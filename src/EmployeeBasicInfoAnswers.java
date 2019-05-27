public class EmployeeBasicInfoAnswers {

    private EmployeeBasicInfo employee;

    public EmployeeBasicInfoAnswers(EmployeeBasicInfo employee) {
        this.employee = employee;
    }

    public String getAnswerWithId() {
        return "Numer Id pracownika: " + employee.getId() + ", ";
    }

    public String getAnswerWithLastName() {
        return "Nazwisko: " + employee.getLastName() + ", ";
    }

    public String getAnswerWithFirstName() {
        return "Imię: " + employee.getFirstName() + ", ";
    }

    public String getAnswerWithDateEmployment() {
        return "Data zatrudnienia: " + employee.getDateOfEmployment() + ", ";
    }

    public String getAnswerWithSex() {
        return "Płeć: " + employee.getSex() + ", ";
    }

    public String getAnswerWithNumberDepartment() {
        return "Numer identyfikacyjny działu: " + employee.getNumberDepartment() + ", ";
    }

    public String getAnswerWithNameDepartment() {
        return "Nazwa działu: " + employee.getNameDepartment() + ", ";
    }

    public String getAnswerWithPosition() {
        return "Stanowisko: " + employee.getPosition() + ", ";
    }

    public String getAnswerWithNumberPhone() {
        return "Numer telefonu: " + employee.getNumberPhone() + ", ";
    }

    public String getAnswerWithEmail() {
        return "Email: " + employee.getEmail() + ", ";
    }

    public String getAnswerWithSupervisor() {
        return "Bezpośredni przełożony: " + employee.getSupervisor() + ", ";
    }

    public String getAnswerWithHobby() {
        return "Zainteresowania: " + employee.getHobby() + ", ";
    }

    public String getAnswerWithEnter() {
        return "\n";
    }

    @Override
    public String toString() {
        return "Numer Id pracownika: " + employee.getId() + ", " +
                "Nazwisko: " + employee.getLastName() + ", " +
                "Imię: " + employee.getFirstName();
    }
}
