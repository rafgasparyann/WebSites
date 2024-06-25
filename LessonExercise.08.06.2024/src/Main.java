import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//        2023

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 9;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = 12;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println((double) sum / arr.length);

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(9);
        array1.add(2);
        array1.add(5);
        array1.add(12);
        for (int i = 0; i < array1.size(); i++) {
            sum += array1.get(i);
        }
        System.out.println((double) sum / array1.size());

//        2024

        array1.add(8);
        int sum1 = 0;
        for (int i = 0; i < array1.size(); i++) {
            sum1 += array1.get(i);
        }
        System.out.println((double) sum1 / array1.size());
        array1.remove(0);
//        array1.removeAll(array1);

        array1.add(3, 6);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i) + " ");
        }

        Student student = new Student("Poghos", "Poghosyan", 20);
        Student student1 = new Student("Jack", "Williams", 19);
        Student student2 = new Student("Stepan", "Stepanyan", 18);
        Student student3 = new Student("Artash", "Artashesyan", 19);
        Student student4 = new Student("Meline", "Meliqyan", 17);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getName() + " " + studentList.get(i).getsName() + " " + studentList.get(i).getAge());
        }

        HashSet<Integer>hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
//        for (int i = 0; i < hashSet.size(); i++) {
//
//        }
    }
}