import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class LocateUniverseFormula {

    public static void main(String[] args) throws IOException {

        System.out.println("Find universe-formula using class File : " + locateUniverseFormula());

        System.out.println("Find universe-formula using nio : " + locateUniverseFormulaNIO());

    }

    /**
     * Locates the universe-formula​​​​​​​‌‌‌​​​​​​‌‌‌​​​‌​‌​​​​‌​ file.
     */
    private static String locateUniverseFormulaNIO() throws IOException {
        Path path = Paths.get("C:/Users/Utilisateur/Documents");
        final Path[] result = new Path[1];
        Files.walkFileTree(path, new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if("universe-formula".equals(file.getFileName().toString())){
                    result[0] = file;
                    return FileVisitResult.TERMINATE;
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });
        return result[0].toString();
        /*
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
         */
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
