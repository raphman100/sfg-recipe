package guru.springframework.sfgrecipe.services;

import guru.springframework.sfgrecipe.commands.RecipeCommand;
import guru.springframework.sfgrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

	Set<Recipe> getRecipes();
	Recipe findById(Long l);
	RecipeCommand findCommandById(Long l);
	RecipeCommand saveRecipeCommand(RecipeCommand command);
}
