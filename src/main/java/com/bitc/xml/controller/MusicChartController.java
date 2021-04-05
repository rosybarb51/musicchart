package com.bitc.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.xml.dto.ChartDto;
import com.bitc.xml.service.XmlService;

@Controller
public class MusicChartController {
	@Autowired
	private XmlService xmlService;
	
	@RequestMapping(value="/chart/musicChart1", method=RequestMethod.GET)
	public ModelAndView musicChart1() throws Exception {
		
		ModelAndView mv = new ModelAndView("/chart/musicChart1");
		
		List<ChartDto> list = xmlService.getMusicChart();
		
		mv.addObject("xmlDatas", list);
		
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/chart/musicChart2", method=RequestMethod.POST)
	public Object musicChart2() throws Exception {
		List<ChartDto> list = xmlService.getMusicChart();
		
		return list;
	}
}
