import java.util.Arrays;

public class Twin {

    public static void main(String[] args) {
        System.out.println("Silent and Listen are twin ? " + isTwin("Silent", "Listen"));
        System.out.println("Silent and Listen are twin ? " + isTwin("Silent", "List"));
    }

    /*
     *  Q
     *  A twin of word is a word written with the same letters(case insensitive) but not
     *  necessarily in the same order.
     *
     *  For example "Silent" is a twin of "Listen"
     *
     *  The "isTwin(a, b)" method should return true if b is the twin of a and false otherwise.
     *  a and b are two non-null strings
     *
     *  Write the body of the "isTwin(a, b)" method
     * */
    public static boolean isTwin(String a, String b ){
        if( a == null || b == null) return false;
        byte[] ab = a.toLowerCase().getBytes();
        byte[] bb = b.toLowerCase().getBytes();
        Arrays.sort(ab);
        Arrays.sort(bb);
        return new String(ab).equals(new String(bb));
    }
}
