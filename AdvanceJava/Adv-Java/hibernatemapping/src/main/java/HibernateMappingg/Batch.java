package HibernateMappingg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Batch {
	
	String batchId ;
	String batchName;
	
	LocalDateTime time;
	
	List<Student> students;

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	

}
