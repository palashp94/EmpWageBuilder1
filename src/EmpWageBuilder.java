public class EmpWageBuilder {
    // Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHrsPerMonth;


    public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public static void main(String[] args) {

        EmpWageBuilder dmart = new EmpWageBuilder("Dmart",20,2,10);

        // variables
        int empHrs= 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpWage = 0;
        // computation
        while (totalEmpHrs <= dmart.maxHrsPerMonth && totalWorkingDays < dmart.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " EmpHr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * dmart.empRatePerHour;
        System.out.println("Total Emp Wage for company:  "+ dmart.company + " is: " + totalEmpWage);
    }
}


