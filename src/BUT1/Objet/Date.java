package BUT1.Objet;
import BUT1.Ut;
public class Date {

    private int jour;
    private int mois;
    private int année;
    private static String[] moisLettres = {"none", "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};

    public Date(int jour, int mois, int année) {
        this.jour = jour;
        this.mois = mois;
        this.année = année;
    }

    @Override
    public String toString() {
        return this.jour + " " + moisLettres[this.mois] + " " + this.année;
    }


    public Date demain() {
        int j = this.jour;
        int m = this.mois;
        int a = this.année;

        j += 1;
        if (j > jourdumois(m, a)) {
            j = 1;
            m += 1;
        }
        if (m > 12) {
            a += 1;
            m = 1;
        }
        Date d = new Date(j, m, a);
        return d;
    }

    public Date incermenter() {
        this.jour += 1;
        if (this.jour > jourdumois(this.mois, this.année)) {
            this.jour = 1;
            this.mois += 1;
        }
        if (this.mois > 12) {
            this.année += 1;
            this.mois = 1;
        }
        return this;
    }

    public static int jourdumois(int m, int a) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            if (Ut.estBissextile(a)) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    public boolean egal(Date d2) {
        if (this.jour == d2.jour && this.mois == d2.mois && this.année == d2.année) {
            return true;
        } else {
            return false;
        }
    }

    public boolean antérieure(Date d2) {
        if (this.année <= d2.année) {
            if (this.mois <= d2.mois) {
                if (this.jour <= d2.jour) {
                    return false;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public boolean postérieure(Date d2) {
        if (this.année >=d2.année){
            if (this.mois >=d2.mois){
                if (this.jour >=d2.jour){
                    return false;
                } else{
                    return false;
                }
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

    public int différence(Date d2) {
        int x = 0;
        if (this.antérieure(d2)) {
            while (!egal(d2)) {
                x += 1;
                this.incermenter();
            }
        }else if (this.postérieure(d2)) {
            while (!egal(d2)) {
                x += 1;
                d2.incermenter();
            }
        }
        return x;
    }

}
