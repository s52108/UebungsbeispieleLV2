public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        int temp = 6;
        boolean rutschig = false;

        if (isWinterreifenPflicht(temp, rutschig)) {
            System.out.println("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }
    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {
        boolean winterreifenpflicht = false;
        if (temperatur < 10 && rutschigeFahrbahn == true) {
            winterreifenpflicht = true;
        } else if (temperatur < 4) {
            winterreifenpflicht = true;
        }
        return winterreifenpflicht;
    }
}
