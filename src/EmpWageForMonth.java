public class EmpWageForMonth {
    public static void main(String[] args) {
        // Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int NUM_WORKING_DAYS = 20;
        int WAGE_PER_HOUR = 20;
        int FULL_TIME_WORK_HOUR = 8;
        int PART_TIME_WORK_HOUR = 4;

        // variables
        int workingDay=0;
        int totalSalary = 0;
        while (workingDay< NUM_WORKING_DAYS){
            int empWage = 0;
            // Computation
            double empCheck = Math.floor(Math.random() * 10) % 3;
            if (empCheck == IS_FULL_TIME) {
                System.out.println("Employee is Present" + Math.random());
                empWage = FULL_TIME_WORK_HOUR * WAGE_PER_HOUR;
            } else if (empCheck == IS_PART_TIME) {
                System.out.println("Employee is Present" + Math.random());
                empWage = PART_TIME_WORK_HOUR * WAGE_PER_HOUR;
            } else
                System.out.println("Employee is Absent");
            System.out.println("Employee wage: " + empWage);
            totalSalary = empWage;
            workingDay++;
        }
    }
}
