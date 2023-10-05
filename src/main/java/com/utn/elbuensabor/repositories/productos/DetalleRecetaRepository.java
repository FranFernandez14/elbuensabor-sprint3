package com.utn.elbuensabor.repositories.productos;

import com.utn.elbuensabor.entities.productos.DetalleReceta;
import com.utn.elbuensabor.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRecetaRepository extends BaseRepository<DetalleReceta, Long> {
}
