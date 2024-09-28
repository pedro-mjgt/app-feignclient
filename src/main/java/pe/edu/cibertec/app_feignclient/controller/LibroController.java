package pe.edu.cibertec.app_feignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Libro;
import pe.edu.cibertec.app_feignclient.service.LibroService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class LibroController {

    private final LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> obtenerLibros() {
        return libroService.obtenerLibros();
    }

}
