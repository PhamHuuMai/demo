package vn.com.ntq.ntqsocialnetwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import vn.com.ntq.ntqsocialnetwork.DAO.UserDAO;


@Configuration
public class UserService {

	@Autowired
	private UserDAO userDAO;
    

}
