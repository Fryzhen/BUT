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

        sudoku = sudokuSwapCarreLignes(sudoku);
        for (int i = 0; i < sudoku.length; i++) {
            int [] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < sudoku.length; j++) {
                if (liste[sudoku[i][j]] != 0) {
                    Ut.sautLigne();
                    Ut.afficher("Problème carré : " + (i+1));
                    return false;
                }
                else{
                    liste[sudoku[i][j]] = sudoku[i][j];
                }
            }
        }

        Ut.sautLigne();
        Ut.afficher("true");
        return true;
        }
    public static int [][] sudokuSwapCarreLignes(int [][] sudoku){
        int [][] newsudoku = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,8,0},{0,0,0,0,0,0,0,0,0}};
        for (int i = 0; i < sudoku.length/3; i++){
            newsudoku[3*i+0][0] = sudoku[3*i+0][0];
            newsudoku[3*i+0][1] = sudoku[3*i+0][1];
            newsudoku[3*i+0][2] = sudoku[3*i+0][2];
            newsudoku[3*i+1][0] = sudoku[3*i+0][3];
            newsudoku[3*i+1][1] = sudoku[3*i+0][4];
            newsudoku[3*i+1][2] = sudoku[3*i+0][5];
            newsudoku[3*i+2][0] = sudoku[3*i+0][6];
            newsudoku[3*i+2][1] = sudoku[3*i+0][7];
            newsudoku[3*i+2][2] = sudoku[3*i+0][8];
            newsudoku[3*i+0][3] = sudoku[3*i+1][0];
            newsudoku[3*i+0][4] = sudoku[3*i+1][1];
            newsudoku[3*i+0][5] = sudoku[3*i+1][2];
            newsudoku[3*i+1][3] = sudoku[3*i+1][3];
            newsudoku[3*i+1][4] = sudoku[3*i+1][4];
            newsudoku[3*i+1][5] = sudoku[3*i+1][5];
            newsudoku[3*i+2][3] = sudoku[3*i+1][6];
            newsudoku[3*i+2][4] = sudoku[3*i+1][7];
            newsudoku[3*i+2][5] = sudoku[3*i+1][8];
            newsudoku[3*i+0][6] = sudoku[3*i+2][0];
            newsudoku[3*i+0][7] = sudoku[3*i+2][1];
            newsudoku[3*i+0][8] = sudoku[3*i+2][2];
            newsudoku[3*i+1][6] = sudoku[3*i+2][3];
            newsudoku[3*i+1][7] = sudoku[3*i+2][4];
            newsudoku[3*i+1][8] = sudoku[3*i+2][5];
            newsudoku[3*i+2][6] = sudoku[3*i+2][6];
            newsudoku[3*i+2][7] = sudoku[3*i+2][7];
            newsudoku[3*i+2][8] = sudoku[3*i+2][8];
        }
        return newsudoku;
    }


    public static void main(String[] arg) {
        // {{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,}}

        int[][] sudoku_a = {{1,5,8,4,3,7,6,2,9},{3,2,4,6,9,5,1,8,7},{7,9,6,8,2,1,5,3,4},{2,7,3,1,6,9,8,4,5},{8,4,1,7,5,3,2,9,6},{9,6,5,2,8,4,3,7,1},{4,3,7,5,1,2,9,6,8},{6,1,9,3,4,8,7,5,2},{5,8,2,9,7,6,4,1,3}};
        int[][] sudoku_b = {{1,5,8,4,3,7,6,2,9},{3,2,4,6,9,5,1,8,7},{7,9,6,8,2,1,5,3,4},{2,7,3,1,6,9,8,4,5},{8,4,1,7,5,3,2,9,6},{9,6,5,2,8,4,3,7,1},{4,3,7,5,1,2,9,6,8},{6,1,9,3,4,8,7,5,2},{5,8,2,9,7,6,4,1,3}};
        int[][] sudoku_i = {{0,0,6,0,0,0,0,0,1},{0,7,0,0,6,0,0,5,0},{8,0,0,1,0,3,2,0,0},{0,0,5,0,4,0,8,0,0},{0,4,0,7,0,2,0,9,0},{0,0,8,0,1,0,7,0,0},{0,0,1,2,0,5,0,0,3},{0,6,0,0,7,0,0,8,0},{2,0,0,0,0,0,4,0,0}};

        int[][] testcarre = {{1,2,3,4,5,6,7,8,9},{2,3,4,5,6,7,8,9,1},{3,4,5,6,7,8,9,1,2},{4,5,6,7,8,9,1,2,3},{5,6,7,8,9,1,2,3,4},{6,7,8,9,1,2,3,4,5},{7,8,9,1,2,3,4,5,6},{8,9,1,2,3,4,5,6,7},{9,1,2,3,4,5,6,7,8}};
        int[][] testligne = {{1,2,3,4,5,6,7,8,9},{4,5,6,7,8,9,2,2,3},{7,8,9,1,2,3,4,5,6},{2,3,1,5,6,4,8,9,7},{5,6,4,8,9,7,1,3,1},{8,9,7,2,3,1,5,6,4},{3,1,2,6,4,5,9,7,8},{6,4,5,9,7,8,3,1,2},{9,7,8,3,1,2,6,4,5}};
        int[][] testcolon = {{1,2,3,4,5,6,7,8,9},{5,4,6,7,8,9,1,2,3},{7,8,9,1,2,3,4,5,6},{2,3,1,5,6,4,8,9,7},{5,6,4,8,9,7,2,3,1},{8,9,7,2,3,1,5,6,4},{3,1,2,6,4,5,9,7,8},{6,4,5,9,7,8,3,1,2},{9,7,8,3,1,2,6,4,5}};


        int[][] s = testcolon;
        sudokuDisp(s);
        sudokuCheck(s);


    }
}
