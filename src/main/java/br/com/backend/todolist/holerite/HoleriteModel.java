package br.com.backend.todolist.holerite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Holerite")
public class HoleriteModel {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_FOLHA", nullable = false)
    private int codFolha;

    @Column(name = "COD_EMPRESA", nullable = false)
    private int cod_empresa;
    @Column(name = "COD_FUNCIONARIO", nullable = false)
    private int cod_funcionario;
    @Column(name = "SALARIO")
    private String salario;
    @Column(name = "VALORPROVENTOS")
    private String valor_proventos;
    @Column(name = "VALORDESCONTOS")
    private String valor_descontos;
    @Column(name = "VALORLIQUIDO")
    private String valor_liquido;
    @Column(name = "FAIXAIRRF")
    private String faixa_irrf;
    @Column(name = "FGTSMES")
    private String fgtsmes;
    @Column(name = "MENSAGEM")
    private String mensagem;
}
