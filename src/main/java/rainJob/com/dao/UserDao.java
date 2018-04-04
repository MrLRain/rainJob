package rainJob.com.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rainJob.com.entity.User;

@Repository
@Transactional
public interface UserDao extends BaseRepository<User> {

}
