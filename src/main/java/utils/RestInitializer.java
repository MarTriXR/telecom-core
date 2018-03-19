package utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;


import static spark.Spark.*;

public class RestInitializer {
    private static final Logger LOG = LogManager.getLogger(RestInitializer.class);
    public static boolean initialize(){
        try{
            port(CoreProperties.getSensorRestPort());
            get("/sensor/:id/:measure", (req, res) -> "OK");
            return true;
        }catch(Exception e){
            LOG.log(Level.ERROR,"Unable to initialize rest api",e);
        }
        return false;
    }
}
