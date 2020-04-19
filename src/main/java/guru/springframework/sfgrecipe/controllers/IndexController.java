package guru.springframework.sfgrecipe.controllers;

import guru.springframework.sfgrecipe.domain.Category;
import guru.springframework.sfgrecipe.domain.UnitOfMeasure;
import guru.springframework.sfgrecipe.repositories.CategoryRepository;
import guru.springframework.sfgrecipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String getIndexPage() {

		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");

		System.out.println("Category: " + categoryOptional.get().getDescription());
		System.out.println("UnitOfMeasure: " + unitOfMeasure.get().getDescription());

		return "index";
	}
}
