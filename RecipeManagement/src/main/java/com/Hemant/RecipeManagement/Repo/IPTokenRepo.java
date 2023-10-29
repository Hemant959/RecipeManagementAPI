package com.Hemant.RecipeManagement.Repo;

import com.Hemant.RecipeManagement.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPTokenRepo extends JpaRepository<AuthenticationToken,Long> {

}
