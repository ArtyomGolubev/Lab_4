package Lab_4.Exceptions;

public class MovingToNonexistentPlaceException extends Exception {// checked exception
    public MovingToNonexistentPlaceException() {
        super("Нельзя поехать в то место, которого нет.");
    }
}

