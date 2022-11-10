public class TD1 {
    public static void  ex18(){

        int n = Ut.saisirEntier();
        int p = Ut.saisirEntier();
        int i = 0;

        while (n > p){
            i = i + 1;
            n = n - p;
        }
        Ut.afficher(i);
        Ut.afficher("");
        Ut.afficher(n);
        }

    public static void  ex19(){

        double e =  Ut.saisirReel();
        double p = Math.PI;
        int s = 1;
        int g = 1;

        while (s - (p / 4) > e){
            g += 2;
            s = s - (1 / g);
        }

        Ut.afficher(s);

    }

    public static void main(String[] arg){

        ex18();
    }

}
