package ir.university.ticketing.main;

import ir.university.ticketing.factory.TicketFactory;
import ir.university.ticketing.model.Ticket;

public class Main {

    public static void main(String[] args) {

        Ticket ticket = TicketFactory.createTicket("TECH");

        System.out.println("Current State: " + ticket.getStateName());

        ticket.process();
        ticket.generateResponse();

        ticket.nextState();
        System.out.println("Current State: " + ticket.getStateName());

        ticket.nextState();
        ticket.nextState();
        ticket.nextState();
    }
}
