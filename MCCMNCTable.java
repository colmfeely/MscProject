package com.mscproject.entities;

import java.io.Serializable;

@Entity
@Table(name="mcc_mncTable")
public class MCCMNCTable implements Serializable {
	
	@Column(name="mcc")			private Integer mcc;
	@Column(name="mnc")			private Integer mnc;
	@Column(name="country")		private String country;
	@Column(name="Operator")	private String operator;
	
	public MCCMNCTable(){}

	public MCCMNCTable(Integer mcc,Integer mnc,String country,String operator) {
		
			this.mcc = mcc;
			this.mnc = mnc;
			this.country = country;
			this.operator = operator;
	}

	public Integer getMcc() {
		return mcc;
	}

	public void setMcc(Integer mcc) {
		this.mcc = mcc;
	}

	public Integer getMnc() {
		return mnc;
	}

	public void setMnc(Integer mnc) {
		this.mnc = mnc;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	

}
