public class Main {
    public static void main(String[] args){
        //UC1
        System.out.println("Welcome to Employee Wage Computation Program");

        Employee e1 = new Employee();

        e1.checkDailyAttendance();  // determine if present/absent
        System.out.println("Attendance value: " + e1.dailyAttendance);

        e1.calculateDailyWage();
        e1.calculateDailyWageUsingSwitch();
        e1.calculateMonthlyWage();
        e1.calculateWageTillCondition();
    }
}
