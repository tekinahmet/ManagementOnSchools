package pojos.meetManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CreateMeeting {
    String date ;
    String description ;
    String startTime;
    String stopTime;
    List<Long> studentIds ;

    public CreateMeeting(String date, String description, String startTime, String stopTime, long studentIds) {
        this.date = date;
        this.description = description;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.studentIds = Collections.singletonList(studentIds);
    }

    public CreateMeeting() {
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public List<Long> getStudentIds() {
        return studentIds;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public void setStudentIds(long studentIds) {
        this.studentIds = Collections.singletonList(studentIds);
    }

    @Override
    public String toString() {
        return "CreateMeeting{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", studentIds=" + studentIds +
                '}';
    }

    //    {
//        "date": "<string>",
//            "description": "<string>",
//            "startTime": "<string>",
//            "stopTime": "<string>",
//            "studentIds": [
//        "<long>",
//                "<long>"
//  ]
//    }
}
