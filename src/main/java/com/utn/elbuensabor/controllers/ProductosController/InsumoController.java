package com.utn.elbuensabor.controllers.ProductosController;

import com.utn.elbuensabor.controllers.BaseControllerImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.utn.elbuensabor.entities.productos.Insumo;
import com.utn.elbuensabor.services.productos.InsumoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/insumo")
public class InsumoController extends BaseControllerImpl<Insumo,InsumoServiceImpl> {

    @GetMapping("/getSotckBajo")
    public ResponseEntity<?> search(@RequestParam Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.getStockBajo(pageable));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

}