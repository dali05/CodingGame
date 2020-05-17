import java.util.Scanner;

/**
 * @author ALLOUM on 08/04/2020
 */
public class AsciiArt {

    static final char FIRST_CHAR = 'a';
    static final char LAST_CHAR = 'z';
    static final char QU_MARK = LAST_CHAR + 1;

    public static char scanChar(int height, int width, String[] rows, String s) {
        // Iterate over each character from A to Z.
        for (char c = FIRST_CHAR; c <= LAST_CHAR; c++) {
            // Check to see if the character corresponds with the ASCII art.
            if (printChar(height, width, String.valueOf(c), rows).equals(s)) {
                // Return the character if it does.
                return c;
            }
        }
        // Optionally use a null character to indicate that the string passed
        // doesn't correspond to any valid ASCII art.
        return (char) 0;
    }

    public static String printCharWithStringBuilder(int height, int width, String text, String[] rows) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (char c : text.toCharArray()) {
                if (FIRST_CHAR <= c && c <= LAST_CHAR) {
                    result.append(rows[i].substring((c - FIRST_CHAR) * width, (c - FIRST_CHAR) * width + width));
                } else {
                    result.append(rows[i].substring((QU_MARK - FIRST_CHAR) * width));
                }
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static String printChar(int height, int width, String text, String[] rows) {
        String result = "";
        for (int i = 0; i < height; i++) {
            for (char c : text.toCharArray()) {
                if (FIRST_CHAR <= c && c <= LAST_CHAR) {
                    result += rows[i].substring((c - FIRST_CHAR) * width, (c - FIRST_CHAR) * width + width);
                } else {
                    result += rows[i].substring((QU_MARK - FIRST_CHAR) * width);
                }
            }
            result = result + "\n";
        }
        return result;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        // width and height of the ASCII-art representation of 1 character
        System.out.println("Enter Width : ");
        int width = in.nextInt();
        System.out.println("Enter height : ");
        int height = in.nextInt();

        // text to convert
        in.nextLine();
        System.out.println("Enter text to Print : ");
        String text = in.nextLine().toLowerCase();

        // ASCII art representations of the whole alphabet + ?
        String[] rows = new String[height];
        /*
        for (int i = 0; i < height; i++) {
            rows[i] = in.nextLine();
        }
        */
        // rows to test when width=4 and height=5
        rows = new String[]{
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###",
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #",
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##",
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      ",
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #"
        };

        System.out.println("Print Charcter: ");
        String characterPrinted = printChar(height, width, text, rows);
        System.out.println(characterPrinted);
//        String charctereA = " #  \n# # \n### \n# # \n# # \n";
        char charA = scanChar(height, width, rows, characterPrinted);
        System.out.println("Char Result : --------->" + charA + "<---------------");
    }
}



