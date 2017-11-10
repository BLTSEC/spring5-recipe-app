package ninja.bltsec.services;

import ninja.bltsec.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
