package models;

import java.util.Date;
import java.util.List;

/**
 * Project Object Model.
 */
public class Project {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public List<Resource> getScreenShots() {
        return ScreenShots;
    }

    public void setScreenShots(List<Resource> ScreenShots) {
        this.ScreenShots = ScreenShots;
    }

    public List<Resource> getDocuments() {
        return Documents;
    }

    public void setDocuments(List<Resource> Documents) {
        this.Documents = Documents;
    }

    public List<Person> getTeamMembers() {
        return TeamMembers;
    }

    public void setTeamMembers(List<Person> TeamMembers) {
        this.TeamMembers = TeamMembers;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    Integer Id;
    String Title;
    String Content;
    List<Resource> ScreenShots;    
    List<Resource> Documents;
    List<Person> TeamMembers;
    Date StartDate;
    Date EndDate;
}
