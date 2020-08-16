package guru.springframework.sfgrecipe.services;

import guru.springframework.sfgrecipe.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
	Set<UnitOfMeasureCommand> listAllUoms();
}
