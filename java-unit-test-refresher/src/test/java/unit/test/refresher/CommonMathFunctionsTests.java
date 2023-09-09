package unit.test.refresher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonMathFunctionsTests {
    CommonMathFunctions commonMathFunctions = new CommonMathFunctions();
    @Test
    public void doMath() {

        double value = commonMathFunctions.findAbsoluteValue(-5.56);

        Assertions.assertEquals(5.56,value);
    }

    @Test
    public void findPowerMath() {
        double value = commonMathFunctions.findPower(3.0,2.0);

        Assertions.assertEquals(9.0,value);
    }
}
