package br.senac.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Target;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder


@Entity(name = "cliente")
public class Cliente {


    @Id
    private String nome;
    private String nomeSocial;
    private String CPF;
    private String endereco;
    private String email;
    private String tipo;


}
