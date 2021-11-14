package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.InvoiceRepository;
import model.Invoice;

@Controller
public class OtherController {
	InvoiceRepository repository = new InvoiceRepository();
	
	@RequestMapping("other/index.html")
	public String index(Model model) {
		List<Invoice> listOfInvoice = repository.getInvoices();
		model.addAttribute("invoices", listOfInvoice);
		return "other.index";
	}
	@RequestMapping("other/detai.html/{id}")
	public String detail(Model model, @PathVariable("id") String id) {
		Invoice inv = repository.getInvoice(id);
		model.addAttribute("o", inv);
		model.addAttribute("title","Other detail");
		return "other.detail";
	}
}
