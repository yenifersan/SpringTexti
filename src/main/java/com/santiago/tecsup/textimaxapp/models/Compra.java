package com.santiago.tecsup.textimaxapp.models;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "looccabecera_app")
public class Compra implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id_compra;

	@JoinColumn(name = "compra_anumordcom")
	private String anumordcom;
	
	@JoinColumn(name = "compra_afecordcom")
	private String afecordcom;
	
	@JoinColumn(name = "compra_cliente")
	private String cliente;
	
	@JoinColumn(name = "compra_formapago")
	private String formapago;
	
	@JoinColumn(name = "compra_moneda" )
	private String moneda;
	
	@JoinColumn(name = "compra_total")
	private Double total;
	
	@JoinColumn(name = "compra_estado")
	private String estado;
	
	
	public Integer getId() {
		return id_compra;
	}
	public void setId(Integer id) {
		this.id_compra = id;
	}
	public String getAnumordcom() {
		return anumordcom;
	}
	public void setAnumordcom(String anumordcom) {
		this.anumordcom = anumordcom;
	}
	public String getAfecordcom() {
		return afecordcom;
	}
	public void setAfecordcom(String afecordcom) {
		this.afecordcom = afecordcom;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getFormapago() {
		return formapago;
	}
	public void setFormapago(String formapago) {
		this.formapago = formapago;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Compra [id=" + id_compra + ", anumordcom=" + anumordcom + ", afecordcom=" + afecordcom + ", cliente=" + cliente
				+ ", formapago=" + formapago + ", moneda=" + moneda + ", total=" + total + ", estado=" + estado + "]";
	}

}
