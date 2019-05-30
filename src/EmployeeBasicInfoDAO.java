import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeBasicInfoDAO extends EmployeeBasicInfo {

    public List<EmployeeBasicInfo> loadAllEmployees() {
        List<EmployeeBasicInfo> allEmployees = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_basic_info;");

            while (resultSet.next()){
                EmployeeBasicInfo employee = new EmployeeBasicInfo();

                employee.setId(resultSet.getInt("id"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setDateOfEmployment(resultSet.getDate("date_employment"));
                employee.setSex(resultSet.getString("sex").charAt(0));
                employee.setNumberDepartment(resultSet.getInt("number_department"));
                employee.setNameDepartment(resultSet.getString("name_department"));
                employee.setPosition(resultSet.getString("position"));
                employee.setNumberPhone(resultSet.getInt("number_phone"));
                employee.setEmail(resultSet.getString("email"));
                employee.setSupervisor(resultSet.getString("supervisor"));
                employee.setHobby(resultSet.getString("hobby"));

                allEmployees.add(employee);
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return allEmployees;
    }

    public List <EmployeeBasicInfo> loadAllEmployeesShortData (){
        List<EmployeeBasicInfo> allEmplyeesWithCategory = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()){
            String query = "SELECT `id`,`last_name`,`first_name` FROM employees_basic_info;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                EmployeeBasicInfo employee = new EmployeeBasicInfo();

                employee.setId(resultSet.getInt("id"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setFirstName(resultSet.getString("first_name"));

                allEmplyeesWithCategory.add(employee);
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return allEmplyeesWithCategory;
    }

    public EmployeeBasicInfo loadEmployeeById (int id){

        EmployeeBasicInfo employee = new EmployeeBasicInfo();

        try (Connection connection = DatabaseConnector.getConnection()){

            PreparedStatement stat = connection.prepareStatement("SELECT * FROM employees_basic_info WHERE `id` = ?");
            stat.setInt(1, id);
            ResultSet resultSet = stat.executeQuery();

            if (resultSet.next()){
                employee.setId(resultSet.getInt("id"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setDateOfEmployment(resultSet.getDate("date_employment"));
                employee.setSex(resultSet.getString("sex").charAt(0));
                employee.setNumberDepartment(resultSet.getInt("number_department"));
                employee.setNameDepartment(resultSet.getString("name_department"));
                employee.setPosition(resultSet.getString("position"));
                employee.setNumberPhone(resultSet.getInt("number_phone"));
                employee.setEmail(resultSet.getString("email"));
                employee.setSupervisor(resultSet.getString("supervisor"));
                employee.setHobby(resultSet.getString("hobby"));
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return employee;
    }

    public void insertNewEmployee(EmployeeBasicInfo employee) {

        try (Connection connection = DatabaseConnector.getConnection()) {

            String sqlQuery = "INSERT INTO employees_basic_info (`last_name`,`first_name`,`date_employment`,`sex`," +
                    "`number_department`,`name_department`,`position`,`number_phone`,`email`,`supervisor`,`hobby`)VALUES " +
                    "(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);


            stat.setString(1, employee.getLastName());
            stat.setString(2, employee.getFirstName());
            stat.setDate(3, employee.getDateOfEmployment());
            stat.setString(4, String.valueOf(employee.getSex()));
            stat.setInt(5, employee.getNumberDepartment());
            stat.setString(6, employee.getNameDepartment());
            stat.setString(7, employee.getPosition());
            stat.setInt(8, employee.getNumberPhone());
            stat.setString(9, employee.getEmail());
            stat.setString(10, employee.getSupervisor());
            stat.setString(11, employee.getHobby());
            int affectedRows = stat.executeUpdate();

            if (affectedRows == 0){
                throw new SQLException("Utworzenie pracownika nie powiodło się, brak pływu na wiersze");
            }
            try (ResultSet generatedKeys = stat.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    employee.setId(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Nie powiodło się otrzymania id");
                }
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public void deleteEmployeeById (int id){

        try (Connection connection = DatabaseConnector.getConnection()){

            PreparedStatement stat = connection.prepareStatement("DELETE FROM employees_basic_info WHERE id=?");
            stat.setInt(1, id);
            stat.executeUpdate();

        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
    }

    public void updateEmployee (EmployeeBasicInfo employee) {

        try (Connection connection = DatabaseConnector.getConnection()){
            String sqlQuery = "UPDATE employees_basic_info SET date_employment=?, sex=?, number_department=?, name_department=?," +
                    " position=?, number_phone=?, email=?, supervisor=?, hobby=? WHERE id=?";

            PreparedStatement stat = connection.prepareStatement(sqlQuery);
            stat.setDate(1, employee.getDateOfEmployment());
            stat.setString(2, String.valueOf(employee.getSex()));
            stat.setInt(3, employee.getNumberDepartment());
            stat.setString(4, employee.getNameDepartment());
            stat.setString(5, employee.getPosition());
            stat.setInt(6, employee.getNumberPhone());
            stat.setString(7, employee.getEmail());
            stat.setString(8, employee.getSupervisor());
            stat.setString(9, employee.getHobby());
            stat.setInt(10, employee.getId());
            stat.executeUpdate();

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public List<EmployeeBasicInfo> getAllEmployeesWithAttribute(String category, String attribute) {
        List<EmployeeBasicInfo> allEmplyeesWithAttribute = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            String sqlQuery = "SELECT * FROM employees_basic_info WHERE " + category + "=?";

            PreparedStatement stat = connection.prepareStatement(sqlQuery);
            stat.setString(1, attribute);

            ResultSet resultSet = stat.executeQuery();

            while (resultSet.next()) {
                EmployeeBasicInfo employee = new EmployeeBasicInfo();

                employee.setId(resultSet.getInt("id"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setFirstName(resultSet.getString("first_name"));

                allEmplyeesWithAttribute.add(employee);
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

        return allEmplyeesWithAttribute;
    }
}
