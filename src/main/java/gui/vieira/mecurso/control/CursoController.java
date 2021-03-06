
package gui.vieira.mecurso.control;

import gui.vieira.mecurso.dto.CursoDto;
import gui.vieira.mecurso.entity.Curso;
import gui.vieira.mecurso.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {
    
    @Autowired
    private CursoRepository cursoRepository;
    
    @GetMapping
    public List<CursoDto> listar(){
        List<Curso> cursos = (List<Curso>)cursoRepository.findAll();
        return CursoDto.converter(cursos);
    }
    
    
    
}
