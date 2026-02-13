package ir.university.ticketing.state;

import ir.university.ticketing.model.Ticket;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved.");
        ticket.setState(new ResolvedState());
    }
}
