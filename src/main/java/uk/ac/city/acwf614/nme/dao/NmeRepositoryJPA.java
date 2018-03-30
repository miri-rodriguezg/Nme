/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf614.nme.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import uk.ac.city.acwf614.nme.domain.Album;
import uk.ac.city.acwf614.nme.domain.Artist;
import uk.ac.city.acwf614.nme.domain.Track;

/**
 *
 * @author Miriam Rodriguez
 */
@Stateless
public class NmeRepositoryJPA implements NmeRepository{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Artist> findAllArtists() {
      TypedQuery<Artist> query = em.createQuery(
      "SELECT ar FROM Artist ar", Artist.class);
      return query.getResultList();
    }

    @Override
    public List<Track> findAllTracks() {
      TypedQuery<Track> query = em.createQuery(
      "SELECT t FROM track t", Track.class);
      return query.getResultList();
    }

    @Override
    public List<Album> findAllAlbums() {
      TypedQuery<Album> query = em.createQuery(
      "SELECT al FROM Album al", Album.class);
      return query.getResultList();
    }

    @Override
    public List<Track> findTracksOnAlbum(int albumId) {
        TypedQuery<Track> query = em.createQuery(
        "SELECT t FROM Album al JOIN al.tracks t WHERE al.albumId=:albumId", Track.class);
        query.setParameter("albumId", albumId);
        return query.getResultList();
    }

    @Override
    public int artistCount() {
        TypedQuery<Long> query = em.createQuery(
        "SELECT COUNT(ar) FROM Artist ar", Long.class);
        return query.getSingleResult().intValue();
    }

    @Override
    public void addArtist(int artistId, String artistName, String genre, int sales) {
        Artist artist = new Artist();
        artist.setArtistId(artistId);
        artist.setArtistName(artistName);
        artist.setGenre(genre);
        artist.setSales(sales);
        em.persist(artist);
    }

    @Override
    public void removeAlbum(int albumId) {
        Album album = em.find(Album.class, albumId);
        em.remove(album);
    }      
        
}
