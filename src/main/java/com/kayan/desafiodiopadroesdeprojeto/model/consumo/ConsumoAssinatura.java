package com.kayan.desafiodiopadroesdeprojeto.model.consumo;

public class ConsumoAssinatura implements Consumo {
	
	private int id = 2;
	private String tituloAssinatura = "Obrigado pela assinatura, aqui esta seu produto";
	private byte[] imagemFisico = "Teste".getBytes();
	
	@Override
	public String titulo() {
		return tituloAssinatura;
	}
	@Override
	public byte[] imagem() {
		return imagemFisico;
	}
	@Override
	public int id() {
		return id;
	}
	public String getTituloAssinatura() {
		return tituloAssinatura;
	}
	public void setTituloAssinatura(String tituloAssinatura) {
		this.tituloAssinatura = tituloAssinatura;
	}
	public byte[] getImagemFisico() {
		return imagemFisico;
	}
	public void setImagemFisico(byte[] imagemFisico) {
		this.imagemFisico = imagemFisico;
	}
	
	
	

}
