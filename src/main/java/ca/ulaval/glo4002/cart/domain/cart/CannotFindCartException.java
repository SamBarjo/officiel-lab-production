package ca.ulaval.glo4002.cart.domain.cart;

public class CannotFindCartException extends RuntimeException {
    public CannotFindCartException(String msg, Exception e) {
        super(msg, e);
    }
}
