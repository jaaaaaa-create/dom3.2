//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("Задача 1");
        int ZP = 15000;
        int OLL = 0;
        int i = 1;
        while (OLL < 2_459_000) {
            OLL = OLL + ZP;
            i++;
        }
        System.out.println("Месяц: " + i + ", сумма накоплений равна " + OLL + " рублей.");
// Задача 2
        System.out.println("Задача 2");
        int i1 = 0;
        while (i1 < 10) {
            i1++;
            System.out.print(i1 + " ");
        }
        System.out.println();
        for (; i1 > 0; i1--) {
            System.out.print(i1 + " ");
        }
        System.out.println();
// Задача 3
        System.out.println("Задача 3");
        int vsego = 12_000_000;
        double pups = 0;
        double die = 0;
        for (int j = 1; j < 11; j++) {
            pups = (vsego * 17 / 1000);
            die = (vsego * 8 / 1000);
            vsego = (int) (vsego + pups - die);
            System.out.println("Год " + j + ", численность населения составляет " + vsego);
        }
// Задача 4
        System.out.println("Задача 4");
        int oll = 15_000;
        int k = 0;
        while (oll <= 12_000_000) {
            k++;
            oll = oll + (oll * 7 / 100);
            System.out.println("Месяц: " + k + ", суммна накоплений: " + oll);
        }
// Задача 5
        System.out.println("Задача 5");
        int oll1 = 15_000;
        int t = 0;
        while (oll1 <= 12_000_000) {
            t++;
            oll1 = oll1 + (oll1 * 7 / 100);
            if (t % 6 == 0) {
                System.out.println("Месяц: " + t + ", суммна накоплений: " + oll1);
            }
        }
        System.out.println("Месяц: " + t + ", суммна накоплений: " + oll1);
// Задача 6
        System.out.println("Задача 6");
        int oll2 = 15_000;
        int g = 0;
        int polYear = 0;
        while (g < 9 * 12) {
            g++;
            oll2 = oll2 + (oll2 * 7 / 100);
            if (g % 6 == 0) {
                polYear = polYear + 1;
                System.out.println("Полугодие: " + polYear + "е, суммна накоплений: " + oll2);
            }
        }
// Задача 7
        System.out.println("Задача 7");
        int firstFry = 2;
        for (int day = firstFry = 4; day <= 31; day = day + 7)
        {
            System.out.println(day);
        }
// Задача 8
        System.out.println("Задача 8");
        int seychas=2054;
        int ransche=seychas-200;
        int potom =seychas+100;
        for (int year = 0; year<=potom; year++){
            if (year>=ransche && year%79==0){
                System.out.println(year);
            }
        }
    }
}