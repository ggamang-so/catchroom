package com.project.catchroom.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
    private int no;
    private String userid;
    private String username;
    private String tel;
    private int zipcode;
    private String address;
    private String addrDetail;
    private String joinDate;
    private String blackUser;

}
