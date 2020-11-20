package com.liumeng.gaobo.util;

/**
 * 基础校验规则
 * @param <T>
 */
public abstract class BaseValidateRule<T> implements IRule<T> {
	protected String comment    = "";
	protected String failedHint = "";

	@Override
	public String getRuleComment() {
		return comment;
	}

	@Override
	public String getFailedHint() {
		return failedHint;
	}
}