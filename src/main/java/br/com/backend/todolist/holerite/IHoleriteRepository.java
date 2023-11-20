package br.com.backend.todolist.holerite;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IHoleriteRepository extends JpaRepository<HoleriteModel, Integer>{
    
}
