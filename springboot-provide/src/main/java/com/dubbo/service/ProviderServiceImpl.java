package com.dubbo.service;

import com.dubbo.entiy.Persion;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springbootdubbonocas
 * @description:
 * @author: JH
 * @create: 2021-03-05 11:02
 */
@Service
public class ProviderServiceImpl implements IProseionService{
    @Override
    public List<Persion> queryList() {
        Persion persion01=new Persion();
        persion01.setAge(23);
        persion01.setName("ydus");

        Persion persion02=new Persion();
        persion02.setAge(20);
        persion02.setName("rise");

        List<Persion> list=new ArrayList<>();
        list.add(persion01);
        list.add(persion02);
        return list;
    }
}