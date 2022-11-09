import java.io.FileNotFoundException;

public class ThirdJob {
    public static void main(String[] args) throws Exception { // Добавлено исключение для надлежайщей работы программы 
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
     }
     
     public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
     }     
}

// Убрал исключение Throwable, так как оно мешало работу другим исключениям, которые могут явно указать, что не ладно с кодом
// Так как я не знаю задачи этого кода, оставлю всё как написано, убрав лишние исключение, которые могли помешать работе программы
// В остальном код работает как положено