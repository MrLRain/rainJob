package rainJob.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rainJob.com.controller.vo.UserVo;
import rainJob.com.dao.BaseRepository;
import rainJob.com.dao.UserDao;
import rainJob.com.entity.User;
import rainJob.com.service.UserService;
import rainJob.com.util.SpringBeanFactory;
import rainJob.com.util.dozer.BeanMapper;
import rainJob.com.util.supper.BaseService;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController extends SpringBeanFactory<User, UserVo,UserDao> {

    @Autowired
    private UserService UserService;
    @Autowired
    private BeanMapper beanMapper;

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();

        }
    }
    @Override
    public BeanMapper getBeanMapper() {

        System.out.println();
        int i = 0;
        System.out.println("i = " + i);
        return beanMapper;
    }

    @Override
    public BaseService<User,UserDao> getService() {
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

    @GetMapping("/home")
    @ModelAttribute
    public String home(){
        return "home";
    }
}
