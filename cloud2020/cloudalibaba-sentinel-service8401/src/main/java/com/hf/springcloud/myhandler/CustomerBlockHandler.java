package com.hf.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hf.springcloud.entities.CommonResult;

/**
 * @ClassName: CustomerBlockHandler
 * @author: xiehongfei
 * @description:
 **/
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
