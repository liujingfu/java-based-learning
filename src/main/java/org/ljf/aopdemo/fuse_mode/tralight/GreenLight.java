package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:35
 */
public class GreenLight extends Light {

    @Override
    public void showLight(LightManager manager, LightState nextState) {

        System.out.println("绿灯！(5s)");
        sleep(5000);
        manager.setLightState(nextState);

    }
}
