package ninja.bltsec.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test
    public void getRecipes() throws Exception {
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;
        category.setId(4L);
        assertEquals(idValue, category.getId());
    }

}