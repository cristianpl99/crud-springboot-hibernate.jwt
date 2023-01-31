package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cristian");
        usuario.setApellido("Pereyra");
        usuario.setEmail("cristianpl99@gmail.com");
        usuario.setTelefono("1124547100");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNombre("Cristian");
        usuario1.setApellido("Pereyra");
        usuario1.setEmail("cristianpl99@gmail.com");
        usuario1.setTelefono("1124547100");
        usuarios.add(usuario1);



        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Cristian");
        usuario2.setApellido("Pereyra");
        usuario2.setEmail("cristianpl99@gmail.com");
        usuario2.setTelefono("1124547100");
        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Cristian");
        usuario3.setApellido("Pereyra");
        usuario3.setEmail("cristianpl99@gmail.com");
        usuario3.setTelefono("1124547100");
        usuarios.add(usuario3);

    return usuarios;
    }

    @RequestMapping(value = "usuario44")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Pereyra");
        usuario.setEmail("cristianpl99@gmail.com");
        usuario.setTelefono("1124547100");
        return usuario;
    }

    @RequestMapping(value = "usuario33")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Pereyra");
        usuario.setEmail("cristianpl99@gmail.com");
        usuario.setTelefono("1124547100");
        return usuario;
    }

    @RequestMapping(value = "usuario22")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Pereyra");
        usuario.setEmail("cristianpl99@gmail.com");
        usuario.setTelefono("1124547100");
        return usuario;
    }
}
