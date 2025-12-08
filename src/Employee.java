public class Employee {
    int dailyAttendance;
    int workPerDay = 8;
    int halfDay = 4;
    int hourlyPay = 20;
    int dailySalary = 0;

    public void calculateDailyAttendance() {
        if (Math.random() < 0.5) {
            dailyAttendance = 1;   // present
            System.out.println("Employee is present");
        }
        else if(((Math.random()*100)%3 )==0){
            dailyAttendance=1;
            System.out.println("part time");
        }else {
            dailyAttendance = 0;   // absent
            System.out.println("Employee is absent");
        }
    }

    public int dailyWage() {
        if (dailyAttendance == 2) {
            dailySalary = workPerDay * hourlyPay;
            System.out.println("Daily salary: " + dailySalary);
        } else if(dailyAttendance == 1){
            dailySalary = halfDay * hourlyPay;
            System.out.println("Daily salary: " + dailySalary);
        }
        else {
            dailySalary = 0;
            System.out.println("No pay");
        }
        return dailySalary;
    }
}
