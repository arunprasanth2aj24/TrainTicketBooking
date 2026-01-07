package TrainTicketBooking;

public class TatkalTicket extends Ticket implements TatkalTicketInterface{


    public TatkalTicket(String ticketId ,int fare,PassengerInterface passsenger){
        this.setTicketId(ticketId);
        this.setFare(fare);
        this.setPassenger(passsenger);
    }
    public TatkalTicket(){

    }


    @Override
    public void computeFare(){
        if(this.getPassenger().getStartDestination().equals("Tirupur")&&this.getPassenger().getDestination().equals("Kochi")){
            this.setFare(250);
        }
        else if(this.getPassenger().getStartDestination().equals("Chennai")&&this.getPassenger().getDestination().equals("Coimbatore")){
            this.setFare(350);
        }
        else if(this.getPassenger().getStartDestination().equals("Tirupur")&&this.getPassenger().getDestination().equals("Coimbatore")){
            this.setFare(50);
        }
        else if(this.getPassenger().getStartDestination().equals("Coimbatore")&&this.getPassenger().getDestination().equals("Kochi")){
            this.setFare(200);
        }
        else if(this.getPassenger().getStartDestination().equals("Tiruppur")&&this.getPassenger().getDestination().equals("Kolkata")){
            this.setFare(600);
        }
        else{
            System.out.println("___");
        }

        System.out.println("Your ticket booked sucessfully");
        System.out.println(this.getTicketId());
        System.out.println("Name :"+this.getPassenger().getName());
        System.out.println("Start destination :"+this.getPassenger().getStartDestination());
        System.out.println("End destination :"+this.getPassenger().getDestination());

        System.out.println("Your ticket fare incl TatkalCharge :"+(this.getFare()+150));


    }
}
