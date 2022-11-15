public class IllegalFormatException extends RuntimeException {
    public IllegalFormatException() {
        super();
        System.out.println("Неверно введены данные: их количество не совпадает с нужным");
    }
}

class IllegalDateOfBirthFormatException extends IllegalFormatException {
    IllegalDateOfBirthFormatException() {
        super();
        System.out.println("Неверно ведено Дата Рождения");
    }
}

class IllegalNumberFormatException extends IllegalFormatException {
    IllegalNumberFormatException() {
        super();
        System.out.println("Неверно введён Номер Телефона");
    }
}

class IllegalSexFormatException extends IllegalFormatException {
    IllegalSexFormatException() {
        super();
        System.out.println("Неверно введён Пол");
    }
}