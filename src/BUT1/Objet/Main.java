package BUT1.Objet;
import BUT1.Ut;

import java.beans.VetoableChangeListenerProxy;

public class Main {


    public static void main(String[] args) {
        int[] ptitab = {1, 2, 3,4, 5};
        int[] feur = {};
        Ensembles e1 = new Ensembles(5,ptitab);
        Ensembles e2 = new Ensembles(5,feur);
        System.out.println(e2.deborde());


    }
}
