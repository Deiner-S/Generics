public class Audi {
        private String marca;
        private String modelo;
        private String cor;



    public Audi(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
