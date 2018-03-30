/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf614.nme.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Miriam Rodriguez
 */
@Entity
public class Album {
    
    @Id
    private int albumId;
    private String albumTitle;
    private Date releaseDate;
    
    @ManyToOne
    @JoinColumn(name="artistId")
    private Artist artist;
    
    @OneToMany(mappedBy="album")
    private Set<Track>tracks;    

    public Album() {
        tracks = new HashSet<>();
    } 
    

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

//    public Set<Track> getTracks() {
//        return tracks;
//    }
//
//    public void setTracks(Set<Track> tracks) {
//        this.tracks = tracks;
//    }   
    
    
    @Override
    public String toString() {
        return "Album{" + "albumId=" + albumId + ", albumTitle=" + albumTitle + ", releaseDate=" + releaseDate + ",artist=" + artist.getArtistName()+'}';
    }   
    
    
}
