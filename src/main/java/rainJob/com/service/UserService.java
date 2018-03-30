package rainJob.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rainJob.com.dao.BaseRepository;
import rainJob.com.entity.User;
import rainJob.com.util.supper.BaseService;
/**
 * @Author: xiaoyu
 * @Date: 11:36 2018/3/30
 * @Description:
 * @ModifyBy:
 */
@Service
public class UserService extends BaseService<User,BaseRepository> {
   @Autowired
   BaseRepository baseRepository;

    @Override
    public BaseRepository getDao() {
        return baseRepository;
    }
}
