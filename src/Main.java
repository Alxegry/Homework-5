public class Main {
    public static void main(String[] args) {

//        Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("\nУстановите версию приложения для iOS по ссылке");
        } else {
            System.out.println("\nУстановите версию приложения для Android по ссылке");
        }

//        Задача 2
        int clientOS1 = 0;
        int clientDeviceYear = 2015;
        boolean iOSVersion = clientOS1 == 0;
        boolean androidVersion = clientOS1 == 1;
        boolean oldVersion = clientDeviceYear < 2015;
        boolean newVersion = clientDeviceYear >= 2015;
        if (iOSVersion && oldVersion) {
            System.out.println("\nУстановите облегченную версию приложения для iOS по ссылке");
        } else if (iOSVersion && newVersion) {
            System.out.println("\nУстановите версию приложения для iOS по ссылке");
        } else if (androidVersion && oldVersion) {
            System.out.println("\nУстановите облегченную версию приложения для Android по ссылке");
        } else if (androidVersion && newVersion) {
            System.out.println("\nУстановите версию приложения для Android по ссылке");
        }

//        Задача 3
        int year = 2021;
        boolean multiple4 = year % 4 == 0;
        boolean notMultiple100 = year % 100 != 0;
        boolean multiple400 = year % 400 == 0;
        boolean notModernEnough = year < 1584;
        if (notModernEnough) {
            System.out.println("\n" + year + " год не является високосным");
        } else if (multiple4 && notMultiple100 || multiple400) {
            System.out.println("\n" + year + " год является високосным");
        } else {
            System.out.println("\n" + year + " год не является високосным");
        }

//        Задача 4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (100 < deliveryDistance) {
            System.out.println("\nНа ваш адрес доставка не предусмотрена");
        } else if (0 <= deliveryDistance && deliveryDistance <= 20) {
            System.out.println("\nПотребуется дней: " + deliveryTime);
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("\nПотребуется дней: " + deliveryTime);
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("\nПотребуется дней: " + deliveryTime);
        }

//        Задача 5
        int monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("\nError");
        } else {
            switch (monthNumber) {
                case 1:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону зима");
                    break;
                case 2:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону зима");
                    break;
                case 3:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону весна");
                    break;
                case 4:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону весна");
                    break;
                case 5:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону весна");
                    break;
                case 6:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону лето");
                    break;
                case 7:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону лето");
                    break;
                case 8:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону лето");
                    break;
                case 9:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону осень");
                    break;
                case 10:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону осень");
                    break;
                case 11:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону осень");
                    break;
                case 12:
                    System.out.println("\n" + monthNumber + " месяц принадлежит к сезону зима");
                    break;
            }
        }
    }
}