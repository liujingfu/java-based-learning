package org.ljf.aopdemo.fuse_mode.tralight;


/**
 * description
 *
 * @author ljf 2019/10/14 14:21
 */
public class TrafficLight {
    private static enum State {
        RED, GREEN, YELLOW
    }

    private static State state = State.RED;

    public static void change() {
        switch (state) {
            case RED:
                System.out.println("--------\n红灯(5s)");
                sleep(5000);
                state = State.GREEN;
                break;
            case GREEN:
                System.out.println("绿灯(5s)");
                sleep(5000);
                state = State.YELLOW;
                break;
            case YELLOW:
                System.out.println("黄灯(2s)");
                sleep(2000);
                state = State.RED;
        }

    }

    private static void sleep(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        while (true) {
            TrafficLight.change();
        }
    }
}
