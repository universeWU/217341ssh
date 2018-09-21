package cap.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import cap.bean.User;
import com.opensympony.xwork2.ActionSupport;

public class ControlAction {
    private Map<String,String>strMap=new HashMap<String, String>();
    private Map<String,User>UserMap=new HashMap<String, User>();
    private List<User>userList=new ArrayList<User>();
    private Map<String,String>getStrMap(){
        return strMap;
    }

    public void setStrMap(Map<String, String> strMap) {
        this.strMap = strMap;
    }

    public Map<String, User> getUserMap() {
        return UserMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        UserMap = userMap;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public String control()
    {
        //值为字符串
        strMap.put("1","cdavtc1");
        strMap.put("2","cdavtc2");
        strMap.put("3","cdavtc3");
        //值为bean对象
        User u1=new User("1","universe1","universe1");
        UserMap.put("one",u1);
        User u2=new User("2","universe2","universe2");
        UserMap.put("two",u2);
        userList.add(u1);
        userList.add(u2);
        return SUCCESS;

    }
}
