package com.example.facturero.controller;

import com.example.facturero.model.Factura;
import com.example.facturero.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/factura")
public class FacturaController {
    @Autowired
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @GetMapping
    public List<Factura> getFacturas() {
        return facturaService.getAllFacturas();
    }

    @PostMapping
    public Factura crearFactura(@RequestBody Factura factura) {
        return facturaService.createFactura(factura);
    }

    @PutMapping
    public Factura updateFactura(@RequestBody Factura factura) {
        return facturaService.updateFactura(factura);
    }

    @DeleteMapping(path = "{id}")
    public void deleteFactura(@PathVariable("id") long id) {
        facturaService.deleteFacturaById(id);
    }
}
