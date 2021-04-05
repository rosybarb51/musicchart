package com.bitc.xml.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// xml 파일의 엘리먼트 중 가장 상위의 엘리먼트를 적어준다.
@XmlRootElement(name="response")
public class MusicChartDto {

//	MusicChart 더블 클릭으로 선택 후, 오른쪽 마우스 - refactor - Encapsulate Filed 누르고, public 체크 확인 후 getter setter 생성해주기
	private List<ChartDto> MusicChart;

//	리스트로 가져올 것..이라서
	@XmlElement(name="music")
	public List<ChartDto> getMusicChart() {
		return MusicChart;
	}

	public void setMusicChart(List<ChartDto> musicChart) {
		MusicChart = musicChart;
	}
	
}
