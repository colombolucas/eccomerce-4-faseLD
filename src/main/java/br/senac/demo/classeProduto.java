package br.senac.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Builder
@Entity(name="Produto")
public class classeProduto {


    private String descricaoProd;
    private String categoria;
    private double valor;
    private int peso;

    }

