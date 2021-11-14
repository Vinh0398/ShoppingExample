package dao;

import java.util.List;

import mapper.CategoryMapper;
import model.Category;

public class CategoryRepository extends Repository{
	public List<Category> getsCategory(){
		return jdbc.query("SELECT * FROM category", new CategoryMapper());
	}
	public int add(Category obj) {
		return jdbc.update("INSERT INTO Category (CategoryId,CategoryName,ParentId) VALUE(?,?,?)",obj.getId(),obj.getName(),obj.getParent());
	}
	public List<Category> getParents(){
		String sql = "SELECT * FROM Category WHERE ParentId is null";
		return jdbc.query(sql, new CategoryMapper());
	}
	
}
