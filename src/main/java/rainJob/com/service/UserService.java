package rainJob.com.service;

import org.springframework.stereotype.Service;
import rainJob.com.dao.BaseRepository;
import rainJob.com.dao.UserDao;
import rainJob.com.entity.User;
import rainJob.com.util.supper.BaseService;

import javax.annotation.Resource;

/**
 * @Author: xiaoyu
 * @Date: 11:36 2018/3/30
 * @Description:
 * @ModifyBy:
 */
@Service
public class UserService extends BaseService<User,UserDao> {
    @Resource
    private UserDao userDao;

    @Override
    public UserDao getDao() {
        return userDao;
    }
}
