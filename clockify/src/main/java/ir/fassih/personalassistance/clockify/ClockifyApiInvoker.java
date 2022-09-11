package ir.fassih.personalassistance.clockify;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.fassih.personalassistance.clockify.config.ClockifyConfig;
import ir.fassih.personalassistance.clockify.config.ClockifyConfigLoader;
import ir.fassih.personalassistance.clockify.dto.TimeEntryDto;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

public class ClockifyApiInvoker {

    private final static Logger logger =
            Logger.getLogger(ClockifyApiInvoker.class.getName());
    private final static ObjectMapper mapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .findAndRegisterModules();
    private static final String baseUrl = "https://api.clockify.me/api/v1";


    private final ClockifyConfig config;

    public ClockifyApiInvoker(ClockifyConfig config) {
        this.config = config;
    }



    public TimeEntryDto[] loadTimeEntries() throws URISyntaxException, IOException, InterruptedException {
        String formatPath =
                String.format("/workspaces/%s/user/%s/time-entries", config.getWorkspace(), config.getUserId());
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(baseUrl + formatPath))
                .header("content-type", "application/json")
                .header("X-Api-Key", config.getToken())
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());

        String body = response.body();
        logger.info("received: " + body);

        return mapper.readValue(body, TimeEntryDto[].class);
    }

}
