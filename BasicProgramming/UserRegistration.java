package UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegitration {
	public static void userName(){
            System.out.println("Enter User Name:");
            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            Pattern user = Pattern.compile("^[A-Z][a-z]{3,}$");
            Matcher mtch = user.matcher(name);
            if(mtch.matches())
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("Invalid");
            }

    public static void emailValidation(){
            System.out.println("Enter Email Adress:");
            String email=sc.next();
            Pattern u = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
            Matcher m = u.matcher(email);
            if(m.matches())
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("Invalid");
            }

    public static void mobile(){
            System.out.println("Enter Mobile Number:");
            String  number=sc.next();
            Pattern u = Pattern.compile("^[1-9]{2}[-, ]?{1}[1-9][0-9]{9}$");
            Matcher m = u.matcher(number);
            if(m.matches())
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("Invalid");
            }

   public static void passwordValidation(){
            System.out.println("Enter Password");
            String number=sc.next();
            String pat="^[A-Z][a-z0-9]{8,}+[@#%&]{1}$";
            Pattern u = Pattern.compile(pat);
            Matcher m = u.matcher(number);
            if(m.matches())
            {
                System.out.println("valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }

		public Static void main(String[] args)
		{
			userName();
			emailValidation();
			mobileValidation();
			passwordValidation();
		}
    }


