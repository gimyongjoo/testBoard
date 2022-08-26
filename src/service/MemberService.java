package service;

import controller.MemberController;
import data.Member;
import infra.Container;
import repository.MemberRepository;

public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(){
        this.memberRepository = Container.memberRepository;
    }

    public int saveMember(String loginId, String passward, String name){
        return memberRepository.saveMember(loginId, passward, name);
    }

    public boolean isExistByLoginId(String loginId){
        return memberRepository.isExistByLoginId(loginId);
    }

    public boolean isCorrectInfo(String loginId, String password){
        Member findMember = memberRepository.getMemberByLoignId(loginId);

        if(findMember == null){
            return false;
        }

        if(findMember.getPassward().equals(password)){
            return true;
        }
        return false;
    }

    public Member getMemberByLoginId(String loginId) {
        return memberRepository.getMemberByLoignId(loginId);
    }

    public void delete(String loginId) {
        Member findMember = getMemberByLoginId(loginId);
        memberRepository.delete(findMember);
    }
}
