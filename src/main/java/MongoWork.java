
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import java.rmi.UnknownHostException;
import java.util.Properties;

public class MongoWork {
	private MongoClient mongoClient;
	private MongoDatabase db;
	private boolean authenticate;
	private DBCollection table;

	public MongoWork(Properties properties) {
		try {
			mongoClient = new MongoClient("localhost", 27017);

			db = mongoClient.getDatabase("mynewuser");

//			boolean auth = db.authenticate("testdb", "password".toCharArray());
//	if (auth) {
//
//		DBCollection table = db.getCollection("user");
//
//		BasicDBObject document = new BasicDBObject();
//		document.put("name", "mkyong");
//		table.insert(document);
//
//		System.out.println("Login is successful!");
//	} else {
//		System.out.println("Login is failed!");
//	}
//	System.out.println("Done");
//
    } catch (MongoException e) {
	e.printStackTrace();
    }
	}
}
