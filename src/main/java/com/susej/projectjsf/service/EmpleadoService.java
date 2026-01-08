/**
 * 
 */
package com.susej.projectjsf.service;

import java.util.ArrayList;
import java.util.List;

import com.susej.projectjsf.entity.Empleado;

import jakarta.enterprise.context.ApplicationScoped;


/**
 * Clase que permite realiza la logica de negocios para empleados
 * {@link}
 */

@ApplicationScoped
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> em=new ArrayList<>();
		
		for(int i=0 ; i<=9;i ++) {
			Empleado emp=new Empleado("Nombre:"+i,"apellido:"+i,"empleado:"+i,"programador:"+i,false);
               System.out.println(emp.isEstatus());
			em.add(emp);	
		}
		
		return em;
		
	}

}
