
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployerBasicInfo  {

    private final int ID_EMPLOYER;
    private String lastName;
    private String firstName;
    SimpleDateFormat formatDate = new SimpleDateFormat("E yyyy.MM.dd");
    private final Date DATA_EMPLOYMENT;
    //exp. 190 + 113 = `2013, Calendar.MAY, 13`
    private char sex;
    private String numberOfDepartment;
    private String nameDepartment;
    private String position;
    private int numberPhone;
    private String email;
    private String supervisor;
    private String hobby;

    public EmployerBasicInfo(int ID_EMPLOYER , String lastName, String firstName, Date DATA_EMPLOYMENT) {
        this.ID_EMPLOYER = ID_EMPLOYER;
        this.lastName = lastName;
        this.firstName = firstName;
        this.DATA_EMPLOYMENT = DATA_EMPLOYMENT;
    }

    public int getID_EMPLOYER (){
        return ID_EMPLOYER;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDATA_EMPLOYMENT() {
        return DATA_EMPLOYMENT;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public void setNumberOfDepartment(String numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
