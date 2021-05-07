package com.hf.springcloud.service;

/**
 * @ClassName: StorageService
 * @author: xiehongfei
 * @description:
 **/
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
