import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("I forgot how to Java. Let's calculator!");

        try {
            BufferedReader bi = new BufferedReader( new InputStreamReader(System.in));
            Calculator calc = new Calculator();
    
    
            while(true) {
                String[] strNums;
                strNums = bi.readLine().split(" ");
              
                String operation = strNums[0];
                
                switch(operation) {
                    case "add":
                        Integer sum = calc.add(Integer.parseInt(strNums[1]), Integer.parseInt(strNums[2]));
                        System.out.println(String.valueOf(sum));
                        break;
                    case "subtract":
                        Integer ans = calc.subtract(Integer.parseInt(strNums[1]), Integer.parseInt(strNums[2]));
                        System.out.println(String.valueOf(ans));
                        break;
                    case "multiply":
                        ans = calc.multiply(Integer.parseInt(strNums[1]), Integer.parseInt(strNums[2]));
                        System.out.println(String.valueOf(ans));
                        break;
                    case "divide":
                        ans = calc.divide(Integer.parseInt(strNums[1]), Integer.parseInt(strNums[2]));
                        System.out.println(String.valueOf(ans));
                        break;
                    case "fib":
                        ans = calc.fibonacciNumberFinder(Integer.parseInt(strNums[1]));
                        System.out.println(String.valueOf(ans));
                        break;
                    case "binary":
                        String strAns = calc.intToBinaryNumber(Integer.parseInt(strNums[1]));
                        System.out.println(strAns);
                        break;
                    default:
                        System.out.println("Invalid format");
                  }
            }
          
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }
    
}
