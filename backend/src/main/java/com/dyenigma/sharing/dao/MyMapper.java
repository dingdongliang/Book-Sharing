package com.dyenigma.sharing.dao;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;

/**
 * backend/com.dyenigma.sharing.constant
 *
 * @Description : 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 * @Author : dingdongliang
 * @Date : 2018/4/9 11:44
 */
public interface MyMapper<T> extends BaseMapper<T>, ConditionMapper<T>, IdsMapper<T> {
}

