package com.ync365.seed.bussiness.modules.user.dao;

import java.util.List;
import java.util.Map;

import com.ync365.seed.bussiness.modules.user.entity.SysRoleModule;
import com.ync365.seed.commons.annotation.MyBatisRepository;

@MyBatisRepository
public interface SysRoleModuleMapper {

	/**
	 * 添加信息
	 * 
	 * @param record
	 * @return
	 */
    int insertSelective(SysRoleModule record);

    /**
	 * 查询
	 * 
	 * @param map
	 * @return
	 */
	List<SysRoleModule> selectPageByMap(Map<String, Object> map);


	/**
	* 物理  通过 roleId删除数据
	* 
	* @param roleId
	* @return
	*/
	int deleteRoleModuleByRoleId(Integer roleId);
	
	/**
	* 物理  通过 moduleId删除数据
	* 
	* @param moduleId
	* @return
	*/
	int deleteRoleModuleByModuleId(Integer moduleId);
	
	/**
	 * roleId为条件更新
	 * 
	 * @param record
	 * @return
	 */
	int update(SysRoleModule record);
}