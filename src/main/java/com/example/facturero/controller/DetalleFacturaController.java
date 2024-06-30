package com.example.facturero.controller;

import com.example.facturero.model.DetalleFactura;
import com.example.facturero.service.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/detallefactura")
public class DetalleFacturaController {
    @Autowired
    private final DetalleFacturaService detalleFacturaService;

    public DetalleFacturaController(DetalleFacturaService detalleFacturaService) {
        this.detalleFacturaService = detalleFacturaService;
    }

    @GetMapping
    public List<DetalleFactura> getDetalleFacturas() {
        return detalleFacturaService.getAllDetalleFacturas();
    }

    @PostMapping
    public DetalleFactura crearDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
        return detalleFacturaService.createDetalleFactura(detalleFactura);
    }

    @PutMapping
    public DetalleFactura updateDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
        return detalleFacturaService.updateDetalleFactura(detalleFactura);
    }

    @DeleteMapping(path = "{id}")
    public void deleteDetalleFactura(@PathVariable("id") long id) {
        detalleFacturaService.deleteDetalleFacturaById(id);
    }
}
