package spring.db.carmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarMemberController {

	@Autowired
	CarMemberDaoInter dao;
	
	@GetMapping("/carmember/list")
	public String list(Model model)
	{
		//목록 가져오기
		List<CarMemberDto>list=dao.getAllDatas();
		
		int count=dao.getTotalCount();
		//request 에  목록 저장
		model.addAttribute("list", list);
		model.addAttribute("count", count);

		
		return "carmember/memberlist";
	}
	
	@GetMapping("/carmember/writeform")
	public String form()
	{
		return "carmember/memberform";
	}


	@PostMapping("/carmember/write")
	public String insert(@ModelAttribute CarMemberDto dto)
	{
		dao.insertMember(dto);
		return "redirect:list";
	}

}