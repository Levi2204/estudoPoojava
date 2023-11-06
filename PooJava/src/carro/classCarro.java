package carro;

public class classCarro {
    String marca;
    String modelo;
    int ano;

    public classCarro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void acelerar (){
        System.out.printf("O carro do modelo %s está acelerando %n", this.modelo);
    }
    public void frear () {
        System.out.printf("O carro do modelo %s está freando %n", this.modelo);
    }
}
