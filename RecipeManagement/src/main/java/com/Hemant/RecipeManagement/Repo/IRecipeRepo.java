package com.Hemant.RecipeManagement.Repo;

import com.Hemant.RecipeManagement.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecipeRepo extends JpaRepository<Recipe,Long> {

}
