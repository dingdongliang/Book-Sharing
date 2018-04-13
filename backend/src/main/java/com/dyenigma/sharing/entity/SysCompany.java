package com.dyenigma.sharing.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * backend/com.dyenigma.sharing.entity
 *
 * @Description :
 * @Author : dingdongliang
 * @Date : 2018/4/9 11:38
 */
@Getter
@Setter
public class SysCompany extends BaseDomain {
    private String coId;

    private String coName;

    private String coPhone;

    private String coAdr;

    private String coZip;

    private Integer sort;

    private String coEmail;

    private String contact;

    private String status;

    private String manager;

    private String coDesc;
}