package assignmet4;

public class NotEnoughBalanceException extends BankAccountException {
    
	public NotEnoughBalanceException(String message) {
        super(message);
    }
}
