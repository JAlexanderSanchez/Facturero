package com.example.facturero.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFactura;
    private String fecha;
    private double total;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private long idUsuario; // Foreign key reference to Usuario

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<DetalleFactura> detalles;
}
