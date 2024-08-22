//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaCarrosGenerica carros = new ListaCarrosGenerica();
        AbstractFactoryGenerica factory = factory("BMW");
        AbstractFactoryGenerica factory2 = factory("Audi");



        for (int i = 0; i < 10; i++) {
            carros.inserir(factory.criar());
            carros.inserir(factory2.criar());
        }

        carros.exibirCarros();

    }

    public static AbstractFactoryGenerica factory(String marca) {
        switch (marca) {
            case "Audi":
                return new AudiFactory();
                case "BMW":
                    return new BMWFactory();
            default: return null;
        }

    }

}