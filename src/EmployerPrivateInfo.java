public class EmployerPrivateInfo {

    private final int ID_EMPLOYER;
    private float salary;
    private int age;
    private long bankAccountNumber;
    private int ratingWork;
    private String mainResponsibility;
    private int vacationDays;
    private int currentUnUsedVacationDays;

    //maybe add benfits (new classes)


    public EmployerPrivateInfo(int ID_EMPLOYER) {
        this.ID_EMPLOYER = ID_EMPLOYER;
    }

    public int getID_EMPLOYER() {
        return ID_EMPLOYER;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getRatingWork() {
        return ratingWork;
    }

    public void setRatingWork(int ratingWork) {
        this.ratingWork = ratingWork;
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

    public int getCurrentUnUsedVacationDays() {
        return currentUnUsedVacationDays;
    }

    public void setCurrentUnUsedVacationDays(int currentUnUsedVacationDays) {
        this.currentUnUsedVacationDays = currentUnUsedVacationDays;
    }
}
