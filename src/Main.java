import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter the length of the first side of the rectangle:");
       if (input.hasNextDouble()) {
           double side1 = input.nextDouble();

           System.out.println("Enter the length of the second side of the rectangle:");
           if (input.hasNextDouble()) {
               double side2 = input.nextDouble();

               double area = side1 * side2;
               double perimeter = 2 * (side1 + side2);
               double diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));


               System.out.println("Area of the rectangle:" + area);
               System.out.println("Perimeter of the rectangles:" + perimeter);
               System.out.println("Length of the diagonal:." + diagonal);
           } else {
               System.out.println("Invalid input for the second side length.");
           }
       }else{
           System.out.println("Invalid input for the first side length.");
           }
           input.close();
           }
       }

