package unit.test.refresher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;

public class CommonMathFunctionsTests {
    Logger logger = Logger.getLogger(String.valueOf(CommonMathFunctionsTests.class));
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

    @DisplayName("ArrayList of Float is rounded and sorted")
    @Test
    public void roundList() {
        ArrayList<Float> floatList = new ArrayList<>();
        ArrayList<Float> expected = new ArrayList<>();
        floatList.add((float) 2.6);
        floatList.add((float) 2.2);
        floatList.add((float) 1.6);
        floatList.add((float) 9.4);
        floatList.add((float) 7.45765);
        floatList.add((float) 3.88889);
        floatList.add((float) 1.999);
        floatList.add((float) 6.56);
        floatList.add((float) 4.44);

        expected.add((float) 2);
        expected.add((float) 2);
        expected.add((float) 2);
        expected.add((float) 3);
        expected.add((float) 4);
        expected.add((float) 4);
        expected.add((float) 7);
        expected.add((float) 7);
        expected.add((float) 9);


        ArrayList<Float> result = commonMathFunctions.roundList(floatList);

        if(expected.equals(result)) {
            logger.info("\n***********************************    FOLLOW UP QUESTION   ************************************\n\n " +
                    "1) Why can you implicitly cast an int value to a primitive float, but not the other way around?\n\n" +
                    "2) Why must you cast int to float or use the wrapper class Float() in order for this test to pass?");
        }
        Assertions.assertEquals(expected,result);
    }
}
