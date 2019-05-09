package nz.ac.auckland.se754sem2019.mycash.integration;

import org.junit.Test;

import com.mongodb.MongoClient;

import nz.ac.auckland.se754sem2019.mycash.Dollar;
import nz.ac.auckland.se754sem2019.mycash.DollarPersistence;

public class DollarPersistenceIntegrationTest {

	@Test
	public void shouldConnectToMongoDBServer() {
		
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		String myCashDBName = "my-cash-db";
		String myCashCollectionName = "my-cash-collection";
		
		Dollar five = new Dollar(5);
		DollarPersistence dollarPersistence = new DollarPersistence(mongoClient, myCashDBName, myCashCollectionName);
		
		dollarPersistence.saveNZD(five);
		
		System.out.println("Dollar save action perfomed!!!");
	}

}
