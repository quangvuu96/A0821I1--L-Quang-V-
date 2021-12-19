package case_study.services;

import java.util.List;
import java.util.Optional;

public interface Service<T> {
    void save(T t);
    List<T> getAll();
    void delete(int id);
    Optional<T> get(int id);
}
