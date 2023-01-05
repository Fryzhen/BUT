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

   public static void invMatrice(float[][] equ) {
      float[][] sol = new float[equ.length][equ.length];
      for (int i = 0; i < equ.length; i++) {
         sol[i][i] = 0;
      }

      Ut.afficher(equ);
      System.out.println();

      for (int i = 1; i < equ.length; i++) {
         double div = equ[i][0];
         for (int j = 0 ; j < equ.length; j++) {
            equ[i][j] -= div * equ[0][j];
         }
      }
      for (int i = 1; i < equ.length; i++) {
         double div = equ[i][i];

      }
      Ut.afficher(equ);

   }


   public static void main(String[] args) {
      float[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      invMatrice(mat);

   }
}