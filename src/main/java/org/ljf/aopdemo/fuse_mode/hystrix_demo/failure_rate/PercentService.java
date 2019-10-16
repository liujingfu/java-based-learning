package org.ljf.aopdemo.fuse_mode.hystrix_demo.failure_rate;

/**
 * description
 *
 * @author ljf 2019/10/14 21:01
 */
public class PercentService {
    public String ex(int seed) {
        if (seed < 10) {
            throw new RuntimeException("抛个异常测试提高异常率！");
        }
        return seed + "想返回吗？";
    }
}
