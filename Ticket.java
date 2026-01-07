package TrainTicketBooking;

public abstract class Ticket implements TicketInterface {
    private String ticketId;
    private int fare;

    private PassengerInterface passenger;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public PassengerInterface getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerInterface passenger) {
        this.passenger = passenger;
    }

    public void computeFare() {
        if(passenger.getStartDestination().equals("Tirupur")&&passenger.getDestination().equals("Kochi")){
            this.setFare(250);
        }
        else if(passenger.getStartDestination().equals("Chennai")&&passenger.getDestination().equals("Coimbatore")){
            this.setFare(350);
        }
        else if(passenger.getStartDestination().equals("Tirupur")&&passenger.getDestination().equals("Coimbatore")){
            this.setFare(50);
        }
        else if(passenger.getStartDestination().equals("Coimbatore")&&passenger.getDestination().equals("Kochi")){
            this.setFare(200);
        }
        else if(passenger.getStartDestination().equals("Tiruppur")&&passenger.getDestination().equals("Kolkata")){
            this.setFare(600);
        }
        else{
            System.out.println("___");
        }

        System.out.println("Your ticket booked sucessfully");
        System.out.println(this.getTicketId());
        System.out.println("Name :"+passenger.getName());
        System.out.println("Start destination :"+passenger.getStartDestination());
        System.out.println("End destination :"+passenger.getDestination());

        System.out.println("Your ticket fare is :"+this.getFare());
    }
}
