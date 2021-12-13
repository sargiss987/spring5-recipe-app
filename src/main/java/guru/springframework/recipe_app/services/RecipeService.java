package guru.springframework.recipe_app.services;


import guru.springframework.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
