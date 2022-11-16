package BUT1.Objet;
import BUT1.Ut;
public class Main {


    public static void main(String args[]) {

        Voiture v1 = new Voiture("T", 1);
        Voiture v2 = new Voiture("N", 1);
        Course c1 = new Course(v1,v2,80);
        c1.deroulement();

    }
}
