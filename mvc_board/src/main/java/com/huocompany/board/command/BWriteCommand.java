package com.huocompany.board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huocompany.board.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map =model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bname = request.getParameter("bname");
		String btitle= request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BDao dao = new BDao();
		dao.write (bname, btitle, bcontent);
		

	}

}
