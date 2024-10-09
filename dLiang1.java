//import java.util.*;

public class dLiang1{
    public static void main(String[] args) {
        //Listening 1.1
	System.out.println("Hello Java !!");

	//Listening 1.3 3 pesan berurutan
	System.out.println("Programming is fun!");
	System.out.println("Fundamental first!!");
	System.out.println("Problem Driven");

	//Listening 1.3 Compute Expresion
	System.out.println((10.5 + 2 * 3) / (45 - 3.5));

	//Listening 1.5 Show run time error
	//System.out.println(1 / 0);

	//Listening 1.6 Logical error
	System.out.println("Celcius 35 is Fahrenheit degree");
	System.out.println((9 / 5) * 35 + 32);
	/*In Java, the division for integers is the quotient—the fractional part is truncated—so in Java 9 / 5 is 1.
	Toget the correct result, you need to use 9.0 / 5, which results in 1.8*/

	//Programming Exercise
	//1.1
	System.out.println("Welcome to Java");
	System.out.println("Welcome to COmputer Science");
	System.out.println("Programming is fun");

	//1.2
	System.out.println("Welcome to Java");
	System.out.println("Welcome to Java");
	System.out.println("Welcome to Java");
	System.out.println("Welcome to Java");
	System.out.println("Welcome to Java");

	//1.3
	System.out.println("      J    A    V     V     A");
	System.out.println("      J   A A    V   V     A A");
	System.out.println(" J    J  AAAAA    V V     AAAAA");
	System.out.println("  J J   A     A    V     A     A");

	//1.4
	int a = 1;
	System.out.printf("a\ta^2\ta^3");
	System.out.printf("\n" + a + "\t" + a*a + "\t" + a*a*a);
	System.out.printf("\n" + ++a + "\t" + a*a + "\t" + a*a*a);
	System.out.printf("\n" + ++a + "\t" + a*a + "\t" + a*a*a);
	System.out.printf("\n" + ++a + "\t" + a*a + "\t" + a*a*a + "\n");
	/*++a = mengubah nilai a saat itu juga || a++ = nilai a di rubah setelahnya*/

	//1.5
	System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
	/*hasilnya == 47/56*/

	//1.6
	int b = 1;
	System.out.println(b++ + b++ + b++ + b++ + b++ + b++ + b++ + b++ + b++);

	//1.7
	System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 11)));
	/*untuk mendapatkan hasil koma */
	System.out.println(4 * (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 11)));
	/*untuk mendapatkan hasil bulat */

	//1.8
	System.out.println(2 * 5.5 * Math.PI); //keliling lingkaran
	System.out.println(5.5 * 5.5 * Math.PI); //luas lingkaran

	//1.9
	System.out.println(2 * (4.5 + 7.9)); //keliling segi4
	System.out.println(4.5 * 7.9); //luas persegi

	//1.10
	double c = 14.0 / 1.6;
	System.out.println(c / 0.75);
	System.out.println(c / 0.5);

	//1.11
	System.out.println(312032486 + (((365 * 24 * 60 * 60 / 7)-(365 * 24 * 60 * 60 / 13)+(365 * 24 * 60 * 60 / 45)) * 5));

	//1.12
	System.out.println((24.0 * 1.6) / (1.0 + (40.0 / 60.0) + (35.0 / 3600)));
    
	//1.13
	System.out.println((44.5 * 55.0 - 50.2 * 5.9) / (3.4 * 55.0 - 50.2 * 2.1)); //x
	System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 55.0 - 50.2 * 2.1)); //y
	/*Kayanya ini salah.... */

    }
}