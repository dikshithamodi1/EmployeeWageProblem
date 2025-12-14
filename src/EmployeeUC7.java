public class EmployeeUC7 {
static final int absent=0;
static final int present=1;
static final int partTime=2;
static final int hourlyWage=20;
static final int fullDay=8;
static final int partTimeHours=4;
static final int max_hours=100;
static final int max_days=20;
public static void calculateEmployeeWage(){
    int totalWage=0;
    int totalWorkingHours=0;
    int totalWorkingDays=0;
    while(totalWorkingHours<max_hours && totalWorkingDays<max_days){
            totalWorkingDays++;
            int empcheck=(int)(Math.random()*3);
            int dailyHours=0;
            switch (empcheck){
                case present:
                    dailyHours=fullDay;
                    break;
                case partTime:
                    dailyHours=partTimeHours;
                    break;
                default:
                    dailyHours=0;
                    break;
            }
            totalWorkingHours+=dailyHours;
            totalWage+=dailyHours*hourlyWage;
    }
    System.out.println("Total Working Days: " + totalWorkingDays);
    System.out.println("Total Working Hours: " + totalWorkingHours);
    System.out.println("Employee wage is "+totalWage);
}
}
