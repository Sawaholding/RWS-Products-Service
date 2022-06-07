package RWS.products.controllers;


import RWS.products.models.Category;
import RWS.products.services.ProCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProCategoryController
{
    @Autowired
    private ProCategoryService categoryService;

    @RequestMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @RequestMapping("/categories/{id}")
    public Category getCategory(@PathVariable String id){
        return categoryService.getCategory(id);}

    @RequestMapping( method = RequestMethod.POST, value = "/categories")
    public void addCategory(@RequestBody Category category){
        categoryService.addNewCategory(category);
    }

    @RequestMapping( method = RequestMethod.PUT, value = "/categories")
    public void updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
    }

    @DeleteMapping("/categories/{id}")
    public void updateCategory(@PathVariable String id){
        categoryService.deleteCategory(id);
    }

}
