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
public class SysPermission extends BaseDomain {
    private String pmsnId;

    private String menuName;

    private String menuCode;

    private String prntId;

    private String prntName;

    private String pmsnCode;

    private String pmsnName;

    private String status;

    private String pmsnUrl;

    private String pmsnDesc;

    private String required;

}