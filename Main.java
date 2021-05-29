package mrelastic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //https://www.sanfoundry.com/java-program-implement-binary-search-tree-using-linked-list/
        Scanner input = new Scanner(System.in);
        
        int currPrice, newPrice, choice, a, b; 
                
        System.out.println("Choose one: \t(1) Price Elasticity of Demand");
        System.out.println("\t\t(2) Price Elasticity of Supply");
        System.out.println("\t\t(3) Cross Elasticity of Demand");
        System.out.println("\t\t(4) Income Elasticity of Demand");
        
        System.out.print("\nEnter your choice: "); choice = input.nextInt();
             
        System.out.print("\nEnter values for variables a and b in the equation for the ");
        System.out.println( (choice != 2) ? "demand curve.\nDemand: P=a-b*Qd" : "supply curve.\nSupply: P=c+d*Qs");
        
        System.out.println();
        
        System.out.print("Enter a: "); a = input.nextInt();
        System.out.print("Enter b: "); b = input.nextInt();
        System.out.print("Enter current price: "); currPrice = input.nextInt();
        Curvature curvature = new Curvature(a, b);
        
                        
                        System.out.print("Enter new price: "); newPrice = input.nextInt();
                        System.out.println();
                        System.out.println(demand.elasticity(newPrice));
                        break;
                        
                    case 2:
                        System.out.print("Enter c: "); c = input.nextInt();
                        System.out.print("Enter d: "); d = input.nextInt();
                        System.out.print("Enter current price:"); currPrice = input.nextInt();
                        supply = new Supply(c,d,currPrice);
                        
                        System.out.print("Enter new price:"); newPrice = input.nextInt();
                        System.out.println();
                        System.out.println(supply.elasticity(newPrice));
                        break;
                        
    }
}
