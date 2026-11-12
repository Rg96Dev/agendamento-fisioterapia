package com.clinica;

import java.time.LocalDateTime;
/*
* CLASSE (O Molde)
 * Aqui definimos o que é um Agendamento no nosso sistema.
 * Os atributos "private" garantem o Encapsulamento: os dados ficam protegidos 
 * e não podem ser alterados diretamente por outras partes do sistema.
*/
public class Agendamento {
    private LocalDateTime data;
    private String nomeCliente;
    private String telefone;
    private String servico;
    private String status;

/* 
* CONSTRUTOR (O Nascimento)
* É o método especial chamado toda vez que usamos "new Agendamento(...)".
* Ele obriga a informar os dados básicos para o agendamento existir.
* Note que o "status" não é pedido nos parâmetros, pois todo novo 
 * agendamento já nasce automaticamente como "AGENDADO".
 */
    public Agendamento(LocalDateTime data, String nomeCliente, String telefone, String servico) {
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.servico = servico;
        this.status = "AGENDADO";
    }

/* 
* GETTERS (Acesso para Leitura)
* Como os atributos são privados, usamos os métodos "get" 
* para permitir que o resto do sistema leia essas informações.
*/
    public LocalDateTime getData() {
        return this.data;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getServico() {
        return this.servico;
    }

    /* 
    * SETTERS (Acesso para Escrita/Alteração)
     * Métodos "set" permitem alterar os dados de um agendamento que já existe.
    */
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
/* */
    public String getStatus() {
        return this.status;
    }
}
