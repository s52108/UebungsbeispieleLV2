public class NotenDemo {
    public static void main(String[] args) {
        System.out.println(getNotentext(50));

    }

    public static String getNotentext(int punkte) {
        if (punkte >= 90) {
            return "Sehr gut";
        } else if (punkte >= 78) {
            return "Gut";
        } else if (punkte >= 65) {
            return "Befriedigend";
        } else if (punkte >= 51) {
            return "Genügend";
        }
        return "Ungenügend";
    }
}
