
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       printYear(2020);
       printMobile(0, 2023);
       int deliveryDay = printDelivery(55) ;
       if (deliveryDay != -1) {
           System.out.println("Колл-во дней доставки: " + deliveryDay);
       } else {
           System.out.println("Доставки нет");
       }



    }



    public static void printYear (int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный ");
        } else {
            System.out.println(year + " - не високосный");
        }
    }




    public static void printMobile (int os , int mobileYear) {
        if (os != 0 && os != 1){
            System.out.println("Значение должно быть 0 или 1");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        if (mobileYear < currentYear && os == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }if (mobileYear < currentYear && os == 1) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }if (mobileYear == currentYear && os == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }if (mobileYear == currentYear && os == 1 ) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }


    }

    public static int printDelivery (int distance) {
        if (distance > 100 || distance < 0) {
            return -1;
        }if (distance < 20) {
            return 1;
        }if (distance > 20 && distance < 60) {
            return 2;
        }if (distance > 60) {
            return 3;
        }return distance;
    }



}