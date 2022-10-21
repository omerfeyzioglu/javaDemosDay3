package dataAccess;

import entities.Course;

public class JdbcInstructorDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("instructor added to Jdbc");
    }
}
