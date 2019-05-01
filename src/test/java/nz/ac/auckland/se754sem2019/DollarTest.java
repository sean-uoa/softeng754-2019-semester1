package nz.ac.auckland.se754sem2019;
import static org.junit.Assert.*;

import org.bson.Document;
import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DollarTest {
	
	@Test
	public void testDollarDivision() {
		// Given
		Dollar ten = new Dollar(10);
		
		// When
		Dollar result = ten.dividedBy(2);
		
		// Then
		assertEquals(new Dollar(5), result);  // Change to 4 to see the failure
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDollarDividedByZero() {
		// Given
		Dollar ten = new Dollar(10);
		
		// When
		ten.dividedBy(0);
	}
	
	@Test
	public void testDollarPersistence() {
		
		/* Initialise the database connection. */
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		String myCashDatabaseName = "my-cash-db";
		MongoDatabase mongoDatabase = mongoClient.getDatabase(myCashDatabaseName);
		String myCashCollectionName = "my-cash-collection";
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(myCashCollectionName);
		
		/* Save the data to the database.*/
		Dollar five = new Dollar(5);
		Document document = new Document();
		document.put("NZD", five.toString());
		mongoCollection.insertOne(document);
		System.out.println("Dollar save action perfomed!");
	}

}
