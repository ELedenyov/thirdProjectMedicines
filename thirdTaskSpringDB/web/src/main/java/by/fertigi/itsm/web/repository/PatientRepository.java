package by.fertigi.itsm.web.repository;

import by.fertigi.itsm.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
