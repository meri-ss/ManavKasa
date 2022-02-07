import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double tutar=0;

        Scanner input=new Scanner(System.in);

        System.out.println("Armut Kaç Kilo :");
        int armutKg=input.nextInt();
        tutar+=armutKg*armut;

        System.out.println("Elma Kaç Kilo :");
        int elmaKg=input.nextInt();
        tutar+=elmaKg*elma;

        System.out.println("Domates Kaç Kilo :");
        int domatesKg=input.nextInt();
        tutar+=domatesKg*domates;

        System.out.println("Muz Kaç Kilo :");
        int muzKg=input.nextInt();
        tutar+=muzKg*muz;

        System.out.println("Patlıcan Kaç Kilo :");
        int patlicanKg=input.nextInt();
        tutar+=patlicanKg*patlican;

        System.out.println("Toplam Tutar :" +tutar);



    }
}
