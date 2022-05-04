package RWS.products.controllers;


import RWS.products.models.ProCategory;
import RWS.products.services.ProCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProCategoryController {

    @Autowired
    private ProCategoryService categoryService;

    @RequestMapping("/categories")
    public List<ProCategory> getAllCategories(){
        return categoryService.getAllCategories();
    }




}
