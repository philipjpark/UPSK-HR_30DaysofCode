import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Operators {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    
    double total = (meal_cost * (tip_percent * .01)) + (meal_cost * (tax_percent * .01)) + meal_cost;
    
       double roundTotal = Math.round(total); 
    
   int newTotal = (int)roundTotal; 
    
    System.out.println(newTotal);
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
}
