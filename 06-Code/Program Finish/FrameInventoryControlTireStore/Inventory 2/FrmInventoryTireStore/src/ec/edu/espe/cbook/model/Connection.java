
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
    

<<<<<<< HEAD
    ConnectionString connectionString = new ConnectionString("mongodb+srv://sbcaisatoa:SB148005@clusteroop.lgtlx.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Proyect");
=======

ConnectionString connectionString = new ConnectionString("mongodb+srv://ajcalderon:ajcalderon@clusteroop.l8hmv.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase("Proyect");
>>>>>>> 00061a8d25227b7ea868429532f34e81e3c702e4

    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
