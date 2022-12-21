package additional.directory_scanner;

import java.io.File;

public class DirectoryScanner {

    private DirectoryCounter scan (File directory, DirectoryCounter counter) {

        File [] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    counter.incrementFolderCounter();
                    scan(file, counter);
                }
                if (file.isFile()) {
                    counter.incrementFileCounter();
                }
                if (file.isHidden()) {
                    counter.incrementHiddenObjectCounter();
                }
                if (file.getName().endsWith(".txt")) {
                    counter.incrementTxtCounter();
                }
            }
        }
        return counter;
    }

    public String getResult (File directory) {
        DirectoryCounter counter = new DirectoryCounter();
        return scan(directory, counter).toString();
    }
}