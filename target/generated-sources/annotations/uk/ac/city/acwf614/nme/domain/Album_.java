package uk.ac.city.acwf614.nme.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acwf614.nme.domain.Artist;
import uk.ac.city.acwf614.nme.domain.Track;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T15:56:47")
@StaticMetamodel(Album.class)
public class Album_ { 

    public static volatile SingularAttribute<Album, Date> releaseDate;
    public static volatile SingularAttribute<Album, Artist> artist;
    public static volatile SingularAttribute<Album, Integer> albumId;
    public static volatile SingularAttribute<Album, String> albumTitle;
    public static volatile SetAttribute<Album, Track> tracks;

}