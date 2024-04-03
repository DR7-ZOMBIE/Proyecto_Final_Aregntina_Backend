package com.Alquiler.Alquiler_Vehiculo.dto;

import com.Alquiler.Alquiler_Vehiculo.model.Categoria;
import com.Alquiler.Alquiler_Vehiculo.model.Reserva;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VehiculoDTO {
@JsonIgnore
    private Long ID;
    private String marca;
    private String modelo;
    @JsonIgnore
    private String codigoSerial;
    private String serialMotor;
    private String color;
    private LocalDate year;
    private String matricula;
    @JsonIgnore
    private String placa;
    private Boolean isDisponible;
    private String observacion;
    private String descripcion;
@JsonIgnore
    private Categoria categoria;
    @JsonIgnore
    private Reserva reservas;

}
