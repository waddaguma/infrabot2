package com.example.demo.member.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Getter
//@Setter
@Table(name = "member")
public class Member {


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 이 Annotation을 붙여주면 해당 변수를  PrimaryKey로 인식한다.
	private Long id;
	private String name;
	private Integer zipCode;
	private LocalDateTime eMail;
	private Boolean active;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public LocalDateTime geteMail() {
		return eMail;
	}
	public void seteMail(LocalDateTime eMail) {
		this.eMail = eMail;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	


}
