package BUT_S1.Objet;
import BUT_S1.Ut;

public class Main {


    public static void main(String[] args) {
        int[] ptitab = {1, 2, 3, 4, 5};
        int[] feur = {6,7};
        EE e1 = new EE(5,ptitab);
        EE e2 = new EE(5,feur);
        //System.out.println(e2.deborde());
        //Ut.afficher(e1.toString());
        Ut.afficher(e1.estDisjoint(e2));
        //Ut.afficher(e1.toString());

    }
}
