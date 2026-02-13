package ir.university.ticketing.state;

import ir.university.ticketing.model.Ticket;

public class CreatedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket assigned.");
        ticket.setState(new AssignedState());
    }
}
