package br.com.fiap.cp02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fiap.cp02.entity.Usuario;
import br.com.fiap.cp02.model.Credencial;
import br.com.fiap.cp02.model.LoginResponse;
import br.com.fiap.cp02.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
    private UsuarioRepository userRepository;
	
	@Autowired
    AuthenticationManager manager;

    @Autowired
    PasswordEncoder encoder;
	
    @Autowired
    TokenService tokenService;
	
    public LoginResponse logar(Credencial credencial) {
    	LoginResponse login = new LoginResponse();
        manager.authenticate(credencial.toAuthentication());
        login.setToken(tokenService.generateToken(credencial));
		return login;
    }
    
    public Usuario registrar(Usuario user){
    	user.setPassword(encoder.encode(user.getPassword()));
    	userRepository.save(user);
    	user.setId(userRepository.findByUsername(user.getUsername()).getId());
    	return user;
    }
}