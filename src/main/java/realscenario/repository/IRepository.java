package realscenario.repository;

public interface IRepository<T> {
    T save(T entity);
}
