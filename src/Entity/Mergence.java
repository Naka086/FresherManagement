package Entity;

import java.util.Date;

public class Mergence {
    private int id;
    private Date mergeDate;
    private String newCenterName;
    public Mergence(int id, Date mergeDate, String newCenterName) {
        this.id = id;
        this.mergeDate = mergeDate;
        this.newCenterName = newCenterName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getMergeDate() {
        return mergeDate;
    }
}
