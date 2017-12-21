package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {
    private Category category;
    @Before
    public void setUp(){
        category=new Category();
    }
    @Test
    public void getId() {
        Long expectedIdValue=4l;
        category.setId(4l);

        assertEquals(expectedIdValue,category.getId());
    }

    @Test
    public void getDescription() {

    }

    @Test
    public void getRecipes() {
    }
}