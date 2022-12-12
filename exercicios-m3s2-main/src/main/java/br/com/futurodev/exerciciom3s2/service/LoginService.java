package br.com.futurodev.exerciciom3s2.service;

import br.com.futurodev.exerciciom3s2.security.TokenService;
import br.com.futurodev.exerciciom3s2.security.dto.LoginDto;
import br.com.futurodev.exerciciom3s2.security.dto.TokenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired private AuthenticationManager authenticationManager;

    @Autowired private TokenService tokenService;

    public TokenDto gerarToken(LoginDto login) {
        Authentication auth = authenticationManager.authenticate(login.converter());
        return tokenService.gerarToken(auth);
    }

}
