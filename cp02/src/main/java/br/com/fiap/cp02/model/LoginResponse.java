package br.com.fiap.cp02.model;

public class LoginResponse {
	
    private TokenJwt token;

    public LoginResponse () {}

    public LoginResponse(TokenJwt token) {
        this.token = token;
    }
    
    public TokenJwt getToken() {
        return token;
    }
    
    public void setToken(TokenJwt token) {
        this.token = token;
    }
}