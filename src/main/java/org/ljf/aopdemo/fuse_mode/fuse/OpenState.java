package org.ljf.aopdemo.fuse_mode.fuse;



import java.util.Timer;
import java.util.TimerTask;

/**
 * description 熔断器断开状态
 * 断开状态内部维护着一个计数器,如果断开达到一定的时间则自动切到半开状态并且如果在半开状态下如果要执行操作则直接报错
 *
 * @author ljf 2019/10/14 15:30
 */
public class OpenState extends AbstractBreakerState {

    public OpenState(BreakerManager manager) {
        super(manager);

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeoutHasBeenReached();
                timer.cancel();
            }
        }, manager.timeout);
    }
    @Override
    public void protectedCodeIsAboutToBeCalled() {
        super.protectedCodeIsAboutToBeCalled();
        throw new RuntimeException("服务已熔断，请稍等重试！");
    }
    /**
     * 断开超过设定的阈值，自动切换到半断开状态
     */
    private void timeoutHasBeenReached()
    {
        manager.moveToHalfOpenState();
    }
}
