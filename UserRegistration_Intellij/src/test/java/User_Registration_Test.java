import org.junit.Assert;
import org.junit.Test;

public class User_Registration_Test {

    @Test
    public void givenFirstName_ShouldReturnTrue()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateFirstName("Narayan");
        Assert.assertEquals(true, result);
    }


    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateFirstName("Na");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateFirstName("Nar@yan");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateEmailAddress("abc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNumber_WhenValid_ShouldReturnTrue()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateMobileNumber("91-8118838819");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNumber_WhenValid_ShouldReturnFalse()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validateMobileNumber("8118838819");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validatePassword("Afsaralam15@");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnFalse()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validatePassword("Afsaralam15");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnFalse1()
    {
        User_Registration_Main validator=new User_Registration_Main();
        boolean result = validator.validatePassword("Afsar15");
        Assert.assertEquals(false, result);
    }
}
