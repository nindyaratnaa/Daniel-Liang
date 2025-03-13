/* (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
cx + dy = f x = ed - bf
ad - bc y = af - ec
ad - bc
The class contains:
■ Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six getter methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.” See Programming
Exercise 3.3 for sample runs.
*/

package Daniel_Liang_9_11;
import java.util.Scanner;

public class MainLinierEquation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //memanggil class yang di butuh kan
        LinearEquation equation = new LinearEquation();
        

        //meminta input bisa hanya dengan input dan keduanya, kalau kedunya harus satu satu
        System.out.println("Enter value of a, b, c, d, e, f: ");
        double a= input.nextDouble();
        equation.setA(a);
        double b= input.nextDouble();
        equation.setB(b);
        double c= input.nextDouble();
        equation.setC(c);
        double d= input.nextDouble();
        equation.setD(d);
        double e= input.nextDouble();
        equation.setE(e);
        double f= input.nextDouble();
        equation.setF(f);
        input.close();

        //menampilkan output yang di minta
        if(equation.isSolvable()){
            System.out.printf("Value of x: %.3f", equation.getX());
            System.out.printf("\nValue of y: %.3f", equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
