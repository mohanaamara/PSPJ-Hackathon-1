import java.util.Scanner;
public class MovieTicket{
    String movieName;
    String ticketPrice;
    int numberOfTickets;
        MovieTicket(String movieName, String ticketPrice, int numberOfTickets){
            this.movieName= movieName;
            this.ticketPrice= ticketPrice;
            this.numberOfTickets= numberOfTickets;
    }
    double calculateTotal(){
        return ticketPrice*numberOfTickets;
    }
    double calculateDiscount(){
        if(numberOfTickets>5){
            return calculateTotal()*0.10;
            else
                return 0;
        }
        double calculateFinalAmount(){
            return calculateTotal()-calculateDiscount();
    }
    void displayBill(){
        System.out.println("Booking Bill");
        System.out.println("Movie Name:"+moviename);
        System.out.println("Ticket Price:"+ticketPrice);
        System.out.println("Number of Tickets:"+numberOfTickets);
        System.out.println("Discount:"+calculateDiscount());
        System.out.println("Total Amount:"+calculateTotal());
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter movie name:");
        String name= sc.nextLine();
        System.out.println("Enter ticket price:");
        double price= sc.nextDouble();
        System.out.println("Enter number of tickets:");
        int tickets= sc.nextInt();
        MovieTicket mt= new MovieTicket(name, price, tickets);
        mt.displayBill();
    }
}
}