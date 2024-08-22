public class BMWFactory extends AbstractFactoryGenerica<BMW> {
    @Override
    public BMW recuperar() {
                return new BMW("BMW","IX","Branca");

    }
}
