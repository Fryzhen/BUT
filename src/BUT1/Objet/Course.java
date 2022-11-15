package BUT1.Objet;
import BUT1.Ut;



public class Course {
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
        /* pré-requis : (à compléter)
         * action : fait avancer this d’une distance égale à sa vitesse */
    }
    public void auDepart() {
        /* action : place this au départ de la course (à l’origine) */
    }











}
