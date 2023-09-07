package economia.metaphorce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import economia.metaphorce.interfaceService.ITareaService;
import economia.metaphorce.interfaces.ITarea;
import economia.metaphorce.model.Tarea;

@Service
public class TareaService implements ITareaService{
	
	@Autowired
	private ITarea data;
	
	@Override
	public List<Tarea> listar() {
		return (List<Tarea>)data.findAll();
	}

	@Override
	public Optional<Tarea> listarId(int id) {
		return data.findById(id);
	}
	

	@Override
	public int save(Tarea t) {
		int res = 0;
		Tarea tarea =  data.save(t);
		if (!tarea.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);		
	}
	

}
