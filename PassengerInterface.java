package TrainTicketBooking;

public interface PassengerInterface {
    public String getName();
    public void setName(String name);
    public int getAge();
    public void setAge(int age);
    public String getDestination();
    public void setDestination(String destination);
    public String getTicketType();
    public void setTicketType(String ticketType);
    public String getStartDestination();
    public void setStartDestination(String startDestination);
    public TicketInterface getGt();
    public void setGt(TicketInterface gt);
    public TicketInterface getTt();
    public void setTt(TicketInterface tt);

}
