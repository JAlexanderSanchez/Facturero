package com.example.facturero.service;

import com.example.facturero.model.Factura;
import com.example.facturero.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {
    private final FacturaRepository facturaRepository;

    @Autowired
    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public List<Factura> getAllFacturas() {
        return facturaRepository.findAll();
    }

    public Factura createFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Factura updateFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void deleteFacturaById(Long id) {
        facturaRepository.deleteById(id);
    }
}
