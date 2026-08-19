package csd_pack;

import java.util.ResourceBundle;

public class app {
public int userLogin(String in_user,String in_pwd)
{
	ResourceBundle rb=ResourceBundle.getBundle("configu");
	String username=rb.getString("username");
	String password=rb.getString("password");
	if(in_user.equals(username)&& in_pwd.equals(password))
return 1;
else return 0;
}
}
