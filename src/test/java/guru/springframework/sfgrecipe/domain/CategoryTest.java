package guru.springframework.sfgrecipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

	Category category;

	@Before
	public void setUp() {
		category = new Category();
	}
	@Test
	public void getId() throws Exception {
		Long idValue = 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}

	@Test
	public void getDescription() throws Exception {
		String descriptionValue = "Hot Dog Jubilee";
		category.setDescription(descriptionValue);
		assertEquals(descriptionValue, category.getDescription());
	}

	@Test
	public void getRecipes() throws Exception {
	}
}