package BUT1.Objet;

import BUT1.Ut;

public class Ensembles {

    private int[] ensTab;

    private int cardinal;

    public Ensembles(int max) {
        this.ensTab = new int[max];
        this.cardinal = this.ensTab.length;
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

    public String toString() {
        String ligne = "";
        for (int i = 0; i < this.cardinal; i++) {
            ligne += this.ensTab[i] + " ";
        }
        return ligne;
    }

    public int getCardinal() {
        return this.cardinal;
    }

    public int contientPratique(int num) {
        for (int i = 0; i < cardinal; i++){
            if (ensTab[i] == num){return i;}
        }
        return -1;
    }

    public boolean contient(int num) {
        for (int i = 0; i < cardinal; i++){
            if (ensTab[i] == num){return true;}
        }
        return false;
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

}

