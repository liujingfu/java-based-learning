package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:31
 */
public interface LightState {
    void showLight(LightManager manager, LightState nextState);
}
