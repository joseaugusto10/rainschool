package br.com.rainschool.recursos;

import br.com.rainschool.entidades.Usuarios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoUsuario {
    @GetMapping
    public ResponseEntity<Usuarios> findAll() {
        Usuarios usuarios = new Usuarios(1,"Maria","maria@gmail.com","99999","1234");
        return ResponseEntity.ok(usuarios);
    }

}
