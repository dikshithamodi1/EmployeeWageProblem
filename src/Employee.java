public class Employee {
    int absent=0;
    int present=1;
    int dailyAttendance;
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

}
