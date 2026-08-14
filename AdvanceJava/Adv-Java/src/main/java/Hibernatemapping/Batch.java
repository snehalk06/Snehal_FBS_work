package Hibernatemapping;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Batch {
@Id
    String batchId;
   String batchName;
    LocalDateTime time;
    @OneToMany(mappedBy = "batch")
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

    public Batch(String batchId, String batchName, LocalDateTime time) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.time = time;
       
    }
    public Batch() {

    }
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + ", time=" + time + ", students=" + students
				+ "]";
	}
    
	
}