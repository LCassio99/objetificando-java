package br.com.lcassio;

//Classe representante do objeto
public class Moto {

    private String modelo;
    private String cor;
    private int ano;

    //construtor
    public Moto(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    //Obtém modelo
    public String getModelo() {
        return modelo;
    }

    //Define modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Obtém cor
    public String getCor() {
        return cor;
    }

    //Define cor
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Obtém ano
    public int getAno() {
        return ano;
    }

    //Define ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    //Método que imprime as informações da moto
    public void exibeinfo() {
        System.out.println("Modelo:" + modelo);
        System.out.println("Cor:" + cor);
        System.out.println("Ano:" + ano);
        System.out.println();

    }

    //Método que imprime a moto ligando
    public void ligarMoto() {
        System.out.println("Randandan");
    }

    //Método que imprime a moto desligando
    public void desligarMoto() {
        System.out.println("Que tal botar gasolina?");
    }

    public static void main(String args[]) {
        //Criação do objeto
        Moto minhaMoto = new Moto("Phoenix", "Vermelha", 2011);

        //Exibindo as informações
        minhaMoto.exibeinfo();

        //Ligando a moto
        minhaMoto.ligarMoto();

        //Desligando a moto
        minhaMoto.desligarMoto();
    }

}
