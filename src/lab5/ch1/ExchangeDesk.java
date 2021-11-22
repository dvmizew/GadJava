package lab5.ch1;

public class ExchangeDesk<T> {
    private T amount;
    //public int convert(T from, T to) { }
    public ExchangeDesk(T amount) {
        this.amount = amount;
    }

    public T getAmount() {
        return amount;
    }
}