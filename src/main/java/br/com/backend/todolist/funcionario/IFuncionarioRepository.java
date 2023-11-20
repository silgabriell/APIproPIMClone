package br.com.backend.todolist.funcionario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IFuncionarioRepository extends JpaRepository<FuncionarioModel, Integer>{
    
}
