package rainJob.com.service;

import rainJob.com.controller.vo.UserVo;
import rainJob.com.dao.UserDao;
import rainJob.com.util.dozer.BeanMapper;

import javax.annotation.Resource;

public class UserService extends BaseService<UserVo> {

    @Resource
    UserDao userDao;

    @Resource
    BeanMapper beanMapper;


    @Override
    public <S extends UserVo> S save(S s) {
        Object save = userDao.save(s);
        UserVo map = beanMapper.map(save, UserVo.class);
        return (S) map;
    }

    @Override
    public <S extends UserVo> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public rainJob.com.controller.vo.UserVo findOne(String id) {
        return beanMapper.map(userDao.findOne(id), rainJob.com.controller.vo.UserVo.class);
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Iterable<rainJob.com.controller.vo.UserVo> findAll() {
        return null;
    }

    @Override
    public Iterable<rainJob.com.controller.vo.UserVo> findAll(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(rainJob.com.controller.vo.UserVo userVo) {

    }

    @Override
    public void delete(Iterable<? extends rainJob.com.controller.vo.UserVo> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
