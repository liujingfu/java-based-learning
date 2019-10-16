package org.ljf.aopdemo.fuse_mode.tralight;

/**
 * description
 *
 * @author ljf 2019/10/14 14:40
 */
public class Test {
    public static void main(String[] args) {
        LightState[] states = {new RedLight(), new GreenLight(), new YellowLight()};
        int index = 0;
        LightManager manager = new LightManager(states[index++]);
        while (true) {
            manager.changeLight(states[index++]);
            if (index == states.length) {
                index = 0;
            }
        }
    }
}
