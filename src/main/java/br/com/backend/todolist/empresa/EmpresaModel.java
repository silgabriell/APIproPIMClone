package br.com.backend.todolist.empresa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Empresas")
public class EmpresaModel {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_empresa", nullable = false)
    private int codigo_empresa;

    @Column(name = "cnpj", nullable = false)
    private String cnpj;
    @Column(name = "Inscricao_estadual", nullable = false)
    private String Inscricao_estadual;
    @Column(name = "Nome", nullable = false)
    private String Nome;
    @Column(name = "rua", nullable = false)
    private String rua;
    @Column(name = "cep", nullable = false)
    private String cidade;
    @Column(name = "numero", nullable = false)
    private Integer numero;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "telefone", nullable = false)
    private String telefone;
    @Column(name = "Nome_responsavel", nullable = false)
    private String Nome_responsavel;
}
