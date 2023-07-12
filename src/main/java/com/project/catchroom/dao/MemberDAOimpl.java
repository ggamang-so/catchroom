package com.project.catchroom.dao;

import com.project.catchroom.entity.MemberEntity;
import com.project.catchroom.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDAOimpl implements MemberDAO {
    MemberRepository memberRepository;


    @Autowired
    public MemberDAOimpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberEntity saveMember(MemberEntity memberEntity) {
        memberRepository.save(memberEntity);
        return memberEntity;
    }

    @Override
    public MemberEntity getMember(Long id) {
        return memberRepository.getById(id);
    }
}
