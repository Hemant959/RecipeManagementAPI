package com.Hemant.RecipeManagement.Service;

import com.Hemant.RecipeManagement.Repo.IPTokenRepo;
import com.Hemant.RecipeManagement.model.AuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pTokenService {
    @Autowired
    IPTokenRepo ipTokenRepo;
    public  void createToken(AuthenticationToken token) {
        ipTokenRepo.save(token);
    }
}
