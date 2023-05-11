package com.residencia.biblioteca.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "livro")
public class Livro {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "codigolivro")
	private Integer codigoLivro;
	
	@Column (name = "nomelivro")
	private String nomeLivro;
	
	@Column (name = "nomeautor")
	private String nomeAutor;
	
	@Column (name = "datalancamento")
	private Date dataLancamento;
	
	@Column (name = "codigoisbn")
	private Integer codigoIsbn;	
	
	@ManyToOne
	@JoinColumn (name = "codigoeditora" , referencedColumnName = "codigoeditora")
	private Editora editora;
	
	@OneToOne (mappedBy = "livro")
	private Emprestimo emprestimo;

	public Integer getCodigoLivro() {
		return codigoLivro;
	}	

	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getCodigoIsbn() {
		return codigoIsbn;
	}

	public void setCodigoIsbn(Integer codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	
}