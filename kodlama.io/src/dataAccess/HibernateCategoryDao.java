package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("category added to Hibernate");
    }
}
