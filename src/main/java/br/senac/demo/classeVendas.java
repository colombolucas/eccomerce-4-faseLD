package br.senac.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Builder
@Entity(name="Vendas")

public class classeVendas {

    @Id
    private int Id;
    private String cliente;
    private String Produto;
    private int qtdProd;
    private String Obs;
    private String formaPagamento;
}
