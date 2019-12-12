package com.zking.ssm.util;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class pageAspect {

    @Around(value = "execution(* *..*Service.*(..))")
    public Object invoke(ProceedingJoinPoint point) throws Throwable {

        //1  获取目标方法的执行参数
        Object[] args = point.getArgs();
        //定义pageBean对象
        PageBean pageBean = null;
        //循环遍历参数
        for (Object obj : args) {
            if (obj instanceof PageBean) {
                pageBean = (PageBean) obj;
                break;
            }
        }
        //2  判断是否分页，并设置到pageHelper中
        if(null!=pageBean&&pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        //3.执行目标方法
        Object result = point.proceed(args);

        //4.获取分页信息
        if(null!=pageBean&&pageBean.isPagination()&&null!=result&&result instanceof List){
            List list=(List)result;
            PageInfo pageInfo=new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }
        return  result;

    }

}
