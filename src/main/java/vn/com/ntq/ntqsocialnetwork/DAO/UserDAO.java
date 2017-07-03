package vn.com.ntq.ntqsocialnetwork.DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import vn.com.ntq.ntqsocialnetwork.constant.EntityConstant;
import vn.com.ntq.ntqsocialnetwork.entities.User;
import vn.com.ntq.ntqsocialnetwork.service.UserService;

import com.mongodb.MongoClient;


public class UserDAO extends AbstractDAO<User> {

	@Autowired
	protected MongoOperations mongo;

	private static final String COLLECTION_NAME = "colluser";

	@Override
	public List<User> listAll() {
		return mongo.findAll(User.class, COLLECTION_NAME);
	}

	@Override
	public void insert(User e) {
		e.setId(listAll().size()+1000000000);
		mongo.insert(e, COLLECTION_NAME);
	}

	@Override
	public User getById(long id) {
		return mongo.findById(id, User.class);
	}

	@Override
	public boolean update(User newUser, String key, Object value) {
		Query query = new Query();
		query.addCriteria(Criteria.where(EntityConstant.ACCOUNT_EMAIL).is(newUser.getEmail()));
		Update update = new Update();
		update.set(key, value);
		mongo.updateFirst(query, update, COLLECTION_NAME);
		return true;
	}

	@Override
	public boolean delete(long id) {
		User user = getById(id);
		mongo.remove(user);
		return false;
	}

	@Override
	public List<User> getByEntity(User e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Query query) {
		return mongo.find(query, User.class,COLLECTION_NAME );
	}	
	
	@Override
	public boolean update(String id, User entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User entity) {
		return false;
	}
}