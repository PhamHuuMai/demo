package vn.com.ntq.ntqsocialnetwork.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDAO {
    @Bean     
	public UserDAO getUserDAO(){
    	return new UserDAO();
    }   
	    
}
