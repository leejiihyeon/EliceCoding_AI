package ajax;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mybatis.MemberDTO;
import spring.mybatis.MemberService;

@Controller
public class LoginAjaxController {
	
	@Autowired
	@Qualifier("mybatisservice")
	MemberService service;
	
	
//로그인폼 화면 뷰 보여주는 메소드
	@RequestMapping(value="/ajax/login", method=RequestMethod.GET)
	public void loginform() {//뷰 결과 
	}

//로그인 ajax 처리 메소드
	@RequestMapping(value="/ajax/login", method=RequestMethod.POST , produces = {"application/json;charset=utf-8"} )
	@ResponseBody
	public String loginresult(String id, String password) {
		if(id.equals("ajax") && password.equals("1234")) {
			return "{\"process\":\"정상로그인\" , \"role\":\"admin\"}";
		}
		else {
			return "{\"process\":\"비정상로그인\" , \"role\":\"user\"}";
		}
		
	}
	/*url: '<%=request.getContextPath() %>/ajax/myinform',
	data : {'id':$("#id").val(), 'password':$("#password").val() } , 
	type : 'get' ,*/
	@RequestMapping(value="/ajax/myinform" , produces = {"application/json;charset=utf-8"})
	@ResponseBody
	public MemberDTO myinform(String id, String password) {
		// spring.mybatis 패키지 service dao dto sql-mapping.xml
		MemberDTO dto = service.member(id);
		System.out.println("/ajax/myinform 호출==> "+dto);
		if(dto == null) {
			dto = new MemberDTO();
			dto.setId("new"); //클라이언트 id == new 
		}
		else if(!dto.getPassword().equals(password)){
			dto.setPassword("new");
			dto.setEmail(null);
			dto.setName(null);
			dto.setPhone(null);
			dto.setAddress(null);
		}
		return dto;  //3.pom.xml 라이브러리 <dependency> 자바객체를 json 변환 자동
	}
	
	@RequestMapping(value="/ajax/memberlist"  , produces = {"application/json;charset=utf-8"})
	@ResponseBody
	public List<MemberDTO> memberlist(int page){
		List<MemberDTO> list = service.memberlist(page);
		
		return list;
		
	}
}











