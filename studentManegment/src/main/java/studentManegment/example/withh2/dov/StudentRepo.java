package studentManegment.example.withh2.dov;

import org.springframework.data.jpa.repository.JpaRepository;

import studentManegment.example.withh2.model.Student;

public interface StudentRepo extends JpaRepository <Student , Integer> {
    
}
