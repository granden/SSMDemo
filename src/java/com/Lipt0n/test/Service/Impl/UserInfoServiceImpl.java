package com.Lipt0n.test.Service.Impl;

import com.Lipt0n.test.Beans.*;
import com.Lipt0n.test.Mapper.UserInfoMapper;
import com.Lipt0n.test.Service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
//@Component
public class UserInfoServiceImpl implements UserInfoService {


    /*https://blog.csdn.net/qq125293177/article/details/52839506
    *
    * Service层：引用对应的Dao数据库操作，在这里可以编写自己需要的代码（比如简单的判断）。
    * service层是调用各种dao的业务操作，比如你有一个业务是 添加，然后修改。
    * 那么你分别调用dao的添加和修改操作，包括里面的一些数据转换，逻辑判断都放到service层，
    * dao只是单纯的增删改查。 而且事务一般会放到service层。
    * 其中Service层和DAO层由于可能都会对数据库进行操作，其具体区别为：

    dao和service对应

    一般情况下,Hibernate DAO只操作一个POJO对象，因此一个DAO对应一个POJO对象。
     Service层是为了处理包含多个POJO对象（即对多个表的数据操作）时，进行事务管理
     （声明式事务管理）。Service层（其接口的实现类）被注入多个DAO对象，以完成其数据操作。
    * */
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int insertUser(UserData userData) {
        return userInfoMapper.insertUser(userData);
    }


}
