package com.sinosoft.sss.cloud.customer.respository.impl4mybatis.mapper;

import java.util.List;

/**
* 通用的数据库访问接口
* @date 2019/10/23
*/
public interface BaseMapper<Entity> {

  long count(Entity entity);

  List<Entity> select(Entity entity);

  Entity selectByPrimaryKey(Object id);

  int delete(Entity entity);

  int deleteByPrimaryKey(Object id);

  int deleteByPrimaryKeys(String ids);

  int insert(Entity entity);

  int insertSelective(Entity entity);

  int update(Entity entity);

  int updateByPrimaryKey(Entity entity);

  int updateByPrimaryKeySelective(Entity entity);

}
