package com.huocompany.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.huocompany.board.dao.BDao;
import com.huocompany.board.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void excute(Model model) {
	
		
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list",dtos);
	}

}
