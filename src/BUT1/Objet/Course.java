package BUT1.Objet;

import BUT1.Ut;

public class Course {
    private Voiture v1;
    private Voiture v2;
    private int longeur;

    private int nombre;


    public Course(Voiture uneVoit1, Voiture uneVoit2, int longueur) {
        this.v1 = uneVoit1;
        this.v2 = uneVoit2;
        this.longeur = longueur;
    }

    public String toString() {
        return v1.toString2() + "\n" + v2.toString2();
    }

    public Voiture deroulement() {
        /*
         * action : Simule le déroulement d’une course entre this.voit1 et this.voit2
         * sur une piste de longueur this.longueurPiste.
         * this.voit1 et this.voit2 sont d’abord placées sur la ligne de départ.
         * Ensuite, jusqu’à ce qu’une voiture franchisse la ligne d’arrivée, l’une
         * des deux voitures est itérativement sélectionnée aléatoirement et avance.
         * Un affichage des deux voitures (représentées par la première lettre de leur
         * nom) à leur position respective à chaque étape permet de suivre la course.
         * résultat : la voiture gagnante.
         */
        v1.auDepart();
        v2.auDepart();
        while (!v1.depasse(longeur) && !v2.depasse(longeur)) {
            int rnd = Ut.randomMinMax(1, 1000);
            if (rnd <= 500) {
                v1.avance();
            } else {
                v2.avance();
            }
            Ut.pause(200);
            Ut.clearConsole();
            System.out.println(toString());
        }
        if (v1.depasse(longeur)) {
            System.out.println(v1.leNom());
            return v1;
        } else if (v2.depasse(longeur)) {
            System.out.println(v2.leNom());
            return v2;
        } else {

        }
    return v1;
    }
}

