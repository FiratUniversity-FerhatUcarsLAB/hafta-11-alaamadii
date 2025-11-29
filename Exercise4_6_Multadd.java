import java.util.Scanner;

public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        //TODO
        return a * b + c;
    }

    public static double expSum(double x) {
        //TODO
        return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        //TODO

        // Test 1: multadd(1.0, 2.0, 3.0)
        double test1 = multadd(1.0, 2.0, 3.0);
        System.out.println("multadd(1.0, 2.0, 3.0) = " + test1);

        // Test 2: sin(pi/4) + cos(pi/4) / 2   using multadd
        double sinCosTest = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + sinCosTest);

        // Test 3: log(10) + log(20)   using multadd
        double logTest = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log(10) + log(20) = " + logTest);

        // Test 4: expSum(x) with user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for x to test expSum(x): ");
        double x = input.nextDouble();
        System.out.println("expSum(" + x + ") = " + expSum(x));
        
        
    }
}

