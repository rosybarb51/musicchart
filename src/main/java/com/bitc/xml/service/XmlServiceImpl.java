package com.bitc.xml.service;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.bitc.xml.dto.ChartDto;
import com.bitc.xml.dto.MusicChartDto;

@Service
public class XmlServiceImpl implements XmlService{

	@Override
	public List<ChartDto> getMusicChart() throws Exception {
	JAXBContext jc = JAXBContext.newInstance(MusicChartDto.class);
	
	Unmarshaller um = jc.createUnmarshaller();
	
	MusicChartDto musicChart = (MusicChartDto)um.unmarshal(new File("C://java102//musicchart.xml"));
	
	List<ChartDto> list = musicChart.getMusicChart();
	
//	데이터 확인용
//	for (ChartDto chart : list) {
//		System.out.println("ID : " + chart.getId());
//		System.out.println("Title : " + chart.getTitle());
//		System.out.println("Album : " + chart.getAlbum());
//		System.out.println("Musician : " + chart.getMusician());
//		System.out.println("Release : " + chart.getRelease());
//		System.out.println("Genre : " + chart.getGenre());
//		System.out.println("-----------------------------");
//	}
	
	return list;
	}
}
