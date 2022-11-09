import java.util.InputMismatchException;
import java.util.Scanner;

public class Float {
    public static void main(String[] args) {
        MainProgram();
    }   
    
    public static void MainProgram() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Введите число: ");
            Object input = in.nextFloat();
            System.out.println(input);
        } catch (InputMismatchException e) {
            System.out.println("Неверно введено число, попробуйте ещё раз.");
            MainProgram();
        } catch (NullPointerException e) {                                          // Я не вижу смысла это оставлять, так как 
            System.out.println("Пустые строки вводить нельзя");                  // сканер сам не позволяет делать пустые строки в
        } finally {                                                                 // консоли
            in.close();
        }
    }    
}
