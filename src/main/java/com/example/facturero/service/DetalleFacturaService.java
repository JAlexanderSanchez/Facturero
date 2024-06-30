package com.example.facturero.service;

import com.example.facturero.model.DetalleFactura;
import com.example.facturero.repository.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaService {
    private final DetalleFacturaRepository detalleFacturaRepository;

    @Autowired
    public DetalleFacturaService(DetalleFacturaRepository detalleFacturaRepository) {
        this.detalleFacturaRepository = detalleFacturaRepository;
    }

    public List<DetalleFactura> getAllDetalleFacturas() {
        return detalleFacturaRepository.findAll();
    }

    public DetalleFactura createDetalleFactura(DetalleFactura detalleFactura) {
        return detalleFacturaRepository.save(detalleFactura);
    }

    public DetalleFactura updateDetalleFactura(DetalleFactura detalleFactura) {
        return detalleFacturaRepository.save(detalleFactura);
    }

    public void deleteDetalleFacturaById(Long id) {
        detalleFacturaRepository.deleteById(id);
    }
}
