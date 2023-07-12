package com.project.catchroom.dao;

import com.project.catchroom.entity.MemberEntity;

public interface MemberDAO {
    MemberEntity saveMember(MemberEntity memberEntity);

    MemberEntity getMember(Long Id);

}
