//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("Задача 1");
        int ZP = 15000;
        int OLL=0;
        int i=1;
        while (OLL<2_459_000){
            OLL =OLL+ZP;
            i++;
        }System.out.println("Месяц: "+i+", сумма накоплений равна "+OLL+" рублей.");
// Задача 2
        System.out.println("Задача 2");
        int i1=0;
        while (i1<10){
            i1++;
            System.out.print( i1+" ");
        } System.out.println();
        for (;i1 >0; i1--){
            System.out.print(i1+" ");
        } System.out.println();
// Задача 3
        System.out.println("Задача 3");
        int vsego =12_000_000;
        double pups=0;
        double die=0;
        for (int j=1; j<11; j++){
            pups=pups+(vsego*17/1000);
            die=die+(vsego*8/1000);
            vsego= (int) (vsego+pups-die);
            System.out.println("Год "+j+", численность населения составляет "+vsego);
        }
// Задача 4

    }
}