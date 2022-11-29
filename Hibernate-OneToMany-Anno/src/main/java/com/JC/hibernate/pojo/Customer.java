package com.JC.hibernate.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "custid")
	private int customerId;
	
	@Column(name = "custname", length = 10)
	private String customerName;
	
	@Column(name = "custaddress", length = 10)
	private String customerAddress;

}
