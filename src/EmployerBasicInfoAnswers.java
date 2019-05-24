public class EmployerBasicInfoAnswers extends EmployerBasicInfo {

    private EmployerBasicInfo employer;

    public EmployerBasicInfoAnswers(EmployerBasicInfo employer) {
        this.employer = employer;
    }

    public String getAnswerWithId() {
        return "Numer Id pracownika: " + employer.getId() + ", ";
    }

    public String getAnswerWithLastName() {
        return "Nazwisko: " + employer.getLastName() + ", ";
    }

    public String getAnswerWithFirstName() {
        return "Imię: " + employer.getFirstName() + ", ";
    }

    public String getAnswerWithDateEmployment() {
        return "Data zatrudnienia: " + employer.getDateOfEmployment() + ", ";
    }

    public String getAnswerWithSex() {
        return "Płeć: " + employer.getSex() + ", ";
    }

    public String getAnswerWithNumberDepartment() {
        return "Numer identyfikacyjny działu: " + employer.getNumberDepartment() + ", ";
    }

    public String getAnswerWithNameDepartment() {
        return "Nazwa działu: " + employer.getNameDepartment() + ", ";
    }

    public String getAnswerWithPosition() {
        return "Stanowisko: " + employer.getPosition() + ", ";
    }

    public String getAnswerWithNumberPhone() {
        return "Numer telefonu: " + employer.getNumberPhone() + ", ";
    }

    public String getAnswerWithEmail() {
        return "Email: " + employer.getEmail() + ", ";
    }

    public String getAnswerWithSupervisor() {
        return "Bezpośredni przełożony: " + employer.getSupervisor() + ", ";
    }

    public String getAnswerWithHobby() {
        return "Zainteresowania: " + employer.getHobby() + ", ";
    }

    public String getAnswerWithEnter() {
        return "\n";
    }

    @Override
    public String toString() {
        return "Numer Id pracownika: " + employer.getId() + ", " +
                "Nazwisko: " + employer.getLastName() + ", " +
                "Imię: " + employer.getFirstName();
    }
}
