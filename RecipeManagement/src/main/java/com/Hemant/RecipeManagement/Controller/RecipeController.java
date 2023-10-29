package com.Hemant.RecipeManagement.Controller;

import com.Hemant.RecipeManagement.Repo.ICommentRepo;
import com.Hemant.RecipeManagement.Service.CommentService;
import com.Hemant.RecipeManagement.Service.RecipeService;
import com.Hemant.RecipeManagement.model.Comment;
import com.Hemant.RecipeManagement.model.Recipe;
import com.Hemant.RecipeManagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;
    @Autowired
    CommentService commentService;
    @Autowired
    ICommentRepo iCommentRepo;
    @PostMapping("Create/Recipe")
    public String addRecipe(@RequestBody Recipe newRecipe){
        return recipeService.addRecipe(newRecipe);
    }
    @GetMapping("Get/Recipe")
    public List<Recipe> getRecipeList(){
       return recipeService.getRecipeList();
    }
    @PutMapping("update/Recipe")
    public String updateRecipe(@RequestParam String name,@RequestParam Long id,@RequestParam String userName){
        return recipeService.updateRecipe(name,id,userName);
    }
    @DeleteMapping("delete/Recipe")
    public String deleteRecipeById(@RequestParam Long id){
        return recipeService.deleteRecipeById(id);
    }

    @PostMapping("AddComment/recipe")
    public String addCommentToRecipe(@RequestBody Comment newComment,@RequestParam String userName){
        return recipeService.addCommentToRecipe(newComment,userName);
    }
}
