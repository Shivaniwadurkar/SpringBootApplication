package com.example.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBootApplication.model.Product;
import com.example.SpringBootApplication.service.ProductService;

@Controller
public class ProductWebController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/web/product")
//dependancy injection of model
	public String product(Model model) {
		List<Product> listProducts = productService.listAll();
		model.addAttribute("listProducts", listProducts);
		return "product/product";
	}

	@RequestMapping("/new")
	public String addNewProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "product/newproduct";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/";

	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable(name = "id")Long id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = productService.get(id);
		mav.addObject("product",product );
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id")Long id) {
		productService.delete(id);
		return "redirect:/";

	}
	
	
	
	
}