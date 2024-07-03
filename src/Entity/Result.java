package Entity;

public class Result {
    private int id;
    private float avg;
    private String description;
    public Result(int id, float avg, String description) {
        this.id = id;
        this.avg = avg;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getAvg() {
        return avg;
    }
    public void setAvg(float avg) {
        this.avg = avg;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
