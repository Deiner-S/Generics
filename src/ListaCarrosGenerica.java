import java.util.ArrayList;
import java.util.List;

public class ListaCarrosGenerica<T>{

    private List<T> carros;

    public ListaCarrosGenerica() {
        carros = new ArrayList<>();
    }


    public void inserir(T carro) {
        this.carros.add(carro);

    }

    public void exibirCarros() {
        this.carros.forEach(System.out::println);
    }
}
