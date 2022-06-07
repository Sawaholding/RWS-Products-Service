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

    public List<Category> getAllCategories(){
        List<Category> categories = new ArrayList<Category>();
        repository.findAll().forEach(a -> categories.add(a));
        return categories;
    }

    public Category getCategory(String id)
    {
        return repository.findById(id).orElse(null);
    }

    public void addNewCategory(Category category)
    {
        repository.save(category);
    }

    public void updateCategory(Category category)
    {
        repository.save(category);
    }

    public void deleteCategory(String id) {
        repository.deleteById(id);
    }


}
