/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf614.nme.dao;

import java.util.List;
import uk.ac.city.acwf614.nme.domain.Album;
import uk.ac.city.acwf614.nme.domain.Artist;
import uk.ac.city.acwf614.nme.domain.Track;

/**
 *
 * @author Miriam Rodriguez
 */
public interface NmeRepository {
    
List<Artist> findAllArtists();
List<Track> findAllTracks();
List<Album> findAllAlbums();
List<Track> findTracksOnAlbum(int albumId);
int artistCount();
void addArtist(int artistId, String artistName, String genre, int sales);
void removeAlbum(int albumId);
    
}
