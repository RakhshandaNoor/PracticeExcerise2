import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {
     Pallindrome pallindrome;
    @Before
    public void setUp() throws Exception {
        pallindrome = new Pallindrome();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test(){
        //arrange
        boolean expected1=true;
        boolean expected2=false;
        //act
        boolean result1= pallindrome.Palli(("malayalam"));
        boolean result2= pallindrome.Palli(("hindi"));
        //assert
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
}