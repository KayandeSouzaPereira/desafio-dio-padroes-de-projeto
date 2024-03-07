package com.kayan.desafiodiopadroesdeprojeto.model.consumo;


public class ConsumoFisico implements Consumo {
	
	private int id = 1;
	private String tituloFisico = "Obrigado pela espera, aqui esta seu produto";
	private byte[] imagemFisico = "Teste".getBytes();
	
	@Override
	public String titulo() {
		return tituloFisico;
	}
	@Override
	public byte[] imagem() {
		return imagemFisico;
	}
	
	@Override
	public int id() {
		return id;
	}
	public String getTituloFisico() {
		return tituloFisico;
	}
	public void setTituloFisico(String tituloFisico) {
		this.tituloFisico = tituloFisico;
	}
	public byte[] getImagemFisico() {
		return imagemFisico;
	}
	public void setImagemFisico(byte[] imagemFisico) {
		this.imagemFisico = imagemFisico;
	}
	
	
	

}
