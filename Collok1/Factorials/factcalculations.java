package Factorials1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class factcalc {
    public List<BigInteger> calculateFactorials(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Number must be non-negative");
        }
        List<BigInteger> factorials = new ArrayList<>();
        BigInteger factorial = BigInteger.ONE;
        factorials.add(BigInteger.ONE);
        for (int i = 1; i < n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            factorials.add(factorial);
        }

        return factorials;
    }
}
