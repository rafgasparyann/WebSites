public class Main {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        long a = 1L;
//        ex.155
//        while (n < 100) {
//            if (n % 3 == 0) {
//                sum += n;
//            }
//            ++n;
//        }
//        System.out.print("Sum: " + sum);

        while (n < 100) {
            if (n % 15 == 0) {
                a *= n;
            }
            n++;
        }
        System.out.print(a);
    }
}