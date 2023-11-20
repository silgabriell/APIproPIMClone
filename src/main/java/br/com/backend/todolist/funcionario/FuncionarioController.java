package br.com.backend.todolist.funcionario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private IFuncionarioRepository funcionarioRepository;

    @GetMapping("/")
    public List<FuncionarioModel> list() {        
        List<FuncionarioModel> funcionarios = this.funcionarioRepository.findAll();
        return funcionarios;
    }
       
}
