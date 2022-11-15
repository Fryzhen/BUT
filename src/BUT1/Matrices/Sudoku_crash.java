package BUT1.Matrices;
import BUT1.Ut;
public class Sudoku_crash {

    public static void sudokuDisp(int[][] sudoku) {
        int slen = sudoku.length;
        int ligne = 3;
        int colone = 3;
        for (int[] ints : sudoku) {
            Ut.sautLigne();
            if (ligne == 3) {
                Ut.afficher("—————————————————————————");
                Ut.sautLigne();
                ligne = 0;
            }
            ligne += 1;
            for (int j = 0; j < slen; j++) {
                if (colone == 3) {
                    Ut.afficher("| ");
                    colone = 0;
                }
                colone += 1;
                Ut.afficher(ints[j]);
                Ut.afficher(" ");

            }
            Ut.afficher("|");
        }
        Ut.sautLigne();
        Ut.afficher("—————————————————————————");
        Ut.sautLigne();
    }

    public static void sudokuSolv(int[][] sudoku) {

        while (!sudokuCheck(sudoku)) {

            int[][] sligne = sudoku;
            int[][] scarre = sudokuSwapLigneCarre(sudoku);
            int[][] scolon = sudokuSwapLigneColone(sudoku);
            int[] liste = {1, 2, 3, 4, 5, 6, 7, 8, 9};


            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku.length; j++) {
                    if (sudoku[i][j] == 0) {
                        sudokuDisp(sudoku);
                        sudoku[i][j] = sudokuTest(i, j, sligne, scolon, scarre);
                        Ut.sautLigne();

                    }
                }
            }
            sudokuDisp(sudoku);
        }
    }

    public static int sudokuTest(int l, int c, int[][] sligne, int[][] scolon, int[][] scarre) {

        int[] sli = sligne[l];
        int[] sco = scolon[c];
        int[] sca = scarre[l / 3 * 3 + c / 3];
        int[] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < sli.length; i++) {
            liste[sli[i]] += 1;
        }
        for (int i = 0; i < sco.length; i++) {
            liste[sco[i]] += 1;
        }
        for (int i = 0; i < sca.length; i++) {
            liste[sca[i]] += 1;
        }
        if (devmode()) {
            Ut.afficher(l);
            Ut.afficher(" ");
            Ut.afficher(c);
            Ut.sautLigne();
            Ut.afficher(liste);
            Ut.sautLigne();
            Ut.sautLigne();
        }
        int count = 0;
        int newint = 0;

        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == 0) {
                count += 1;
                newint = i;
            }
        }

        if (count != 1) {
            newint = 0;
        }
        if (devmode()) {
            Ut.afficher("Count : " + count);
            Ut.sautLigne();
            Ut.afficher("Newint : " + newint);
        }
        return newint;
    }


    public static boolean sudokuCheck(int[][] sudoku) {

        // check des zéros
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] == 0) {
                    if (devmode()) {
                        Ut.sautLigne();
                        Ut.afficher("Problème ligne : ");
                        Ut.afficher(i + 1);
                        Ut.afficher(", colone : ");
                        Ut.afficher(j + 1);
                    }
                    return false;
                }
            }
        }

        // check pour les lignes
        for (int i = 0; i < sudoku.length; i++) {
            int[] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < sudoku.length; j++) {
                if (liste[sudoku[i][j]] != 0) {
                    if (devmode()) {
                        Ut.sautLigne();
                        Ut.afficher("Problème ligne : " + (i + 1));
                    }
                    return false;
                } else {
                    liste[sudoku[i][j]] = sudoku[i][j];
                }
            }
        }

        // check pour les colones
        for (int i = 0; i < sudoku.length; i++) {
            int[] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < sudoku.length; j++) {
                if (liste[sudoku[j][i]] != 0) {
                    if (devmode()) {
                        Ut.sautLigne();
                        Ut.afficher("Problème colone : " + (i + 1));
                    }
                    return false;
                } else {
                    liste[sudoku[j][i]] = sudoku[j][i];
                }
            }
        }

        // check pour les carrés
        sudoku = sudokuSwapLigneCarre(sudoku);
        for (int i = 0; i < sudoku.length; i++) {
            int[] liste = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int j = 0; j < sudoku.length; j++) {
                if (liste[sudoku[i][j]] != 0) {
                    if (devmode()) {
                        Ut.sautLigne();
                        Ut.afficher("Problème carré : " + (i + 1));
                    }
                    return false;
                } else {
                    liste[sudoku[i][j]] = sudoku[i][j];
                }
            }
        }

        Ut.sautLigne();
        Ut.afficher("true");
        return true;
    }

    public static int[][] sudokuSwapLigneCarre(int[][] sudoku) {
        int[][] newsudoku = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 8, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        newsudoku[3 * i + k][3 * j + l] = sudoku[3 * i + j][3 * k + l];
                    }
                }
            }
        }
        return newsudoku;
    }

    public static int[][] sudokuSwapLigneColone(int[][] sudoku) {
        int[][] new_sudoku = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                new_sudoku[j][i] = sudoku[i][j];
            }
        }

        return new_sudoku;
    }

    public static boolean devmode() {
        return false;
    }

    public static void main(String[] arg) {
        // {{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,},{,,,,,,,,}}

        int[][] sudoku_a = {{1, 5, 8, 4, 3, 7, 6, 2, 9}, {3, 2, 4, 6, 9, 5, 1, 8, 7}, {7, 9, 6, 8, 2, 1, 5, 3, 4}, {2, 7, 3, 1, 6, 9, 8, 4, 5}, {8, 4, 1, 7, 5, 3, 2, 9, 6}, {9, 6, 5, 2, 8, 4, 3, 7, 1}, {4, 3, 7, 5, 1, 2, 9, 6, 8}, {6, 1, 9, 3, 4, 8, 7, 5, 2}, {5, 8, 2, 9, 7, 6, 4, 1, 3}};
        int[][] sudoku_b = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {4, 5, 6, 7, 8, 9, 1, 2, 3}, {7, 8, 9, 1, 2, 3, 4, 5, 6}, {2, 3, 1, 5, 6, 4, 8, 9, 7}, {5, 6, 4, 8, 9, 7, 2, 3, 1}, {8, 9, 7, 2, 3, 1, 5, 6, 4}, {3, 1, 2, 6, 4, 5, 9, 7, 8}, {6, 4, 5, 9, 7, 8, 3, 1, 2}, {9, 7, 8, 3, 0, 2, 6, 4, 5}};
        int[][] sudoku_c = {{7, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 5, 0, 1, 9, 0, 4}, {5, 8, 0, 0, 6, 0, 0, 2, 0}, {0, 0, 0, 8, 0, 0, 0, 4, 0}, {0, 0, 4, 2, 0, 0, 3, 0, 6}, {0, 7, 0, 0, 0, 5, 0, 0, 0}, {0, 0, 6, 0, 0, 3, 0, 0, 0}, {2, 0, 0, 0, 0, 0, 6, 5, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1}};
        int[][] sudoku_d = {{3, 0, 0, 0, 0, 1, 0, 0, 0}, {0, 6, 8, 0, 0, 0, 5, 4, 0}, {0, 0, 0, 0, 5, 0, 0, 3, 6}, {0, 0, 0, 0, 6, 0, 4, 0, 0}, {0, 3, 1, 0, 0, 5, 0, 0, 2}, {6, 0, 7, 0, 8, 2, 0, 0, 0}, {5, 0, 6, 3, 9, 0, 1, 2, 4}, {0, 0, 0, 7, 1, 0, 8, 0, 0}, {8, 1, 9, 5, 2, 0, 0, 6, 7}};
        int[][] sudoku_i = {{0, 0, 6, 0, 0, 0, 0, 0, 1}, {0, 7, 0, 0, 6, 0, 0, 5, 0}, {8, 0, 0, 1, 0, 3, 2, 0, 0}, {0, 0, 5, 0, 4, 0, 8, 0, 0}, {0, 4, 0, 7, 0, 2, 0, 9, 0}, {0, 0, 8, 0, 1, 0, 7, 0, 0}, {0, 0, 1, 2, 0, 5, 0, 0, 3}, {0, 6, 0, 0, 7, 0, 0, 8, 0}, {2, 0, 0, 0, 0, 0, 4, 0, 0}};

        int[][] sudokuvid = {{0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        int[][] testzeros = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {4, 5, 6, 7, 8, 9, 1, 2, 3}, {7, 8, 9, 1, 2, 3, 4, 5, 6}, {2, 3, 1, 5, 6, 4, 8, 9, 7}, {5, 6, 0, 8, 9, 7, 2, 3, 1}, {8, 9, 7, 2, 3, 1, 5, 6, 4}, {3, 1, 2, 6, 4, 5, 9, 7, 8}, {6, 4, 5, 9, 7, 8, 3, 1, 2}, {9, 7, 8, 3, 1, 2, 6, 4, 5}};
        int[][] testcarre = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {2, 3, 4, 5, 6, 7, 8, 9, 1}, {3, 4, 5, 6, 7, 8, 9, 1, 2}, {4, 5, 6, 7, 8, 9, 1, 2, 3}, {5, 6, 7, 8, 9, 1, 2, 3, 4}, {6, 7, 8, 9, 1, 2, 3, 4, 5}, {7, 8, 9, 1, 2, 3, 4, 5, 6}, {8, 9, 1, 2, 3, 4, 5, 6, 7}, {9, 1, 2, 3, 4, 5, 6, 7, 8}};
        int[][] testligne = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {4, 5, 6, 7, 8, 9, 2, 2, 3}, {7, 8, 9, 1, 2, 3, 4, 5, 6}, {2, 3, 1, 5, 6, 4, 8, 9, 7}, {5, 6, 4, 8, 9, 7, 1, 3, 1}, {8, 9, 7, 2, 3, 1, 5, 6, 4}, {3, 1, 2, 6, 4, 5, 9, 7, 8}, {6, 4, 5, 9, 7, 8, 3, 1, 2}, {9, 7, 8, 3, 1, 2, 6, 4, 5}};
        int[][] testcolon = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {5, 4, 6, 7, 8, 9, 1, 2, 3}, {7, 8, 9, 1, 2, 3, 4, 5, 6}, {2, 3, 1, 5, 6, 4, 8, 9, 7}, {5, 6, 4, 8, 9, 7, 2, 3, 1}, {8, 9, 7, 2, 3, 1, 5, 6, 4}, {3, 1, 2, 6, 4, 5, 9, 7, 8}, {6, 4, 5, 9, 7, 8, 3, 1, 2}, {9, 7, 8, 3, 1, 2, 6, 4, 5}};

        int[][] s = sudoku_d;
        sudokuDisp(s);
        sudokuSolv(s);

        //sudokuDisp(sudokuCheck(s));
        //sudokuDisp(sudokuSwapLigneCarre(sudokuSwapLigneCarre(s)));
        //sudokuDisp(sudokuSwapLigneColone(s));


    }
}
