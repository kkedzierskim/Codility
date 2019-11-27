import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTraining {

    public void testBasicGroups() {
        Pattern pattern1 = Pattern.compile("[^-]*--(\\w+)--.*");
        Matcher matcher1 = pattern1.matcher("Ala ma kota. Kota ma na imie --Zygmunt--. Kot jest czarny.");
        matcher1.matches();
        System.out.println(matcher1.group(1));
    }
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\w+.?\\w+");
        Matcher matcher = pattern.matcher("matisrati13");

            System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }
}
