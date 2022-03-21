package ajax;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.mybatis.MemberDTO;

//ajax��û�� ó�� ��Ʈ�ѷ� 4 �����̻�( sts4 + sts3 �߰� ��� ==> ������������Ʈ �⺻ ���� 3.1.1 ����--4.3.18 ����
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
