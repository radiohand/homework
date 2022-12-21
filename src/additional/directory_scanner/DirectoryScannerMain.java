package additional.directory_scanner;

import java.io.File;
import java.util.Scanner;

public class DirectoryScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        File directory;

        do {
            System.out.println("Введите директорию: ");
            directory = new File(scanner.nextLine());
        } while (!directory.isDirectory());

        DirectoryScanner directoryScanner = new DirectoryScanner();

        System.out.println(directoryScanner.getResult(directory));
    }
}
