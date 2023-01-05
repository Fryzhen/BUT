package BUT_S1.Objet;

import BUT_S1.Ut;

public class Arene {
   private EE ensOrques;
   private int nbo;
   private int taille;

   public Arene(int taille, int nbo) {
      this.nbo = nbo;
      this.taille = taille;
      this.ensOrques = new EE(nbo);
      for (int i = 1; i <= nbo; i++) {
         Orque o = new Orque(this);
         System.out.println(o.toString());
         ensOrques.ajoutElt(o.getId());
      }
   }

   public Orque bataille() {
      while (ensOrques.getCardinal() != 1) {
         int o1 = ensOrques.retraitEltAleatoirement();
         int o2 = ensOrques.retraitEltAleatoirement();
         Orque c1 = Orque.getOrqueById(o1);
         Orque c2 = Orque.getOrqueById(o2);
         Orque gagnant = c1.duel(c2);
         int idGagnant = gagnant.getId();
         ensOrques.ajoutElt(idGagnant);
         System.out.println(c1.getId() + " * " + c2.getId() + " > " + idGagnant);
      }
      return Orque.getOrqueById(ensOrques.selectionElt());
   }


}
