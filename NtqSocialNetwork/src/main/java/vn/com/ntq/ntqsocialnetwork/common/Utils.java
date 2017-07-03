package vn.com.ntq.ntqsocialnetwork.common;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import vn.com.ntq.ntqsocialnetwork.entities.Friend;
import vn.com.ntq.ntqsocialnetwork.entities.User;

public class Utils {

	public static String dateToStringJp(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy年 MM月", Locale.JAPAN);
		return format.format(date);
	}

	public static String generatePagingHtml(int curentPage, int totalPage, String query) {
		String temp = "<ul id=\"pagination-flickr\" class='uk-clearfix'> ";
		if (curentPage == 1)
			temp = temp
					+ "<li><a href='javascript:void(0)' style='text-decoration:none; color:black'>�Previous</a></li>";
		else
			temp = temp + "<li><a href=\"?page=" + (curentPage - 1) + query + "\">�Previous</a></li>";

		for (int i = ((curentPage - 2) <= 0) ? 1 : (curentPage - 2); i <= (((curentPage + 2) >= totalPage) ? totalPage
				: (curentPage + 2)); i++) {
			if (i == curentPage)
				temp = temp + "<li href='javascript:void(0)' style='color:black'><a href='javascript:void(0)'>" + i
						+ "</a></li>";
			else
				temp = temp + "<li><a href=\"?page=" + i + query + "\">" + i + "</a></li>";
		}
		if (curentPage == totalPage)
			temp = temp
					+ "<li><a href='javascript:void(0)' style='text-decoration:none; color:black'>Next >> </a></li>";
		else
			temp = temp + "<li><a href=\"?page=" + (curentPage + 1) + query + "\">Next �</a></li>";
		temp = temp + "</ul>";
		return temp;
	}

	public static List<User> pagedList(List<User> users, int pageNumber, int pageSize) {
		pageNumber--;

		int fromIndex = (pageNumber * pageSize);
		int toIndex = fromIndex + pageSize;
		if (toIndex > users.size())
			toIndex = users.size();

		List<User> subsetElement = users.subList(fromIndex, toIndex);
		return subsetElement;
	}

	public static List<User> sortByStatus(List<User> input) {
		input.sort(new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {
				// TODO Auto-generated method stub
				if (u1.getStatus() == u2.getStatus() && u1.getLastAction() == u2.getLastAction()) {
					return 0;
				}
				if (u1.getStatus() == u2.getStatus()) {
					if (u1.getStatus() == 0) {
						if (u1.getLastAction() < u2.getLastAction())
							return 1;
						return -1;
					}
					if (u1.getStatus() == 1) {
						if (u1.getLastAction() < u2.getLastAction())
							return -1;
						return 1;
					}
				}
				if (u1.getStatus() < u2.getStatus()) {
					return 1;
				}
				return -1;
			}
		});
		return input;
	}

	public static boolean isDecimal(double input) {

		return (input % 1) != 0;
	}

    public static List<Friend> sortFriendByAcceptTime(List<Friend> input,int isAscend){
    	input.sort(new Comparator<Friend>() {
			@Override
			public int compare(Friend f1,Friend f2) {
				// TODO Auto-generated method stub
				int result=0;	
				if(f1.getAcceptTime()>f2.getAcceptTime())
					result = 1;
				if(f1.getAcceptTime()<f2.getAcceptTime())
					result = -1;
				return result;
			}
		});    
    	return input;
    }

}
