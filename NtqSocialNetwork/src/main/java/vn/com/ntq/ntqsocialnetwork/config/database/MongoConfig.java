package vn.com.ntq.ntqsocialnetwork.config.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
//@ComponentScan("vn.com.ntqsocialnetwork")
public class MongoConfig{
    private static final String NAME_DATABASE="MockDB";
//	
    @Bean
	public Mongo mongo() {
		return new MongoClient("localhost",27017);
	}

//	@Bean
//	public MongoDbFactory mongoDbFacctory(){
//		return new  SimpleMongoDbFactory(new MongoClient("localhost", 27017), NAME_DATABASE);
//	}

	@Bean
	public MongoTemplate mongoTemplate(){
		return new MongoTemplate(mongo(),NAME_DATABASE);
	}
}