package entity;

public class User {
private String username;
private String password;
public User(){
	System.out.println("一个新的user产生");
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
