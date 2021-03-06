package ubb.courses.backend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import ubb.courses.backend.models.authorization.User;
import ubb.courses.backend.models.generic.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "enrollments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Enrollment extends BaseEntity {

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "course_id")
    @NotNull
    private Course course;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id")
    @NotNull
    private User user;
}

