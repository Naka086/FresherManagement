package Entity;

public class Center {
    private int centerID;
    private String centerName;
    private String centerAddress;
    private String centerPhone;
    private String centerEmail;
    public Center(int centerID, String centerName, String centerAddress, String centerPhone, String centerEmail) {
        this.centerID = centerID;
        this.centerName = centerName;
        this.centerAddress = centerAddress;
        this.centerPhone = centerPhone;
        this.centerEmail = centerEmail;
    }
    public int getCenterID() {
        return centerID;
    }
    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }
    public String getCenterName() {
        return centerName;
    }
    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }
    public String getCenterAddress() {
        return centerAddress;
    }
    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }
    public String getCenterPhone() {
        return centerPhone;
    }
    public void setCenterPhone(String centerPhone) {
        this.centerPhone = centerPhone;
    }
    public String getCenterEmail() {
        return centerEmail;
    }
    public void setCenterEmail(String centerEmail) {
        this.centerEmail = centerEmail;
    }
}
