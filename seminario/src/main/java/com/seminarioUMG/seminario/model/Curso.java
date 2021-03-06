package com.seminarioUMG.seminario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "cursos")
public class Curso {
	

	@Id
	@GeneratedValue
	@Column (name = "id_curso")
	private Integer idCurso;
	@Column (name = "nombre")
	private String nombre;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_catedratico")
	@JsonBackReference
	private Catedratico catedratico;
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Catedratico getCatedratico() {
		return catedratico;
	}
	public void setCatedratico(Catedratico catedratico) {
		this.catedratico = catedratico;
	}
	public Curso(Integer idCurso, String nombre, Catedratico catedratico) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.catedratico = catedratico;
	}
	public Curso() {
		super();
	}

	

	
}
