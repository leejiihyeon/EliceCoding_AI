package ajax;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.mybatis.MemberDTO;

//ajax요청만 처리 컨트롤러 4 버전이상( sts4 + sts3 추가 기능 ==> 스프링프로젝트 기본 버전 3.1.1 생성--4.3.18 변경
@RestController
public class AllAjaxController {
	@RequestMapping("/ajax/a")
	public String a() {
		return "{\"result\":true}";
	}
	
	@RequestMapping("/ajax/b")
	public MemberDTO b() {
		return new MemberDTO("ID","PASSWORD");
	}
	
	@RequestMapping("/ajax/c")
	public String[] c() {
		return new String[] {"a","b","c"};
	}
}
