import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePrivateInfoDAO extends EmployeePrivateInfo{

    public List<EmployeePrivateInfo> loadAllEmployees() {
        List<EmployeePrivateInfo> allEmployees = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_private_info;");

            while (resultSet.next()){
                EmployeePrivateInfo employee = new EmployeePrivateInfo();

                employee.setIdEPI(resultSet.getInt("id"));
                employee.setIdEmployee(resultSet.getInt("employee_id"));
                employee.setSalary(resultSet.getBigDecimal("salary"));
                employee.setAge(resultSet.getInt("age"));
                employee.setBankAccountNumber(resultSet.getString("bank_account_number"));
                employee.setRatingWork(resultSet.getInt("rating_work"));
                employee.setMainResponsibility(resultSet.getString("main_responsibility"));
                employee.setVacationDays(resultSet.getInt("vacation_days"));
                employee.setCurrentUnusedVacationDays(resultSet.getInt("current_unused_vacation_days"));

                allEmployees.add(employee);
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return allEmployees;
    }

    public EmployeePrivateInfo loadEmployeePIById (int id){

        EmployeePrivateInfo employee = new EmployeePrivateInfo();

        try (Connection connection = DatabaseConnector.getConnection()){

            PreparedStatement stat = connection.prepareStatement("SELECT * FROM employees_private_info WHERE `id` = ?");
            stat.setInt(1, id);
            ResultSet resultSet = stat.executeQuery();

            if (resultSet.next()){
                employee.setIdEPI(resultSet.getInt("id"));
                employee.setIdEmployee(resultSet.getInt("employee_id"));
                employee.setSalary(resultSet.getBigDecimal("salary"));
                employee.setAge(resultSet.getInt("age"));
                employee.setBankAccountNumber(resultSet.getString("bank_account_number"));
                employee.setRatingWork(resultSet.getInt("rating_work"));
                employee.setMainResponsibility(resultSet.getString("main_responsibility"));
                employee.setVacationDays(resultSet.getInt("vacation_days"));
                employee.setCurrentUnusedVacationDays(resultSet.getInt("current_unused_vacation_days"));
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return employee;
    }

    public void insertNewEmployeePI(EmployeePrivateInfo employee) {

        try (Connection connection = DatabaseConnector.getConnection()) {

            String sqlQuery = "INSERT INTO employees_private_info (`employee_id`,`salary`,`age`,`bank_account_number`," +
                    "`rating_work`,`main_responsibility`,`vacation_days`,`current_unused_vacation_days`)VALUES " +
                    "(?,?,?,?,?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);

            if (employee.getIdEmployee() != 0){
                stat.setInt(1, employee.getIdEmployee());
            } else {
                stat.setNull(1, Types.INTEGER);
            }
            stat.setBigDecimal(2, employee.getSalary());
            stat.setInt(3, employee.getAge());
            stat.setString(4, employee.getBankAccountNumber());
            stat.setInt(5, employee.getRatingWork());
            stat.setString(6, employee.getMainResponsibility());
            stat.setInt(7, employee.getVacationDays());
            stat.setInt(8, employee.getCurrentUnusedVacationDays());
            int affectedRows = stat.executeUpdate();

            if (affectedRows == 0){
                throw new SQLException("Utworzenie pracownika nie powiodło się, brak pływu na wiersze");
            }
            try (ResultSet generatedKeys = stat.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    employee.setIdEPI(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Nie powiodło się otrzymania id");
                }
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public void deleteEmployeePIById (int id){

        try (Connection connection = DatabaseConnector.getConnection()){

            PreparedStatement stat = connection.prepareStatement("DELETE FROM employees_private_info WHERE id=?");
            stat.setInt(1, id);
            stat.executeUpdate();

        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
    }

    public void updateEmployeePI (EmployeePrivateInfo employee) {

        try (Connection connection = DatabaseConnector.getConnection()){
            String sqlQuery = "UPDATE employees_private_info SET employee_id=?, salary=?, age=?, bank_account_number=?," +
                    " rating_work=?, main_responsibility=?, vacation_days=?, current_unused_vacation_days=?, WHERE id=?";

            PreparedStatement stat = connection.prepareStatement(sqlQuery);
            stat.setInt(1, employee.getIdEmployee());
            stat.setBigDecimal(2, employee.getSalary());
            stat.setInt(3, employee.getAge());
            stat.setString(4, employee.getBankAccountNumber());
            stat.setInt(5, employee.getRatingWork());
            stat.setString(6, employee.getMainResponsibility());
            stat.setInt(7, employee.getVacationDays());
            stat.setInt(8, employee.getCurrentUnusedVacationDays());
            stat.setInt(10, employee.getIdEPI());
            stat.executeUpdate();

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public List<EmployeePrivateInfo> getAllEmployeesPIWithAttribute(String category, String attribute) {
        List<EmployeePrivateInfo> allEmplyeesWithAttribute = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            String sqlQuery = "SELECT * FROM employees_private_info WHERE " + category + "=?";

            PreparedStatement stat = connection.prepareStatement(sqlQuery);
            stat.setString(1, attribute);

            ResultSet resultSet = stat.executeQuery();

            while (resultSet.next()) {
                EmployeePrivateInfo employee = new EmployeePrivateInfo();

                employee.setIdEPI(resultSet.getInt("id"));
                employee.setIdEmployee(resultSet.getInt("employee_id"));
                allEmplyeesWithAttribute.add(employee);
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

        return allEmplyeesWithAttribute;
    }
}
