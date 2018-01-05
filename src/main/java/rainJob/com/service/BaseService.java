package rainJob.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import rainJob.com.dao.BaseDao;

@Service
public abstract class BaseService<D extends BaseDao,T> implements  CrudRepository<T,String> {

//    @Autowired
//    protected D dao;

}
