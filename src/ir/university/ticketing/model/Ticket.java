package ir.university.ticketing.model;

import ir.university.ticketing.state.*;
import ir.university.ticketing.strategy.processing.ProcessingStrategy;
import ir.university.ticketing.strategy.response.ResponseStrategy;
import ir.university.ticketing.logger.Logger;

public class Ticket {

    private TicketState state;
    private ProcessingStrategy processingStrategy;
    private ResponseStrategy responseStrategy;

    public Ticket(ProcessingStrategy processingStrategy,
                  ResponseStrategy responseStrategy) {
        this.state = new CreatedState();
        this.processingStrategy = processingStrategy;
        this.responseStrategy = responseStrategy;
    }

    public void process() {
        processingStrategy.process();
        Logger.getInstance().log("Ticket processed");
    }

    public void generateResponse() {
        responseStrategy.generateResponse();
        Logger.getInstance().log("Response generated");
    }

    public void nextState() {
        state.handle(this);
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getClass().getSimpleName();
    }
}
