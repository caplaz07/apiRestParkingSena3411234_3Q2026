package com.sena.parqueadero.dto;

import com.sena.parqueadero.model.tipoVehiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class VehiculoDTO {
	private Long idVehiculo;
	@NotBlank(message = "La placa es obligatoria")
	@Pattern(regexp = "^[A-Za-z0-9 -]{3,10}$", message ="Formato de placa invalido")
	private String placa;
	@NotNull(message = "El tipo de vehículo es obligatorio")
	private tipoVehiculo tipo;
	private String marca;
	private String modelo;
}
