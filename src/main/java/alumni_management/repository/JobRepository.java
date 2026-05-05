// src/main/java/alumni_management/repository/JobRepository.java
package alumni_management.repository;

import alumni_management.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
