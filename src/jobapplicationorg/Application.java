/*
 * To change this license header, choose License Headers in Project Properties.
 */

package jobapplicationorg;

import java.text.DateFormat;
import java.util.LinkedList;

/**
 *
 * @author Josh Williams
 */
public class Application {
    
    private String company;
    private String position;
    private DateFormat dateApplied;
    private LinkedList<DateFormat> followUpDates;
    private String notes;
/*
    Basic constructor that ignores follow up dates, since creation doesn't allow for follow up
    */
    
    public Application(String comp, String pos, DateFormat dateApp, String no)
    {
        company = comp;
        position = pos;
        dateApplied = dateApp;
        followUpDates = new LinkedList<DateFormat>();
        notes = no;
    }
    
    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the dateApplied
     */
    public DateFormat getDateApplied() {
        return dateApplied;
    }

    /**
     * @param dateApplied the dateApplied to set
     */
    public void setDateApplied(DateFormat dateApplied) {
        this.dateApplied = dateApplied;
    }

    /**
     * @return the followUpDates
     */
    public LinkedList<DateFormat> getFollowUpDates() {
        return followUpDates;
    }

    /**
     * @param followUpDates the followUpDates to set
     */
    public void setFollowUpDates(LinkedList<DateFormat> followUpDates) {
        this.followUpDates = followUpDates;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
}
