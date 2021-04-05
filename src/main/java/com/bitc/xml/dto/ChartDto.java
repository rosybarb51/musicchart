package com.bitc.xml.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="music")
public class ChartDto {

//	getter, setter가 들어갈 적당한 자리에 마우스 커서 갖다 댄 후 상단 메뉴바의 source - generate getters and setters 선택 후 public 체크 확인 후 생성
	private String id;
	private String title;
	private String album;
	private String musician;
	private String release;
	private String genre;
	
//	music 엘리먼트의 속성값 가져오기
	@XmlAttribute(name="id")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
//	music 엘리먼트 내의 엘리먼트들을 가져오기 위해 한 번만 선언
	@XmlElement
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getMusician() {
		return musician;
	}
	
	public void setMusician(String musician) {
		this.musician = musician;
	}
	
	public String getRelease() {
		return release;
	}
	
	public void setRelease(String release) {
		this.release = release;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
