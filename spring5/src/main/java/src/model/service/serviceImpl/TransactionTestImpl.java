package src.model.service.serviceImpl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import src.model.service.TransactionTest;

/**
 * 1.事务管理注解：@Transactional 该注解可以加在类上面，也可以加在方法上面
 * 2.加在类上面，表示这个类里面所有方法添加了事务管理
 * 3.加在方法上面，只方法添加了事务
 * 4.设置事务参数，大多数情况下使用默认即可
 * */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ,
               timeout = -1, readOnly = false, rollbackFor = {IllegalAccessException.class},
               noRollbackFor = {OutOfMemoryError.class})
public class TransactionTestImpl implements TransactionTest {

    /**
     * 连接并操作数据库增删改查
     * */
    public void add() {
        //操作数据库 ... ...
    }
}
