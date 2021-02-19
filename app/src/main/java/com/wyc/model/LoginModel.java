package com.wyc.model;

import android.text.TextUtils;

import com.wyc.callback.MyCallBack;
import com.wyc.entity.Accout;

/**
 * Created by ufsoft on2021/2/19
 * describle:
 */
public class LoginModel {
    public void login(String name, String passWord, MyCallBack<Accout>myCallBack){
        if(!TextUtils.isEmpty(name)  && !TextUtils.isEmpty(passWord) ){
            Accout accout = new Accout();
            accout.setName(name);
            accout.setPassWord(passWord);
            if(myCallBack !=null){
                myCallBack.onSuccess(accout);
            }
        }else{
            if(myCallBack !=null){
                myCallBack.onFail();
            }
        }
    }
}
