package com.javarevolutiones.jsps.servlets.Entidades;

import java.io.Serializable;

public class usuarioEntidad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1707860739268659538L;

private String usuario;
private String password;
private String nombre;
private String apellido;

public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}

}
