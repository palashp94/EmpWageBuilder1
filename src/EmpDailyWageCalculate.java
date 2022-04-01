public class EmpDailyWageCalculate {
    public static void main(String[] args) {
        // Constants
        int Is_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        // Variables
        int empWage = 0;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_FULL_TIME) {
            System.out.println("Employee is Present" + Math.random());
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        }
        else
            System.out.println("Employee is Absent");
        System.out.println("Employee wage: "+empWage);
    }
}

