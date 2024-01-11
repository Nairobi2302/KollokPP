package Factorials1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class factorials {
    public static void main(String[] args) {
        try {
            factcalc calculator = new factcalc();
            int n = 10;
            List<BigInteger> factorials = calculator.calculateFactorials(n);
            for (int i = 0; i < factorials.size(); i++) {
                System.out.println(factorials.get(i));
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
