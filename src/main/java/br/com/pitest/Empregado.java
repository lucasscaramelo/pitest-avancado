package br.com.pitest;

public class Empregado {
    private String nome;
    private String cargo;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empregado(String nome, String cargo, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String introducao() {
        if (nome != "") {
            return (String.format("Olá! Meu nome é %s e meu cargo é s%.", getNome(), getCargo()));
        } else {
            return "Empregado sem nome";
        }
    }

    public void darAumento(float porcento) {
        salario += (salario * porcento / 100);
    }
}
