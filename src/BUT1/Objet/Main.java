package BUT1.Objet;
import BUT1.Ut;
public class Main {


    public static void main(String[] args) {

        Voiture v1 = new Voiture("T", 3);
        Voiture v2 = new Voiture("N", 3);
        Course c1 = new Course(v1,v2,80);
        System.out.println(c1.deroulement());

    }
}
