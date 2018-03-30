package uk.ac.city.acwf614.nme.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acwf614.nme.domain.Album;
import uk.ac.city.acwf614.nme.domain.Track;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T15:56:47")
@StaticMetamodel(Artist.class)
public class Artist_ { 

    public static volatile SetAttribute<Artist, Album> albums;
    public static volatile SingularAttribute<Artist, String> genre;
    public static volatile SingularAttribute<Artist, Integer> artistId;
    public static volatile SingularAttribute<Artist, String> artistName;
    public static volatile SingularAttribute<Artist, Integer> sales;
    public static volatile SetAttribute<Artist, Track> tracks;

}