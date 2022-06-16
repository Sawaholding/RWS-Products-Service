package RWS.products.controllers;

import RWS.products.controllers.config.Config;
import RWS.products.models.Category;
import RWS.products.repository.DB_Repository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Optional;

//AAA (Arrange-Act-Assert)

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = Config.class)
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})


class ProCategoryControllerIntTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DB_Repository db_repository;

//    @Autowired
//    private ProCategoryService categoryService;

    @Test
    void getAllCategories() throws Exception {
        //arrange
        Category cat = new Category();
        cat.setId("123abd");
        cat.setName("laptops");
        cat.setImage("image");
        cat.setDateTimeCreated("12.12.20024");

        List<Category> cats = List.of(cat);

        //Mock
        Mockito.when(db_repository.findAll()).thenReturn(cats);

        //ACT
        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.get("/categories")
                        .contentType(MediaType.APPLICATION_JSON)
        );

         result.andExpect(MockMvcResultMatchers.status().isOk());
         String body = result.andReturn().getResponse().getContentAsString();
         assert body.contains(cat.getId());

//        assert result.andReturn().getResponse().getContentAsString().contains(cat.getId());
//        assert result.andReturn().getResponse().getContentAsString().contains(cat.getName());
//        assert result.andReturn().getResponse().getContentAsString().contains(cat.getImage());
    }

    @Test
    void getCategory() throws Exception {
        Category cat = new Category();
        cat.setId("123abd");
        cat.setName("laptops");
        cat.setImage("image");
        cat.setDateTimeCreated("12.12.20024");

        //Mock
        Mockito.when(db_repository.findById(cat.getId())).thenReturn(Optional.of(cat));

        //ACT
        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.get("/categories/{id}", cat.getId())
                        .contentType(MediaType.APPLICATION_JSON)
        );

        result.andExpect(MockMvcResultMatchers.status().isOk());
        String body = result.andReturn().getResponse().getContentAsString();
        assert body.contains(cat.getId());
        assert body.contains(cat.getName());
    }

    @Test
    void addCategory() throws Exception {
        Category cat = new Category();
        cat.setId("123abd");
        cat.setName("laptops");
        cat.setImage("image");
        cat.setDateTimeCreated("12.12.20024");
        String json = new ObjectMapper().writeValueAsString(cat);

        //Mock
        Mockito.when(db_repository.save(cat)).thenReturn(null);

        //ACT
        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.post("/categories")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
        );

        result.andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void updateCategory() throws Exception {

        Category cat = new Category();
        cat.setId("123abd");
        cat.setName("laptops");
        cat.setImage("image");
        cat.setDateTimeCreated("12.12.20024");
        String json = new ObjectMapper().writeValueAsString(cat);

        //Mock
        Mockito.when(db_repository.save(cat)).thenReturn(null);

        //ACT
        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.put("/categories")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
        );

        result.andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void deleteCategory() throws Exception {
        String id = "abc";

        //ACT
        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.delete("/categories/{id}", id)
        );
        result.andExpect(MockMvcResultMatchers.status().isOk());
    }

}