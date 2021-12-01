package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.MemberRepository;
import model.Member;

@Controller
@RequestMapping("author")
public class MemberController {
	MemberRepository repository = new MemberRepository();

	@RequestMapping(value = "register.html", method = RequestMethod.POST)
	public String register(Member obj) {
		repository.add(obj);
		return "redirect:/author/logon.html";
	}

	@RequestMapping("register.html")
	public String register() {
		return "author.register";
	}

	@RequestMapping("logon.html")
	public String register(HttpServletRequest request) {
		if (request.getParameter("error") != null) {
			request.setAttribute("msg", "Username or password incorrect.");
		}
		return "author.logon";
	}

}
