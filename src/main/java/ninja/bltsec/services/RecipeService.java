package ninja.bltsec.services;

import ninja.bltsec.commands.RecipeCommand;
import ninja.bltsec.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
