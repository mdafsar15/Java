import java.util.regex.Pattern;

public class User_Registration_Main {

private static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
private static final String EMAIL_ADDRESS_PATTERN="^[A-Za-z0-9+_.-]+@(.+)$";
private static final String MOBILE_NUMBER_PATTERN="^[1-9]{2}[-, ]?{1}[1-9][0-9]{9}$";
private static final String PASSWORD_VALIDATE_PATTERN="[A-Z][a-z0-9]{8,}+[@#%&]{1}$";

public boolean validateFirstName(String fname)
{
    Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
    return pattern.matcher(fname).matches();
}

public boolean validateEmailAddress(String email)
{
    Pattern pattern=Pattern.compile(EMAIL_ADDRESS_PATTERN);
    return pattern.matcher(email).matches();
}

public boolean validateMobileNumber(String mobNum)
    {
        Pattern pattern=Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobNum).matches();
    }

    public boolean validatePassword(String password)
    {
        Pattern pattern=Pattern.compile(PASSWORD_VALIDATE_PATTERN);
        return pattern.matcher(password).matches();
    }
}
