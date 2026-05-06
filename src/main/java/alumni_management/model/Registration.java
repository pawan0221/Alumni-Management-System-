package alumni_management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "registrations")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int batch;
    private String department;
    private String company;
    private String location;
    private String email;
    private String bio;
    private String status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getBatch() { return batch; }
    public void setBatch(int batch) { this.batch = batch; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}