import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of walls:");
        int walls = in.nextInt();
        System.out.println("Enter surface area of walls:");
        double wallSurfaceArea = in.nextDouble();
        System.out.println("Enter surface area of ceiling:");
        double ceilSurfaceArea = in.nextDouble();

        double ltrpsqm = 6.5;
        double totsqm = (walls*wallSurfaceArea)+ceilSurfaceArea;

        double totpaint = totsqm/ltrpsqm;
        

        System.out.println(totpaint);
        System.out.println("You need : " + totpaint + " litres of paint.");

    }
}