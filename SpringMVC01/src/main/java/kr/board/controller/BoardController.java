package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

@Controller
public class BoardController {

	// 컨트롤러가 클라이언트로 부터 게시판을 보여달라는 요청이오면 처리
	// /boardList.do - 게시판 리스트를 보여주세요 요청
	// HandlerMapping
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		
		Board vo = new Board();
		vo.setIdx(1);
		vo.setTitle("게시판실습");
		vo.setContents("게시판실습");
		vo.setWriter("박성민");
		vo.setIndate("2022-05-10");
		vo.setCount(0);
		List<Board> list=new ArrayList<Board>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		model.addAttribute("list", list);
		return "boardList"; //WEB-INF/views/boardList.jsp -> forward
	}
	
}
