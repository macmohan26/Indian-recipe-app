package sonu.springframework.indianrecipeapp.services;


import sonu.springframework.indianrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}