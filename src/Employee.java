public class Employee {
    static final int absent=0;
    static final int present=1;
    int dailyAttendance;
    int hourlyWage=20;
    int fullDay=8;
    int dailyWage;
    static final int partTime=2;
    int partTimeHours=4;
    public void checkDailyAttendance(){
        int empcheck=(int)(Math.random()*3);
        if (empcheck==present){
            dailyAttendance=present;
            System.out.println("Employee is present");
        } else if (empcheck==partTime) {
            dailyAttendance=partTime;
            System.out.println("Employee is parttime");
        }
        else{
            dailyAttendance=absent;
            System.out.println("Employee is not present");
        }
    }
    public void calculateDailyWage(){
        if (dailyAttendance==present){
            dailyWage=hourlyWage*fullDay;
            System.out.println("Daily wage: " + dailyWage);
            //UC3
        } else if (dailyAttendance==partTime) {
            dailyWage=partTimeHours*hourlyWage;
            System.out.println("Daily wage: " + dailyWage);
        } else{
            dailyWage=0;
            System.out.println("No Pay");
        }
    }
    // UC4: Calculate Daily Wage using Switch Case
    public void calculateDailyWageUsingSwitch() {
        switch (dailyAttendance) {
            case present:
                dailyWage = hourlyWage * fullDay;
                break;
            case partTime:
                dailyWage = hourlyWage * partTimeHours;
                break;
            default:
                dailyWage = 0;
        }
        System.out.println("Daily Wage using switch: " + dailyWage);
    }
}
