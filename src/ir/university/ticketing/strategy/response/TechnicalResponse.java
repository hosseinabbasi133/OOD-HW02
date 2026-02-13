package ir.university.ticketing.strategy.response;

public class TechnicalResponse implements ResponseStrategy {

    @Override
    public void generateResponse() {
        System.out.println("Technical response sent.");
    }
}
