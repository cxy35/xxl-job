package com.xxl.job.executor.cxy35.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * BEAN模式（方法形式）
 *
 * @Author cxy35
 * @Date 2020/10/12 16:44
 */
@Component
public class MyJobHandler {
    @XxlJob("demo")
    public ReturnT<String> demo(String param) throws Exception {
        XxlJobLogger.log("demo");
        return ReturnT.SUCCESS;
    }
}
