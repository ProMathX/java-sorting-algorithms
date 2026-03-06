import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class junitTestCaseTest {
    @Test
    void calc(){
        Main testCase = new Main();
        assertEquals("Hello World",testCase.helloWorld());
    }
}

