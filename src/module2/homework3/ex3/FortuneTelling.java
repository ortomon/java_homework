package module2.homework3.ex3;

@FunctionalInterface
public interface FortuneTelling<T> {
    boolean predict(T t);
}
