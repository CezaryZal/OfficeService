import java.math.BigDecimal;

public class EmployeePrivateInfo {

    private final int IDEPI;
    private final int ID_EMPLOYEE;
    private BigDecimal salary;
    private int age;
    private String bankAccountNumber;
    private int ratingWork;
    private String mainResponsibility;
    private int vacationDays;
    private int currentUnusedVacationDays;
    //maybe add benfits (new classe)

    public EmployeePrivateInfo(int idEmployee, int idEPI) {
        this.ID_EMPLOYEE = idEmployee;
        this.IDEPI = idEPI;
    }

    public int getidEPI() {
        return IDEPI;
    }

    public int getIdEmployee() {
        return ID_EMPLOYEE;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getRatingWork() {
        return ratingWork;
    }

    public boolean setRatingWork(int ratingWork) {
        if (ratingWork > 10 || ratingWork < 1){
            return false;
        }
        this.ratingWork = ratingWork;
        return true;
    }

    public String getMainResponsibility() {
        return mainResponsibility;
    }

    public void setMainResponsibility(String mainResponsibility) {
        this.mainResponsibility = mainResponsibility;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getCurrentUnusedVacationDays() {
        return currentUnusedVacationDays;
    }

    public void setCurrentUnusedVacationDays(int currentUnusedVacationDays) {
        this.currentUnusedVacationDays = currentUnusedVacationDays;
    }

    @Override
    public String toString() {
        return "Employee private info{" +
                "id empolyee=" + ID_EMPLOYEE +
                ", salary=" + salary +
                ", age=" + age +
                ", bank account number='" + bankAccountNumber + '\'' +
                ", rating work=" + ratingWork +
                ", main responsibility='" + mainResponsibility + '\'' +
                ", vacation days=" + vacationDays +
                ", current unused vacation days=" + currentUnusedVacationDays +
                '}';
    }
}
