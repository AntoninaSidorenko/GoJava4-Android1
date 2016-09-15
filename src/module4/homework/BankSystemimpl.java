package module4.homework;

public class BankSystemimpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {

        double commission = amount * user.getBank().getCommission(amount);
        double summ = amount + commission;
        if (user.getBank().getLimitOfWithdrawal() >= summ) {
            user.setBalance(user.getBalance() - summ);
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void fandUser(User user, int amount) {
        double commission = amount * user.getBank().getCommission(amount);
        if (commission <= user.getBank().getLimitOfFunding()) {
            user.setBalance(amount + user.getBalance() - commission);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double commission = amount * fromUser.getBank().getCommission(amount);
        double summ = amount + commission;
        if (summ <= fromUser.getBank().getLimitOfWithdrawal() && amount <= toUser.getBank().getLimitOfFunding()) {
            fromUser.setBalance(fromUser.getBalance() - summ);
            toUser.setBalance(toUser.getBalance() + amount);
        } else {
            System.out.println("Error");
        }

    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalaryOfEmploee() - user.getSalaryOfEmploee() * user.getBank().getCommission(user.getSalaryOfEmploee()));

    }
}
