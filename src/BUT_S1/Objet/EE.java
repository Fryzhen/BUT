package BUT_S1.Objet;

import BUT_S1.Ut;

public class EE {

    private int[] ensTab;

    private int cardinal;

    public EE(int max) {
        this.ensTab = new int[max];
        this.cardinal = 0;
    }

    public EE(int max, int[] tab) {
        this.ensTab = new int[max];
        this.cardinal = tab.length;
        for (int i = 0; i < cardinal; i++) {
            this.ensTab[i] = tab[i];
        }
    }

    public EE(int[] tab) {
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
            cardinal ++;
        }


    }

    private int retraitPratique(int i) {
        int[] t = new int[1];
        if (0 <= i && i < cardinal) {
            int k = ensTab[i];
            cardinal --;
            ensTab[i] = ensTab[cardinal];
            ensTab[cardinal] = t[0];
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

    public boolean estInclus(EE ens) {
        int k = 0;
        for (int j = 0; j < ens.cardinal; j++) {
            if (contient(ens.ensTab[j])) {
                k += 1;
            }
        }
        return k == (ens.cardinal);
    }

    public boolean estEgal(EE ens) {
        for (int j = 0; j < ensTab.length; j++) {
            if (!(contient(ens.ensTab[j]))) {
                return false;
            }
        }
        return true;
    }

    public boolean estDisjoint(EE ens) {
        for (int j = 0; j < ensTab.length; j++) {
            if ((contient(ens.ensTab[j]))) {
                return false;
            }
        }
        return true;
    }

    public EE intersection(EE ens) {
        EE e = new EE(this.cardinal + ens.cardinal);
        for (int i = 0; i < this.cardinal; i++) {
            if (contient(ens.ensTab[i])) {
                e.ajoutPratique(ens.ensTab[i]);
            }
        }
        return e;
    }

    public EE reunion(EE ens) {
        EE e = new EE(this.cardinal + ens.cardinal);
        for (int i = 0; i < this.cardinal; i++) {
            e.ajoutPratique(this.ensTab[i]);
        }
        for (int i = 0; i < ens.cardinal; i++) {
            if (!(e.contient(ens.ensTab[i]))) {
                e.ajoutPratique(ens.ensTab[i]);
            }
        }
        return e;
    }

    public EE difference(EE ens) {
        EE e = new EE(this.cardinal);
        for (int i = 0; i < this.cardinal; i++) {
            if (contient(ens.ensTab[i])) {
                e.retraitPratique(i);
            }
        }
        return e;
    }

    public int retraitEltAleatoirement() {
        // Pré-requis : ensemble this est non vide
        // Résultat/action : enlève un élément de this (aléatoirement) et le renvoie
        int i = Ut.randomMinMax(0, this.cardinal - 1);
        int select = retraitPratique(i);
        return select;
    }

    public int selectionEltAleatoirement() {
        // Pré-requis : ensemble this est non vide
        // Résultat : un élément quelconque de this choisi aléatoirement
        int i = Ut.randomMinMax(0, this.cardinal - 1);
        return this.ensTab[i];
    }

    public int selectionElt() {
        // Pré-requis : ensemble this est non vide
        // Résultat : un élément quelconque de this
        return this.ensTab[this.cardinal - 1];
    }

    // FIN PROGRAME

}

