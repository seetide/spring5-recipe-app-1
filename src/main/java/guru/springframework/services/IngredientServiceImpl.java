package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class IngredientServiceImpl implements IngredientService {


    private final RecipeRepository recipeRepository;

    public IngredientServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Ingredient> getIngredients(String recipeId) {
        Recipe recipe = recipeRepository.findById(Long.valueOf(recipeId)).orElse(null);
        if(recipe == null) throw new RuntimeException("No such recipe");

        Set<Ingredient> ingredients = recipe.getIngredients();
        return ingredients;
    }

    @Override
    public Ingredient findById(Long id) {
        return null;
    }

    @Override
    public IngredientCommand findByRecipeIdAndId(long anyLong, long anyLong1) {
        return null;
    }
}
