
public class TD3 {

    public static void  afficherTabEntiers(int [] t) {
        for (int i = 0; i < t.length; i++){
            Ut.afficher(t[i]+" ");
        }
    }

    public static int []  saisirTabEntiers(int taille){
        int [] tableau = new int [taille];
        for (int i = 0; i < tableau.length; i++){
            tableau[i] = Ut.saisirEntier();
        }
        return tableau;
    }

    public static double  moyenneTabEntiers(int [] tableau){
        int x = 0;
        double moyenne = 0;
        for (int i = 0; i < tableau.length; i++){
            moyenne += tableau[i];
            x += 1;
        }
        moyenne /= x;
        return moyenne;
    }

    public static int maximum ( int... nombres) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] > max) {
                max = nombres[i];
            }
        }
        return max;
    }

    public static int nbChiffres ( int nb) {
        int ans = 0;
        while (nb >= 1) {
            nb /= 10;
            ans += 1;
        }
        return ans;
    }
    public static int nbChiffresCarre (int nb){
        nb *= nb;
        return nbChiffres(nb);
    }

    public static int[] frequenceChiffre (int nb) {
        int [] table = {0,0,0,0,0,0,0,0,0,0};
            while (nb >= 1) {
                table[nb % 10] += 1;
                nb /= 10;
            }
        return table;
    }

    public static boolean aChiffresTousDifferents(int nb) {
        int[] table = frequenceChiffre(nb);
        for (int i = 0; i<table.length; i++) {
            if (table[i] > 1){
            return false;
            }
        }
        return true;
    }

    public static void pyramide (int nb) {
        int num = 0;
        int variable = 0;
        for(int i = 0; i <= nb; i++ ){
            for (int j = 0; j < (nb - i); j++){
                Ut.afficher(' ');
                Ut.afficher(' ');
            }
            variable = num;
            for (int j = 0; j <= i ; j++){
                variable += 1;
                Ut.afficher(variable);
                Ut.afficher(' ');
                if (variable >= 9){
                    variable = -1;
                }
            }
            if (variable <= 0){
                variable = 9;
            }
            for (int j = 0; j <= i - 1; j++){
                variable -= 1;
                Ut.afficher(variable);
                Ut.afficher(' ');
                if (variable <= 0){
                    variable = 10;
                }

            }
            num += 1;
            if (num >= 9){
                num = -1;
            }
            Ut.sautLigne();
        }
    }




    public static void main(String[] arg) {

    }
}
