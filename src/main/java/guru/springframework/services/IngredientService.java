package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;

import java.util.Set;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long anyLong, Long anyLong1);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
