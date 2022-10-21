package business;

import dataAccess.ICourseDao;
import dataAccess.ILogger;
import entities.Course;

import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger loggers[];

    private List<Course> courses;

    public CourseManager(ICourseDao courseDao, ILogger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course ) throws Exception {
        if(course.getPrice()<10){
            throw new Exception("course price can't be less than 10");
        }
        for (Course course1:courses) {
            if(course.getCourseName()==course1.getCourseName())
            {throw new Exception("course already added");
            }

        }
        courses.add(course);
        courseDao.add(course);
        for (ILogger logdata: loggers){
            logdata.log(course.getCourseName());
        }
    }

}
