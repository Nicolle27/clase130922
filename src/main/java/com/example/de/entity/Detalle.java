package com.example.de.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor

public class Detalle implements Serializable{
	private static final long serialVersionUID = 1L;
	private int iddetalle;
	private int idventa;
	private int idproducto;
	private String precio;
	private String cantidad;
	public Detalle() {
		super();
	}
	public Detalle(int iddetalle, int idventa, int idproducto, String precio, String cantidad) {
		super();
		this.iddetalle = iddetalle;
		this.idventa = idventa;
		this.idproducto = idproducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIddetalle() {
		return iddetalle;
	}
	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
