public class Carro {
        public static void main(String[] args) throws Exception {
                Instanciar Carro1 = new Instanciar("verde", "1.6", "automático", "123");
                Instanciar Carro2 = new Instanciar("branco", "1.0", "manual", "456");
                Instanciar Carro3 = new Instanciar("preto", "1.3", "manual", "789");

                Informacao info1 = new Informacao(2001, Carro1.getCor(), "Escort", 122);
                Informacao info2 = new Informacao(2004, Carro2.getCor(), "Palio", 111);
                Informacao info3 = new Informacao(2003, Carro3.getCor(), "Gol", 113);

                Comportamentos comport = new Comportamentos();

                Partes partes1 = new Partes(Carro1.getMotor(), Carro1.getCambio(), Carro1.getChassis(), "couro");
                Partes partes2 = new Partes(Carro2.getMotor(), Carro2.getCambio(), Carro2.getChassis(), "bege");
                Partes partes3 = new Partes(Carro3.getMotor(), Carro3.getCambio(), Carro3.getChassis(), "preto");

                System.out.println("Carro 1: \n" +
                                "Ano de Fabricação: " + info1.getAnoFabricacao() + "\n" +
                                "Cor: " + Carro1.getCor() + "\n" +
                                "Marca: " + info1.getMarca() + "\n" +
                                "Velocidade Máxima: " + info1.getVelocidadeMaxima() + " km/h");

                System.out.println("\nCarro 2: \n" +
                                "Ano de Fabricação: " + info2.getAnoFabricacao() + "\n" +
                                "Cor: " + Carro2.getCor() + "\n" +
                                "Marca: " + info2.getMarca() + "\n" +
                                "Velocidade Máxima: " + info2.getVelocidadeMaxima() + " km/h");

                System.out.println("\nigCarro 3: \n" +
                                "Ano de Fabricação: " + info3.getAnoFabricacao() + "\n" +
                                "Cor: " + Carro3.getCor() + "\n" +
                                "Marca: " + info3.getMarca() + "\n" +
                                "Velocidade Máxima: " + info3.getVelocidadeMaxima() + " km/h");
        }
}
