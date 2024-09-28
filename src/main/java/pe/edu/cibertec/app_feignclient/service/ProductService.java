package pe.edu.cibertec.app_feignclient.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_feignclient.client.placeholder.iclientservice.ProductClient;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Product;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductClient productClient;

    public Product obtenerProductoXId(Long id) {
        return productClient.obtenerProductoXId(id);
    }

}
