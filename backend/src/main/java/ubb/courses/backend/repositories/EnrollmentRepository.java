package ubb.courses.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ubb.courses.backend.models.Enrollment;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    List<Enrollment> deleteAllByCourseId(Integer id);

    Enrollment findByCourseIdInAndUserId(int course_id, int user_id);
}

