import java.util.HashMap;
import java.util.Scanner;

public class MIMETypeSolution {

        public static void main(String[] args){
        /* Example:
         *  2
         *  4
         * html text/html
         * png image/png
         * test.html
         * noextension
         * portrait.png
         * doc.TXT
         * */

        HashMap<String, String> types = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table
        int Q = in.nextInt(); // Number Q of file names to be analyzed
        System.err.println(N+ " "+Q);
        //        types.put("html", "text/html");
        //        types.put("png", "image/png");

        for(int i = 0; i < N ; i++){
            String EXT = in.next().toLowerCase();
            String MT =  in.next();
            types.put(EXT,MT);
        }
        in.nextLine();
        // String[] fileNameTab = new String[]{"test.html","noextension","portrait.png","doc.TXT"};
        for(int i = 0; i < Q ; i++){
            String FNAME = in.nextLine();
            // String FNAME = fileNameTab[i];
            if(!(FNAME.contains("."))){
                System.out.println("UNKNOWN");
                continue;
            }
            String ext = FNAME.substring(FNAME.lastIndexOf(".")+1).toLowerCase();
            String type = types.getOrDefault(ext,"UNKNOWN");
            System.out.println(type);
        }
    }
}
