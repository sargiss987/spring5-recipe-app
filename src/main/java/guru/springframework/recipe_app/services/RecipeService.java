package guru.springframework.recipe_app.services;


import guru.springframework.recipe_app.commands.RecipeCommand;
import guru.springframework.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(long anyLong);
}


