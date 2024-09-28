package pe.edu.cibertec.app_feignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Product;
import pe.edu.cibertec.app_feignclient.service.ProductService;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/productos/{id}")
    public Product obtenerProductoXId(@PathVariable("id") Long id) {
        return productService.obtenerProductoXId(id);
    }

}
