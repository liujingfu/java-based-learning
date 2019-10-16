package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:33
 */
public abstract class Light implements LightState {
    protected void sleep(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
