public class Main {
    public static void main(String[] args) {
//        1) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j < array.length - 1; j++) {
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        II) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, -6, 7, 8, 9, 10};
//        int index = 0;
//        int sum = 0;
//        boolean found = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                found = true;
//                index = i;
//                break;
//            }
//        }
//        if (found == false) {
//            System.out.println("In array hasn't negative number");
//        } else {
//            for (int i = 0; i < index; i++) {
//                sum += array[i];
//            }
//            System.out.println(sum);
//        }
//
//        3) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                sum1 += array[i];
//            }
//            else {
//                sum2 += array[i];
//            }
//        }
//        System.out.println("Sum even of index elements: " + sum1 + " " + "Sum odd of value elements: " + sum2);
//
//        4) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, -6, 7, 8, 9};
//        int averageOfPositiveElements = 0;
//        int sum = 0;
//        int positiveElements = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                sum += array[i];
//                positiveElements++;
//                averageOfPositiveElements = sum / positiveElements;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                array[i] = array[i] * -1;
//            }
//            if (array[i] > averageOfPositiveElements) {
//                count++;
//            }
//        }
//        System.out.println("Count: " + count);

    }
}