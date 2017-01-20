package utility;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbConn {
	public static MongoCollection<Document> getMongoCollection(String databaseName, String mongoCollectionName) {
		try {
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			
			MongoDatabase mongoDatabase = mongoClient.getDatabase(databaseName);
			System.out.println("Successfully connect to mongodb database " + databaseName + "!");
			
			MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(mongoCollectionName);
			System.out.println("Successfully get collection " + mongoCollectionName + "!");
			
			return mongoCollection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
