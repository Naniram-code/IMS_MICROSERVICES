package net.nrb.service;
/*
import com.scm.model.Course;
import com.scm.model.Student;
import com.scm.repo.CourserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourserService{
    @Autowired
    private CourserRepo service;
    @Override
    public Course saveCourse(Course course) {

        return service.save(course);
    }

    @Override
    public Course getCourseById(Integer courseId) {
        Optional<Course> optionalCourse =service.findById(courseId);
        return optionalCourse.get();
    }

    @Override
    public List<Course> getAllCourse() {

        return service.findAll();
    }

    @Override
    public Course updateCourse(Course course) {

        Course existingCourse =service.findById(course.getCid()).get();
        existingCourse.setCname(course.getCname());
        existingCourse.setCduration(course.getCduration());
        existingCourse.setCfee(course.getCfee());

        Course updatedCourse = service.save(existingCourse);
        return updatedCourse;
    }

    @Override
    public void deleteCourse(Integer courseId) {
        service.deleteById(courseId);

    }
}*/
