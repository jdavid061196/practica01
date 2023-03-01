package com.practica01.domain;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@Table(name="estado")
public class estado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String nombreEstado;
    private int poblacion;
    private String continente;
    private String capital;

    public estado() {
    }

    public estado(String nombreEstado, int poblacion, String continente, String capital) {
        this.nombreEstado = nombreEstado;
        this.poblacion = poblacion;
        this.continente = continente;
        this.capital = capital;
    }
    
    
}
