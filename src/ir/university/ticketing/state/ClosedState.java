package ir.university.ticketing.state;

import ir.university.ticketing.model.Ticket;

public class ClosedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket already closed.");
    }
}
