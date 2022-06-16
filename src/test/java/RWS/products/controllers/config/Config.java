package RWS.products.controllers.config;


import RWS.products.repository.DB_Repository;
import RWS.products.services.ProCategoryService;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


@TestConfiguration
public class Config {


    @Bean
    @Primary
    public DB_Repository repository(){
        return Mockito.mock(DB_Repository.class);
    }


//    @Bean
//    @Primary
//    public ProCategoryService categoryService(){
//        return Mockito.mock(ProCategoryService.class);
//    }

}
