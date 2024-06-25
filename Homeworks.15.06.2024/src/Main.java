public class Main {
    public static void main(String[] args) {
//        1.1) -------------------------------------------------------------------
//
//        int x = 50, sum = 0;
//        while (x <= 100) {
//            if (x % 2 == 0) {
//                sum += x;
//            }
//            ++x;
//        }
//        System.out.println(sum);
//
//        1.2) -------------------------------------------------------------------
//
//        int x = 50, sum = 0;
//        do {
//            if (x % 2 == 0) {
//                sum += x;
//            }
//            x++;
//        } while (x < 101);
//        System.out.println(sum);
//
//        1.3) -------------------------------------------------------------------
//
//        int x = 50, sum = 0;
//        for (int i = 50; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        3a) -------------------------------------------------------------------
//
//        sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        3b) -------------------------------------------------------------------
//
//        sum = 0;
//        for (int i = 100; i >= 1; i--) {
//            if (i % 3 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        3g) -------------------------------------------------------------------
//
//        int x = 1, sum = 0;
//        while (x <= 100){
//            if (x % 3 == 0){
//                sum += x;
//            }
//            x++;
//        }
//        System.out.println(sum);
//
//        3d) -------------------------------------------------------------------
//
//        int x = 1, sum = 0;
//        do {
//            if (x % 3 == 0) {
//                sum += x;
//            }
//            x++;
//        } while (x <= 100);
//        System.out.println(sum);
//
//        4) -------------------------------------------------------------------
//
//        int max = 0;
//        for (int i = 10000; i <= 99999; i++) {
//            if (i % 12 == 0) {
//                max = i;
//            }
//        }
//        System.out.println(max);
//
//        9) -------------------------------------------------------------------
//
//        int[] numbers = new int[10];
//        numbers[0] = 86;
//
//        for (int i = 1; i < 10; i++) {
//            numbers[i] = numbers[i - 1] - 3;
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        10) -------------------------------------------------------------------
//
//        int[] numbers = new int[15];
//        numbers[0] = 3;
//
//        for (int i = 1; i < 15; i++) {
//            numbers[i] = numbers[i - 1] * 3;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        20) -------------------------------------------------------------------
//
//        int count = 0;
//        int number = 0;
//
//        while (count < 100) {
//            if (isPrime(number) == true) {
//                System.out.print(number + " ");
//                count++;
//            }
//            number++;
//        }
//
//        22) -------------------------------------------------------------------
//
//        int[] numbers = new int[20];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random() * 101);
//        }
//
//        int max = numbers[0], min = numbers[0], maxIndex = 0, minIndex = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//                maxIndex = i;
//            }
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//                minIndex = i;
//            }
//        }
//
//        for (int x : numbers) {
//            System.out.print(x + " ");
//        }
//
//        System.out.print("\n max: " + max + ",                                  |||             index: " + maxIndex);
//        System.out.print("\n min: " + min+ ",                                   |||             index: " + minIndex);
//        System.out.print("\n max - min = " + (max - min));
//
//        23a) -------------------------------------------------------------------
//
//        int n = 9;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(n + " ");
//            }
//            System.out.println();
//        }
//
//        23b) -------------------------------------------------------------------
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//
//        23g) -------------------------------------------------------------------
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(i*10 + " ");
//            }
//            System.out.println();
//        }
//
//        23d) -------------------------------------------------------------------
//
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(i*10+2 + " ");
//            }
//            System.out.println();
//        }
//
//        23e) -------------------------------------------------------------------
//
//        for (int i = 0; i < 7; i++) {
//            for (int j = 1; j < 15; j++) {
//                System.out.print(j+1 + " ");
//            }
//            System.out.println();
//        }
//
//        23z) -------------------------------------------------------------------
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 14; j > 3; j--) {
//                System.out.print(j+1 + " ");
//            }
//            System.out.println();
//        }
//
//        23!e) -------------------------------------------------------------------
//
//        for (int i = 0; i <= 10; i += 2) {
//            for (int j = 0; j <= 10; j += 2) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
    }


    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
