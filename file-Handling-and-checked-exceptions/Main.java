import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the name and the path at which you want to save the file[Path must be like this E:\\sample.docx]: ");
            String name = scanner.nextLine();
            System.out.print("Enter the data you want to save: ");
            String data = scanner.nextLine();
            try {
                FileWriter(data, name);
                System.out.println("File has been saved");
                break;

            } catch (IOException exception) {
                System.out.println("Invalid Input");
                exception.printStackTrace();
            }

        }

    }

    public static void FileWriter(String data,String path) throws IOException{
        FileWriter fileWriter = null;
        fileWriter = new FileWriter(path);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write(data);
        printWriter.close();
    }

}