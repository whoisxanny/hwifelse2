public class Main {
    public static void main(String[] args) {
        int clientOs = 0;
        int clientDeviceYear = 2016;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }



        int year = 2021;
        if (year >= 1584) {
            if (year % 4 == 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным ))");
            }else {
                System.out.println(year + " год не является високосным !!!");
            }
        }


        int deliveryDistance = 65;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
            System.out.println("Потребуется дней: " + days);
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Вы живете так далёко, что курьер чисто физически до вас не доберётся. Прости! Желаю вам купить квартиру в Сити");
        }




        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Something got wrong :(");
        }

    }
}