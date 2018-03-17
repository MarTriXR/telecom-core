package utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class CoreProperties {
    private static final Logger LOG = LogManager.getLogger(CoreProperties.class);
    private static String databaseUrl;
    private static String databaseUser;
    private static String databasePassword;
    private static String databaseDriver;
    private static int databaseMinPoolSize;
    private static int databaseMaxPoolSize;
    private static int restPort;
    private static String restIp;
    private static String[] restAllowedIp;
    private static int restThreadPool;
    private static Properties prop = new Properties();
    private static InputStream input = null;

    public static boolean LoadProperties(String path){
        try{
            input = new FileInputStream(path);
            prop.load(input);
            setDatabaseUrl(prop.getProperty("databaseUrl"));
            setDatabaseUser(prop.getProperty("databaseUser"));
            setDatabasePassword(prop.getProperty("databasePassword"));
            setDatabaseDriver(prop.getProperty("databaseDriver"));
            setDatabaseMinPoolSize(Integer.parseInt(prop.getProperty("databaseMinPoolSize")));
            setDatabaseMaxPoolSize(Integer.parseInt(prop.getProperty("databaseMaxPoolSize")));
            setRestPort(Integer.parseInt(prop.getProperty("restPort")));
            setRestIp(prop.getProperty("restIp"));
            setRestAllowedIp(prop.getProperty("restAllowedIp").split(","));
            setRestThreadPool(Integer.parseInt(prop.getProperty("restThreadPool")));
            LOG.log(Level.INFO,"Properties loaded");
            return true;

        }catch(Exception e){
            LOG.log(Level.FATAL,"Unable to load properties",e);
        }
        return false;
    }

    public static String getDatabaseUrl() {
        return databaseUrl;
    }

    public static void setDatabaseUrl(String databaseUrl) {
        CoreProperties.databaseUrl = databaseUrl;
    }

    public static String getDatabaseUser() {
        return databaseUser;
    }

    public static void setDatabaseUser(String databaseUser) {
        CoreProperties.databaseUser = databaseUser;
    }

    public static String getDatabasePassword() {
        return databasePassword;
    }

    public static void setDatabasePassword(String databasePassword) {
        CoreProperties.databasePassword = databasePassword;
    }

    public static String getDatabaseDriver() {
        return databaseDriver;
    }

    public static void setDatabaseDriver(String databaseDriver) {
        CoreProperties.databaseDriver = databaseDriver;
    }

    public static int getDatabaseMinPoolSize() {
        return databaseMinPoolSize;
    }

    public static void setDatabaseMinPoolSize(int databaseMinPoolSize) {
        CoreProperties.databaseMinPoolSize = databaseMinPoolSize;
    }

    public static int getDatabaseMaxPoolSize() {
        return databaseMaxPoolSize;
    }

    public static void setDatabaseMaxPoolSize(int databaseMaxPoolSize) {
        CoreProperties.databaseMaxPoolSize = databaseMaxPoolSize;
    }

    public static int getRestPort() {
        return restPort;
    }

    public static void setRestPort(int restPort) {
        CoreProperties.restPort = restPort;
    }

    public static String getRestIp() {
        return restIp;
    }

    public static void setRestIp(String restIp) {
        CoreProperties.restIp = restIp;
    }

    public static String[] getRestAllowedIp() {
        return restAllowedIp;
    }

    public static void setRestAllowedIp(String[] restAllowedIp) {
        CoreProperties.restAllowedIp = restAllowedIp;
    }

    public static int getRestThreadPool() {
        return restThreadPool;
    }

    public static void setRestThreadPool(int restThreadPool) {
        CoreProperties.restThreadPool = restThreadPool;
    }
}
