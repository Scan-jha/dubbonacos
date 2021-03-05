package com.dubbo.comtroller;

import com.dubbo.entiy.Persion;
import com.dubbo.entiy.ProsionResult;
import com.dubbo.service.IProseionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springbootdubbonocas
 * @description:
 * @author: JH
 * @create: 2021-03-05 11:14
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Reference
    private IProseionService iProseionService;

    @ResponseBody
    @GetMapping(value = "/get")
    public ProsionResult.Builder getList(){
        List<Persion> list=iProseionService.queryList();

        return new ProsionResult.Builder<>().code(200).message("success").data(list);
    }
}