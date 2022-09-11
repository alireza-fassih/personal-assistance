package ir.fassih.personalassistance.clockify.config;

import ir.fassih.personalassistance.utils.ExceptionsUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ClockifyConfigLoader {

    private final static String propertiesPrefix = "clockify";
    private final static Logger logger =
            Logger.getLogger(ClockifyConfigLoader.class.getName());


    private ClockifyConfigLoader() {
        // util class
    }


    public static ClockifyConfig load(InputStream stream) {
        try {
            Properties properties = new Properties();
            properties.load(stream);
            return convertPropertiesToConfig( properties );
        } catch (IOException io) {
            logger.severe("cannot load properties input => "
                    + ExceptionsUtil.getStackTrace(io));
            throw new RuntimeException("cannot load config", io);
        }
    }

    private static ClockifyConfig convertPropertiesToConfig(Properties properties) {
        String token = properties.getProperty(propertiesPrefix + ".token");
        String workspace = properties.getProperty(propertiesPrefix + ".workspace");
        String userId = properties.getProperty(propertiesPrefix + ".user-id");
        String markerTagId = properties.getProperty(propertiesPrefix + ".marker-tag-id");
        return new ClockifyConfig(token, workspace, userId, markerTagId);
    }

}
