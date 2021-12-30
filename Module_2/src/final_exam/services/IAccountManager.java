package final_exam.services;

import java.util.List;

public interface IAccountManager<T> {
    void getAll();
    List<T> search();

    void add();

    void delete();
}
