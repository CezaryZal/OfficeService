
public class Commands {

    private Screen screen = new Screen();
    private EmployeeBasicInfoFullAnswers EBIFullAnswers = new EmployeeBasicInfoFullAnswers();
    private EmployeeBasicInfoEditor employeeEditor = new EmployeeBasicInfoEditor();
    private EmployeeBasicInfoDAO EBIDAO = new EmployeeBasicInfoDAO();
    private HeadersAnswers headersAnswers = new HeadersAnswers();
    private HeadersQuestions headersQuestions = new HeadersQuestions();



    public void displayMainMenu (){
        screen.printText(headersQuestions.getMainManu());
    }

    public void displayBasicInfoAboutAllEmployees() {
        screen.printText(EBIFullAnswers.createStringAllEmployees());
    }

    public void displayOptionToSelectDetailsData (){
        screen.printText(headersQuestions.getOptionToSelectDetailsData());
    }

    public void displayOptionToSelectCategoryData (){
        screen.printText(headersQuestions.getOptionToSelectCategoryData());
    }

    public void displayAnswerEmployeesShortDataAndChooseType (String numberAnswer){
        screen.printText(EBIFullAnswers.createStringEmployeesShortDataAndSelectType(Integer.valueOf(numberAnswer)));
    }

    public void displayBasicInfoAboutEmployeeById (String idEmployer){
        screen.printText(EBIFullAnswers.createStringEmployerById(Integer.valueOf(idEmployer)));
    }

    public void displayOptionToSelectCategoryToDisplaySpecificInfo () {
        screen.printText(headersQuestions.getOptionToSelectCategoryToDisplaySpecificInfo());
    }

    public void setCategoryToDisplaySpecificInfo (String answer) {
        EBIFullAnswers.setNumberOfCategoryToDisplaySpecificInfo(Integer.valueOf(answer));
    }

    public void displayHeaderToSelectSpecificInfoFromEBI () {
        screen.printText(headersQuestions.getHeaderToSelectSpecificInfoFromEBI());
    }

    public void displayAllEmployeesByAttribute(String attribute){
        screen.printText(EBIFullAnswers.createStringAllEmployeesByAttribute(attribute));
    }

    public void displayHeaderToCreateNewEmployee () {
        screen.printText(headersQuestions.getHeaderCreateNewEmployee());
    }

    public void setAnswersToCreateNewEmployee (String answer) {
        EBIDAO.insertNewEmployee(employeeEditor.createNewEmployee(answer));
        screen.printText(headersAnswers.getHeaderAfterCreateNewEmployee());
    }

    public void displayHeaderToDeleteEmployee (){
        screen.printText(headersQuestions.getHeaderDeleteEmployee());
        screen.printText(EBIFullAnswers.createStringAllEmployeesShortData());
    }

    public void setCommandToDeleteEmployee (String answer){
        EBIDAO.deleteEmployeeById(Integer.valueOf(answer));
        screen.printText(headersAnswers.getHeaderAfterDeleteEmployee());
    }

    public void displayHeaderToSelectEmployeeToUpdateEBI () {
        screen.printText(headersQuestions.getHeaderUpdateEBI());
        screen.printText(EBIFullAnswers.createStringAllEmployeesShortData());
    }

    public void setIdToUpdateEmployeeFromEBI (String answer){
        employeeEditor.setTmpIdEmployee(Integer.valueOf(answer));
    }

    public void displayOprionToSelectCategoryToUpdateEBI (){
        screen.printText(headersQuestions.getOptionToSelectCategoryToUpdateEBI());
    }

    public void setCategoryToUpdateEBI (String answer){
        employeeEditor.setNumberOfCategoryToUpdate(Integer.valueOf(answer));
    }

    public void displayOptionToUpdateEBIFromCategory () {
        screen.printText(headersQuestions.getOptionToUpdateEBIFromCategory());
    }

    public void setNewDataAndUpdateEBI (String newData){
        employeeEditor.prepareUpdateEmployee(newData);
    }

    public void displayHeaderAfterUpdateEmployee () {
        screen.printText(headersAnswers.getHeaderAfterUpdateEmployee());
    }


    public void displayHeaderToBackLastWindow () {
        screen.printText(headersAnswers.getHeaderToBackLastWindow());
    }

    public void displayListEmploymentsShortData(){
        screen.printText(EBIFullAnswers.createStringAllEmployeesShortData());
        screen.printText(headersQuestions.getOptionToSelectEmployee());
    }

    public void displayFarewellText (){
        screen.printText(headersQuestions.getFarewellText());
    }
}
