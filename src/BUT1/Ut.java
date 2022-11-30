package BUT1;
// dmaj : fin octobre 2020

import java.util.*;
import java.lang.*;

public class Ut {

    // _________________/Disp classique\________________________

    public static void afficher(String ch) {
        System.out.print(ch);
    }

    public static void afficher(int nb) {
        System.out.print(nb + "");
    }

    public static void afficher(double nb) {
        System.out.print(nb + "");
    }

    public static void afficher(float nb) {
        System.out.print(nb + "");
    }

    public static void afficher(char c) {
        System.out.print(c + "");
    }

    public static void afficher(boolean b) {
        System.out.print(b + "");
    }

    // _________________/Disp Matrice\______________________
    public static void afficher(int[] t) {
        for (int i = 0; i < t.length; i++) {
            Ut.afficher(t[i] + " ");
        }
    }

    public static void afficher(char[] t) {
        for (int i = 0; i < t.length; i++) {
            Ut.afficher(t[i] + " ");
        }
    }

    public static void afficher(float[] t) {
        for (int i = 0; i < t.length; i++) {
            Ut.afficher(t[i] + " ");
        }
    }

    public static void afficher(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                Ut.afficher(t[i][j] + " ");
            }
            Ut.sautLigne();
        }
    }

    public static void afficher(boolean[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                Ut.afficher(t[i][j] + " ");
            }
            Ut.sautLigne();
        }
    }

    public static void afficher(float[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                Ut.afficher(t[i][j] + " ");
            }
            Ut.sautLigne();
        }
    }

    public static void afficher(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            Ut.sautLigne();
        }
    }

    // _________________/Saut Ligne\________________________
    public static void passerLigne() {
        System.out.println("");
    }

    public static void passerALaLigne() {
        passerLigne();
    }

    public static void sauterALaLigne() {
        passerLigne();
    }

    public static void sautLigne() {
        passerLigne();
    }

    // __________________/Saisir\_________________________
    public static int saisirEntier() {

        Scanner clavier = new Scanner(System.in);
        String s = clavier.nextLine(); //int lu = clavier.nextInt();
        int lu = 456;
        try {
            lu = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            System.out.println("Ce n'est pas un entier valide");
        }
        return lu;
    }

    public static double saisirDouble() {
        return saisirReel();
    }

    public static double saisirReel() {

        Scanner clavier = new Scanner(System.in);
        String s = clavier.nextLine();
        double lu = -123.987;
        try {
            lu = Double.parseDouble(s);
        } catch (NumberFormatException ex) {
            System.out.println("Ce n'est pas un reel valide");
        }
        return lu;
    }

    public static float saisirFlottant() {

        Scanner clavier = new Scanner(System.in);
        String s = clavier.nextLine();
        float lu = -123.987F;
        try {
            lu = Float.parseFloat(s);
        } catch (NumberFormatException ex) {
            System.out.println("Ce n'est pas un reel valide");
        }
        return lu;
    }

    public static char saisirCaractere() {

        Scanner clavier = new Scanner(System.in);
        char lu = clavier.next().charAt(0);
        return lu;
    }

    public static boolean saisirBooleen() {

        Scanner clavier = new Scanner(System.in);
        boolean lu = clavier.nextBoolean();
        return lu;
    }

    public static String saisirChaine() {

        Scanner clavier = new Scanner(System.in);
        String s = clavier.nextLine();
        return s;
    }

    public static char[] saisirCharArray() {

        Scanner clavier = new Scanner(System.in);
        String s = clavier.nextLine();
        char[] tab = s.toCharArray();
        return tab;
    }

    public static float[] saisirTabFloat(int taille) {
        float[] tableau = new float[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Ut.saisirFlottant();
        }
        return tableau;
    }

    public static float[][] saisirMatFloat(int largeur, int longeure) {
        float[][] tableau = new float[largeur][longeure];
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[0].length; j++) {
                tableau[i][j] = Ut.saisirFlottant();
            }
        }
        return tableau;
    }

    public static int[] saisirTabEntiers(int taille) {
        int[] tableau = new int[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = Ut.saisirEntier();
        }
        return tableau;
    }

    // _________________/Autres\_________________________
    public static int alphaToIndex(char c) {
        // Prerequis : c est un caractere entre 'a' et 'z'
        // Resultat : la valeur 0 pour 'a', 12 pour 'm', 25 pour 'z'...
        return (int) c - 97;
    }

    public static char indexToAlpha(int i) {
        // Prerequis : i est un entier entre 0 et 25
        //             (par exemple, indice d'un tableau)
        // Resultat : la valeur 'a' pour 0, 'm' pour 12, 'z' pour 25...b
        return (char) (i + 97);
    }


    public static void clearConsole() {
        // Action : efface la console (le terminal)
        for (int i = 0; i <= 10; i++) {
            System.out.print("\n");
        }
    }

    public static void pause(int timeMilli) {
        // Action : suspend le processus courant pendant timeMilli millisecondes
        try {
            Thread.sleep(timeMilli);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static int pgcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int randomMinMax(int min, int max) {
        // Resultat : un entier entre min et max choisi aleatoirement
        Random rand = new Random();
        int res = rand.nextInt(max - min + 1) + min;
        // System.out.println(res + " in [" + min + "," + max + "]");
        // assert min <= res && res <= max : "tirage aleatoire hors des bornes";
        return res;
    }

    public static boolean estEntier(double n) {
        // Resultat : vrai ssi n est un reel qui est aussi un entier (exemple: 5.0)
        return (int) n == n;
    }

    public static boolean estBissextile(int an) {
        // Resultat : vrai ssi an est bissextile
        return an % 400 == 0 || an % 4 == 0 && an % 100 != 0;
    }

    public static char[] hexaToBin(String hexa) {
        char[] bin = new char[hexa.length() * 4];
        int x = 0;
        char c = ' ';
        for (int i = 0; i < hexa.length(); i++) {
            c = hexa.charAt(i);
            if (c == '0') {
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == '1') {
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == '2') {
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == '3') {
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == '4') {
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == '5') {
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == '6') {
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == '7') {
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == '8') {
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == '9') {
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == 'A') {
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == 'B') {
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == 'C') {
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == 'D') {
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else if (c == 'E') {
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '0';
                x += 1;
            } else if (c == 'F') {
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
                bin[x] = '1';
                x += 1;
            } else {
                x += 4;
            }
        }
        return bin;
    }


} // end class




	
