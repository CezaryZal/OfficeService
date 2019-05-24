
public class Commands implements HeadersQuestions, HeadersAnswers{

    private Screen screen = new Screen();
    private AnswersForConsole answersForConsole = new AnswersForConsole();
    private EmployerBasicInfoEditor employerEditor = new EmployerBasicInfoEditor();


    public void displayMainMenu (){
        screen.printText(mainManu);
    }

    public void displayBasicInfoAboutAllEmployments() {
        screen.printText(answersForConsole.makeBasicInfoAboutAllEmployment());
    }

    public void displayOptionForSelectDetailsData (){
        screen.printText(optionForSelectDetailsData);
    }

    public void displayOptionForSelectCategoryData (){
        screen.printText(optionForSelectCategoryData);
    }

    public void displayAnswerEmploymentsShortDataAndChooseType (String numberAnswer){
        screen.printText(answersForConsole.makeEmploymentsShortDataAndChooseType(Integer.valueOf(numberAnswer)));
    }

    public void displayBasicInfoAboutEmployerById (String idEmployer){
        screen.printText(answersForConsole.makeBasicInfoAboutEmployerById(Integer.valueOf(idEmployer)));
    }

    public void displayHeaderToCreateNewEmployer () {
        screen.printText(headerToCreateNewEmployer);
    }

    public void sentAnswersToCreateNewEmployer (String answer) {
        EmployerBasicInfo employer = employerEditor.createNewEmployer(answer);
        employerEditor.insertNewEmployer(employer);
        screen.printText(headerAfterCreateNewEmployer);
    }

    public void displayHeaderToDeleteEmployer (){
        screen.printText(headerToDeleteEmployer);
        screen.printText(answersForConsole.makeListEmploymentsShortData());
    }

    public void sentCommandToDeleteEmployer (String answer){
        employerEditor.deleteEmployerById(Integer.valueOf(answer));
        screen.printText(headerAfterDeleteEmployer);
    }








    public void displayListEmploymentsShortData(){
        screen.printText(answersForConsole.makeListEmploymentsShortData());
        screen.printText(optionForSelectEmployer);
    }

    public void displayFarewellText (){
        screen.printText(farewellText);
    }
}
