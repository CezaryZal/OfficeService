
import java.util.Arrays;
import java.util.List;

public class EmployeeBasicInfoFullAnswers {

    private HeadersAnswers headersAnswers = new HeadersAnswers();
    private EmployeeBasicInfoDAO employeeBasic = new EmployeeBasicInfoDAO();
    List<String> category = Arrays.asList("last_name", "first_name", "date_employment", "sex", "number_department",
            "name_department", "position", "email", "supervisor", "hobby");
    private int numberCategory;


    public String createStringAllEmployeesShortData (){
        List<EmployeeBasicInfo> allEmployees = employeeBasic.loadAllEmployeesShortData();

        StringBuilder strB = new StringBuilder (headersAnswers.getHeaderEmployeesShortData());

        for (EmployeeBasicInfo employee : allEmployees){
            EmployeeBasicInfoWithDescription employeeWithDescription = new EmployeeBasicInfoWithDescription(employee);
            strB.append(employeeWithDescription);
            strB.append(employeeWithDescription.getAnswerWithEnter());
        }
        return strB.toString();
    }

    public String createStringAllEmployees (){
        List<EmployeeBasicInfo> allEmployees = employeeBasic.loadAllEmployees();

        StringBuilder strB = new StringBuilder (headersAnswers.getHeaderEmployeesBasicInfo());

        for (EmployeeBasicInfo employer : allEmployees) {
            strB.append(createStringEmployee(employer));
        }
        return strB.toString();
    }


    public String createStringEmployeesShortDataAndSelectType(int answerNumber) {
        List<EmployeeBasicInfo> allEmployers = employeeBasic.loadAllEmployees();

        String headerforAnswer = "";
        StringBuilder strB = new StringBuilder();

        for (EmployeeBasicInfo employer : allEmployers) {
            EmployeeBasicInfoWithDescription answers = new EmployeeBasicInfoWithDescription(employer);
            strB.append(answers.getAnswerWithId());
            strB.append(answers.getAnswerWithLastName());
            strB.append(answers.getAnswerWithFirstName());
            switch (answerNumber) {
                case 1: {
                    strB.append(answers.getAnswerWithDateEmployment());
                    headerforAnswer = headersAnswers.getHeaderEmployeesShortDataAndDateEmployment();
                    break;
                }
                case 2: {
                    strB.append(answers.getAnswerWithSex());
                    headerforAnswer = headersAnswers.getHeaderEmployeesShortDataAndSex();
                    break;
                }
                case 3: {
                    strB.append(answers.getAnswerWithNumberDepartment());
                    headerforAnswer = headersAnswers.getHeaderEmployeesShortDataAndNumberDepartment();
                    break;
                }
            }
            strB.append(answers.getAnswerWithEnter());
        }
        return headerforAnswer + strB.toString();
    }

    public String createStringEmployerById (int id) {
        return createStringEmployee(employeeBasic.loadEmployeeById(id));
    }


    public String createStringEmployee (EmployeeBasicInfo employer){
        EmployeeBasicInfoWithDescription answers = new EmployeeBasicInfoWithDescription(employer);
        StringBuilder strB = new StringBuilder();

        strB.append(answers.getAnswerWithId());
        strB.append(answers.getAnswerWithLastName());
        strB.append(answers.getAnswerWithFirstName());
        strB.append(answers.getAnswerWithDateEmployment());
        strB.append(answers.getAnswerWithSex());
        strB.append(answers.getAnswerWithNumberDepartment());
        strB.append(answers.getAnswerWithNameDepartment());
        strB.append(answers.getAnswerWithPosition());
        strB.append(answers.getAnswerWithNumberPhone());
        strB.append(answers.getAnswerWithEmail());
        strB.append(answers.getAnswerWithSupervisor());
        strB.append(answers.getAnswerWithHobby());
        strB.append(answers.getAnswerWithEnter());

        return strB.toString();
    }

    public void setNumberOfCategoryToDisplaySpecificInfo (int numberCategory) {
        this.numberCategory = numberCategory;
    }

    public String createStringAllEmployeesByAttribute (String attribute){
        List<EmployeeBasicInfo> allEmployeesWithAttribute;
        StringBuilder answers = new StringBuilder(headersAnswers.getHeaderAfterDisplayAllEmployeesByAttribute());

        allEmployeesWithAttribute = employeeBasic.getAllEmployeesWithAttribute(category.get(numberCategory - 1), attribute);

        for (EmployeeBasicInfo employee : allEmployeesWithAttribute) {

            EmployeeBasicInfoWithDescription employeeWithDescription = new EmployeeBasicInfoWithDescription(employee);
            answers.append(employeeWithDescription);
            answers.append(employeeWithDescription.getAnswerWithEnter());
        }
        return answers.toString();
    }
}
