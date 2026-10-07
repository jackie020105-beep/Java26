package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
    public static void main(String[] args) {
        testMemberDao();
    }

    public static void testMemberDao() {
        MemberDao mdao = new MemberListDao();
        // 회원 추가
        System.out.println(">> 회원 추가 및 회원 목록");
        mdao.save(new Member("wonjae", "1111", "정원재", null, null));
        mdao.save(new Member("curi", "1111", "큐리", null, null));
        printMemberList(mdao.findAll());
        
        // 회원 모두 찾기
        System.out.println(">> 회원 목록");
        List<Member> mlist = mdao.findAll();

        // 회원 출력
        printMemberList(mlist);
        
        System.out.println(">> 아이디로 회원 찾기");
        Member m = mdao.findById("curi");
        System.out.println(m);
        
        System.out.println(">> 비번 변경");
        m.setPassword("1234");
        mdao.update(m);
        printMemberList(mdao.findAll());
        
        System.out.println(">> 회원 삭제");
        mdao.delete(mdao.findById("curi"));
        printMemberList(mdao.findAll());

    }

    public static void printMemberList(List<Member> mlist) {
        for (Member m : mlist) {
            System.out.println(m);
        }
    }
}