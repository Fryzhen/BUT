package BUT1.Objet;

import BUT1.Ut;

public class Ensembles {

    private int[] ensTab;

    private int cardinal;

    public Ensembles(int max) {
        this.ensTab = new int[max];
        this.cardinal = 0;
    }

    public Ensembles(int max, int[] tab) {
        this.ensTab = new int[max];
        this.cardinal = tab.length;
        for (int i = 0; i < cardinal; i++) {
            this.ensTab[i] = tab[i];
        }
    }

    public Ensembles(int[] tab) {
        this.ensTab = new int[tab.length];
        this.cardinal = tab.length;
        for (int i = 0; i < cardinal; i++) {
            this.ensTab[i] = tab[i];
        }
    }

    /*
    public Ensembles(int max, String tab){
        this.ensTab = new int[max];
        this.cardinal = this.ensTab.length;
        for (int i = 0; i < cardinal; i++){
            this.ensTab[i] = Integer.parseInt(toString(tab.charAt(i)));
        }
    }
     */

    public String toString() {
        String ligne = "{";
        ligne += this.ensTab[0];
        for (int i = 1; i < this.ensTab.length; i++) {
            ligne += " " + this.ensTab[i];
        }
        return ligne + "}";
    }

    public int getCardinal() {
        return this.cardinal;
    }

    private int contientPratique(int num) {
        for (int i = 0; i < cardinal; i++) {
            if (ensTab[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public boolean contient(int num) {
        for (int i = 0; i < cardinal; i++) {
            if (ensTab[i] == num) {
                return true;
            }
        }
        return false;
    }

    private void ajoutPratique(int e) {
        if (!contient(e) && cardinal != ensTab.length) {
            ensTab[cardinal] = e;
            cardinal += 1;
        }


    }

    private int retraitPratique(int i) {
        int[] t = new int[1];
        if (0 < i && i < cardinal && contient(i)) {
            int k = ensTab[i];
            ensTab[i] = t[0];
            return k;
        }
        return 0;
    }

    public boolean estVide() {
        for (int i = 0; i < cardinal; i++) {
            if (ensTab[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean deborde() {
        return cardinal >= ensTab.length;
    }

    private void deplace() {
        while (contient(0)) {
            ensTab[contientPratique(0)] = ensTab[cardinal - 1];
            ensTab[cardinal - 1] = 0;
            cardinal -= 1;
        }
    }


    public boolean retraitElt(int num) {
        int i = 0;
        while (contient(num)) {
            this.ensTab[contientPratique(num)] = 0;
            i += 1;
            deplace();
        }
        return i > 0;
    }

    public int ajoutElt(int num) {
        if (deborde()) {
            return -1;
        } else if (contient(num)) {
            return 0;
        } else {
            ensTab[cardinal] = num;
            cardinal++;
            return 1;
        }

    }

}

