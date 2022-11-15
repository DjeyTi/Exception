import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

import FileManipulation.FileReader;
import FileManipulation.Manager;
import FileManipulation.NewClass;

public class Controler {
    public static void Control() throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные без кириллицы (Имя Фамилия Отчество ДатаРождения Телефон Пол(F или M)): ");
        String input = in.nextLine();
        String[] newInfo = input.split(" ");
        in.close();
        if (newInfo.length != 6) {
            throw new IllegalFormatException();
        } else if (newInfo[3].length() != 8) {
            throw new IllegalDateOfBirthFormatException();
        } else if (newInfo[4].length() != 11) {
            throw new IllegalNumberFormatException();
        } else if (newInfo[5].length() != 1) {
            throw new IllegalSexFormatException();
        }
        NewClass Info = new NewClass(newInfo[0], newInfo[1], newInfo[2], newInfo[3], 
                                     Long.parseLong(newInfo[4]), newInfo[5].toLowerCase().charAt(0));
        String path;
        if (newInfo[1].trim().endsWith("a") && newInfo[5].trim().contains("f")) {
            path = newInfo[1].substring(0, newInfo[1].length() - 1);
        } else {
            path = newInfo[1];
        }
        Manager Managment = new Manager(new FileReader("Exception/3rdHW/Cabinet/" + path + ".txt"));
        try {
            Managment.addInfo(Info);
        } catch (NoSuchFileException e) {
            new File("Exception/3rdHW/Cabinet/" + path + ".txt").createNewFile();
            Managment.addInfo(Info);
        }
    }
}
