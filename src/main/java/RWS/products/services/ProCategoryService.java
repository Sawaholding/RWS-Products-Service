package RWS.products.services;

import RWS.products.models.ProCategory;
import RWS.products.repository.DB_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProCategoryService {

    @Autowired
    private DB_Repository repository;
    
    public List<ProCategory> categories = new ArrayList<ProCategory>();

//    List<ProCategory> categoriesList =  repository.getCategories();
//    public void annitialising(){
//        categories =  repository.getCategories();
//    }
    public List<ProCategory> getAllCategories(){
        categories =  repository.getCategories();
        return categories;
    }

}
