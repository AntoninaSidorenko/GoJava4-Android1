package module6.offline.task;

/**
 * Created by Lenovo on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        final String result = Utils.removeChar('r', "rrrout");
        System.out.println(result);

        String res = Utils.removeChar2('e', " eeeer");
        System.out.println(res);

        int number = 12345;
        String numberReplase = Utils.removeChar('1', number + "");
        System.out.println(numberReplase);

    }
}