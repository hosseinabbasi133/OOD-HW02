package ir.university.ticketing.strategy.response;

public class GeneralResponse implements ResponseStrategy {

    @Override
    public void generateResponse() {
        System.out.println("General response sent.");
    }
}
