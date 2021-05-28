import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double x;
    double y;
    double z;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter side x: "); // ubralod shegyavs x
    x = scanner.nextDouble(); // scanner x-stvis
    System.out.println("Enter side y: "); // ubralod shegyavs t
    y = scanner.nextDouble(); // scanner y-stvis
        
    z = Math.sqrt((x*x)+(y*y));    // matematika
   
    System.out.println("The hypotenuse is :"+z); //pasuxi
    
    scanner.close(); // daxurvaa arvici raari
            
    }
}