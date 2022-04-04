public class EmpWageBuilderArray {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilderArray[] {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpwage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
     companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays);
     numOfCompany++;
    }

    private void computeEmpwage() {
        int i;
        for (i = 0; i < numOfCompany; i++) {
            int totalEmpWage = this.computeEmpwage(companyEmpWageArray[i]);
            System.out.println("Total Emp Wage for company " + companyEmpWageArray[i].company + " is: " + totalEmpWage);
        }
    }

       private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        //Variables
           int empHrs=0;
           int totalEmpHrs=0;
           int totalWorkingDays=0;
           //Computation
           while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays) {
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
           Object companyEmpwage;
           return totalEmpHrs * companyEmpwage.empratePerHour;
     }

      public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpwage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpwage("BigBasket", 30, 2, 20);
        empWageBuilder.computeEmpwage();
    }
}

