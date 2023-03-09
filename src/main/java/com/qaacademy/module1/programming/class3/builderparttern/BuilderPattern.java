package com.qaacademy.module1.programming.class3.builderparttern;

public class BuilderPattern {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection.DataBaseConnectionBuilder(
                "username",
                "password",
                "dbName",
                "hostname")
                .setPort("3306")
                .setAuthenticationType(AuthenticationType.LDAP)
                .build();
        System.out.println(dataBaseConnection.getUsername());
        System.out.println(dataBaseConnection.getPassword());
        System.out.println(dataBaseConnection.getDbName());
        System.out.println(dataBaseConnection.getHostname());
        System.out.println(dataBaseConnection.getPort());
        System.out.println(dataBaseConnection.getAuthenticationType().toString());
    }
}
