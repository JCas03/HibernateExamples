package com.JC.hibernate.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vendor")
public class Vendor {
	@Id
	@Column(name = "vendid")
	private int vendorId;
	
	@Column(name = "venName", length = 10)
	private String vendorName;
	
	@OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "venid", referencedColumnName = "vendid")
	private Set customers;


}
