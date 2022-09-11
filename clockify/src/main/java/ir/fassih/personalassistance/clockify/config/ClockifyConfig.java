package ir.fassih.personalassistance.clockify.config;

public class ClockifyConfig {

    private final String token;
    private final String workspace;
    private final String userId;
    private final String markerTagId;

    public ClockifyConfig(String token, String workspace, String userId, String markerTagId) {
        this.token = token;
        this.workspace = workspace;
        this.userId = userId;
        this.markerTagId = markerTagId;
    }

    public String getToken() {
        return token;
    }

    public String getWorkspace() {
        return workspace;
    }

    public String getUserId() {
        return userId;
    }

    public String getMarkerTagId() {
        return markerTagId;
    }
}
