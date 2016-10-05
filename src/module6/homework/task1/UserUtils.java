package module6.homework.task1;

public class UserUtils {

    static User[] uniqueUsers(User[] users) {
        int c = 0;
        for (int i = 0; i < users.length; i++) {
            for (int a = i + 1; a < users.length; a++) {
                if (users[i].equals(users[a])) {
                    users[a] = null;
                    c++;
                }
            }

        }
        for(int i =0; i < users.length; i++ ){

        }

        return users;
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {
        return users;
    }

    final User[] paySalaryToUsers(User[] users) {
        return users;
    }

    final long[] getUsersId(User[] users) {

        return null;
    }

    User[] deleteEmptyUsers(User[] users) {
        return users;
    }

}
