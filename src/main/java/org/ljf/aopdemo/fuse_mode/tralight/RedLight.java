package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:34
 */
public class RedLight extends Light {

    @Override
    public void showLight(LightManager manager, LightState nextState) {
        System.out.println("---------\n红灯！(5s)");
        sleep(5000);
        manager.setLightState(nextState);
    }
}
