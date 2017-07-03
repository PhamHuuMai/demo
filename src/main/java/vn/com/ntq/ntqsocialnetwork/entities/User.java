package vn.com.ntq.ntqsocialnetwork.entities;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;



/*
 * Let using this for MongoDB
 * please insert MongoDB name is : ntqsocial // that's all.
 * 
 * */
@Document
public class User extends AbstractEntity{
    
	@Id
	private long id; // Not use This in any case !
	
	@NotNull
	@Size(min=6, max=30)
    private String userName;
	
	@Size(min=8, max = 30)
	@NotNull
    private String password;
	@Email
    private String email;
	@DateTimeFormat
    private Date birthDay; // new Date("yyyy/mm/dd")  
    @Min(0)
	@Max(1)
    private int sex; // 0 and 1 : 0 - Male - 1 - Female;
    private long timeRegester; // time register easy sort
    private long lastAction;//default 0;
    private int status; // default 0; 0 : off - 1 : on - 2 : Busy - 3 : absent ;
    private long updateDate;
    private String image;
    @DBRef(lazy=true)
    private List<Friend> friends;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*  this constructor can use for insert*/
	public User(long id,String userName,  String email , String password , Date birthDay, int sex,
			long timeRegester, long lastAction, int status,long updateDate,String image,List<Friend> friends) {
		super();
		this.id = id;
		this.updateDate = updateDate;
		this.image = image;
		this.friends = friends;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.birthDay = birthDay;
		this.sex = sex;
		this.timeRegester = timeRegester;
		this.lastAction = lastAction;
		this.status = status;
	}
	
	public User(String userName, String email, String password, Date birthDay, int sex, long timeRegester,
			long lastAction, int status) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.birthDay = birthDay;
		this.sex = sex;
		this.timeRegester = timeRegester;
		this.lastAction = lastAction;
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getbirthDay() {
		return birthDay;
	}
	public void setbirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public long getTimeRegester() {
		return timeRegester;
	}
	public void setTimeRegester(long timeRegester) {
		this.timeRegester = timeRegester;
	}
	public long getLastAction() {
		return lastAction;
	}
	public void setLastAction(long lastAction) {
		this.lastAction = lastAction;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public long getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(long updateDate) {
		this.updateDate = updateDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", idAccount=" + "" + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", birthDay=" + birthDay + ", sex=" + sex + ", timeRegester=" + timeRegester
				+ ", lastAction=" + lastAction + ", status=" + status + "]";
	}
}
