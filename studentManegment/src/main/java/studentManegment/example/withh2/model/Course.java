package studentManegment.example.withh2.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    
    @OneToOne(mappedBy = "course")
    @JsonBackReference
    private Student webApi;
    public Student getWebApi() {
        return webApi;
    }
    public void setWebApi(Student webApi) {
        this.webApi = webApi;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getFess() {
        return fess;
    }
    public void setFess(long fess) {
        this.fess = fess;
    }
    private long fess;
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", fess=" + fess + "]";
    }
}
