package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;

import java.util.Set;

public interface IngredientService {
    Set<Ingredient> getIngredients(String recipeId);

    Ingredient findById(Long id);

    IngredientCommand findByRecipeIdAndId(long anyLong, long anyLong1);
}
