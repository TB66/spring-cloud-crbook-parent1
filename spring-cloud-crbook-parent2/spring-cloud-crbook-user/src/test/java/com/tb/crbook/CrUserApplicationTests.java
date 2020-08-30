package com.tb.crbook;


import com.tb.crbook.bean.User;
import com.tb.crbook.bean.UserExample;
import com.tb.crbook.dao.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CrUserApplicationTests{
    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        UserExample ue=new UserExample();
        ue.createCriteria().andAccountEqualTo("admin").andPwdEqualTo("111");
        List<User> list=userMapper.selectByExample(ue);
        Assert.assertEquals(1,list.size());
    }

}
