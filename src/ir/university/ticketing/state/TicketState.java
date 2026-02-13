package ir.university.ticketing.state;

import ir.university.ticketing.model.Ticket;

public interface TicketState {
    void handle(Ticket ticket);
}

