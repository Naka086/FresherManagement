package Entity;

import java.util.Date;

public class Course {
    private int courseID;
    private String courseName;
    private String courseDescription;
    private Date courseStartDate;
    private Date courseEndDate;
    public Course(int courseID, String courseName, String courseDescription, Date courseStartDate, Date courseEndDate) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public Date getCourseStartDate() {
        return courseStartDate;
    }
    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }
    public Date getCourseEndDate() {
        return courseEndDate;
    }
    public void setCourseEndDate(Date courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

}
