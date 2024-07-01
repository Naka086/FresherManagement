package Login;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap();

    IDandPasswords() {
        this.logininfo.put("Fresher", "passwords");
        this.logininfo.put("Fresher1", "password1");
        this.logininfo.put("Fresher2", "password2");
    }

    protected HashMap getLoginInfo() {
        return this.logininfo;
    }
}

