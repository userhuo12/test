package com.huocompany.board.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huocompany.board.command.BContentCommend;
import com.huocompany.board.command.BListCommand;
import com.huocompany.board.command.BModifyCommand;
import com.huocompany.board.command.BWriteCommand;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		
		return "writeForm";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		BWriteCommand command = new BWriteCommand();
		command.excute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		BListCommand command = new BListCommand();
		command.excute(model);

		return "list";
	}

	@RequestMapping(value = "content_view")
	public String content_view(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		 BContentCommend command = new BContentCommend();
		command.excute(model);

		return "contentView";
	}
	
	@RequestMapping(value = "/modify_form")
	public String modify_form(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		BContentCommend command = new BContentCommend();
		command.excute(model);

		return "modifyForm";
	}

	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request, Model model) {

		model.addAttribute("request", request);

		BModifyCommand command = new BModifyCommand();
		command.excute(model);

		return "redirect:list";
	}

}