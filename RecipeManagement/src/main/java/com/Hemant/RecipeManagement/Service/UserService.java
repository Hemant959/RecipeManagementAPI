package com.Hemant.RecipeManagement.Service;

import com.Hemant.RecipeManagement.Repo.IUserRepo;
import com.Hemant.RecipeManagement.Service.hashingUtility.passwordEncryptor;
import com.Hemant.RecipeManagement.model.AuthenticationToken;
import com.Hemant.RecipeManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    pTokenService pTokenService;

    public String userSignUp(User newUser) {
        String name = newUser.getUserName();
        User existingUser = iUserRepo.findFirstByUserName(name);
        if (existingUser != null) {
            return "user Already exist.";
        }
        String signUpPassword = newUser.getPassword();
        try {
            String encryptedPassword = passwordEncryptor.encrypt(signUpPassword);

            newUser.setPassword(encryptedPassword);

            // patient table - save User
            iUserRepo.save(newUser);
            return "user registered";

        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }
    }

    public String userSignIn(String userName, String userPassword) {
        User existingUser = iUserRepo.findFirstByUserName(userName);

        if(existingUser == null){
            return "Not a valid Name, Please sign up first !!!";
        }
        try {
            String encryptedPassword = passwordEncryptor.encrypt(userPassword);

            if(existingUser.getPassword().equals(encryptedPassword)){
                // return a token for this sign in
                AuthenticationToken token  = new AuthenticationToken(existingUser);
                pTokenService.createToken(token);
                return "logged in";
            }else{
                //password was wrong!!!
                return "Invalid Credentials!!!";
            }
        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }

    }
}

