package ir.university.ticketing.strategy.processing;

public class TechnicalProcessing implements ProcessingStrategy {

    @Override
    public void process() {
        System.out.println("Processing technical request...");
    }
}
