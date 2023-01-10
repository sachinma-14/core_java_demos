
package recursion;

/**
 *
 * @author LukasVyhnalek
 */
public class Recursion {

    
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    
    public static int factorialVisualization(int n){
        System.out.println("Computing Factorial of " + n);
        if(n <= 1){
            System.out.println("Result of Factorial " + n + " = 1");
            return 1;
        }else{
            int result = factorialVisualization(n-1);
            System.out.println("Result of Factorial " + n + " = " + (n * result));
            return n * result;
        }
    }
    
    public static void main(String[] args) {
        factorialVisualization(4);
    }
    
}
