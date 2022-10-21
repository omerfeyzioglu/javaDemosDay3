package business;

import dataAccess.ICategoryDao;
import dataAccess.ICourseDao;
import dataAccess.ILogger;
import entities.Category;
import entities.Course;

import java.util.List;

public class CategoryManager{
    private ICategoryDao categoryDao;
    private ILogger loggers[];

    private List<Category> categories;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for(Category category2 : categories){
            if(category.getCategoryName()==category2.getCategoryName()){
                throw new Exception("category already added");
            }
        }
    
        categoryDao.add(category);
        categories.add(category);

        for(ILogger logdata : loggers){
            logdata.log(category.getCategoryName());

        }
    
    }
}
