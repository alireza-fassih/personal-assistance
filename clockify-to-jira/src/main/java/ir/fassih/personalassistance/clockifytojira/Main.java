package ir.fassih.personalassistance.clockifytojira;

import ir.fassih.personalassistance.clockify.ClockifyApiInvoker;
import ir.fassih.personalassistance.clockify.config.ClockifyConfig;
import ir.fassih.personalassistance.clockify.config.ClockifyConfigLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws Exception {

        String userHomeDir = System.getProperty("user.home");
        var input = new FileInputStream(userHomeDir + "/.clockify-to-jira/config.properties");
        ClockifyConfig load = ClockifyConfigLoader.load(input);

        ClockifyApiInvoker invoker = new ClockifyApiInvoker(load);

        var results = invoker.loadTimeEntries();


        return;
    }

}
