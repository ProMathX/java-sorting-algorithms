import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class junitTestCaseTest {
    @Test
    void calc(){
        Main testCase = new Main();
        assertEquals("Hello World",testCase.helloWorld());
    }
}

