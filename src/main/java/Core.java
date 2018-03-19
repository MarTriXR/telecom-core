import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.CoreProperties;
import utils.RestInitializer;

public class Core {
    private static final Logger LOG = LogManager.getLogger(Core.class);

    public static void main(String[] args) {
        LOG.log(Level.INFO,"Starting CORE application");
        if(args.length==1){
            if(CoreProperties.LoadProperties(args[0])){
                RestInitializer.initialize();
            }
        }else{
            LOG.log(Level.INFO,"Please provide a properties file path");
            System.exit(0);
        }
    }
}
