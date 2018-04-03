package rainJob.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rainJob.com.controller.vo.UserVo;
<<<<<<< HEAD
import rainJob.com.dao.BaseRepository;
import rainJob.com.entity.User;
import rainJob.com.service.UserService;
import rainJob.com.util.SpringBeanFactory;
import rainJob.com.util.dozer.BeanMapper;
import rainJob.com.util.supper.BaseService;
/**
 * @Author: xiaoyu
 * @Date: 11:36 2018/3/30
 * @Description:
 * @ModifyBy:
 */
@RestController
@RequestMapping("/user")
public class UserController extends SpringBeanFactory<User, UserVo,BaseRepository> {

    @Autowired
    private UserService UserService;
    @Autowired
    private BeanMapper beanMapper;
    @Override
    public BeanMapper getBeanMapper() {
        return beanMapper;
=======
import rainJob.com.dto.ResponseMessage;
import rainJob.com.service.UserService;
import rainJob.com.util.dozer.BeanMapper;

import javax.annotation.Resource;

public class UserController extends BaseController<UserVo> {

    @Resource
    UserService userService;


    @Override
    public ResponseMessage<UserVo> idList(String... ids) {
        ResponseMessage responseMessage = new ResponseMessage();
        return responseMessage.success(userService.findOne("1"));
>>>>>>> 43ed15514465f493ae6e479859a4ee069c75759c
    }

    @Override
    public BaseService<User,BaseRepository> getService() {
        return UserService;
    }

    @Override
    public Class getVClass() {
        return UserVo.class;
    }

    @Override
    public Class getTClass() {
        return User.class;
    }

    @GetMapping("/kill")
    public void showKill(){
        System.out.println("kill = " + "kill");
    }
}
