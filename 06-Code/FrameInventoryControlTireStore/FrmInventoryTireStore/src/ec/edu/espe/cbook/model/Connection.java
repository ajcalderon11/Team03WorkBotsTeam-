
package ec.edu.espe.cbook.model;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author TeamWorkBots
 */
public class Connection {
  //  
    ConnectionString connectionString = new ConnectionString("mongodb+srv://dmcruz3:dmcruz3@clusteroop.lgtlx.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
    //
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Proyect");
    
    //
    public MongoDatabase obtenerDB(){
        return database;
    }
//
}

//conections
