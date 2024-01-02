package pojos.studentInfoManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddStudentInfoPostPojo implements Serializable {
	private int absentee;
	private int educationTermId;
	private double finalExam;
	private String infoNote;
	private int lessonId;
	private double midtermExam;

	public AddStudentInfoPostPojo() {
	}

	public AddStudentInfoPostPojo(int absentee, int educationTermId, double finalExam, String infoNote, int lessonId, double midtermExam) {
		this.absentee = absentee;
		this.educationTermId = educationTermId;
		this.finalExam = finalExam;
		this.infoNote = infoNote;
		this.lessonId = lessonId;
		this.midtermExam = midtermExam;
	}

	public int getAbsentee() {
		return absentee;
	}

	public void setAbsentee(int absentee) {
		this.absentee = absentee;
	}

	public int getEducationTermId() {
		return educationTermId;
	}

	public void setEducationTermId(int educationTermId) {
		this.educationTermId = educationTermId;
	}

	public double getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public String getInfoNote() {
		return infoNote;
	}

	public void setInfoNote(String infoNote) {
		this.infoNote = infoNote;
	}

	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public double getMidtermExam() {
		return midtermExam;
	}

	public void setMidtermExam(double midtermExam) {
		this.midtermExam = midtermExam;
	}

	@Override
	public String toString() {
		return "AddStudentInfoPostPojo{" +
				"absentee=" + absentee +
				", educationTermId=" + educationTermId +
				", finalExam=" + finalExam +
				", infoNote='" + infoNote + '\'' +
				", lessonId=" + lessonId +
				", midtermExam=" + midtermExam +
				'}';
	}
}