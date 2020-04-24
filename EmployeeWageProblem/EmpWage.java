package EmpWage;
import java.util.Arrays;
import java.util.HashMap;

public class EmpWage {
        static int IS_FULLTIME = 1;
        static int IS_PARTTIME = 2;
        static int IS_ABSENT = 3;
        static int WAGE_PERHOUR = 20;
        static int MAX_WORKING_DAYS = 20;
        static int MAX_WORKING_HOURS = 100;
        public static void main(String[] args) {

            System.out.println("****** Welcom to Employee Wage ***");

            int total_hours=0;
            int Workingdays=1;
            int total_wage=0;
            HashMap<String,Integer> hm=new HashMap<String,Integer>();

            while ((Workingdays<=MAX_WORKING_DAYS&&total_hours<=MAX_WORKING_HOURS))
            {
                int workinghrs=EmpWage.getemphr();
                System.out.println(workinghrs);
                total_hours=workinghrs+total_hours;
                int total_wage_perday=WAGE_PERHOUR*workinghrs;
                String day="Day"+Workingdays;
                hm.put(day,total_wage_perday);
                total_wage=total_wage_perday+total_wage;
                Workingdays++;
            }

            System.out.println(Arrays.asList(hm));
            System.out.println("total wage: "+total_wage);

        }

        private static int getemphr(){
            int workinghrsPerDay=0;
            int hourCheck=(int)(Math.random()*3+1);
            switch (hourCheck)
            {
                case 1:
                    workinghrsPerDay=8;
                case 2:
                    workinghrsPerDay=4;
                case 3:
                    workinghrsPerDay=0;
                    break;
            }

            return workinghrsPerDay;
        }

    }

