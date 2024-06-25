import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        513)
//
        char[] array = {'a', '0', 'd', 'x', '0', 'e', 'f', '0', 'h'};
        int count = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'x') {
                found = true;
                int index;
                index = i;
                for (int j = index; j < array.length; j++) {
                    if (array[j] == '0'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
//
//        4.22)
//
//        // Ստեղծում ենք Scanner օբյեկտ՝ օգտատիրոջ մուտքերը կարդալու համար
//        Scanner input = new Scanner(System.in);
//
//        // Օգտատիրոջից հարցնում ենք առաջին տողը
//        System.out.print("Մուտքագրեք առաջին տողը: ");
//        String firstString = input.nextLine();
//
//        // Օգտատիրոջից հարցնում ենք երկրորդ տողը
//        System.out.print("Մուտքագրեք երկրորդ տողը: ");
//        String secondString = input.nextLine();
//
//        // Ստուգում ենք, արդյոք երկրորդ տողը առաջին տողի ենթատողն է
//        if (firstString.contains(secondString)) {
//            System.out.println("Երկրորդ տողը առաջին տողի ենթատողն է:");
//        } else {
//            System.out.println("Երկրորդ տողը առաջին տողի ենթատողը չէ:");
//        }
//
//
//        4.23
//
        // Ստեղծում ենք Scanner օբյեկտ՝ օգտատիրոջ մուտքերը կարդալու համար
//        Scanner input = new Scanner(System.in);
//
//        // Մուտքագրում ենք աշխատակցի անունը
//        System.out.print("Մուտքագրեք աշխատակցի անունը: ");
//        String name = input.nextLine();
//
//        // Մուտքագրում ենք շաբաթվա ընթացքում աշխատած ժամերի քանակը
//        System.out.print("Մուտքագրեք շաբաթվա ընթացքում աշխատած ժամերի քանակը: ");
//        double hoursWorked = input.nextDouble();
//
//        // Մուտքագրում ենք ժամավճարը
//        System.out.print("Մուտքագրեք ժամավճարը: ");
//        double hourlyRate = input.nextDouble();
//
//        // Մուտքագրում ենք դաշնային հարկի պահման տոկոսադրույքը
//        System.out.print("Մուտքագրեք դաշնային հարկի պահման տոկոսադրույքը (օրինակ, 20, եթե 20%): ");
//        double federalTaxRate = input.nextDouble() / 100;
//
//        // Մուտքագրում ենք նահանգային հարկի պահման տոկոսադրույքը
//        System.out.print("Մուտքագրեք նահանգային հարկի պահման տոկոսադրույքը (օրինակ, 9, եթե 9%): ");
//        double stateTaxRate = input.nextDouble() / 100;
//
//        // Հաշվարկում ենք համախառն աշխատավարձը
//        double grossPay = hoursWorked * hourlyRate;
//
//        // Հաշվարկում ենք դաշնային հարկի պահումը
//        double federalTax = grossPay * federalTaxRate;
//
//        // Հաշվարկում ենք նահանգային հարկի պահումը
//        double stateTax = grossPay * stateTaxRate;
//
//        // Հաշվարկում ենք ընդհանուր հարկը
//        double totalTax = federalTax + stateTax;
//
//        // Հաշվարկում ենք զուտ աշխատավարձը
//        double netPay = grossPay - totalTax;
//
//        // Տպում ենք հաշվարկային թերթիկը
//        System.out.println("\nՀաշվարկային թերթիկ:");
//        System.out.println("Աշխատակցի անունը: " + name);
//        System.out.println("Աշխատած ժամերի քանակը: " + hoursWorked);
//        System.out.printf("Ժամավճար: $%.2f\n", hourlyRate);
//        System.out.printf("Համախառն աշխատավարձ: $%.2f\n", grossPay);
//        System.out.printf("Դաշնային հարկի պահում (%.2f%%): $%.2f\n", federalTaxRate * 100, federalTax);
//        System.out.printf("Նահանգային հարկի պահում (%.2f%%): $%.2f\n", stateTaxRate * 100, stateTax);
//        System.out.printf("Ընդհանուր հարկ: $%.2f\n", totalTax);
//        System.out.printf("Զուտ աշխատավարձ: $%.2f\n", netPay);
//
//        4.24)
//
//        // Ստեղծում ենք Scanner օբյեկտ՝ օգտատիրոջ մուտքերը կարդալու համար
//        Scanner input = new Scanner(System.in);
//
//        // Օգտատիրոջից հարցնում ենք երեք քաղաքի անուններ
//        System.out.print("Մուտքագրեք առաջին քաղաքի անունը: ");
//        String city1 = input.nextLine();
//
//        System.out.print("Մուտքագրեք երկրորդ քաղաքի անունը: ");
//        String city2 = input.nextLine();
//
//        System.out.print("Մուտքագրեք երրորդ քաղաքի անունը: ");
//        String city3 = input.nextLine();
//
//        // Գլխավոր քաղաքները դնում ենք զանգվածում
//        String[] cities = {city1, city2, city3};
//
//        // Զանգվածը տեսակավորում ենք աճման կարգով
//        Arrays.sort(cities);
//
//        // Տպում ենք քաղաքները աճման կարգով
//        System.out.println("Քաղաքները աճման կարգով: ");
//        for (String city : cities) {
//            System.out.println(city);
//        }
    }
}