public class Sudoku {

    public static void dispSudoku(int [][] sudoku){
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
    public static void main(String[] arg) {
        int[][] sudoku = {{1,2,3,4,5,6,7,8,9},{1,3,2,4,5,6,7,8,9},{1,2,5,4,3,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
        int[][] solvdoku = {{0,0,6,0,0,0,0,0,1},{0,7,0,0,6,0,0,5,0},{8,0,0,1,0,3,2,0,0},{0,0,5,0,4,0,8,0,0},{0,4,0,7,0,2,0,9,0},{0,0,8,0,1,0,7,0,0},{0,0,1,2,0,5,0,0,3},{0,6,0,0,7,0,0,8,0},{2,0,0,0,0,0,4,0,0}}
        dispSudoku(sudoku);

    }
}
