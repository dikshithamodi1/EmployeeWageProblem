public class Main {
    public static void main(String[] args){
        //UC1
        System.out.println("Welcome to Employee Wage Computation Program");

//        Employee e1 = new Employee();

//        e1.checkDailyAttendance();  // determine if present/absent
//        System.out.println("Attendance value: " + e1.dailyAttendance);

//        e1.calculateDailyWage();
//        e1.calculateDailyWageUsingSwitch();
//        e1.calculateMonthlyWage();
//        e1.calculateWageTillCondition();
//          EmployeeUC7.calculateEmployeeWage();

        // UC8: Multiple companies
        EmployeeUC8.calculateEmployeeWage("TCS", 20, 20, 100);
        EmployeeUC8.calculateEmployeeWage("Infosys", 25, 22, 110);
        EmployeeUC8.calculateEmployeeWage("Wipro", 30, 20, 120);
    }
}
