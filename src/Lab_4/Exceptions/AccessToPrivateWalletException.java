package Lab_4.Exceptions;

public class AccessToPrivateWalletException extends Exception {// checked exception
    public AccessToPrivateWalletException() {
        super("Некрасиво смотреть в чужой кошелек");
    }
}
