package BUT1;

import BUT1.Ut;

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
                    System.out.print('▭');
                } else if (tab[i][j] == '1') {
                    System.out.print('▬');
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
        for (int col = 1; col < equ[0].length; col++) {
            for (int lin = 1; lin < equ.length; lin++) {
                equ[lin][col] = equ[lin][col] - ((equ[lin - 1][col - 1] / equ[lin][col - 1]) * equ[lin - 1][col]);
                Ut.afficher(equ);


                System.out.println();
            }
        }


    }

    public static void main(String args[]) {
        float[][] mat = {{1, 3, 4, 5}, {2, 1, 8, 9}, {4, 3, 2, 2}};
        float[][] newmat = Ut.saisirMatFloat(4,5);
        matrice(newmat);

    }
}