package br.com.backend.todolist.user;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserModel, Integer>{

    UserModel findByLogin(String username);

    List<UserModel> findByCodUsuario(int codUsuario);

}
