package uk.ac.city.acwf614.nme.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acwf614.nme.domain.Album;
import uk.ac.city.acwf614.nme.domain.Artist;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T15:56:47")
@StaticMetamodel(Track.class)
public class Track_ { 

    public static volatile SingularAttribute<Track, Float> duration;
    public static volatile SingularAttribute<Track, Artist> artist;
    public static volatile SingularAttribute<Track, Integer> trackId;
    public static volatile SingularAttribute<Track, Album> album;
    public static volatile SingularAttribute<Track, Date> recordingDate;
    public static volatile SingularAttribute<Track, String> trackName;

}