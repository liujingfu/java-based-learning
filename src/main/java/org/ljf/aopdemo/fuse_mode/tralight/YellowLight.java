package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:37
 */
public class YellowLight extends Light {

    @Override
    public void showLight(LightManager manager, LightState nextState) {
        System.out.println("黄灯！(2s)");
        sleep(2000);
        manager.setLightState(nextState);
    }
}
