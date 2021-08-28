package br.senac.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Builder


@Entity(name = "cliente")
public class Cliente {


    private String nome;
    private String nomeSocial;
    private String CPF;
    private String endereco;
    private String email;
    private String tipo;


}
