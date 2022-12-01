package BUT_S1.Matrices;
import BUT_S1.Ut;
public class TD4 {
    public static int[][] addMatrice(int[][] mat1, int[][] mat2) {
        int [][] matsum = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1.length; j++){
                matsum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return  matsum;
    }

    public static int addMatriceDiago(int[][] mat) {
        int matsum = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (i == j){
                matsum += mat[i][j];
                matsum += mat[mat.length - i - 1][j];
                }
            }
        }
        if (mat.length % 2 == 1)
            matsum -= mat[(mat.length)/2][(mat.length)/2];
        return  matsum;
    }

    public static void calcMatriceNull(int[][] mat){
        int sum = 0;
        int nonull = 0;
        int lignenull = -1;
        int nombrenull = 0;
        int newnombrenull = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == 0){
                    newnombrenull += 1;
                }
                if (mat[i][j] != 0 && nonull == 0){
                    nonull += 1;
                }
                if (mat[i][j] == 0){
                    sum += 1;
                }
            }
            if (newnombrenull > nombrenull){
                lignenull = i;
                nombrenull = newnombrenull;
            }
        }
        Ut.afficher(sum);
        Ut.sautLigne();
        if (nonull == 1){
            Ut.afficher("True");
        }
        Ut.sautLigne();
    }

    public static void  spirale(int z){
        int [][] mat = new int[z][z];
        int x = 0;
        int y = 0;
        int direction = 0;
        for (int a = 0; a < Math.pow(x,2); a++){
            if (direction == 0 && x == z){
                direction = 1;
            } else if (direction == 1 && y == z) {
                direction = 2;
            } else if (direction == 2 && x == 0) {
                direction = 3;
            } else if (direction == 3 && y == 0) {
                direction = 0;
            }
            if (direction == 0){
                x += 1;
            } else if (direction == 1) {
                y += 1;
            } else if (direction == 2) {
                x -= 1;
            } else if (direction == 3) {
                y -= 1;
            }

            mat[x][y] = a;
        }
    }





    public static void main(String[] arg) {
        spirale(4);
    }
}
