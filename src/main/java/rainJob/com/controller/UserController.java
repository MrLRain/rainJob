package rainJob.com.controller;


import rainJob.com.controller.vo.UserVo;
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
    }

    @Override
    public ResponseMessage<UserVo> pageList(UserVo vo) {
        return null;
    }

    @Override
    public ResponseMessage<UserVo> saveData(UserVo vo) {
        return null;
    }

    @Override
    public ResponseMessage<UserVo> updateData(UserVo vo) {
        return null;
    }

    @Override
    public ResponseMessage<UserVo> deleteData(UserVo vo) {
        return null;
    }
}
