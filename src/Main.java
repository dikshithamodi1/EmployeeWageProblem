public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");

        Employee e1 = new Employee();

        e1.calculateDailyAttendance();  // determine if present/absent
        System.out.println("Attendance value: " + e1.dailyAttendance);

        int salary = e1.dailyWage();   // calculate wage
        System.out.println("Daily wage is: " + salary);
    }
}
