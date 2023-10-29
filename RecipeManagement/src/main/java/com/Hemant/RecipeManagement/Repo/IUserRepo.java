package com.Hemant.RecipeManagement.Repo;

import com.Hemant.RecipeManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findFirstByUserName(String name);
}
