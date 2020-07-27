package com.skt.twd.customer.core.object.query;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Id;
import java.util.Date;

@Slf4j
@ToString
@NoArgsConstructor
@Getter
@Setter
public class CustomerResponseDTO {
    String id;          //고객id
    String name;        //고객이름
    String password;    //비밀번호
    String svcNum;      //회선번호
    String authLevel;   //권한레벨
    Date regDate;       //등록일자
    Date updDate;       //수정일자
    String regId;       //등록자
    String updId;       //수정자
}
