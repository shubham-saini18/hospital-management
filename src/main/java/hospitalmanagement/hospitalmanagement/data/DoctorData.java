package hospitalmanagement.hospitalmanagement.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import hospitalmanagement.hospitalmanagement.entity.Doctor;

public interface DoctorData extends JpaRepository<Doctor, Integer> {
    
}
