# <h1 align = "center"> Recipe Managment API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project,  Recipe Management API," is a robust Spring Boot application designed for managing recipe data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting recipe information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 8
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency
- SQL DRIVER
- JPA
- SWAGGER
- sQL DATABASE
- OneToMany Mapping
- ManyToMany Mapping
- ManyToOne Mapping
- AWS

## Model Classes
- Recipe Entity :-The Recipe entity represents recipe record in your Spring Boot application. It is used to store information about a recipe description, including details such as name, description, ingredients, and . This entity is associated with the recipe entity through a one-to-Many relationship.
- User Entity :-The fields in the User entity represent specific attributes associated with an order in your Spring Boot application. These fields capture information about the user, name, password, and id for sign-in and sign-up.
- Comment Entity :-The fields in the Comment entity represent specific attributes associated with a user in your Spring Boot application. These fields capture information about the add comment to recipe.
## Controller Class
- User Controller :-The UserController is a Spring MVC controller class responsible for handling HTTP requests related to address operations in your Spring Boot application.
- Recipe Controller :-The RecipeController is a Spring MVC controller class responsible for handling HTTP requests related to order operations in your Spring Boot application.
## Service Class
- Comment Service :-The CommentService is a service class in your Spring Boot application responsible for handling comment-related operations. It includes the comment method, which allows you to add multiple comment to your recipe.
- User Service :-The UserService is a service class in your Spring Boot application responsible for handling signIn and signUP-related operations. It includes the signIn and signUp which allow you to retrieve all user and add new user to your system, respectively.
- Recipe Service :-The Recipe Service is a service class in your Spring Boot application responsible for handling recipe-related operations. It includes several methods for adding, retrieving, filtering, and deleting recipes.

<!-- Key Features -->
## Key Features
- user Sign_in.
- Get all Recipe.
- Get recipe Details By Id.
- Delete Recipe By Id.
- Update Recipe By Name.

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to CRUD Operation And Custom finder.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

#### Add recipe :
PostMethod :  http://localhost:8080/recipe
### UPdate recipe:
PutMapping : http://localhost:8080/recipeName/Id

### Delete  recipe:
DeleteMapping: http://localhost:8080/Delete/Id/


#### Get All recipe :
 - GET Method : http://localhost:8080/get

 

 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : HEMANT PATEL   -
- Maild Id : hemant959singh@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>
*  Project Recipe Management API.
