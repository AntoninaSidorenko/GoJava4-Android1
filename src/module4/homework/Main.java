package module4.homework;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(123456L, "UK", Currency.USD, 100, 5000, 10, 1200000000L);
        Bank euBank = new EUBank(123456L, "DEU", Currency.EUR, 100, 5000, 10, 1200000000L);
        Bank chinaBank = new ChinaBank(123456L, "CH", Currency.USD, 100, 5000, 10, 1200000000L);

        User user1 = new User(12000, usBank, "A", 123L, 12, 5000, 60000L);
        User user2 = new User(12000, usBank, "B", 123L, 12, 5000, 60000L);
        User user3 = new User(12000, euBank, "C", 123L, 12, 5000, 60000L);
        User user4 = new User(12000, euBank, "D", 123L, 12, 5000, 60000L);
        User user5 = new User(12000, chinaBank, "E", 123L, 12, 5000, 60000L);
        User user6 = new User(12000, chinaBank, "F", 123L, 12, 5000, 60000L);

        BankSystem bankSystem = new BankSystemimpl();

        bankSystem.withdrawOfUser(user1, 1200);
        System.out.println(user1);

        bankSystem.fandUser(user2, 2000);
        System.out.println(user2);

        bankSystem.transferMoney(user3, user4, 1000);
        System.out.println(user3);
        System.out.println(user4);

        bankSystem.paySalary(user5);
        System.out.println(user5);

        bankSystem.transferMoney(user1, user6, 1000);
        System.out.println(user6);
        System.out.println(user1);


        System.out.println(usBank.moneyPaidMonthlyForSalary());


    }

}
