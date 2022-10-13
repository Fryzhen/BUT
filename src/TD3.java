
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


    public static void arivobato (){
        int planche[][]= creeplanche();
        int poslong = planche.length-1;
        int poslarg = (planche[0].length + 1)/2;

        while ((0 <= poslarg) && (poslarg <= planche.length-1)){
            Ut.clearConsole();
            planche[poslong][poslarg] = 8;
            dispplanche(planche);
            planche[poslong][poslarg] = 1;

            int num = Ut.randomMinMax(0, 99);
            if (num < 50) {
                poslong -= 1;
                Ut.afficher("devant");
                Ut.sautLigne();
            } else if (num < 70) {
                poslarg -= 1;
                Ut.afficher("gauche");
                Ut.sautLigne();
            } else if (num < 90) {
                poslarg += 1;
                Ut.afficher("droite");
                Ut.sautLigne();
            } else if (num < 100) {
                poslarg -= 1;
                Ut.afficher("recule");
                Ut.sautLigne();
            }

            Ut.afficher(planche[0].length);
            Ut.sautLigne();
            Ut.afficher(poslarg);
            Ut.sautLigne();

            if (poslong > planche.length - 1){
                poslong = planche.length;
                poslarg = (planche[0].length + 1)/2;
            } else if (poslong < 0) {
                Ut.afficher("Victoire");
                break;
            }
        }

        if (poslarg == planche[1].length-1){
            Ut.afficher("Tombé à droite");
        } else if (poslarg < 0) {
            Ut.afficher("Tombé à gauche");
        }
    }
    public  static int[][] creeplanche(){

        /*
        Ut.afficher("Longeur ?");
        Ut.sautLigne();
        int longueur = Ut.saisirEntier();

        Ut.afficher("largeur (nombre impair uniquement) ?");
        Ut.sautLigne();
        int largeur = Ut.saisirEntier();

        if (longueur < largeur | largeur % 2 == 0){
            Ut.afficher("Error try again");
            Ut.sautLigne();
            creeplanche();
        }

        int [][] tab = new int[longueur][largeur];
        */
        int [][] tab = new int[5][3];
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                tab[i][j] = 1;
            }
        }
        return tab;

    }

    public  static void dispplanche(int [][] planche){
        for (int i = 0; i < planche.length; i++){
            afficherTabEntiers(planche[i]);
            Ut.sautLigne();
        }
    }

    public static void main(String[] arg) {
        arivobato();
    }
}
