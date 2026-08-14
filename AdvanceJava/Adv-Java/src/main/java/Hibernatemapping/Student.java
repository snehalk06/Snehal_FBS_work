package Hibernatemapping;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
@Id
    private String frn;
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    
    @ManyToOne
    private Batch batch;

    public String getFrn() {
        return frn;
    }

    public void setFrn(String frn) {
        this.frn = frn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
        
        
    }


    public Student(String frn, String name, Address address, Batch batch) {
        this.frn = frn;
        this.name = name;
        this.address = address;
        this.batch = batch;
    }
    public Student() {

    }

	@Override
	public String toString() {
		return "Student [frn=" + frn + ", name=" + name + ", address=" + address + ", batch=" + batch + "]";
	}
}