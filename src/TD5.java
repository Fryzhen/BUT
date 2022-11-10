public class TD5 {

    public static String chiffresRomains(int ininombre) {
        String rome = "";

        int nombre = ininombre/1000;

        if (nombre % 10 == 0) {
            rome += "";
        } else if (nombre % 10 == 1) {
            rome += "M";
        } else if (nombre % 10 == 2) {
            rome += "MM";
        } else if (nombre % 10 == 3) {
            rome += "MMM";
        }

        nombre = ininombre/100;

        if (nombre % 10 == 0) {
            rome += "";
        } else if (nombre % 10 == 1) {
            rome += "C";
        } else if (nombre % 10 == 2) {
            rome += "CC";
        } else if (nombre % 10 == 3) {
            rome += "CCC";
        } else if (nombre % 10 == 4) {
            rome += "CD";
        } else if (nombre % 10 == 5) {
            rome += "D";
        } else if (nombre % 10 == 6) {
            rome += "DC";
        } else if (nombre % 10 == 7) {
            rome += "DCC";
        } else if (nombre % 10 == 8) {
            rome += "DCCC";
        } else if (nombre % 10 == 9) {
            rome += "CM";
        }

        nombre = ininombre/10;

        if (nombre % 10 == 0) {
            rome += "";
        } else if (nombre % 10 == 1) {
            rome += "X";
        } else if (nombre % 10 == 2) {
            rome += "XX";
        } else if (nombre % 10 == 3) {
            rome += "XXX";
        } else if (nombre % 10 == 4) {
            rome += "XL";
        } else if (nombre % 10 == 5) {
            rome += "L";
        } else if (nombre % 10 == 6) {
            rome += "LX";
        } else if (nombre % 10 == 7) {
            rome += "LXX";
        } else if (nombre % 10 == 8) {
            rome += "LXXX";
        } else if (nombre % 10 == 9) {
            rome += "XC";
        }

        nombre = ininombre;

        if (nombre % 10 == 0) {
            rome += "";
        } else if (nombre % 10 == 1) {
            rome += "I";
        } else if (nombre % 10 == 2) {
            rome += "II";
        } else if (nombre % 10 == 3) {
            rome += "III";
        } else if (nombre % 10 == 4) {
            rome += "IV";
        } else if (nombre % 10 == 5) {
            rome += "V";
        } else if (nombre % 10 == 6) {
            rome += "VI";
        } else if (nombre % 10 == 7) {
            rome += "VII";
        } else if (nombre % 10 == 8) {
            rome += "VIII";
        } else if (nombre % 10 == 9) {
            rome += "IX";
        }



        return rome;
    }

    public static boolean estCarreParfait(int num){
        int n = (int) Math.sqrt(num);
        if (n*n!=num){
            return false;
        }else {
            return true;
        }
    }
    public static void estTriangle(int num1, int num2){
        if (estCarreParfait(num1 * num1 + num2 * num2)){
            Ut.afficher("Oui");
        }else{
            Ut.afficher("Non");
        }



    }

    public static void main(String[] arg){
        estTriangle(8,6);
    }
}

