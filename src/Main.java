
import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static int printScannerInt () {
        Scanner scanner = new Scanner((System.in));
        int enterANumber = scanner.nextInt();
        return enterANumber;
    }

    public static String printScannerString () {
        Scanner scanner = new Scanner((System.in));
        String string = scanner.next();
        return string;
    }

    public static void printYear () {
        System.out.println("Введите год: ");
        int year = printScannerInt();
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный ");
        } else {
            System.out.println(year + " - не високосный");
        }

    }


    public static void  printYaerMobile () {
        System.out.println("Введите год телефона: ");
        int yaermobile = printScannerInt();
        System.out.println("Если у вас Android введите - 0 , если IOS - 1 : ");
        int mobileName = printScannerInt();
        int android = 0;
        int iOS = 1;
        int currentYear = LocalDate.now().getYear();
        if (yaermobile < currentYear && mobileName == android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (yaermobile < currentYear && mobileName == iOS) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        if (yaermobile == currentYear && mobileName == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (yaermobile == currentYear && mobileName == iOS) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }

    }

    public static void  delivery () {

        System.out.println("Введите расстояние в КМ: ");
        int scanerdelivery = printScannerInt();
        if (scanerdelivery < 20){
            System.out.println("Потребуется дней для доставки: 1");
        } if (scanerdelivery >= 20 && scanerdelivery < 60){
            System.out.println("Потребуется дней для доставки: 2");
        } if (scanerdelivery >= 60 && scanerdelivery < 100){
            System.out.println("Потребуется дней для доставки: 3");
        } else if (scanerdelivery > 100) {
            System.out.println("Доставки нет");
        }


    }




    public static void main(String[] args) {
        System.out.println("Задача 1");
        printYear();
        System.out.println("Задача 2");
        printYaerMobile();
        System.out.println("Задача 3");
        delivery();





    }


}