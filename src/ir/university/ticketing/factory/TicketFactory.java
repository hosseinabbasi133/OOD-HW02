package ir.university.ticketing.factory;

import ir.university.ticketing.model.Ticket;
import ir.university.ticketing.strategy.processing.*;
import ir.university.ticketing.strategy.response.*;

public class TicketFactory {

    public static Ticket createTicket(String type) {

        switch (type) {

            case "TECH":
                return new Ticket(
                        new TechnicalProcessing(),
                        new TechnicalResponse());

            case "FIN":
                return new Ticket(
                        new FinancialProcessing(),
                        new FinancialResponse());

            case "GEN":
                return new Ticket(
                        new GeneralProcessing(),
                        new GeneralResponse());

            default:
                throw new IllegalArgumentException("Invalid ticket type");
        }
    }
}
