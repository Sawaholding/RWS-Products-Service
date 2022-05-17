package RWS.products.services;

import RWS.products.models.Category;
import RWS.products.repository.DB_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class ProCategoryService
{

    @Autowired
    private DB_Repository repository;
    
    public List<Category> categories = new ArrayList<Category>();

    public List<Category> getAllCategories(){
        categories =  repository.getCategories();
        return categories;
    }


    public Category getCategory(String id)
    {
        for (Category c: categories)
        {
            if ( Objects.equals(c.getId(), id))
            {
                return c;
            }
        }
        return null;
    }


    public void addNewCategory(Category category)
    {
        categories.add(category);
    }


    public void updateCategory(Category category)
    {
        for(int i = 0; i < categories.size(); i++)
        {
            Category c = categories.get(i);
            if(c.getId().equals(category.getId()))
            {
                categories.set(i,category);
            }
        }
    }


    public void deleteCategory(String id) {
        categories.removeIf(c -> c.getId().equals(id));
    }
}
