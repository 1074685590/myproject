package com.liumeng.gaobo.java.ming;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class LeftCommand implements Command {
    //持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine mTetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        mTetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        //调用游戏机李的具体方法执行操作
        mTetrisMachine.toLeft();
    }
}
