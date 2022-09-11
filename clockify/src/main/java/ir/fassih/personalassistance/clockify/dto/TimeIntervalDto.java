package ir.fassih.personalassistance.clockify.dto;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeIntervalDto {

    private LocalDateTime start;
    private LocalDateTime end;
    private Duration duration;


    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
