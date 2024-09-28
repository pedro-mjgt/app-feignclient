package pe.edu.cibertec.app_feignclient.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Product;

@FeignClient(name = "productClient", url = "https://fakestoreapi.com/")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product obtenerProductoXId(@PathVariable("id") Long id);

}
