package com.surittec.backendSurittec.dto;

import java.io.Serializable;

import com.surittec.backendSurittec.domain.Cliente;

public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nomeCliente;
	private String CPF;
	
	public ClienteDTO() {
		
	}
	
	public ClienteDTO (Cliente obj) {
		
		nomeCliente = obj.getNome();
		CPF = obj.getCPF();
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}

}
