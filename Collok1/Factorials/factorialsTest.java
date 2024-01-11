package Factorials1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class factorialsTest {
    @Test
    public void testCalculateFactorials() {
        factorialsTest calculator = new factorialsTest();
        List<BigInteger> expected = List.of(
            BigInteger.ONE, 
            BigInteger.TWO, 
            BigInteger.valueOf(6), 
            BigInteger.valueOf(24), 
            BigInteger.valueOf(120)
        );
    }
}
