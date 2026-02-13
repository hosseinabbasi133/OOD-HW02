package ir.university.ticketing.strategy.response;

public class FinancialResponse implements ResponseStrategy {

    @Override
    public void generateResponse() {
        System.out.println("Financial response sent.");
    }
}
