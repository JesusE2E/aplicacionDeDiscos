package com.susej.projectjsf.controllers;

import java.io.Serializable;
import java.util.List;

import com.susej.projectjsf.entity.Empleado;
import com.susej.projectjsf.service.EmpleadoService;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("PrincipalController")
@ViewScoped
public class PrincipalController implements Serializable{

	@Inject
	private EmpleadoService empleadoService;
	private List<Empleado> empleados;
	
	public PrincipalController() {
		
	}
	
	/*
	 * Metodo que se encar
	 * */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		System.out.println("metodo init");
	}
	
	public void consultarEmpleados(){
		
		this.empleados=empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
}
