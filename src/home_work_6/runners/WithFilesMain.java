package home_work_6.runners;

import home_work_6.searchers.EasySearch;
import home_work_6.utils.TextFileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WithFilesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EasySearch searcher = new EasySearch();

        System.out.println("Введите адрес папки с книгами: ");
        String directoryPath = scanner.nextLine(); // "src/home_work_6/source/Stephen_King"
        File directory = new File(directoryPath);

        File [] files = directory.listFiles();
        System.out.println("Перечень книг в папке: ");
        for (int i = 0; i < files.length; i++) {
            System.out.println((i+1) + ")" + files[i].getName());
        }

        while (true) {

            System.out.println("Выберите книгу по пункту из списка: ");
            System.out.println("(или '0' чтобы выйти из программы)");
            int position = scanner.nextInt();
            if (position == 0) {break;}

            while (true) {
                System.out.println("Введите слово, количество использований которого нужно определить: ");
                System.out.println("(или 'back' чтобы вернуться к выбору книги)");
                scanner = new Scanner(System.in);
                String searchedWord = scanner.next();
                if (searchedWord.equals("back")) {break;}

                File file = files[position-1];

                long count = searcher.search(TextFileUtils.fileToString(file), searchedWord);
                System.out.println("Количество использований слова '" + searchedWord + "' в тексте = " + count);
                String resultString = file.getName() + " - " + searchedWord + " - " + count;

                try (Writer writer = new FileWriter("src/home_work_6/source/result.txt", true)){
                    writer.write(resultString);
                    writer.write("\n");
                }catch (IOException e) {e.printStackTrace();}
            }
        }
    }
}
