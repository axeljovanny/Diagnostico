package economia.metaphorce.interfaceService;

import java.util.List;
import java.util.Optional;

import economia.metaphorce.model.Tarea;

public interface ITareaService {

	public List<Tarea> listar();
	public Optional<Tarea> listarId(int id);
	public int save(Tarea t);
	public void delete(int id);
	 

}
