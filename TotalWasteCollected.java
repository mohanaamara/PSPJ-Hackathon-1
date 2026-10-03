import java.util.Scanner;
public class TotalWasteCollected{
    static double totalWaste(double point1Waste, double point2Waste){
        return point1Waste + point2Waste;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter waste collected at pint 1 in kg:");
        double point1Waste= sc.nextDouble();
        System.out.println("Enter wast collected at point 2 in kg:");
        double point2Waste= sc.nextDouble();
        double totalWasteCollected= totalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected:"+ totalWasteCollected+"kg");
        sc.close();
    }
}