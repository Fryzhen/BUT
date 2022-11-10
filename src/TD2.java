public class TD2 {

    public static void ex4() {

        int a = Ut.saisirEntier();
        int b = Ut.saisirEntier();
        int c = Ut.saisirEntier();
        int d = Ut.saisirEntier();

        if (a == b && b == c && c == d) {
            Ut.afficher("Carré");

        } else {
            if ((a == b && b == c) || (a == c && c == d) || (b == c && c == d) || (a == b && b == d)) {
                Ut.afficher("Brelan");
            } else {

                if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c)) {
                    Ut.afficher("Double Paire");
                } else {
                    if ((a == b) || (a == c) || (a == d) || (b == c) || (b == d) || (c == d)) {
                        Ut.afficher("Paire");
                    }
                }
            }
        }
    }

    public static void ex5() {
        int liste = 1;
        int i = -1;

        while (liste != 0) {
            liste = Ut.saisirEntier();
            if ((liste % 2) == 0) {
                i = i + 1;
            }
        }
        Ut.afficher(i);
    }

    public static void ex6() {
        double max = Ut.saisirReel();

        for (int i = 0; i < 18; i++) {
            double nombre = Ut.saisirReel();
            if (nombre > max) {
                max = nombre;
            }
        }
        Ut.afficher(max);
    }

    public static void ex71() {
        int a = Ut.saisirEntier();
        int b = Ut.saisirEntier();
        int c = Ut.saisirEntier();
        int d = ((b * b) - 4 * a * c);

        if (d < 0) {
            Ut.afficher("Delta négatif");

        } else if (d == 0) {
            Ut.afficher(b / (2 * a));

        } else {
            Ut.afficher((b - Math.sqrt(d)) / (2 * a));
            Ut.afficher("");
            Ut.afficher((b + Math.sqrt(d)) / (2 * a));
        }
    }

    public static void ex72() {
        int a = Ut.saisirEntier();
        int b = Ut.saisirEntier();
        int c = Ut.saisirEntier();
        int d = Ut.saisirEntier();

        for (int i = 0; i <= 100; i++) {
            int res = ((a * i * i * i) + (b * i * i) + (c * i) + d);
            if (res == 0) {
                Ut.afficher(res);
                Ut.afficher("");
            }
            double n = i * -1;
            double nres = ((a * n * n * n) + (b * n * n) + (c * n) + d);
            if (nres == 0) {
                Ut.afficher(nres);
                Ut.afficher("");
            }
        }
    }
    public static void ex9() {
        int nb = Ut.saisirEntier();
        int j = 0;
        for (int i = 1; Math.abs(nb - j) > Math.abs(nb - (j + i)); i++) {
            j = j + i;
        }
        Ut.afficher(j);
    }

    public static void ex10() {
        //  Variables : année
        //  Strategie : Triple if backflip 360 noscope
        //
        int année = Ut.saisirEntier();
        if (0 == (année % 4)) {
            if (0 == (année % 100)) {
                année = année / 100;
                if (0 == (année % 4)) {
                    Ut.afficher("année bisextille");
                } else {
                    Ut.afficher("année non bisextille");
                }
            }
        }
    }

    public static void ex11() {}




    public static void main(String[] arg) {
        ex11();
    }
}
