public class Date {

    private int jour;
    private int mois;
    private int année;
    private static String[] moisLettres = {"none", "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"}

    public Date(int jour, int mois, int année) {
        this.jour = jour;
        this.mois = mois;
        this.année = année;
    }

    @Override
    public String toString() {
        return this.jour + "/" + moisLettres[this.mois] + "/" + this.année
    }


    public static Date demain(int j, int m, int a)


    public static int jourdumois(int m, int a) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            if (Ut.estBissextile(a)) {
                return 29;
            } else {
                return 28
            }
        }
    }
}
