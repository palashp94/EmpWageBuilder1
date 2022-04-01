public class EmployeeAttendance {
    public static void main(String[] args) {
        // Constants
        int Is_FULL_TIME = 1;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_FULL_TIME) {
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}

