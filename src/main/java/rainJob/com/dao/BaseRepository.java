package rainJob.com.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rainJob.com.entity.User;

import java.util.Date;
import java.util.List;
@Repository
@Transactional
public interface BaseRepository extends JpaRepository<User, String> {
    @Override
    List<User> findAll();

    @Override
    List<User> findAll(Sort sort);

    @Override
    List<User> findAll(Iterable<String> iterable);

    @Override
    <S extends User> List<S> save(Iterable<S> iterable);

    @Override
    void flush();

    @Override
    <S extends User> S saveAndFlush(S s);

    @Override
    void deleteInBatch(Iterable<User> iterable);

    @Override
    void deleteAllInBatch();

    @Override
    User getOne(String s);

    @Override
    <S extends User> List<S> findAll(Example<S> example);

    @Override
    <S extends User> List<S> findAll(Example<S> example, Sort sort);
}

