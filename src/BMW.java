public class BMW {
    private String marca;
    private String modelo;
    private String cor;



    public BMW(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
