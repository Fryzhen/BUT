package BUT1.Objet;


public class Voiture {
    private String nom;
    private int position;
    private int vitesse;


    public Voiture(String unNom, int uneVitesse) {
        this.nom = unNom;
        this.vitesse = uneVitesse;

    }
    public String toString() {
        return "Nom : " + this.nom + " Vitesse : " + this.vitesse + " |Position : " + this.position + " ";
    }
    public String toString2() {
        /* résultat : retourne une chaîne de caractères formée d’une suite d’espaces
         * suivie de la première lettre du nom de this, suivie d’un retour
         * à la ligne, le nombre d’espaces étant égal à la position de this.
         */
        String ligne = " " * this.position + this.nom[0];
        return ligne;
    }
    public String leNom() {
        return this.nom;
    }
    public boolean depasse(int limite) {
        /* résultat : retourne vrai si et seulement si la position de this est
         * supérieure ou égale à limite
         */
        return this.position >= limite;
    }
    public void avance() {
        this.position += this.position+this.vitesse;
    }
    public void auDepart() {
        this.position = 0;
    }











}
