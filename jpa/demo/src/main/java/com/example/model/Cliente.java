package com.example.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbCliente")
public class Cliente {

@Id  
private String  Cpf;            
private String  Nome;       
private String  Endereco1;     
private String  Endereco2;     
private String  Bairro;        
private String  Cidade;        
private String  Estado;        
private String  Cep;          
private String  Data_nascimento;  
private Byte    Idade;        
private String  Sexo;           
private Float   Limite_credito; 
private Float   Volume_compra;  
private Boolean Primeira_compra;
@ManyToOne
private Categoria categoria;

    public Cliente(String Cpf, String Nome, Categoria categoria) {
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.categoria = categoria;
    }

    public Cliente(String Cpf, String Nome, String Endereco1, String Endereco2, String Bairro, String Cidade, String Estado, String Cep, String Data_nascimento, Byte Idade, String Sexo, Float Limite_credito, Float Volume_compra, Boolean Primeira_compra) {
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.Endereco1 = Endereco1;
        this.Endereco2 = Endereco2;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Cep = Cep;
        this.Data_nascimento = Data_nascimento;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.Limite_credito = Limite_credito;
        this.Volume_compra = Volume_compra;
        this.Primeira_compra = Primeira_compra;
    }

    public String getCpf() {
        return this.Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco1() {
        return this.Endereco1;
    }

    public void setEndereco1(String Endereco1) {
        this.Endereco1 = Endereco1;
    }

    public String getEndereco2() {
        return this.Endereco2;
    }

    public void setEndereco2(String Endereco2) {
        this.Endereco2 = Endereco2;
    }

    public String getBairro() {
        return this.Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return this.Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return this.Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCep() {
        return this.Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getData_nascimento() {
        return this.Data_nascimento;
    }

    public void setData_nascimento(String Data_nascimento) {
        this.Data_nascimento = Data_nascimento;
    }

    public Byte getIdade() {
        return this.Idade;
    }

    public void setIdade(Byte Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Float getLimite_credito() {
        return this.Limite_credito;
    }

    public void setLimite_credito(Float Limite_credito) {
        this.Limite_credito = Limite_credito;
    }

    public Float getVolume_compra() {
        return this.Volume_compra;
    }

    public void setVolume_compra(Float Volume_compra) {
        this.Volume_compra = Volume_compra;
    }

    public Boolean isPrimeira_compra() {
        return this.Primeira_compra;
    }

    public Boolean getPrimeira_compra() {
        return this.Primeira_compra;
    }

    public void setPrimeira_compra(Boolean Primeira_compra) {
        this.Primeira_compra = Primeira_compra;
    }

   

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(Cpf, cliente.Cpf) && Objects.equals(Nome, cliente.Nome) && Objects.equals(Endereco1, cliente.Endereco1) && Objects.equals(Endereco2, cliente.Endereco2) && Objects.equals(Bairro, cliente.Bairro) && Objects.equals(Cidade, cliente.Cidade) && Objects.equals(Estado, cliente.Estado) && Objects.equals(Cep, cliente.Cep) && Objects.equals(Data_nascimento, cliente.Data_nascimento) && Idade == cliente.Idade && Objects.equals(Sexo, cliente.Sexo) && Limite_credito == cliente.Limite_credito && Volume_compra == cliente.Volume_compra && Primeira_compra == cliente.Primeira_compra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cpf, Nome, Endereco1, Endereco2, Bairro, Cidade, Estado, Cep, Data_nascimento, Idade, Sexo, Limite_credito, Volume_compra, Primeira_compra);
    }

    @Override
    public String toString() {
        return "{" +
            " Cpf='" + getCpf() + "'" +
            ", Nome='" + getNome() + "'" +
            ", Endereco1='" + getEndereco1() + "'" +
            ", Endereco2='" + getEndereco2() + "'" +
            ", Bairro='" + getBairro() + "'" +
            ", Cidade='" + getCidade() + "'" +
            ", Estado='" + getEstado() + "'" +
            ", Cep='" + getCep() + "'" +
            ", Data_nascimento='" + getData_nascimento() + "'" +
            ", Idade='" + getIdade() + "'" +
            ", Sexo='" + getSexo() + "'" +
            ", Limite_credito='" + getLimite_credito() + "'" +
            ", Volume_compra='" + getVolume_compra() + "'" +
            ", Primeira_compra='" + isPrimeira_compra() + "'" +
            "}";
    }
}       


