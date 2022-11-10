public class Marin_Ivre {

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
            Ut.afficher(planche[i]);
            Ut.sautLigne();
        }
    }
    public static void main(String[] arg) {

    }
}
