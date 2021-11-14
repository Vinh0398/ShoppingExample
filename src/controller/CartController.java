package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.CartRepository;
import dao.InvoiceRepository;
import model.Cart;
import util.Helper;

@Controller
@RequestMapping("cart")
public class CartController {
	private CartRepository repository = new CartRepository();
	private InvoiceRepository invoiceRepository = new InvoiceRepository();

	@RequestMapping(value = "add.html", method = RequestMethod.POST)
	public String add(Model model, Cart obj, HttpServletRequest request, HttpServletResponse response) {

		String id = null;
		for (Cookie cookie : request.getCookies()) {
			if (cookie.getName().equals("cart")) {
				id = cookie.getValue();
			}

		}
		if (id == null) {
			id = Helper.randomString(32);
			Cookie cookie = new Cookie("cart", id);
			cookie.setPath(request.getServletContext().getContextPath());
			cookie.setMaxAge(30 * 24 * 3600);
			response.addCookie(cookie);
		}
		obj.setId(id);
		repository.add(obj);
		return "redirect:/cart/index.html";
	}

	@RequestMapping("cart.html")
	public String index(Model model, @CookieValue("cart") String id) {
		model.addAttribute("title", "Your Cart");
		model.addAttribute("list", repository.getCarts(id));
		return "cart.index";
	}
}
