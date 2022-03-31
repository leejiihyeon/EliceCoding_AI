package edu.multi.boot1;

import java.util.HashMap;

public class MapService implements NaverService {

	HashMap<String, String> map = new HashMap<String, String>();
	public MapService() {
		map.put("이름이 뭐니?", "클로바야");
	}
	@Override
	public String test(String request) {
		String response = map.get(request);
		if(response == null) {
			response = "답변할 수 없습니다.";
		}
		return response;
	}
	//서비스이면서 자바어플리케이션 실행
	/*public static void main(String args[]) {
		MapService service = new MapService();
		String response1 = service.test("질문");
		System.out.println(response1);
		
		String response2 = service.test("이름이 뭐니?");
		System.out.println(response2);		
	}*/

}
