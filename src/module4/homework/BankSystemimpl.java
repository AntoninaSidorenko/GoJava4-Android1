package module4.homework;

public class BankSystemimpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {

        double commission = amount * user.getBank().getCommission(amount);
        if (user.getBank().getLimitOfFunding() >= amount + commission) {
            double newBalance = user.getBalance() - amount - commission;
            user.setBalance(newBalance);
        }

    }

    @Override
    public void fandUser(User user, int amount) {
        double commission = amount * user.getBank().getCommission(amount);
        if (amount <= user.getBank().getLimitOfFunding()) {
            user.setBalance(amount + user.getBalance() - commission);
        }


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double commission = amount * fromUser.getBank().getCommission(amount);
        if (amount <= fromUser.getBank().getLimitOfWithdrawal() || amount > toUser.getBank().getLimitOfFunding()) {
            fromUser.setBalance(fromUser.getBalance() - amount - commission);
            toUser.setBalance(toUser.getBalance() + amount);
        }

    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalaryOfEmploee() - user.getSalaryOfEmploee() * user.getBank().getCommission(user.getSalaryOfEmploee()));

    }
}
