package com.sena.parqueadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDto {

	private Long idRegistro;
	private String placa;
	private Double valorCobrado;
	private long horasEstadia;
}
