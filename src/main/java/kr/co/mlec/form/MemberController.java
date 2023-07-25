package kr.co.mlec.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class MemberController {
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}

	/*
	@RequestMapping("/join.do")
	public String join(MemberVO member) {
//		public String join(HttpServletRequest request) {
		
		
//		public String join(MemberVO member) <- 이렇게 쓰면 얘가 알아서 다 해줌 그래서 밑에 코드들은 필요없어짐
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
//		
//		MemberVO member = new MemberVO();
//		member.setId(id);
//		member.setPassword(password);
//		member.setName(name);
//		request.setAttribute("member", member);
		
		return "form/memberInfo";
				
	}
	*/
	
	
	@RequestMapping("/join.do")
	public String join(@ModelAttribute("member") MemberVO member) {
			 System.out.println(member.getId());
			 System.out.println(member.getPassword());
			 System.out.println(member.getName());
			 return "form/memberInfo";
			}

	
	
}
