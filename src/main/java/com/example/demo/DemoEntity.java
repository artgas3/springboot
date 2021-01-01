package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class DemoEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "name")
	private String name;
	@Column(name = "remark")
	private String remark;
	@Column(name = "price")
	private double price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "DemoEntity [Id=" + Id + ", name=" + name + ", remark=" + remark + ", price=" + price + "]";
	}
}
