public abstract class AbstractFactoryGenerica<T> {

    public T criar(){

        return recuperar();
    }

    public abstract T recuperar();

}
