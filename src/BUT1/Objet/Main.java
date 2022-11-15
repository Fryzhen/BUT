package BUT1.Objet;
import BUT1.Ut;
public class Main {


    public static void main(String args[]) {

        Course d1 = new Course("T", 0, 2004);
        Date d2 = new Date(31, 12, 2003);


        System.out.print(d1.postérieure(d2));
    }
}
