package module6.offline.task;

/**
 * Created by Lenovo on 19.09.2016.
 */
public abstract class Utils {
    public static String removeChar(char letter, String text) {
        String result = " ";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != letter) {
                result = result + text.charAt(i);


            }

        }
        return result;
    }

    public static String removeChar2(Character letter, String text) {
        String resalt = "";
        String[] split = text.split("");
        for (String c : split) {
            if (!c.equals("" + letter)) {
                resalt += c;

            }
        }
        return resalt;
    }


    public static String removeChar3(Character letter, String text) {
        String resalt = "";
        String[] chars = text.split(letter + "");
        for (String aCar : chars) {
            resalt += aCar;


        }
        return resalt;
    }

    public static String removeChar4(Character letter, String text) {
        return text.replace(letter + "", "");
    }
}