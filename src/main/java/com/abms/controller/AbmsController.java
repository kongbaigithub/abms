package com.abms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abms.entity.Abms;
import com.abms.service.AbmsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 通讯录控制类
 * @author hxl
 *
 */
@RestController
@RequestMapping("/abms")
public class AbmsController {

	@Resource
	private AbmsService abmsService;
	
	@PostMapping("/saveAbms")
	public Object saveAbms(Abms abms) {
		System.out.println("saveAbms: " + abms);
		ModelAndView mav = new ModelAndView();
		try {
			if (null == abms.getId()) {
				
				abmsService.saveAbms(abms);
			}else {
				abmsService.updateAbms(abms);
			}
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", "插入数据失败！");
		}
		
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/updateAbms")
	public Object updateAbms(Abms abms) {
		return null;
	}
	
	@GetMapping("/deleteAbms/{id}")
	public Object deleteAbms(@PathVariable("id") Long id) {
		try {
			return abmsService.deleteAbms(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@GetMapping("/selectById/{id}")
	public Object selectById(@PathVariable("id") Long id,Model model) {
		
		try {
			Abms abms = abmsService.selectById(id);
			return abms;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}
	
	@GetMapping("/select")
	public Object GetDepartment(int limit, int offset, String name, String phone) throws Exception{
		
		PageHelper.startPage(offset,limit);
		
		System.out.println(limit + "->" + offset + "->" + name + "->" + phone);
		
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("limit", limit);
//		map.put("offset", offset * offset);
		map.put("name", name);
		map.put("phone", phone);

		Page<Abms> page = abmsService.selectAbmsByMap(map);
		Map<String,Object> responseMap = new HashMap<String,Object>();
		//key需要与js中 dataField对应，bootStrap默认值为rows
		responseMap.put("rows", page.getResult());
				
		// 需要返回到前台，用于计算分页导航栏
		responseMap.put("total", page.getTotal());
		
        return responseMap;
    }
}
