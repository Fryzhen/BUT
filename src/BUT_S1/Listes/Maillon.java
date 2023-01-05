package BUT_S1.Listes;

public class Maillon {

    private int valeur;
    private Maillon suivant;


    /**
     * Constructeur à partir d'une valeur entière
     */
    public Maillon(int n) {
        valeur = n;
        suivant = null;
    }

    /**
     * Accesseurs
     */

    public int getVal() {
        return this.valeur;
    }

    public void setVal(int v) {
        this.valeur = v;
    }

    public Maillon getSuiv() {
        return this.suivant;
    }

    public void setSuiv(Maillon m) {
        this.suivant = m;
    }

    /**
     * Pour l'affichage
     */

    public String toString() {
        return Integer.toString(this.valeur);
    }

    /* -------------------------------------------------- */

}
