public class HeadersQuestions {

    public String getMainManu() {
        return "\nProszę wpisać numer w celu przejścia do odpowieniej funkcji menu:  \n" +
                "1 - Wyświetlenie podstawowych informacji o wszystkich pracownikach\n" +
                "2 - Dodatkowe opcje wyświetlania informacji o pracownikach \n" +
                "3 - Możliwość dodania nowego pracownika\n" +
                "4 - Możliwość usunięcia pracownika\n" +
                "5 - Możliwośc edytowania danych poszczególnego pracownika\n" +
                "6 - Dodatkowe funkcje\n" +
                "Aby zakończyć pracę programu wpisać \"stop Program\"\n";

        //6 - narazie ograniczymy się do tych 5 opcji
    }

    public String getOptionToSelectDetailsData() {
        return "Jakiego typu infomacje mają zostać wyświetlone: \n" +
                "1 - Jednej kategorii uwzględniające wszystkich pracowników \n" +
                "2 - Pełne dane konkretnego pracownika \n" +
                "3 - Wszystkiech pracowników należących do wybranego atrybutu z wybranej kategorii\n" +
                "4 - Wszystkie informacje należące do wskazanej kategori \n";
        // 4 podpunkt będzie miał większe znaczenie przy dodakowych db np. sumy wynagordzeń
    }

    public String getOptionToSelectCategoryData(){
        return "Wpisanie odpowiedniej liczby wyświetli interesującą informację wszystkich pracowników: \n" +
                "1 - datę zatrudnienia \n" +
                "2 - płeć \n" +
                "3 - numer identyfikacyjny działu ";
    }

    public String getOptionToSelectEmployee () {
        return "Którego pracownika z pośród powyższej listy mają wyświetlić się szczegółowe informacje? Proszę wpisać jego id: ";
    }

    public String getOptionToSelectCategoryToDisplaySpecificInfo () {
        return  "Proszę wpisać odpowiedni numer, reprezentujący wybraną kategorię danych, z której filtrowane będą dane\n" +
                "1 - Nazwisko \n" +
                "2 - Imię\n" +
                "3 - Data zatrudnienia\n" +
                "4 - Płeć\n" +
                "5 - Numer departamentu\n" +
                "6 - Nazwa departamentu\n" +
                "7 - Stanowisko\n" +
                "8 - Numer telefonu\n" +
                "9 - Mail\n" +
                "10 - Bezpośredni przełożony\n" +
                "11 - Hooby\n";
    }

    public String getHeaderToSelectSpecificInfoFromEBI () {
        return "Proszę wpisać atrybut po którym mają wyświetlić się dane: ";
    }

    public String getHeaderCreateNewEmployee () {
        return "W celu dodania nowego pracownika proszę wpisać o nim dane w odpowiedniej kolejności lub " +
                "('last name', 'first name', 'date employment', 'sex', 'number department', 'name department', 'position', " +
                "'number phone', 'email', 'supervisor', 'hobby') \n" +
                "Przykład: Zawadzki, Damian, 2014-06-02, M, 3, HR, junior HR, 968145252, damian@wp.pl, Krzysztof Dabrowski, TV movie\n";
    }

    public String getHeaderDeleteEmployee () {
        return "Proszę wpisać id pracownika, który ma zostać usunięty z pośród listy \n";
    }

    public String getHeaderUpdataEBI () {
        return "Proszę wpisać id pracownika, u którego mają zostać zmienione podstawowe dane\n";
    }

    public String getOptionToSelectCategoryToUpdateEBI () {
        return "Proszę wpisać odpowiedni numer, reprezentujący wybraną kategorię danych, które mają zostać zmienione:\n" +
                "1 - Data zatrudnienia\n" +
                "2 - Płeć\n" +
                "3 - Numer departamentu\n" +
                "4 - Nazwa departamentu\n" +
                "5 - Stanowisko\n" +
                "6 - Numer telefonu\n" +
                "7 - Mail\n" +
                "8 - Bezpośredni przełożony\n" +
                "9 - Hooby\n" +
                "Imię oraz nazwisko są podstawowymi danymi, których nie można zmienić.\n";
    }

    public String getOptionToUpdateEBIFromCategory () {
        return "Proszę wpisać nowe dane: \n";
    }
    
    public String getFarewellText () {
        return "Program został zakończony\n";
    }
}
