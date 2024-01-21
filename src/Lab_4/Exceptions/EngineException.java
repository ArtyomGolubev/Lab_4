package Lab_4.Exceptions;

public class EngineException extends RuntimeException {// unchecked exception 1
    public EngineException() {
        super("Нельзя ехать с выключенным двигателем");
    }
}
