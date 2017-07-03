package vn.com.ntq.ntqsocialnetwork.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import vn.com.ntq.ntqsocialnetwork.DAO.UserDAO;
import vn.com.ntq.ntqsocialnetwork.common.*;
import vn.com.ntq.ntqsocialnetwork.constant.EntityConstant;
import vn.com.ntq.ntqsocialnetwork.entities.Friend;
import vn.com.ntq.ntqsocialnetwork.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.ntq.ntqsocialnetwork.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String logout(ModelMap model, HttpSession session) {
		User u=new User();
		u.setEmail("abc@gmail.com");
	    List<Friend> fs=new ArrayList<Friend>();
	    Friend f=new Friend();
	    f.setAcceptTime(5);
	    f.setFriendStatus(2);
	    User u1=new User();
	    u1.setId(1000000003);
	    f.setUser(u1);
	    fs.add(f);    
	    u.setFriends(fs);
		userDAO.insert(u);
		return "OK";
	}

}
