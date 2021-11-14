package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.ProductRepository;
import model.Product;

@Controller
@RequestMapping("home")
public class HomeController {
	ProductRepository repository = new ProductRepository();
	private static int size = 6;
	
	@RequestMapping(value = {"/","index.html" ,"index.html/{p}" })
	public String index(Model model, @PathVariable(value = "p", required = false) Integer p) {
		if(p==null) {
			p = 1;
		}
		model.addAttribute("title", "MiniShop");
		model.addAttribute("n",(int)Math.ceil(repository.count() / (double)size));
		model.addAttribute("list", repository.getProducts(p, size));
		return "home.index";
	}
	@RequestMapping("detail.html/{id}")
	public String detail(Model model, @PathVariable("id") int id) {
		Product o = repository.getProduct(id);
		//model.addAttribute("title", o.getTitle());
		model.addAttribute("o", o);
		return "home.detail";
	}
	@RequestMapping("search.html")
	public String search (Model model, @RequestParam("q") String q) {
		model.addAttribute("title", "Result for" + q);
		model.addAttribute("list", repository.search(q));
		return "home.search";
	}
	@RequestMapping("browser.html/{id}")
	public String browser (Model model, @PathVariable("id") int id) {
		Product o = repository.getProduct(id);
		model.addAttribute("o", o);
		return "home.browser";
	}
}
