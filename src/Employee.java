public class Employee {
    int absent=0;
    int present=1;
    int dailyAttendance;
    int hourlyWage=20;
    int fullDay=8;
    int dailyWage;
    public void checkDailyAttendance(){
        int empcheck=(int)(Math.random()*2);
        if (empcheck==present){
            dailyAttendance=present;
            System.out.println("Employee is present");
        }else{
            dailyAttendance=absent;
            System.out.println("Employee is not present");
        }
    }
    public void calculateDailyWage(){
        if (dailyAttendance==present){
            dailyWage=hourlyWage*fullDay;
            System.out.println("Daily wage: " + dailyWage);
        }else{
            dailyWage=0;
            System.out.println("No Pay");
        }
    }
}
