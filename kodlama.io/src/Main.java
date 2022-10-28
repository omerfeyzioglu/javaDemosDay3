import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.ILogger;
import dataAccess.JdbcCategoryDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
       List<Category> categories = new ArrayList<>();
       categories.add(new Category(1,"Category1"));
       categories.add(new Category(2,"Category2"));


       ILogger loggers[] = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

       CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers,categories);
       try{
           categoryManager.add(new Category(3,"Category3"));
           categoryManager.add(new Category(31,"Category5"));
           categoryManager.add(new Category(3,"Category3"));//already added error
       }catch(Exception e){
           System.out.println("this category already added ");
       }



    }
}