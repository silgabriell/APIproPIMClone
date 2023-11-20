package br.com.backend.todolist.holerite;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/holerite")
public class HoleriteController {

    @Autowired
    private IHoleriteRepository holeriteRepository;

    @GetMapping("/")
    public List<HoleriteModel> list(HttpServletRequest httpServletRequest) {        
        List<HoleriteModel> holerite = this.holeriteRepository.findAll();
        return holerite;
    }
       
}
