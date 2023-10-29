package com.Hemant.RecipeManagement.Controller;

import com.Hemant.RecipeManagement.Service.AuthenticationTokenService;
import com.Hemant.RecipeManagement.Service.UserService;
import com.Hemant.RecipeManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
public class userController {
    @Autowired
    UserService userService;
    @Autowired
    AuthenticationTokenService authenticationTokenService;
    @PostMapping("user/signUp")
    public String userSignUp(@RequestBody User newUser){
        return userService.userSignUp(newUser);
    }
    @PostMapping("user/signIn")
    public String userSignIn(@RequestParam String userName, @RequestParam String userPassword ){
        return userService.userSignIn(userName,userPassword);
    }
}
