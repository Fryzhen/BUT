package BUT_S1.Objet;

import BUT_S1.Ut;

import java.util.SplittableRandom;

public class Orque {
   private int id;
   private int pv;
   private int att;
   private int pre;
   private Arene arene;
   private static int nbOrques;
   private static Orque[] tabOrques = new Orque[1000];


   public Orque(Arene arene) {
      nbOrques++;
      this.id = nbOrques;
      this.pv = Ut.randomMinMax(50, 500);
      this.att = Ut.randomMinMax(5, 20);
      this.pre = Ut.randomMinMax(1,100);
      this.arene = arene;
      tabOrques[nbOrques] = this;
   }

   @Override
   public String toString() {
      String str = "id  : " + id + "  pv  : " + pv + "  pre : " + pre + "  att : " + att + " ";
      return str;
   }

   static Orque getOrqueById(int ident) {
      return tabOrques[ident];
   }

   public int getId() {
      return id;
   }

   public Orque duel(Orque c) {
      int cpv = c.pv;
      int tpv = pv;
      while (true){
         if (tpv <= 0){
            return c;
         }
         if (cpv <= 0){
            return this;
         }
         if (pre >= Ut.randomMinMax(1,100)){
            cpv -= att;
         }
         if (c.pre >= Ut.randomMinMax(1,100)){
            tpv -= c.att;
         }
      }
   }
}
