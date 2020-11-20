package com.liumeng.gaobo.util;

/**
 * 校验规则interface
 *
 * @param <T>
 */
interface IRule<T> {

	/**
	 * 校验函数
	 * @param data
	 * @return
	 */
	public boolean validate(T data);

	/**
	 * 校验说明
	 * @return
	 */
	public String getRuleComment();

	/**
	 * 错误提示
	 * @return
	 */
	public String getFailedHint();
}