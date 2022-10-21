package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("instructor added to Hibernate");
    }
}
