public class ReshapeString {

    public static void main(String[] args) {
        System.out.println(reshape(3, "abc de fghij")); //returns "abc\ndef\nghi\nj"
        System.out.println(reshape(2, "1 23 456")); //returns "12\n34\n56"
    }

    public static String reshape(int n, String str) {
        //replace each space with empty string
        str = str.replace(" ", "");

        //insert a '\n' character each n characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            if (i % n == 0 && i != 0)
                result.append("\\n" + str.charAt(i));
            else
                result.append(str.charAt(i));
        }

        return result.toString();
    }
}
