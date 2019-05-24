import java.sql.Date;



public class EmployerBasicInfoEditor extends EmployerBasicInfoDAO{

  //  private EmployerBasicInfo employerBasic = new EmployerBasicInfoDAO();

    public EmployerBasicInfo createNewEmployer (String answer) {

        EmployerBasicInfo employer = new EmployerBasicInfo();
        String dateEmployer [] = answer.split(", ");

        employer.setLastName(dateEmployer[0]);
        employer.setFirstName(dateEmployer[1]);
        employer.setDateOfEmployment(Date.valueOf((dateEmployer[2])));
        employer.setSex(dateEmployer[3].charAt(0));
        employer.setNumberDepartment(Integer.valueOf(dateEmployer[4]));
        employer.setNameDepartment(dateEmployer[5]);
        employer.setPosition(dateEmployer[6]);
        employer.setNumberPhone(Integer.valueOf(dateEmployer[7]));
        employer.setEmail(dateEmployer[8]);
        employer.setSupervisor(dateEmployer[9]);
        employer.setHobby(dateEmployer[10]);
        return employer;
    }
}

//    DateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
//    Date date = formatDate.parse("2015/08/03");
//        System.out.println(formatDate.format(date));
