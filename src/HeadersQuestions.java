public interface HeadersQuestions {

    String mainManu = "\nProszę wpisać numer w celu przejścia do odpowieniej funkcji menu:  \n" +
            "1 - Wyświetlenie najważniejszych informacji o wszystkich pracownikach\n" +
            "2 - Wyświetlenie szczegółowych informacji\n" +
            "3 - Możliwość dodania nowego pracownika\n" +
            "4 - Możliwość usunięcia pracownika\n" +
            "5 - Możliwośc edytowania danych poszczególnego pracownika\n" +
            "6 - Dodatkowe funkcje\n" +
            "Aby zakończyć pracę programu wpisać \"stop Program\"";

    String optionForSelectDetailsData = "Szczegółowe infomracje dotyczyć mają: \n" +
            "1 - Wszystkich pracowników \n" +
            "2 - Konkretnego pracownika \n" +
            "W celu powrotu do menu głównego, proszę wpisać \"back\"";

    String optionForSelectCategoryData = "Wpisanie odpowiedniej liczby wyświetli interesującą informację wszystkich pracowników: \n" +
            "1 - datę zatrudnienia \n" +
            "2 - płeć \n" +
            "3 - numer identyfikacyjny działu ";

    String optionForSelectEmployer = "Którego pracownika z pośród powyższej listy mają wyświetlić się szczegółowe informacje? Proszę wpisać jego id: ";

    String headerToCreateNewEmployer = "W celu dodania nowego pracownika proszę wpisać o nim dane w odpowiedniej kolejności lub " +
            "\"back\", aby wrócić do głównego menu.\n" +
            "('last name', 'first name', 'date employment', 'sex', 'number department', 'name department', 'position', " +
            "'number phone', 'email', 'supervisor', 'hobby') \n" +
            "Przykład: Zawadzki, Damian, 2014-06-02, M, 3, HR, junior HR, 968145252, damian@wp.pl, Krzysztof Dabrowski, TV movie\n";

    String headerToDeleteEmployer = "Proszę wpisać id pracownika, który ma zostać usunięty z pośród listy lub " +
            "\"back\" aby wrócić do głównego menu: \n";



    String farewellText = "Program został zakończony";
}
