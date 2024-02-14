import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("I totall forgot how to Java. Let's calculator!");

        try {
            BufferedReader bi = new BufferedReader( new InputStreamReader(System.in));
            Calculator calc = new Calculator();
    
            System.out.println("enter string of numbers");
    
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
                    default:
                        System.out.println("Invalid format");
                  }
            }
          
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }
    
}
