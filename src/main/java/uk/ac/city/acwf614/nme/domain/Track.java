/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf614.nme.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Miriam Rodriguez
 */
@Entity
public class Track {
    
    @Id
    private int trackId;
    private String trackName;
    private float duration;
    private Date recordingDate;
    
    @ManyToOne
    @JoinColumn(name="albumId")
    private Album album;
    
    @ManyToOne
    @JoinColumn(name="artistId")
    private Artist artist;

    public Track() {
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }   

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }           

    @Override
    public String toString() {
        return "Track{" + "trackId=" + trackId + ", trackName=" + trackName + ", duration=" + duration + ", recordingDate=" + recordingDate + ",album=" + album.getAlbumTitle()+ ",artist=" + artist.getArtistName()+'}';
    }
    
    
}
