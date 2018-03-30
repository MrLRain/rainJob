package rainJob.com.util.supper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public abstract class BaseService<T,dao extends JpaRepository<T,String>> implements  CrudRepository<T,String> {

    public abstract dao getDao();

    @Override
    public <S extends T> S save(S s) {
        return getDao().save(s);
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> iterable) {
        return getDao().save(iterable);
    }

    @Override
    public T findOne(String s) {
        return getDao().findOne(s);
    }

    @Override
    public boolean exists(String s) {
        return getDao().exists(s);
    }

    @Override
    public Iterable<T> findAll() {
        return getDao().findAll();
    }

    @Override
    public Iterable<T> findAll(Iterable<String> iterable) {
        return getDao().findAll(iterable);
    }

    @Override
    public long count() {
        return getDao().count();
    }

    @Override
    public void delete(String s) {
        getDao().delete(s);
    }

    @Override
    public void delete(T t) {
        getDao().delete(t);
    }

    @Override
    public void delete(Iterable<? extends T> iterable) {
        getDao().delete(iterable);
    }

    @Override
    public void deleteAll() {
        getDao().deleteAll();
    }
}
