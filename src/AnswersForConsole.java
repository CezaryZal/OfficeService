import java.util.List;

public class AnswersForConsole implements HeadersAnswers {

    private EmployerBasicInfo employerBasic = new EmployerBasicInfoDAO();

    public String makeListEmploymentsShortData (){
        List<EmployerBasicInfo> allEmployers = ((EmployerBasicInfoDAO)employerBasic).loadAllEmploymesntsShortData();

        StringBuilder strB = new StringBuilder (headerEmploymentsShortData);

        for (EmployerBasicInfo employer : allEmployers){
            EmployerBasicInfoAnswers employerAnswers = new EmployerBasicInfoAnswers (employer);
            strB.append(employerAnswers);
            strB.append(employerAnswers.getAnswerWithEnter());
        }
        return strB.toString();
    }

    public String makeBasicInfoAboutAllEmployment (){
        List<EmployerBasicInfo> allEmployers = ((EmployerBasicInfoDAO)employerBasic).loadAllEmployers();

        StringBuilder strB = new StringBuilder (headerEmploymentsBasicInfo);

        for (EmployerBasicInfo employer : allEmployers) {
            strB.append(makeBasicInfoAboutEmployer(employer));
        }
        return strB.toString();
    }


    public String makeEmploymentsShortDataAndChooseType(int answerNumber) {
        List<EmployerBasicInfo> allEmployers = ((EmployerBasicInfoDAO)employerBasic).loadAllEmployers();

        String headerforAnswer = "";
        StringBuilder strB = new StringBuilder();

        for (EmployerBasicInfo employer : allEmployers) {
            EmployerBasicInfoAnswers answers = new EmployerBasicInfoAnswers(employer);
            strB.append(answers.getAnswerWithId());
            strB.append(answers.getAnswerWithLastName());
            strB.append(answers.getAnswerWithFirstName());
            switch (answerNumber) {
                case 1: {
                    strB.append(answers.getAnswerWithDateEmployment());
                    headerforAnswer = headerEmploymentsShortDataAndDateEmployment;
                    break;
                }
                case 2: {
                    strB.append(answers.getAnswerWithSex());
                    headerforAnswer = headerEmploymentsShortDataAndSex;
                    break;
                }
                case 3: {
                    strB.append(answers.getAnswerWithNumberDepartment());
                    headerforAnswer = headerEmploymentsShortDataAndNumberDepartment;
                    break;
                }
            }
            strB.append(answers.getAnswerWithEnter());
        }
        return headerforAnswer + strB.toString();
    }

    public String makeBasicInfoAboutEmployerById (int id) {
        return makeBasicInfoAboutEmployer(((EmployerBasicInfoDAO)employerBasic).loadEmployerById(id));
    }


    public String makeBasicInfoAboutEmployer (EmployerBasicInfo employer){
        EmployerBasicInfoAnswers answers = new EmployerBasicInfoAnswers(employer);
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





}
