import java.text.ParseException;
import java.util.Scanner;

public class Console extends Commands {

    public void startMenu() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String anser;

        do {
            displayMainMenu();
            anser = scanner.nextLine();

            switch (anser) {
                case "1": {
                    displayBasicInfoAboutAllEmployments();
                    break;
                }
                case "2": {
                    do {
                        displayOptionForSelectDetailsData();
                        anser = scanner.nextLine();

                        switch (anser) {
                            case "1": {
                                displayOptionForSelectCategoryData();
                                //W przyszłości zostaną dopisane wszystkie możliwe konfiguracje wyświetlania danych
                                anser = scanner.nextLine();
                                displayAnswerEmploymentsShortDataAndChooseType(anser);
                                break;
                            }
                            case "2": {
                                displayListEmploymentsShortData();
                                anser = scanner.nextLine();
                                displayBasicInfoAboutEmployerById(anser);
                                break;
                            }
                        }
                    } while (!anser.equalsIgnoreCase("back"));
                    break;
                }
                case "3": {
                    displayHeaderToCreateNewEmployer();
                    anser = scanner.nextLine();
                    if (anser.equalsIgnoreCase("back")) {
                        break;
                    }
                    sentAnswersToCreateNewEmployer(anser);
                    break;
                }
                case "4": {
                    displayHeaderToDeleteEmployer();
                    anser = scanner.nextLine();
                    if (anser.equalsIgnoreCase("back")) {
                        break;
                    }
                    sentCommandToDeleteEmployer(anser);
                    break;
                }


                //Przy opcjach dodatkowych można umieścić filtrację po np. numerze departamentu (dziedziczenie nadklas)
            }

        } while (!anser.equalsIgnoreCase("stop Program"));
        {
        }
    }

    public void endMenu() {
        displayFarewellText();
    }
}
