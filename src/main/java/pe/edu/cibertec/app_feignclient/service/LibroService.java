package pe.edu.cibertec.app_feignclient.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_feignclient.client.placeholder.iclientservice.LibroClient;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Libro;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LibroService {

    private final LibroClient libroClient;

    public List<Libro> obtenerLibros() {
        return libroClient.obtenerLibros();
    }

}
