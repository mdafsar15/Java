import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Mail_Test {
    private String emailTestResult;
    private boolean expectedResult;

    public Mail_Test(String email,boolean expectedResult)
    {
        this.emailTestResult=email;
        this.expectedResult=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection  data() {
        return Arrays.asList(new Object[][] {
                { "abc@gmail.com", true },
                { "afsaralam720@gmail.com", true },
                { "abc-100@gmail.com", true},
                { "abc.100@gmail.com", true } ,
                { "abc-100@abc.net", true },
                { "abc.100@abc.com.au ",true },
                { "abc@1.com ",true },
                { "abc@gmail.com.com ",true },
                { "abc+100@gmail.com ",true },      });
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue_OR_False() {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateEmailAddress(this.emailTestResult);
        Assert.assertEquals(this.expectedResult, result);

    }

}
