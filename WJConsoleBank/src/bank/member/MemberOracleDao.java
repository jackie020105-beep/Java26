package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberOracleDao implements MemberDao{


	@Override
	public boolean save(Member m) {
		String sql = "INSERT INTO BANK_MEMBER "
				+ " (id, password, name, email, mobile) "
				+ "values (?, ?, ?, ?, ?)";
		try (Connection conn = DBUtil.getConnection(); //DB와 연결, conn변수에 저장
			PreparedStatement pstmt = conn.prepareStatement(sql)) { //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, m.getId()); // 1번 ? 에 Id 저장
			pstmt.setString(2, m.getPassword()); // 2번 ? 에 Id 저장
			pstmt.setString(3, m.getName()); // 3번 ? 에 Id 저장
			pstmt.setString(4, m.getEmail()); // 4번 ? 에 Id 저장
			pstmt.setString(5, m.getMobile()); // 5번 ? 에 Id 저장
			return pstmt.executeUpdate() == 1; // INSERT 성공했는지 여부
		}
	}

	@Override
	public List<Member> findAll() {
		String sql = "SELECT id, name, email, mobile, type"
				+ "FROM BANK_MEMBER";
		List<Member> members = new ArrayList<>();
		try (Connection conn = DBUtil.getConnection(); //DB와 연결, conn변수에 저장
	        PreparedStatement pstmt = conn.prepareStatement(sql); //SQL을 실행 준비, pstmt변수에 저장
			ResultSet rs = pstmt.executeQuery()) { //SQL을 실행, rs변수에 저장
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				char type = rs.getString("type").charAt(0);
				
				Member member = new Member(id, null, email, mobile, mobile, type); //비번은 보이면 안되므로 null값
				members.add(member);
			}
			return members;
		}
	}

	@Override
	public Member findById(String id) {
		String sql = "SELECT id, name, email, mobile, type"
				+ "FROM BANK_MEMBER"
				+ "WHERE id = ?";
		try (Connection conn = DBUtil.getConnection(); //DB와 연결, conn변수에 저장
		        PreparedStatement pstmt = conn.prepareStatement(sql)){ //SQL을 실행 준비, pstmt변수에 저장
					pstmt.setString(1, id); // ?에 아이디 넣기
					try (ResultSet rs = pstmt.executeQuery()) { //SQL을 실행, rs변수에 저장
						if (rs.next()) {
							String id = rs.getString("id");
							String name = rs.getString("name");
							String email = rs.getString("email");
							String mobile = rs.getString("mobile");
							char type = rs.getString("type").charAt(0);
							
							Member member = new Member(id, null, email, mobile, mobile, type); //비번은 보이면 안되므로 null값
							return member;
						}
						return null; // 아이디가 없는 경우
					}
				}
		}

	@Override
	public boolean update(Member m) {
		String sql = "UPDATE BANK_MEMBER"
				+ "SET password = ?, name = ?, email = ?, mobile = ?"
				+ "WHERE id = ?";
		try (Connection conn = DBUtil.getConnection(); //DB와 연결, conn변수에 저장
		        PreparedStatement pstmt = conn.prepareStatement(sql)){ //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getMobile());
			pstmt.setString(5, m.getId());
			
			return pstmt.executeUpdate() == 1; // UPDATE 성공했는지 여부
		}
	}

	@Override
	public boolean delete(Member m) {
		String sql = "DELETE FROM BANK_MEMBER"
				+ "WHERE id = ? AND password = ?";
		try (Connection conn = DBUtil.getConnection(); //DB와 연결, conn변수에 저장
		        PreparedStatement pstmt = conn.prepareStatement(sql)){ //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			
			return pstmt.executeUpdate() == 1; // DELETE 성공했는지 여부
		}
	}

}
