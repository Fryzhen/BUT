package BUT1.Objet;
import BUT1.Ut;
public class Ensembles {

    private int[] ensTab;

    private int cardinal;

    public  Ensembles(int max){
        this.ensTab = new int[max];
        this.cardinal = this.ensTab.length;
    }

    public Ensembles(int max, int[] tab){
        this.ensTab = new int[max];
        this.cardinal = tab.length;
        for (int i = 0; i < cardinal; i++){
            this.ensTab[i] = tab[i];
        }
    }
    public Ensembles(int[] tab){
        this.ensTab = new int[tab.length];
        this.cardinal = tab.length;
        for (int i = 0; i < cardinal; i++){
            this.ensTab[i] = tab[i];
        }
    }

    public Ensembles(int max, String tab){
        this.ensTab = new int[max];
        this.cardinal = this.ensTab.length;
        for (int i = 0; i < cardinal; i++){
            this.ensTab[i] = Integer.parseInt(String.valueOf(tab.charAt(i)));
        }
    }

}

