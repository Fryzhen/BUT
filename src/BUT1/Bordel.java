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
        for (int i = 1; i < equ.length; i++) {
            for (int j = 0; j < equ[0].length - 1; j++) {
                float div = equ[i][j] / equ[i - 1][j];
                System.out.println(div);

            }
        }


    }

    public static void main(String args[]) {
        float[][] mat = {{1,3,4,5},{2,1,8,9},{4,3,2,2}};
        matrice(mat);

    }
}