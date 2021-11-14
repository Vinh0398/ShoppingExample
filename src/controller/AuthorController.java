package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.AuthorRepository;
import model.Author;
import dao.ProductRepository;

@Controller
@RequestMapping("admin/author")
public class AuthorController {
	AuthorRepository repository = new AuthorRepository();

	@RequestMapping("index.html")
	public String index(Model model) {

		List<Author> listAuthor = repository.getAuthors();

		model.addAttribute("list", listAuthor);
		return "author.index";
	}

	@RequestMapping("add.html")
	public String add() {
		return "author.add";
	}

	@RequestMapping(value = "add.html", method = RequestMethod.POST)
	public String add(Author obj) {
		repository.add(obj);
		return "redirect:/admin/author/index.html";
	}

	@RequestMapping("edit.html/{id}")
	public String edit(Model model, @PathVariable("id") int id) {
		model.addAttribute("o", repository.getAuthor(id));
		return "author.edit";
	}

	@RequestMapping(value = "edit.html/{id}", method = RequestMethod.POST)
	public String edit(Model model, Author obj, @PathVariable("id") int id) {
		repository.edit(obj);
		return "redirect:/admin/author/index.html";
	}

	@RequestMapping("del.html/{id}")
	public String delete(@PathVariable("id") int id) {
		repository.delete(id);
		return "redirect:/admin/author/index.html";
	}

}
