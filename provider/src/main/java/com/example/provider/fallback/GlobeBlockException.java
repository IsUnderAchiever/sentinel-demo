package com.example.provider.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author: 不是菜狗爱编程
 * @date: 2024/04/10/7:27
 * @description:
 */
public class GlobeBlockException {
    public static String blockHandler(BlockException e) {
        return "您访问的太频繁了，请稍后再试！";
    }
}
