package ir.university.ticketing.strategy.processing;

public class FinancialProcessing implements ProcessingStrategy {

    @Override
    public void process() {
        System.out.println("Processing financial request...");
    }
}
