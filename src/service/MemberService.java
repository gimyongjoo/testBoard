package service;

import controller.MemberController;
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

}
