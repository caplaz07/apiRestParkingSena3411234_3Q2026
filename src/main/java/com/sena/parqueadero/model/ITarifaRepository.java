package com.sena.parqueadero.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITarifaRepository extends JpaRepository<Tarifa, Long>{
	
	Optional<Tarifa> findByTipoVehiculo(tipoVehiculo tipoVehiculo);

}
