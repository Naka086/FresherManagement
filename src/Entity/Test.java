package Entity;

import java.util.Date;

public class Test {
    private int id;
    private float score;
    private Date startDate;
    public Test(int id, float score, Date startDate) {
        this.id = id;
        this.score = score;
        this.startDate = startDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
