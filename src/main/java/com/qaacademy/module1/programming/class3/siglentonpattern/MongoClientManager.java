package com.qaacademy.module1.programming.class3.siglentonpattern;

import com.qaacademy.module1.programming.class3.builderparttern.DataBaseConnection;

public class MongoClientManager {
    private static MongoClientManager instance = null;
    private final DataBaseConnection dataBaseConnection;

    private MongoClientManager(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    public static MongoClientManager getInstance(DataBaseConnection dataBaseConnection){
        if(instance == null){
            instance = new MongoClientManager(dataBaseConnection);
        }

        return instance;
    }

    public void connect(){
        System.out.println("Connecting to MongoDB");
        System.out.println(getConnectionString());
    }

    private String getConnectionString(){
        return String.format("mongodb://%s:%s@%s:%s/%s?readPreference=primary&tls=true&authSource=%s",
                dataBaseConnection.getUsername(),
                dataBaseConnection.getPassword(),
                dataBaseConnection.getHostname(),
                dataBaseConnection.getPort(),
                dataBaseConnection.getDbName(),
                dataBaseConnection.getAuthenticationType());
    }
}
