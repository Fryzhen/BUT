public class Sudoku {

    public static void sudokuDisp(int [][] sudoku){
        int slen = sudoku.length;
        int ligne = 3;
        int colone = 3;
        for (int i = 0; i < slen; i++){
            Ut.sautLigne();
            if (ligne == 3){
                Ut.afficher("—————————————————————————");
                Ut.sautLigne();
                ligne = 0;
            }
            ligne += 1;
            for (int j = 0; j < slen; j++){
                if (colone == 3){
                    Ut.afficher("| ");
                    colone = 0;
                }
                colone += 1;
                Ut.afficher(sudoku[i][j]);
                Ut.afficher(" ");

            }
            Ut.afficher("|");
        }
        Ut.sautLigne();
        Ut.afficher("—————————————————————————");
    }

    public static boolean sudokuCheck(int [][] sudoku){
        // check pour les lignes
        for (int i = 0; i < sudoku.length; i++) {
            int [] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < sudoku.length; j++) {
                if (liste[sudoku[i][j]] != 0) {
                    Ut.sautLigne();
                    Ut.afficher("Problème ligne : " + (i+1));
                    return false;
                }
                else{
                        liste[sudoku[i][j]] = sudoku[i][j];
                    }
                }
            }

        // check pour les colones
        for (int i = 0; i < sudoku.length; i++) {
            int [] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < sudoku.length; j++) {
                if (liste[sudoku[j][i]] != 0) {
                    Ut.sautLigne();
                    Ut.afficher("Problème colone : " + (i+1));
                    return false;
                }
                else{
                    liste[sudoku[j][i]] = sudoku[j][i];
                }
            }
        }


        Ut.sautLigne();
        Ut.afficher("true");
        return true;
        }



    public static int [][] sudokuLigne(int [][] sudoku){


    }


    public static void main(String[] arg) {
        int[][] sudoku_a = {{1,5,8,4,3,7,6,2,9},{3,2,4,6,9,5,1,8,7},{7,9,6,8,2,1,5,3,4},{2,7,3,1,6,9,8,4,5},{8,4,1,7,5,3,2,9,6},{9,6,5,2,8,4,3,7,1},{4,3,7,5,1,2,9,6,8},{6,1,9,3,4,8,7,5,2},{5,8,2,9,7,6,4,1,3}};
        int[][] sudoku_b = {{1,5,8,4,3,7,6,2,9},{3,2,4,6,9,5,1,8,7},{7,9,6,8,2,1,5,3,4},{2,7,3,1,6,9,8,4,5},{8,4,1,7,5,3,2,9,6},{9,6,5,2,8,4,3,7,1},{4,3,7,5,1,2,9,6,8},{6,1,9,3,4,8,7,5,2},{5,8,2,9,7,6,4,1,3}};
        int[][] sudoku_i = {{0,0,6,0,0,0,0,0,1},{0,7,0,0,6,0,0,5,0},{8,0,0,1,0,3,2,0,0},{0,0,5,0,4,0,8,0,0},{0,4,0,7,0,2,0,9,0},{0,0,8,0,1,0,7,0,0},{0,0,1,2,0,5,0,0,3},{0,6,0,0,7,0,0,8,0},{2,0,0,0,0,0,4,0,0}};
        int[][] s = sudoku_a;
        sudokuDisp(s);
        sudokuCheck(s);

    }
}
