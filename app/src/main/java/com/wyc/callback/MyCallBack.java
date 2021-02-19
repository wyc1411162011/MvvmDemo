package com.wyc.callback;

/**
 * Created by ufsoft on2021/2/19
 * describle:
 */
public interface MyCallBack<T> {
    public void onSuccess(T t);
    public void onFail();
}
