package ir.fassih.personalassistance.clockify.dto;

import java.util.List;

public class TimeEntryDto {

    private String id;
    private String description;
    private String userId;
    private String taskId;
    private String workspaceId;
    private String projectId;
    private boolean isLocked;
    private boolean billable;
    private TimeIntervalDto timeInterval;
    private List<String> tagIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public TimeIntervalDto getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeIntervalDto timeInterval) {
        this.timeInterval = timeInterval;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }
}
