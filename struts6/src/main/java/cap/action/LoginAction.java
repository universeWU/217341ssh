package cap.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction {
    public String login() {
        System.out.println("页面调用后面的action方法");
        return SUCCESS;
    }

}
