public class AudiFactory extends AbstractFactoryGenerica<Audi> {
    @Override
    public Audi recuperar() {
        return new Audi("Audi","TTRs","Azul");
    }
}
