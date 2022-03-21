package spring.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// ibatis 이전이름 - Mybatis 변경
@Repository("mybatisdao")
public class MemberDAO {
	/*<bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
	<constructor-arg ref="sqlSessionFactory" />
</bean>*/
	@Autowired
	SqlSession session;

	//저장
	public int insertmember(MemberDTO dto) {
		int insertrow = session.insert("insertmember", dto);
		return insertrow;
	}

	//수정
	public int updatemember(MemberDTO dto) {
		return session.update("updatemember", dto);//id, name, address
	}

	//삭제
	public int deletemember(String id) {
		return session.delete("deletemember", id);
		
	}
	
	public List<MemberDTO> memberlist(){
		List<MemberDTO> list = session.selectList("memberlist");
		return list;
	}
	
	public List<MemberDTO> memberlist(int page){
		int [] limit = new int[] { (page-1)*5 , 5};
		List<MemberDTO> list = session.selectList("paginglist", limit);//<select id="??">
		return list;
	}	
	
	public List<String> memberlist(String[] address){
		List<String> list = session.selectList("addresssearch", address);//<select id="??">
		return list;
	}
	public MemberDTO member(String id) {
		MemberDTO dto = session.selectOne("member", id);
		return dto;
	}
}



