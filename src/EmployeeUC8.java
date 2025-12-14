public class EmployeeUC8 {

    // attendance values (same logic as your code)
    static final int absent = 0;
    static final int present = 1;
    static final int partTime = 2;

    // UC8: class method with parameters
    public static void calculateEmployeeWage(
            String companyName,
            int hourlyWage,
            int workingDaysMonths,
            int maxHours) {

        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < maxHours &&
                totalWorkingDays < workingDaysMonths) {

            totalWorkingDays++;
            int empcheck = (int) (Math.random() * 3);
            int dailyHours = 0;

            if (empcheck == present) {
                dailyHours = 8;
            } else if (empcheck == partTime) {
                dailyHours = 4;
            } else {
                dailyHours = 0;
            }

            totalWorkingHours += dailyHours;
            totalWage += dailyHours * hourlyWage;
        }

        System.out.println("Company Name: " + companyName);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage: " + totalWage);
        System.out.println("---------------------------");
    }
}
