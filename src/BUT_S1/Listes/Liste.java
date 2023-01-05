package BUT_S1.Listes;

public class Liste {

    private Maillon tete;

    public Liste() {
        tete = null;
    }

    public Liste(int x) {
        tete = new Maillon(x);
    }

    public Liste(int[] tabListe) {
        this(); // Liste()
        if (tabListe.length > 0) {
            this.tete = new Maillon(tabListe[0]);
            Maillon curThis = this.tete;
            for (int i = 1; i < tabListe.length; i++) {
                curThis.setSuiv(new Maillon(tabListe[i])); // creation et accrochage du maillon suivant
                curThis = curThis.getSuiv();
            }
        }
    }

    public Liste(Liste l) { // constructeur par recopie profonde
        this();
        if (!l.estVide()) {

            this.tete = new Maillon(l.tete.getVal());
            Maillon curThis = this.tete;
            Maillon curL = l.tete.getSuiv();

            while (curL != null) {
                curThis.setSuiv(new Maillon(curL.getVal())); // creation et accrochage du maillon suivant
                curThis = curThis.getSuiv();
                curL = curL.getSuiv();
            }
        }
    }

    public boolean estVide() {
        return (this.tete == null);
    }

    public void ajoutTete(int x) {
        Maillon m = new Maillon(x);
        m.setSuiv(this.tete);
        this.tete = m;
    }

    public boolean contient(int x) {
        Maillon courant = this.tete;
        while (courant != null && courant.getVal() != x) {
            courant = courant.getSuiv();
        }
        return courant != null;
    }

    public String toString() {
        String s = "(";
        Maillon courant = this.tete;
        while (courant != null) {
            s = s + (courant.getVal()) + ((courant.getSuiv() != null) ? ", " : "");
            courant = courant.getSuiv();
        }
        return s + ")";
    }

    public int longueur() {
        if (estVide()) {
            return 0;
        }
        int x = 1;
        Maillon m = tete;
        while (m.getSuiv() != null) {
            m = m.getSuiv();
            x++;
        }
        return x;
    }

    public int somme() {
        if (estVide()) {
            return 0;
        }
        int x = tete.getVal();
        Maillon m = tete;

        while (m.getSuiv() != null) {
            m = m.getSuiv();
            x += m.getVal();
        }
        return x;
    }

    public int max() {
        int x = tete.getVal();
        Maillon m = tete;
        while (m.getSuiv() != null) {
            m = m.getSuiv();
            if (x < m.getVal()) {
                x = m.getVal();
            }
        }
        return x;
    }

    public int occurrences(int y) {
        if (estVide()) {
            return 0;
        }
        int x = 0;
        Maillon m = tete;
        if (m.getVal() == y) {
            x++;
        }
        while (m.getSuiv() != null) {
            m = m.getSuiv();
            if (m.getVal() == y) {
                x++;
            }
        }
        return x;

    }

    public boolean estClone(Liste l) {
        if (estVide() && l.estVide()) {
            return true;
        }
        if (estVide() || l.estVide()) {
            return false;
        }
        int x = 0;
        Maillon m = tete;
        Maillon p = l.tete;
        if (m.getVal() != p.getVal()) {
            return false;
        }
        while (m.getSuiv() != null) {
            m = m.getSuiv();
            p = p.getSuiv();
            if (m.getVal() != p.getVal()) {
                return false;
            }
        }
        return true;
    }

    public boolean estSupK(int k) {
        if (estVide()) {
            return true;
        }
        int x = 1;
        Maillon m = tete;
        while (m.getSuiv() != null) {
            x++;
            if (x == k) {
                return true;
            }
            m = m.getSuiv();
        }
        return false;
    }

    private Maillon dernierMaillon() {
        int x = 1;
        Maillon m = tete;
        while (m.getSuiv() != null) {
            m = m.getSuiv();
        }
        return m;
    }

    public int dernierElt() {
        return dernierMaillon().getVal();
    }

    public void ajoutFin(int n) {
        Maillon m = dernierMaillon();
        Maillon newdernier = new Maillon(n);
        m.setSuiv(newdernier);
    }

    public void ajoutFinSiAbsent(int n) {
        if (!contient(n)&&!estVide()) {
            Maillon m = dernierMaillon();
            Maillon newdernier = new Maillon(n);
            m.setSuiv(newdernier);
        }
    }

    public Liste extractionImpairs() {
        if (estVide()) {
            return this;
        }
        Liste l = new Liste();
        Maillon m = tete;
        if (m.getVal() %2 == 0){
            l.ajoutFin(m.getVal());
        }
        while (m.getSuiv() != null) {
            m = m.getSuiv();
            if (m.getVal() %2 == 0){
                l.ajoutFin(m.getVal());
            }
        }
        return l;
    }

    public void tronquerK(int i) {
    }

    public boolean supprOcc(int n) {
        return false;
    }

    public Liste inverse() {
        return new Liste();
    }

    public void inverseRec() {
    }

    private Maillon inverseRec(Maillon m) {
        return m;
    }

    public void suppToutesOcc(int n) {
    }

    public boolean sousListe(Liste l) {
        return false;
    }

    private boolean estPrefixe(Maillon m) {
        return false;
    }


/*





    estClone(){}
*/
} // end class
