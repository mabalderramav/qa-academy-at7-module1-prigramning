package com.qaacademy.module1.programming.class3.builderparttern;

public class DataBaseConnection {
    private final String username;

    private final String password;

    private final String dbName;

    private final String hostname;

    private final String port;

    private final AuthenticationType authenticationType;

    private DataBaseConnection(DataBaseConnectionBuilder dataBaseConnectionBuilder){
        this.username = dataBaseConnectionBuilder.username;
        this.password = dataBaseConnectionBuilder.password;
        this.dbName = dataBaseConnectionBuilder.dbName;
        this.hostname = dataBaseConnectionBuilder.hostname;
        this.port = dataBaseConnectionBuilder.port;
        this.authenticationType = dataBaseConnectionBuilder.authenticationType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDbName() {
        return dbName;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPort() {
        return port;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public static class DataBaseConnectionBuilder{
        private final String username;

        private final String password;

        private final String dbName;

        private final String hostname;

        private String port;

        private AuthenticationType authenticationType;

        public DataBaseConnectionBuilder(String username,
                                         String password,
                                         String dbName,
                                         String hostname){
            this.username = username;
            this.password = password;
            this.dbName = dbName;
            this.hostname = hostname;
        }

        public DataBaseConnectionBuilder setPort(String port) {
            this.port = port;
            return  this;
        }

        public DataBaseConnectionBuilder setAuthenticationType (AuthenticationType authenticationType){
            this.authenticationType = authenticationType;
            return this;
        }

        public DataBaseConnection build(){
            return  new DataBaseConnection(this);
        }
    }
}
