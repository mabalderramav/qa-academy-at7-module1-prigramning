package com.qaacademy.module1.programming.class3.siglentonpattern;

import com.qaacademy.module1.programming.class3.builderparttern.AuthenticationType;
import com.qaacademy.module1.programming.class3.builderparttern.DataBaseConnection;

public class SingletonPattern {
    public static void main(String[] args) {
        // Mongo
        DataBaseConnection mongoDataBaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .setPort("3306")
                .setAuthenticationType(AuthenticationType.LDAP)
                .build();
        MongoClientManager mongoClientManager = MongoClientManager.getInstance(mongoDataBaseConnection);
        mongoClientManager.connect();

        DataBaseConnection dataBaseConnection1 = new DataBaseConnection.DataBaseConnectionBuilder(
                "username2",
                "password2",
                "dbName",
                "hostname2")
                .setPort("4409")
                .setAuthenticationType(AuthenticationType.OAUTH)
                .build();
        MongoClientManager mongoClientManager1 = MongoClientManager.getInstance(dataBaseConnection1);
        mongoClientManager1.connect();
        System.out.println(mongoClientManager.hashCode());
        System.out.println(mongoClientManager1.hashCode());

        // MySql
        DataBaseConnection mySqlDatabaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .build();
        MySqlClientManager mySqlClientManager = MySqlClientManager.getInstance(mySqlDatabaseConnection);
        mySqlClientManager.connect();

        // Oracle
        DataBaseConnection oracleDataBaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .setPort("8965")
                .build();
        OracleClientManager oracleClientManager = OracleClientManager.getInstance(oracleDataBaseConnection);
        oracleClientManager.connect();
    }
}
