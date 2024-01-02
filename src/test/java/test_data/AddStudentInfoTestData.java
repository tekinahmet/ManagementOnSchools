package test_data;

import java.util.HashMap;
import java.util.Map;

public class AddStudentInfoTestData {
    public static Map<String, Object> addStudentInfoTestData(String absentee, String educationTermId, String finalExam, String infoNote, String lessonId, String midtermExam, String studentId){
        Map<String, Object> map = new HashMap<>();
        if (absentee != null) {
            map.put("absentee", absentee);
        }
        if (educationTermId != null) {
            map.put("educationTermId", educationTermId);
        }
        if (finalExam != null) {
            map.put("finalExam", finalExam);
        }
        if (infoNote != null) {
            map.put("infoNote", infoNote);
        }
        if (lessonId != null) {
            map.put("lessonId", lessonId);
        }
        if (midtermExam != null) {
            map.put("midtermExam", midtermExam);
        }
        if (infoNote != null) {
            map.put("studentId", studentId);
        }

        return map;
    }

}
