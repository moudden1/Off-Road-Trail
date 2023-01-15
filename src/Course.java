import java.util.Date;
import java.util.List;

public class Course {
    String nom;
    Date heureDepart;
    String natureCourse;
    Double Distance;
    Long DureeMax;
    List<Troncon> troncons;
    List<Categorie> categories;
    pointGeo pointDepart;
    pointGeo pointArrivee;
}
