package com.liumeng.gaobo.java.ming;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class RightCommand implements Command {

    private TetrisMachine mTetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        mTetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        mTetrisMachine.toRight();
    }
}
