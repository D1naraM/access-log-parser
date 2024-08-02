import java.io.File;
import java.util.Scanner;


public class ValidFilePath {
    public static void main(String[] args) {

        validFilePath();
    }

    public static void validFilePath() {
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите путь к файлу:");

            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isFile = file.isFile(); //Метод isDerictory здесь не актуален, т.к. он проверяет путь к папке, а не файлу

            if (fileExists) {
            } else continue;

            if (isFile) {
                System.out.println("Путь указан верно");
                count++;
            } else {
                System.out.println("Файл не существует или указанный путь является путём к папке, а не к файлу");
                continue;
            }
            System.out.println("Это файл номер " + count);
        }
    }
}

