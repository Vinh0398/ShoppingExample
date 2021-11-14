package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.CategoryRepository;
import model.Category;

@Controller
@RequestMapping("admin/category")
public class CategoryController {
	CategoryRepository repository = new CategoryRepository();
	
	@RequestMapping("index.html")
	public String index(Model model) {
		
		List<Category> listCategory = repository.getsCategory();
		
		model.addAttribute("list", listCategory);
		
		return "category.index";
	}

	@RequestMapping("add.html")
	public String add(Model model) {
		List<Category> list = repository.getParents();
		model.addAttribute("list", list);
		
		model.addAttribute("obj", new Category());
		
		return "category.add";
	}
	@RequestMapping(value = "add.html", method = RequestMethod.POST)
	public String add(Model model, Category obj) {
		repository.add(obj);
		return "redirect:/admin/category/index.html";
	}
}
