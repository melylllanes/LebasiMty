package com.example.springboot.entity;

public class Pedido {

	private int latas;
	private String municipio;
	private int costo_envio;
	private int costo_total_latas;
	private int costo_total;
	
	
	public Pedido(String municipio, String latas) {
		this.setLatas(Integer.parseInt(latas));
		this.setMunicipio(municipio);

		
	} 
		

	public Pedido () {
		
	}
	public int getLatas() {
		return latas;
	}

	public void setLatas(int latas) {
		this.latas = latas;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getCosto_envio() {
		return costo_envio;
	}

	public void setCosto_envio(int costo_envio) {
		this.costo_envio = costo_envio;
	}

	public int getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(int costo_total) {
		this.costo_total = costo_total;
	}

	public int getCosto_total_latas() {
		return costo_total_latas;
	}

	public void setCosto_total_latas(int costo_total_latas) {
		this.costo_total_latas = costo_total_latas;
	}

	public int calcularCostoEnvio() {

		int total_envio;
		if ("Monterrey".equals(this.getMunicipio()) || "San Nicolas".equals(this.getMunicipio())
				|| "San Pedro Garza Garcia".equals(this.getMunicipio())) {
			total_envio = 65;
		} else {
			total_envio = 85;
		}
		this.setCosto_envio(total_envio);
		return total_envio;

	}

	public int calcularCostoLatas() {
		int precio_latas = (this.getLatas() * 455);
		this.setCosto_total_latas(precio_latas);

		return precio_latas;
	}

	public int calcularCostoTotal() {
		int total = this.getCosto_total_latas() + this.getCosto_envio();
		this.setCosto_total(total);

		return total;
	}

}
