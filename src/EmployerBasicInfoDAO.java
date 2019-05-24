import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployerBasicInfoDAO extends EmployerBasicInfo{

    public List<EmployerBasicInfo> loadAllEmployers() {
        List<EmployerBasicInfo> allEmployers = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employer_basic_info;");

            while (resultSet.next()){
                EmployerBasicInfo employer = new EmployerBasicInfo();

                employer.setId(resultSet.getInt("id"));
                employer.setLastName(resultSet.getString("last_name"));
                employer.setFirstName(resultSet.getString("first_name"));
                employer.setDateOfEmployment(resultSet.getDate("date_employment"));
                employer.setSex(resultSet.getString("sex").charAt(0));
                employer.setNumberDepartment(resultSet.getInt("number_department"));
                employer.setNameDepartment(resultSet.getString("name_department"));
                employer.setPosition(resultSet.getString("position"));
                employer.setNumberPhone(resultSet.getInt("number_phone"));
                employer.setEmail(resultSet.getString("email"));
                employer.setSupervisor(resultSet.getString("supervisor"));
                employer.setHobby(resultSet.getString("hobby"));

                allEmployers.add(employer);
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return allEmployers;
    }

    public List <EmployerBasicInfo> loadAllEmploymesntsShortData (){
        List<EmployerBasicInfo> allEmplyersWithCategory = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()){
            String query = "SELECT `id`,`last_name`,`first_name` FROM employer_basic_info;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                EmployerBasicInfo employer = new EmployerBasicInfo();

                employer.setId(resultSet.getInt("id"));
                employer.setLastName(resultSet.getString("last_name"));
                employer.setFirstName(resultSet.getString("first_name"));

                allEmplyersWithCategory.add(employer);
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return allEmplyersWithCategory;
    }

    public EmployerBasicInfo loadEmployerById (int id){

        EmployerBasicInfo employer = new EmployerBasicInfo();

        try (Connection connection = DatabaseConnector.getConnection()){

            PreparedStatement stat = connection.prepareStatement("SELECT * FROM employer_basic_info WHERE `id` = ?");
            stat.setInt(1, id);
            ResultSet resultSet = stat.executeQuery();

            if (resultSet.next()){

                employer.setId(resultSet.getInt("id"));
                employer.setLastName(resultSet.getString("last_name"));
                employer.setFirstName(resultSet.getString("first_name"));
                employer.setDateOfEmployment(resultSet.getDate("date_employment"));
                employer.setSex(resultSet.getString("sex").charAt(0));
                employer.setNumberDepartment(resultSet.getInt("number_department"));
                employer.setNameDepartment(resultSet.getString("name_department"));
                employer.setPosition(resultSet.getString("position"));
                employer.setNumberPhone(resultSet.getInt("number_phone"));
                employer.setEmail(resultSet.getString("email"));
                employer.setSupervisor(resultSet.getString("supervisor"));
                employer.setHobby(resultSet.getString("hobby"));
            }
        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
        return employer;
    }

    public void insertNewEmployer(EmployerBasicInfo employer) {

        try (Connection connection = DatabaseConnector.getConnection()) {

            String sqlQuery = "INSERT INTO employer_basic_info (`last_name`,`first_name`,`date_employment`,`sex`," +
                    "`number_department`,`name_department`,`position`,`number_phone`,`email`,`supervisor`,`hobby`)VALUES " +
                    "(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sqlQuery);


            stat.setString(1, employer.getLastName());
            stat.setString(2, employer.getFirstName());
            stat.setDate(3, employer.getDateOfEmployment());
            stat.setString(4, String.valueOf(employer.getSex()));
            stat.setInt(5, employer.getNumberDepartment());
            stat.setString(6, employer.getNameDepartment());
            stat.setString(7, employer.getPosition());
            stat.setInt(8, employer.getNumberPhone());
            stat.setString(9, employer.getEmail());
            stat.setString(10, employer.getSupervisor());
            stat.setString(11, employer.getHobby());

            stat.executeUpdate();

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public void deleteEmployerById (int id){

        try (Connection connection = DatabaseConnector.getConnection()){

            PreparedStatement stat = connection.prepareStatement("DELETE FROM employer_basic_info WHERE id=?");
            stat.setInt(1, id);
            stat.executeUpdate();

        } catch (SQLException error){
            System.out.println(error.getMessage());
        }
    }
}
