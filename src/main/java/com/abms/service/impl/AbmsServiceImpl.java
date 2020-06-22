package com.abms.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.abms.entity.Abms;
import com.abms.mapper.AbmsMapper;
import com.abms.service.AbmsService;
import com.github.pagehelper.Page;

@Service
public class AbmsServiceImpl implements AbmsService {
	
	@Resource
	private AbmsMapper abmsMapper;

	public int saveAbms(Abms abms) throws Exception {
		return abmsMapper.saveAbms(abms);
	}

	public int updateAbms(Abms abms) throws Exception {
		return abmsMapper.updateAbms(abms);
	}

	public int deleteAbms(Long id) throws Exception {
		return abmsMapper.deleteAbms(id);
	}

	public Abms selectById(Long id) throws Exception {
		return abmsMapper.selectById(id);
	}

	public Page<Abms> selectAbmsByMap(Map<String, Object> map) throws Exception {
		
		return abmsMapper.selectAbmsByMap(map);
	}

}
