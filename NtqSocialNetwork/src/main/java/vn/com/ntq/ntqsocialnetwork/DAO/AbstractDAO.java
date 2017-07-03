package vn.com.ntq.ntqsocialnetwork.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import vn.com.ntq.ntqsocialnetwork.entities.AbstractEntity;
import vn.com.ntq.ntqsocialnetwork.entities.User;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;

public abstract class AbstractDAO<E extends AbstractEntity> {

	public abstract List<E> listAll();
	public abstract List<E> getByEntity(E e);
	public abstract void insert(E e);
	public abstract List<E> findAll(Query query);
	public abstract E getById(long id);
	
	public abstract boolean update(E entity);

	public abstract boolean update(String id,E entity);
//	public abstract boolean update(int id,E entity, String updateField);
	public abstract boolean update(E entity , String key , Object value) ;
	public abstract boolean delete(long id);
	
}
