package BUT_S1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bordel {
    public static void gameboydisp() {

        char[][] tab = new char[8][48];
        char[] line = Ut.hexaToBin(Ut.saisirChaine());
        int x = 0;
        int y = 0;
        int z = 0;
        int w = 0;
        int k = 0;//k = itérateur

        while (k < line.length) {
            if (x == 4) {
                x = 0;
                y += 1;
                if (y == 4) {
                    y = 0;
                    z += 1;
                    if (z == 12) {
                        z = 0;
                        w += 1;
                    }
                }
            }
            tab[w * 4 + y][z * 4 + x] = line[k];
            x += 1;
            k += 1;
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == '0') {
                    System.out.print('\u25AD');
                } else if (tab[i][j] == '1') {
                    System.out.print('\u25AC');
                }
            }
            System.out.println(' ');
        }
    }
    //▬▭
    //CEED6666CC0D000B03730083000C000D0008111F8889000EDCCC6EE6DDDDD999BBBB67636E0EECCCDDDC999FBBB9333E

    public static void matrice(float[][] equ) {
        Ut.afficher(equ);
        System.out.println();
        for (int lin = 1; lin < equ.length; lin++) {
            float div = equ[lin][0] / equ[lin - 1][0];
            equ[lin][0] = 0;
            for (int col = lin; col < equ[0].length; col++) {
                //equ[lin][col] = equ[lin][col] - ((equ[lin - 1][col - 1] / equ[lin][col - 1]) * equ[lin - 1][col]);
                Ut.afficher(equ[lin][col]);
                equ[lin][col] = equ[lin][col] - (div * equ[lin][col - 1]);

                System.out.println();
            }
        }
        Ut.afficher(equ);

    }

    public static void BDD() {

    }


    public static void main(String args[]) {
        //float[][] mat = {{1, 3, 4, 5}, {2, 1, 8, 9}, {4, 3, 2, 2}};
        //float[][] newmat = Ut.saisirMatFloat(4,5);
        //matrice(mat);
        BDD();

    }
}