public class Main {
    public static void main(String[] args) {

        double initialBalance = 200.37; //начальный баланс
        double depositAmount = 1350; //сумма пополнения

        int bonus; //бонус
        int totalBalance; //итоговый баланс

        if (depositAmount > 100) {
            bonus = (int) (depositAmount / 100);
            totalBalance = (int) (initialBalance + depositAmount + bonus);
            System.out.println("Итоговый баланс: " + totalBalance);
            System.out.println("Начислено бонусов: " + bonus);

        } else {
            totalBalance = (int) (initialBalance + depositAmount);
            System.out.println("Итоговый баланс: " + totalBalance);
            System.out.println("Начислено бонусов: 0");
        }

    }

}

