public class TurmDemo {
    public static void main(String[] args) {
        int a = 1;
        int count = 2;

        while (count <= 10) {

            int summ = a * count;
            System.out.println(a + " * " + count + " = " + summ);
            count++;
            a = summ;

        }

    }

}

