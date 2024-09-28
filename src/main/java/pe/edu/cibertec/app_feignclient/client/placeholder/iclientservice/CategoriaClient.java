package pe.edu.cibertec.app_feignclient.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Categoria;

import java.util.List;

@FeignClient(name = "categoriaClient", url = "http://localhost:8098/tiendita")
public interface CategoriaClient {

    @GetMapping("/categoria")
    List<Categoria> obtenerCategorias();

}
