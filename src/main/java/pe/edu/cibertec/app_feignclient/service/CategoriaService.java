package pe.edu.cibertec.app_feignclient.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_feignclient.client.placeholder.iclientservice.CategoriaClient;
import pe.edu.cibertec.app_feignclient.client.placeholder.model.Categoria;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoriaService {

    private final CategoriaClient categoriaClient;

    public List<Categoria> obtenerCategorias() {
        return categoriaClient.obtenerCategorias();
    }

}
