package com.project.catchroom.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "member")
public class MemberEntity {

    @Id
    @Generated
    private Long id;

    private String userid;
    private String username;
    private String tel;
    private int zipcode;
    private String address;
    private String addrDetail;
    private String joinDate;
    private String blackUser;

}
