package services.ravi.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId(){
        Long id = 4L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

}