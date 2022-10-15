public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");

        for (int i=1; i<=10; i++) {
        System.out.println(i);
    }
          //Задание 2
        System.out.println("Задание 2");

        for (int b=10; b>=1; b--) {
            System.out.println(b);
        }
      //Задание 3
        System.out.println("Задание 3");

        for (int c=0; c<=17; c=c+2) {
            System.out.println(c);
        }
    //Задание 4
        System.out.println("Задание 4");

        for (int v=10; v>=-10; v--) {
            System.out.println(v);
        }

        //Домашнее задание -2
        //Задание 1
        System.out.println("Домашнее задание -2");
        System.out.println("Задание 1");

        for (int n=1904; n<=2096; n=n+4) {
            System.out.println(n+" год является високосным");
        }

        //Задание 2
         System.out.println("Задание 2");

        for (int m=7; m<=98; m=m+7) {
            System.out.print(m+" ");
        }
        System.out.println();
        //Задание 3
         System.out.println("Задание 3");

        for (int z=1; z<=512; z=z*2) {
            System.out.print(z +" ");
        }
        System.out.println();
        //Домашнее задание - 3
        //Задание 1
         System.out.println("Домашнее задание - 3");
         System.out.println("Задание 1");
         int salary=29000;
         int total=0;
         for (int w=1; w<=12; w++) {
             total=salary+total;
            System.out.println("Месяц "+w+", сумма накоплений равна "+total+" рублей");
         }
         //Задание 2
         System.out.println("Задание 2");
         int salary2=29000;
         int total2=0;
         for (int e=1; e<=12; e++) {
             total2=total2+total2/100;
             total2=salary2+total2;
            System.out.println("Месяц "+e+", сумма накоплений равна "+total2+" рублей");
        }
    }
}