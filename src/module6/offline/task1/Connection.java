package module6.offline.task1;

import module6.offline.task1.task2.User;

/**
 * Created by Lenovo on 19.09.2016.
 */
public class Connection {

    private static final Connection INSTANCE = new Connection();
    private static final User USER;

   static {
//       INSTANCE = new Connection();
       USER = new User();
   }

    private Connection() {
    }
    public static Connection getInstance(){
        return INSTANCE;
    }

    public static User getUSER(){
        return USER;
    }

}
