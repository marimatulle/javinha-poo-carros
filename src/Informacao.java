public class Informacao {
    private int anoFabricacao;
    private String cor;
    private String marca;
    private int velocidadeMaxima;

    public Informacao(int anoFabricacao, String cor, String marca, int velocidadeMaxima) {
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
