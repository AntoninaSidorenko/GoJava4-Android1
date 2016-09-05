package module4.offline.task1;

public class Main {
    public static void main(String[] args) {

        MoneyConverter moneyConverter = new Calc();
        Calc calc = new Calc();
        demonstrate(moneyConverter, 100);
        demonstrate(calc, 100);


    }

    private static void demonstrate(MoneyConverter moneyConverter, int moneyCount) {
        System.out.println(moneyConverter.convertFromUsd(moneyCount));
    }
    private static void demonstrate(Calc calc, int moneyCount) {
        System.out.println(calc.convertFromUsd(moneyCount));

    }
}
