package br.com.fiap.cp02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cp02.entity.Usuario;
import br.com.fiap.cp02.model.Credencial;
import br.com.fiap.cp02.model.LoginResponse;
import br.com.fiap.cp02.service.UsuarioService;

@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:19006")
@RestController
public class UsuarioController {

	@Autowired
    private UsuarioService usuarioService;
		
	@PostMapping("/registro")
    public ResponseEntity<Usuario> save(@RequestBody Usuario user){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.registrar(user));
    }
  
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> get(@RequestBody Credencial credencial) {
        return ResponseEntity.ok(usuarioService.logar(credencial));
    }
}