package RWS.products.controllers;

import RWS.products.models.Category;
import RWS.products.repository.DB_Repository;
import RWS.products.services.ProCategoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//AAA (Arrange-Act-Assert)



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest
class ProCategoryControllerIntTest {


    @Autowired
    private MockMvc mockMvc;

    @Mock
    private DB_Repository db_repository;


    @Autowired
    private ProCategoryService categoryService;


    @Test
    void getAllCategories() throws Exception {
        Category cat = new Category();
        cat.setId("id");
        cat.setName("name");
        cat.setImage("image");
        cat.setDateTimeCreated("dateTimeCreated");

        List<Category> cats = List.of(cat);

        DB_Repository catMock = Mockito.mock(DB_Repository.class);

        Mockito.doReturn(cats).when(db_repository.findAll());
        ResultActions result = mockMvc.perform(
                MockMvcRequestBuilders.get("/categories")
                        .contentType(MediaType.APPLICATION_JSON)
        );

         result.andExpect(MockMvcResultMatchers.status().isOk());
//        assert result.andReturn().getResponse().getContentAsString().contains(cat.getId());
        assert result.andReturn().getResponse().getContentAsString().contains(cat.getName());
//        assert result.andReturn().getResponse().getContentAsString().contains(cat.getImage());
    }

    @Test
    void getCategory() {

    }

    @Test
    void addCategory() {

    }

    @Test
    void updateCategory() {

    }

    @Test
    void testUpdateCategory() {

    }
}