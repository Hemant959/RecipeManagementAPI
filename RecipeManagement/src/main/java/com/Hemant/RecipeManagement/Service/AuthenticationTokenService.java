package com.Hemant.RecipeManagement.Service;

import com.Hemant.RecipeManagement.Repo.IAuthenticationTokenRepo;
import com.Hemant.RecipeManagement.model.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {
    @Autowired
    IAuthenticationTokenRepo iAuthenticationTokenRepo;
    public void createToken(AuthenticationToken token) {
        iAuthenticationTokenRepo.save(token);
    }
}
