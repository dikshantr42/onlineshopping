package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Television Description");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Mobile");
		category2.setDescription("Mobile Description");
		category2.setImageURL("CAT_2.png");
		
		categories.add(category2);
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Laptop");
		category3.setDescription("Laptop Description");
		category3.setImageURL("CAT_3.png");
		
		categories.add(category3);
		
	}
	
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		return null;
	}
}