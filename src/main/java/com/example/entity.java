package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "demoTableee")
public class entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="col1" )
	private int col1;
	
	@Column(name="col2")
	private int col2;
	
	public int getcol1() {
		return col1;
	}
	public void setcol1(int col1) {
		this.col1 = col1;
	}
	public int getcol2() {
		return col2;
	}
	public void setcol2(int col2) {
		this.col2 = col2;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public entity() {
		super();
	}
	@Override
	public String toString() {
		return "entity [id=" + id + ", col1=" + col1 + ", col2=" + col2 + "]";
	}
	public entity(int id, int col1, int col2) {
		super();
		this.id = id;
		this.col1 = col1;
		this.col2 = col2;
	}
	
	
	
}
