import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LocateUniverseFormula {

    public static void main(String[] args) throws IOException {

        System.out.println("Find universe-formula using class File : " + locateUniverseFormula());

        System.out.println("Find universe-formula using nio : " + locateUniverseFormulaNIO());

        Path path = Paths.get("C:/Users/Utilisateur/Documents");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            stream.forEach(System.out::println);
        }
    }

    /**
     * Locates the universe-formula​​​​​​​‌‌‌​​​​​​‌‌‌​​​‌​‌​​​​‌​ file.
     */
    private static String locateUniverseFormulaNIO(){
        Path path = Paths.get("C:/Users/Utilisateur/Documents");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                if("universe-formula".equals(entry.getFileName().toString())){
                    return entry.toString();
                }else if(Files.isDirectory(entry)){
                    findNIO(entry);
                }
            }
        } catch (IOException e) {
            return null;
        }
        return null;
    }

    private static void findNIO(Path entry) {

    }

    /**
     * Locates the universe-formula​​​​​​​‌‌‌​​​​​​‌‌‌​​​‌​‌​​​​‌​ file.
     */
    public static String locateUniverseFormula() {
        String path = "C:/Users/Utilisateur/Documents";
        String fileName = "universe-formula";
        File file = find(path, fileName);
        return file.getAbsolutePath();
    }

    public static File find(String path, String fileName) {
        File file = new File(path);
        if (fileName.equalsIgnoreCase(file.getName()))
            return file;
        if (file.isDirectory()) {
            for (String child : file.list()) {
                File childFile = find(path + File.separator + child, fileName);
                if (childFile != null)
                    return childFile;
            }
        }
        return null;
    }

}
