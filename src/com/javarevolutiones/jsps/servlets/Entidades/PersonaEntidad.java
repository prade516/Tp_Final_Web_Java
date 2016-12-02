package com.javarevolutiones.jsps.servlets.Entidades;

import java.io.Serializable;

public class PersonaEntidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5460235573462949640L;


	static int PUNTOS_INICIALES=200;
	static int EVASION_MAXIMOS=80;
	static int DEFENSA_MAXIMO=20;
	static int PUNTOS_POR_PARTIDAGANADA=10;
	
	private int codigo;
	private String nombre;
	private int vida;
	private int energia;
	private int defensa;
	private int evasion;
	private int puntosTotales;
	
	private int usoEnergia;
	private int dato;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public int getPuntosTotales() {
		return puntosTotales;
	}

	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}

	public int getUsoEnergia() {
		return usoEnergia;
	}

	public void setUsoEnergia(int usoEnergia) {
		this.usoEnergia = usoEnergia;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	
	
	public PersonaEntidad(){
		this.vida=0;
		this.defensa=0;
		this.energia=0;
		this.evasion=0;
		this.puntosTotales=PUNTOS_INICIALES;
		//?
		this.usoEnergia=0;
		this.dato=0;
	}
	
	public boolean ValidarPunto(){
		boolean resp;
		if((defensa+vida+energia+evasion)<=puntosTotales && evasion<=EVASION_MAXIMOS && defensa<=EVASION_MAXIMOS){
			 resp=true;
		}
		else{
			resp=false;
		}
		return resp;
	}
}
