package BUT_S1.Objet;


public class Voiture {
    private String nom;
    private int position;
    private int vitesse;


    public Voiture(String unNom, int uneVitesse) {
        this.nom = unNom;
        this.vitesse = uneVitesse;

    }
    public String toString() {
        return "Nom : " + this.nom + " \nVitesse : " + this.vitesse + " \nPosition : " + this.position + " ";
    }
    public String toString2() {
        /* résultat : retourne une chaîne de caractères formée d’une suite d’espaces
         * suivie de la première lettre du nom de this, suivie d’un retour
         * à la ligne, le nombre d’espaces étant égal à la position de this.
         */
        String chaine = "";
            for(int i =0; i < this.position; i++){
                chaine += " ";
            }
            chaine += this.nom.charAt(0);
        return chaine;
    }
    public String leNom() {
        return this.nom;
    }
    public void faitDemiTour(){
        this.vitesse *= -1;
    }
    /* action : fait faire un demi-tour à this */
    public boolean depasse(int limite) {
        /* résultat : retourne vrai si et seulement si la position de this est
         * supérieure ou égale à limite
         */
        return this.position >= limite;
    }
    public void avance() {
        this.position += this.vitesse;
    }
    public void auDepart() {
        this.position = 0;
    }
}
