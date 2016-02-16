package com.mscproject.entities;

import java.io.Serializable;

@Entity
@Table(name="failure_class_table")
public class FailureClassTable implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	
	@Column(name="failure_class") private Integer failureClass;
	@Column(name="description")   private String description; 
	
	public FailureClassTable(){}

	public FailureClassTable(Integer failureClass,String description) {
		
		this.failureClass = failureClass;
		this.description = description;
	}

	public Integer getFailureClass() {
		return failureClass;
	}

	public void setFailureClass(Integer failureClass) {
		this.failureClass = failureClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
