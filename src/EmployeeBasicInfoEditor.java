
import java.sql.Date;

public class EmployeeBasicInfoEditor {

    private int tmpIdEmployee;
    private int numberCategory;

    public EmployeeBasicInfo createNewEmployee (String answer) {

        EmployeeBasicInfo employee = new EmployeeBasicInfo();
        String dateEmployee [] = answer.split(", ");

        employee.setLastName(dateEmployee[0]);
        employee.setFirstName(dateEmployee[1]);
        employee.setDateOfEmployment(Date.valueOf((dateEmployee[2])));
        employee.setSex(dateEmployee[3].charAt(0));
        employee.setNumberDepartment(Integer.valueOf(dateEmployee[4]));
        employee.setNameDepartment(dateEmployee[5]);
        employee.setPosition(dateEmployee[6]);
        employee.setNumberPhone(Integer.valueOf(dateEmployee[7]));
        employee.setEmail(dateEmployee[8]);
        employee.setSupervisor(dateEmployee[9]);
        employee.setHobby(dateEmployee[10]);
        return employee;
    }

    public void setTmpIdEmployee(int selectId) {
        this.tmpIdEmployee = selectId;
    }

    public void setNumberOfCategoryToUpdate(int numberCategory) {
        this.numberCategory = numberCategory;
    }

    public void prepareUpdateEmployee(String newData) {
        EmployeeBasicInfoDAO employeeDAO = new EmployeeBasicInfoDAO();

        EmployeeBasicInfo employee = employeeDAO.loadEmployeeById(tmpIdEmployee);

        switch (numberCategory) {
            case 1: {
                employee.setDateOfEmployment(Date.valueOf(newData));
                break;
            }
            case 2: {
                employee.setSex(newData.charAt(0));
                break;
            }
            case 3: {
                employee.setNumberDepartment(Integer.valueOf(newData));
                break;
            }
            case 4: {
                employee.setNameDepartment(newData);
                break;
            }
            case 5: {
                employee.setPosition(newData);
                break;
            }
            case 6: {
                employee.setNumberPhone(Integer.valueOf(newData));
                break;
            }
            case 7: {
                employee.setEmail(newData);
                break;
            }
            case 8: {
                employee.setSupervisor(newData);
                break;
            }
            case 9: {
                employee.setHobby(newData);
                break;
            }
        }
        employeeDAO.updateEmployee(employee);
    }
}

//    DateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
//    Date date = formatDate.parse("2015/08/03");
//        System.out.println(formatDate.format(date));
