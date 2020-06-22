package com.abms.service;

import java.util.Map;

import com.abms.entity.Abms;
import com.github.pagehelper.Page;

public interface AbmsService {

	/**
	 * 新增通讯录
	 * @param abms
	 * @return
	 */
	int saveAbms(Abms abms) throws Exception;
	
	/**
	 * 修改通讯录
	 * @param abms
	 * @return
	 */
	int updateAbms(Abms abms) throws Exception;
	
	/**
	 * 删除通讯录
	 * @param id
	 * @return
	 */
	int deleteAbms(Long id) throws Exception;
	
	/**
	 * 查询通讯录
	 * @param abms
	 * @return
	 * @throws Exception
	 */
	Abms selectById(Long id) throws Exception;
	
	/**
	 * 带条件查询通讯录
	 * @param abms
	 * @return
	 * @throws Exception
	 */
	Page<Abms> selectAbmsByMap(Map<String, Object> map) throws Exception;
}
