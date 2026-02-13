package ir.university.ticketing.state;

import ir.university.ticketing.model.Ticket;

public class ResolvedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket closed.");
        ticket.setState(new ClosedState());
    }
}
