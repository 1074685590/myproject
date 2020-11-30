package com.liumeng.gaobo.java.ming;

/**
 * Created by liumeng on 2020/11/30 0030.
 * Describe:
 */
public class Buttons {
    private LeftCommand mLeftCommand;
    private RightCommand mRightCommand;
    private FallCommand mFallCommand;
    private TransformCommand mTransformCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        mLeftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        mRightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        mFallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        mTransformCommand = transformCommand;
    }

    public void toLeft() {
        mLeftCommand.execute();
    }

    public void toRight() {
        mRightCommand.execute();
    }

    public void fall() {
        mFallCommand.execute();
    }

    public void transform() {
        mTransformCommand.execute();
    }
}
