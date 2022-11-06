public class Program {
    public static void main(String[] args) {
        Exception3();
    }

    public static void Exception1() {               // Первое исключение (java.lang.ArrayIndexOutOfBoundsException)
        int[] array = new int[5];
        System.out.println(array[5]);
    }

    public static void Exception2() {               // Второе исключение (java.lang.ArithmeticException)
        int FirstNum = 10;
        int SecondNum = 0;
        System.out.println(FirstNum / SecondNum);
    }

    public static void Exception3() {               // Третье исключение (java.lang.StringIndexOutOfBoundsException)
        String type = "Hi";
        System.out.println(type.charAt(2));
    }
}
