package vn.com.ntq.ntqsocialnetwork.common;

import java.util.ArrayList;

import java.util.List;

import vn.com.ntq.ntqsocialnetwork.entities.User;

public class Validator {
	public static final int MAX_PASSWORD = 30;
	public static final int MIN_PASSWORD = 8;
	public static final String SHOW_ERROR_VALIDATE_USERNAME = "Name size  must be between 6 and 30 character";
	public static final String SHOW_ERROR_VALIDATE_PASSWORD = "Password size  must be between 8 and 30 character";
	public static final String SHOW_ERROR_VALIDATE_EMAIL = "Email is not in the correct format";
	public static final String KEY_ERROR_VALIDATE_EMAIL = "error_email";
	public static final String KEY_ERROR_VALIDATE_PASSWORD = "error_password";
	public static final String KEY_ERROR_VALIDATE_USERNAME = "error_username";
	
	public static final int MIN_USERNAME = 6;
	public static final int MAX_USERNAME = 30;
	/*
	 * Author : Eze.O.O
	 * validUser
	 * Input : User entity
	 * Return Type : boolean 
	 * Note: Return true if user is valid false otherwise
	 */
	
	public static List<String> validUser(User user){
		List<String> listerror = new ArrayList<>();
		
		if (!validLength(MIN_USERNAME, MAX_USERNAME, user.getUserName())){
			listerror.add(KEY_ERROR_VALIDATE_USERNAME);
			System.err.println("Invalid Username");
		}
		if (!validLength(MIN_USERNAME, MAX_PASSWORD, user.getPassword())){
			listerror.add(KEY_ERROR_VALIDATE_PASSWORD);
			System.err.println("Invalid Password");
		}
		if (!isValidEmail(user.getEmail())){
			listerror.add(KEY_ERROR_VALIDATE_EMAIL);
			System.err.println("Invalid Email");
		}
		
//		else if (user.getStatus() < 0  || user.getStatus() > 3 ){
//			isvalid = false;
//			System.err.println("Invalid Status");
//		}
		return listerror ;
	}
	
	/*
	 * Author : Eze.O.O
	 * isValidEmail
	 * Input : String 
	 * Return Type : boolean 
	 * Note : return true if email is valid and false otherwise
	 */
	private static boolean isValidEmail(String emailAddress){
		
		if (!emailAddress.contains("@") || !emailAddress.contains(".")){
			return false;
		}
		
		int atSignCounter = 0 ;
		for (char c : emailAddress.toCharArray()) {
			if (c == '@'){
				atSignCounter++;
			}
		}
		
		return (atSignCounter == 1);
	}
	
	/*
	 * Author : Eze.O.O
	 * isValidEmail
	 * Input : int, int, String 
	 * Return Type : boolean 
	 * Note : return true if input is within the parametered length and false otherwise
	 */
	private static boolean validLength(int fromLength, int toLength, String input){
		return (input.length() >= fromLength && input.length() <= toLength);
	}
}
