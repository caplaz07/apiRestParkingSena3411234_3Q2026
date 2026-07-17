package com.sena.parqueadero.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parqueadero.model.Registros;
import com.sena.parqueadero.model.tipoVehiculo;

public interface IRegistroRepository extends JpaRepository<Registros, Long> {
Optional<Registros> findByVehiculoPlacaAndActivoTrue(String placa);

List<Registros> findByActivoTrue();

boolean existsByVehiculoIdVehiculo(long vehiculoId);

boolean existsByVehiculoTipo(tipoVehiculo tipoVehiculo);

}
