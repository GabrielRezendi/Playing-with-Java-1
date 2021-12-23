package br.com.alura.forum.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {

    private Long id; 
    private String titulo; 
    private String mensagem; 
    private LocalDateTime dataCriacao; 

    public TopicoDto(Topico topico){
        this.id = topico.getId(); 
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDto> converter(List<Topico> topico) {
        return topico.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

}