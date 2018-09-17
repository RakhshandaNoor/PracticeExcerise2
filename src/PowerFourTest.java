import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerFourTest {
    PowerFour powerFour;
    @Before
    public void setUp() throws Exception {
        powerFour= new PowerFour();
    }

    @After
    public void tearDown() throws Exception {
        powerFour=null;
    }

    @Test
    public void power() {
        //arrange
        int success= 1;
        int failure=0;
        //act
        int res_success= powerFour.power(16);
        int res_failure= powerFour.power(6);
        //assert
        assertEquals(success, res_success);
        assertEquals(failure, res_failure);

    }
}