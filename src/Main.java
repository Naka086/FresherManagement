package Login;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        new LoginPage(idandPasswords.getLoginInfo());
    }
}