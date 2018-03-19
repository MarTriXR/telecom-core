import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.CoreProperties;
<<<<<<< HEAD
import utils.RestInitializer;
=======
>>>>>>> b02b5cf82c3cf7c22935887412ea40d287d2d622

public class Core {
    private static final Logger LOG = LogManager.getLogger(Core.class);

    public static void main(String[] args) {
        LOG.log(Level.INFO,"Starting CORE application");
        if(args.length==1){
            if(CoreProperties.LoadProperties(args[0])){
<<<<<<< HEAD
                RestInitializer.initialize();
=======

>>>>>>> b02b5cf82c3cf7c22935887412ea40d287d2d622
            }
        }else{
            LOG.log(Level.INFO,"Please provide a properties file path");
            System.exit(0);
        }
    }
}
