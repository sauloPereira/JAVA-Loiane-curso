package com.loiane.java.aula56;

public class Pessoa {
	
	private TipoDocumento tipoDoc;
	private String numDocumento;
	
	public Pessoa() {
		
	}
	
	public Pessoa(TipoDocumento tipoDoc, String numDocumento) {
		super();
		this.tipoDoc = tipoDoc;
		this.numDocumento = numDocumento;
	}

	public TipoDocumento getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDocumento tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
	

}