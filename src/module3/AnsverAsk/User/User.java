package module3.AnsverAsk.User;

import java.util.Date;

public class User {
    private String[] phones;
    private Date date;

    public User(){

    }

    public User(String[] phones) {
        this.phones = phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setDate(Date date) {
        Date date1 = new Date();
        this.date = date;
    }
}
