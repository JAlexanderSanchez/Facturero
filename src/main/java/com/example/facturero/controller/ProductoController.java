package com.example.facturero.controller;

import com.example.facturero.model.Producto;
import com.example.facturero.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoController {
    @Autowired
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getProductos() {
        return productoService.getAllProductos();
    }

    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.createProducto(producto);
    }

    @PutMapping
    public Producto updateProducto(@RequestBody Producto producto) {
        return productoService.updateProducto(producto);
    }

    @DeleteMapping(path = "{id}")
    public void deleteProducto(@PathVariable("id") long id) {
        productoService.deleteProductoById(id);
    }
}
