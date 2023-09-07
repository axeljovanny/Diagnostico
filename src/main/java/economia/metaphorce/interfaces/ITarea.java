package economia.metaphorce.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import economia.metaphorce.model.Tarea;

@Repository
public interface ITarea extends CrudRepository< Tarea, Integer> {

}

