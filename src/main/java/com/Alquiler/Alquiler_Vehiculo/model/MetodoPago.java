package com.Alquiler.Alquiler_Vehiculo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metododepago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String nombreTitular;
    @Column (nullable = false)
    private String numeroDeTarjeta;
    @Column(nullable = false)
    private Integer cve;
    @Column(nullable = false)
    private Integer anioVencimiento;

    public MetodoPago(String nombreTitular, String numeroDeTarjeta,Integer cve, Integer anioVencimiento) {
        this.nombreTitular = nombreTitular;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.cve = cve;
        this.anioVencimiento = anioVencimiento;
    }
}