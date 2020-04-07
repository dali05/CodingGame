import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {

    public static void main(String[] args) {

        String[] strings = new String[]{"f", "o", "o", "bar"};
        System.out.println("Concat of [f, o, o, bar] = " + concat(strings));
        System.out.println("Concat of [f, o, o, bar] with stream = " + concatStream(strings));

        String[] emptyStrings = new String[]{};
        System.out.println("Concat of [] = " + concat(emptyStrings));
        System.out.println("Concat of [] with stream = " + concatStream(emptyStrings));

        System.out.println("Concat of null = " + concat(null));
        System.out.println("Concat of null with stream = " + concatStream(null));
    }

    /**
     * Concatenates the given array of strings.
     */
    public static String concat(String[] strings){
        if(strings == null || strings.length == 0){
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (String string : strings){
            result.append(string);
        }

        return result.toString();
    }

    public static String concatStream(String[] strings){
        if(strings == null || strings.length == 0){
            return "";
        }
        return Arrays.stream(strings).collect(Collectors.joining());
    }
}
