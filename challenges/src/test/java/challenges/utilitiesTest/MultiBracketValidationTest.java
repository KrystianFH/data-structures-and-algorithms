package challenges.utilitiesTest;


import challenges.utilities.MultiBracketValidation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiBracketValidationTest {

    @Test public void multiBracketValidationTest() {

        String oneT = "{}"; //True
        String twoT = "{}(){}"; //True
        String threeT = "()[[Extra Characters]]"; //True
        String fourT = "(){}[[]]"; //True
        String fiveT = "{}{Code}[Fellows](())"; //True
        String oneF = "[({}]"; //False
        String twoF = "(]("; //False
        String threeF = "{(})"; //False


        assertEquals("This string is true", true, MultiBracketValidation.multiBracketValidation(oneT));
        assertEquals("This string is true", true, MultiBracketValidation.multiBracketValidation(twoT));
        assertEquals("This string is true", true, MultiBracketValidation.multiBracketValidation(threeT));
        assertEquals("This string is true", true, MultiBracketValidation.multiBracketValidation(fourT));
        assertEquals("This string is true", true, MultiBracketValidation.multiBracketValidation(fiveT));
        assertEquals("This string is false", false, MultiBracketValidation.multiBracketValidation(oneF));
        assertEquals("This string is false", false, MultiBracketValidation.multiBracketValidation(twoF));
        assertEquals("This string is false", false, MultiBracketValidation.multiBracketValidation(threeF));
    }
}
