import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployerOfficeInfo {

    private final int ID_EMPLOYER;
    private int numberOvertimeWork;
    private String currentProject;
    SimpleDateFormat formatDate = new SimpleDateFormat("E yyyy.MM.dd");
    private final Date DATA_START_IN_PROJECT;
    //exp. 190 + 113 = `2013, Calendar.MAY, 13`
    private String resposibilityInProject;
    private String projectSupervisor;
    private String levelInProjectJob;

    public EmployerOfficeInfo(int ID_EMPLOYER, Date DATA_START_IN_PROJECT) {
        this.ID_EMPLOYER = ID_EMPLOYER;
        this.DATA_START_IN_PROJECT = DATA_START_IN_PROJECT;
    }

    public int getID_EMPLOYER() {
        return ID_EMPLOYER;
    }

    public int getNumberOvertimeWork() {
        return numberOvertimeWork;
    }

    public void setNumberOvertimeWork(int numberOvertimeWork) {
        this.numberOvertimeWork = numberOvertimeWork;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public Date getDATA_START_IN_PROJECT() {
        return DATA_START_IN_PROJECT;
    }

    public String getResposibilityInProject() {
        return resposibilityInProject;
    }

    public void setResposibilityInProject(String resposibilityInProject) {
        this.resposibilityInProject = resposibilityInProject;
    }

    public String getProjectSupervisor() {
        return projectSupervisor;
    }

    public void setProjectSupervisor(String projectSupervisor) {
        this.projectSupervisor = projectSupervisor;
    }

    public String getLevelInProjectJob() {
        return levelInProjectJob;
    }

    public void setLevelInProjectJob(String levelInProjectJob) {
        this.levelInProjectJob = levelInProjectJob;
    }
}
