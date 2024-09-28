package pe.edu.cibertec.app_feignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Categoria;
import pe.edu.cibertec.app_feignclient.service.CategoriaService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping("/categorias")
    public List<Categoria> obtenerCategorias() {
        return categoriaService.obtenerCategorias();
    }

}
