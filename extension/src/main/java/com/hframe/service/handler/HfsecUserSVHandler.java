package com.hframe.service.handler;

import com.hframe.domain.model.HfsecUser;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.web.extension.annotation.AfterCreateHandler;
import com.hframework.web.extension.annotation.BeforeDeleteHandler;
import com.hframework.web.extension.annotation.BeforeUpdateHandler;
import org.springframework.stereotype.Service;

/**
 * Created by zhangquanhong on 2016/9/22.
 */
@Service
public class HfsecUserSVHandler extends AbstractBusinessHandler<HfsecUser> {

    @AfterCreateHandler
    public boolean afterCreate(HfsecUser hfsecUser) {
        System.out.println("===> create !");
        return false;
    }

    @BeforeUpdateHandler(attr = "status", orig = "1" , target = "0")
    public boolean afterUpdate(HfsecUser hfsecUser, HfsecUser origHfSecUser) {
        System.out.println("===> update !");
        return false;
    }

    @BeforeDeleteHandler
    public boolean afterDelete(HfsecUser hfsecUser) {
        System.out.println("===> delete !");
        return false;
    }

}
