package ir.university.ticketing.state;

import ir.university.ticketing.model.Ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket in progress.");
        ticket.setState(new InProgressState());
    }
}
