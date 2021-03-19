package homework;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        TriangleSides triangle = new TriangleSides();
        
        System.out.println("Please enter value of first side:");
        double firstside = input.nextDouble();
        triangle.setSide1(firstside);
        System.out.println(); 
        
        System.out.println("Please enter value of second side:");
        double secondside = input.nextDouble();
        triangle.setSide2(secondside);
        System.out.println(); 
        
        System.out.println("Please enter value of third side:");
        double  thirdside = input.nextDouble();
        triangle.setSide3(thirdside);
        System.out.println(); 
        
        System.out.println("Value of first side is: "+triangle.getSide1());
        System.out.println("Value of second side is: "+triangle.getSide2());
        System.out.println("Value of third side is: "+triangle.getSide3());
        
        double p;
        p=firstside+secondside+thirdside;
        System.out.println("Perimeter of triagle is:"+p);
        
    }
}
