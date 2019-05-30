import java.text.ParseException;
import java.util.Scanner;

public class Console extends Commands {

    public void startMenu() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String anser;

        do {
            displayMainMenu();
            anser = scanner.nextLine();

            if (anser.equalsIgnoreCase("stop program")){
                continue;
            }
            switch (Integer.valueOf(anser)) {
                case 1: {
                    displayBasicInfoAboutAllEmployees();
                    break;
                }
                case 2: {
                    do {
                        displayOptionToSelectDetailsData();
                        displayHeaderToBackLastWindow();
                        anser = scanner.nextLine();

                        switch (Integer.valueOf(anser)) {
                            case 1: {
                                displayOptionToSelectCategoryData();
                                //W przyszłości zostaną dopisane wszystkie możliwe konfiguracje wyświetlania danych
                                anser = scanner.nextLine();
                                displayAnswerEmployeesShortDataAndChooseType(anser);
                                break;
                            }
                            case 2: {
                                displayListEmploymentsShortData();
                                anser = scanner.nextLine();
                                displayBasicInfoAboutEmployeeById(anser);
                                break;
                            }
                            case 3: {
                                displayOptionToSelectCategoryToDisplaySpecificInfo();
                                displayHeaderToBackLastWindow();
                                anser = scanner.nextLine();
                                if (anser.equalsIgnoreCase("back")) {
                                    break;
                                }
                                setCategoryToDisplaySpecificInfo(anser);
                                displayHeaderToSelectSpecificInfoFromEBI();
                                displayHeaderToBackLastWindow();
                                anser = scanner.nextLine();
                                if (anser.equalsIgnoreCase("back")) {
                                    break;
                                }
                                displayAllEmployeesByAttribute(anser);
                                break;
                                //można zrobić wyszukiwanie po samym roku zatrudnienia
                            }
                        }
                    } while (!anser.equalsIgnoreCase("back"));
                    break;
                }
                case 3: {
                    displayHeaderToCreateNewEmployee();
                    displayHeaderToBackLastWindow();
                    anser = scanner.nextLine();
                    if (anser.equalsIgnoreCase("back")) {
                        break;
                    }
                    setAnswersToCreateNewEmployee(anser);
                    break;
                }
                case 4: {
                    displayHeaderToDeleteEmployee();
                    displayHeaderToBackLastWindow();
                    anser = scanner.nextLine();
                    if (anser.equalsIgnoreCase("back")) {
                        break;
                    }
                    setCommandToDeleteEmployee(anser);
                    break;
                }
                case 5: {
                    displayHeaderToSelectEmployeeToUpdateEBI();
                    displayHeaderToBackLastWindow();
                    anser = scanner.nextLine();
                    if (anser.equalsIgnoreCase("back")) {
                        break;
                    }
                    setIdToUpdateEmployeeFromEBI(anser);
                    displayOprionToSelectCategoryToUpdateEBI();
                    displayHeaderToBackLastWindow();
                    if (anser.equalsIgnoreCase("back")) {
                        break;
                    }
                    anser = scanner.nextLine();
                    setCategoryToUpdateEBI(anser);
                    displayOptionToUpdateEBIFromCategory();
                    anser = scanner.nextLine();
                    setNewDataAndUpdateEBI(anser);
                    displayHeaderAfterUpdateEmployee();
                    break;
                }

            }

        } while (!anser.equalsIgnoreCase("stop Program"));
    }

    public void endMenu() {
        displayFarewellText();
    }
}
