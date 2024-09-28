package pe.edu.cibertec.app_feignclient.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Libro;

import java.util.List;

@FeignClient(name = "libroClient", url = "http://localhost:8097/libreria")
public interface LibroClient {

    @GetMapping("/libro")
    List<Libro> obtenerLibros();

}
