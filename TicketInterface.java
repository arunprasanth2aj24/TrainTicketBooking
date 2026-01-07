package TrainTicketBooking;

public interface TicketInterface extends TatkalTicketInterface{
    public String getTicketId();
    public void setTicketId(String ticketId);
    public int getFare();
    public void setFare(int fare);
    public PassengerInterface getPassenger();
    public void setPassenger(PassengerInterface passenger);
    public void computeFare();

}
