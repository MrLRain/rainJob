package rainJob.com.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService<T> implements CrudRepository<T, String> {

}
