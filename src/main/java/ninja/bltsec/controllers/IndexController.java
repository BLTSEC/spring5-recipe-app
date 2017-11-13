package ninja.bltsec.controllers;

import lombok.extern.slf4j.Slf4j;
import ninja.bltsec.models.Category;
import ninja.bltsec.models.UnitOfMeasure;
import ninja.bltsec.repositories.CategoryRepository;
import ninja.bltsec.repositories.UnitOfMeasureRepository;
import ninja.bltsec.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
