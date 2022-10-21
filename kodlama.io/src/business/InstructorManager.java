package business;

import dataAccess.IInstructorDao;
import dataAccess.ILogger;
import entities.Instructor;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private ILogger loggers[];

    public InstructorManager(IInstructorDao intructorDao, ILogger[] loggers) {
        this.instructorDao = intructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(ILogger logdata:loggers){
            logdata.log(instructor.getFirstName()+instructor.getLastName());

        }
    }
}

