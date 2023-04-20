package com.huocompany.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.huocompany.board.controller.BContentCommand;
import com.huocompany.board.dao.BDao;
import com.huocompany.board.dto.BDto;

public class BContentCommend implements BCommand {

	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		//model�ȿ� �ִ� request ��ü�� ���� ���� Map �������� ���� �� Map�� Ű���� request�� request��ü�� �� 

		String bid = request.getParameter("bid");

		BDao dao = new BDao();
		BDto dto = dao.content_view(bid);

		model.addAttribute("content", dto);

	}

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
	}

}