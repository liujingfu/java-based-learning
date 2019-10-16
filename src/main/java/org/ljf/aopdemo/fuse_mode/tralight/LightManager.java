package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:38
 */
public class LightManager {
    private LightState lightState;

    public LightManager(LightState lightState) {
        this.lightState = lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }

    public void changeLight(LightState nextState) {
        lightState.showLight(this, nextState);
    }
}
