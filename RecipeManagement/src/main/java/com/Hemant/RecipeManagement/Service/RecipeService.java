package com.Hemant.RecipeManagement.Service;

import com.Hemant.RecipeManagement.Repo.ICommentRepo;
import com.Hemant.RecipeManagement.Repo.IRecipeRepo;
import com.Hemant.RecipeManagement.Repo.IUserRepo;
import com.Hemant.RecipeManagement.model.Comment;
import com.Hemant.RecipeManagement.model.Recipe;
import com.Hemant.RecipeManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeService {
    @Autowired
    IRecipeRepo iRecipeRepo;
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    ICommentRepo iCommentRepo;
    @Autowired
    AuthenticationTokenService authenticationTokenService;
    @Autowired
    CommentService commentService;

    public String addRecipe(Recipe newRecipe) {
        iRecipeRepo.save(newRecipe);
        return "Added";
    }

    public List<Recipe> getRecipeList() {
        return iRecipeRepo.findAll();
    }

    public String deleteRecipeById(Long id) {
        iRecipeRepo.deleteById(id);
        return "recipe deleted successfully";
    }

    public String updateRecipe(String name, Long id, String userName) {
        User user= iUserRepo.findFirstByUserName(userName);
        if(user != null){
            Recipe recipeInfo= iRecipeRepo.findById(id).get();
            recipeInfo.setName(name);
            iRecipeRepo.save(recipeInfo);
            return "Update";
        }
        return "Only owner can update";
    }

    public String addCommentToRecipe(Comment newComment, String userName) {
        User user= iUserRepo.findFirstByUserName(userName);
        if(user != null){
            iCommentRepo.save(newComment);
            return " comment  added";
        }
        return "User name  not found";
    }

}
