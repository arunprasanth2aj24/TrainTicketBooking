package TrainTicketBooking;

public class Passenger implements PassengerInterface{
    private String name;
    private int age;
    private String destination;
    private String ticketType;
    private String startDestination;


    private TicketInterface gt;
    private TicketInterface tt;

    public Passenger(String name , int age, String dest,String ticketType,String startDest){
        this.name = name;
        this.age= age;
        this.destination = dest;
        this.ticketType = ticketType;
        this.startDestination = startDest;
    }
    public Passenger(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getStartDestination() {
        return startDestination;
    }

    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }

    public TicketInterface getGt() {
        return gt;
    }

    public void setGt(TicketInterface gt) {
        this.gt = gt;
    }

    public TicketInterface getTt() {
        return tt;
    }

    public void setTt(TicketInterface tt) {
        this.tt = tt;
    }
}
