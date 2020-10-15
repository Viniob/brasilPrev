package com.prev.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Client {

	@Id @GeneratedValue
	private Integer id;
	private String name;
	private String cpf;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
	private Adress adress;
	
	
	
	public Client() {
		super();
	}
	
	
	public Client(String name, String cpf, Adress adress) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.adress = adress;
	}


	public Client(Integer id, String name, String cpf, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.adress = adress;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", cpf=" + cpf + ", adress=" + adress + "]";
	}
	
	
	
}
