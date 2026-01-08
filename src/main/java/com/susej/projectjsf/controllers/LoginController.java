/**
 * 
 */
package com.susej.projectjsf.controllers;

import java.io.IOException;
import java.io.Serializable;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

/**
 * @autor jesusVB clase que permite controlar el funcionamiento con la pantalla
 *        de login.xhtml
 */

@Named("LoginController")
@ViewScoped
public class LoginController implements Serializable {

	public LoginController() {

	}

	private String user;
	private String password;

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	private void redireccionar(String pagina) throws IOException {

ExternalContext ec=FacesContext.getCurrentInstance().getExternalContext();
ec.redirect(pagina);
 }

	/**
	 * password
	 */
	public void loginButton() {
		if (user.equals("jesuss") && password.equals("1234")) {
			// FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",new
			// FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", "The full
			// info"));

			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL, "pagina no encontrada",""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtPassword",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario Incorrecto", "The full info error"));
		}
		System.out.println("The user name is :" + user);
		System.out.println("Codigo Actual :" + user);
	}

}
