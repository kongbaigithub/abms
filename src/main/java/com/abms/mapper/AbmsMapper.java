package com.abms.mapper;

import java.util.Map;

import com.abms.entity.Abms;
import com.github.pagehelper.Page;

public interface AbmsMapper {

	/**
	 * 新增通讯录
	 * @param abms
	 * @return
	 */
	int saveAbms(Abms abms);
	
	/**
	 * 修改通讯录
	 * @param abms
	 * @return
	 */
	int updateAbms(Abms abms);
	
	/**
	 * 删除通讯录
	 * @param id
	 * @return
	 */
	int deleteAbms(Long id);
	
	/**
	 * 查询通讯录
	 * @param id
	 * @return
	 */
	Abms selectById(Long id);

	/**
	 * 带条件查询通讯录
	 * @param map
	 * @return
	 */
	Page<Abms> selectAbmsByMap(Map<String, Object> map);
}
