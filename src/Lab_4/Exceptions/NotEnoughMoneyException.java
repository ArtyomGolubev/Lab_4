package Lab_4.Exceptions;

public class NotEnoughMoneyException extends RuntimeException {// unchecked exception 2
    public NotEnoughMoneyException() {
        super("Недостаточно денег.");
    }
}