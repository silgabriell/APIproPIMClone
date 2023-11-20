package br.com.backend.todolist.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/")
    public List<UserModel> list(HttpServletRequest httpServletRequest) {
        List<UserModel> usuario = this.userRepository.findAll();
        return usuario;
    }

    @GetMapping("/{id}")
    public UserModel list(HttpServletRequest httpServletRequest, @PathVariable Integer id) {
        
        var usuario = this.userRepository.findById(id).orElse(null);
        if (usuario == null){            
            return null;
        }

        return usuario;
    }

}
       

