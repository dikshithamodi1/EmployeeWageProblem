public class Employee {
    static final int absent=0;
    static final int present=1;
    int dailyAttendance;
    int hourlyWage=20;
    int fullDay=8;
    int dailyWage;
    int workingDaysMonths=20;
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
    public int calculateDailyWage(){
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
        return dailyWage;
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
    //UC5
    public int calculateMonthlyWage(){
        int totalMonthlyWage = 0;
        for (int day = 1; day <= workingDaysMonths; day++) {
            System.out.println("Day " + day + ":");
            checkDailyAttendance();
            totalMonthlyWage = totalMonthlyWage + calculateDailyWage();
            System.out.println();
        }
        System.out.println("Total Monthly Wage (20 Days): " + totalMonthlyWage);
        return totalMonthlyWage;
    }
    // UC6: Calculate wage till 100 hours or 20 days
    public void calculateWageTillCondition() {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < 100 && totalWorkingDays < 20) {
            totalWorkingDays++;
            System.out.println("Day " + totalWorkingDays + ":");
            checkDailyAttendance();
            if (dailyAttendance == present) {
                totalWorkingHours += fullDay;
                totalWage += hourlyWage * fullDay;
            } else if (dailyAttendance == partTime) {
                totalWorkingHours += partTimeHours;
                totalWage += hourlyWage * partTimeHours;
            }
            System.out.println("Total Hours so far: " + totalWorkingHours);
            System.out.println();
        }
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage till condition: " + totalWage);
    }
}
