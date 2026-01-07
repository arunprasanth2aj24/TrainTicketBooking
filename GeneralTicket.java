package TrainTicketBooking;

public class GeneralTicket extends Ticket {


    public GeneralTicket(String ticketId, int fare, PassengerInterface passenger) {
        this.setTicketId(ticketId);
        this.setFare(fare);
        this.setPassenger(passenger);
    }

    public GeneralTicket() {

    }




}