package com.example.facturero.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetalle;

    @ManyToOne
    @JoinColumn(name = "idFactura", nullable = false)
    private long idFactura; // Foreign key reference to Factura
    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private long idProducto; // Foreign key reference to Producto
    private int cantidad;
    private double subtotal;
}
