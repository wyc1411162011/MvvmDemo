package com.wyc.viewmodel;

import android.view.View;

import com.wyc.callback.MyCallBack;
import com.wyc.entity.Accout;
import com.wyc.model.LoginModel;
import com.wyc.view.databinding.ActivityLoginBinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

/**
 * Created by ufsoft on2021/2/19
 * describle:
 */
public class LoginViewModel extends BaseObservable {
    private LoginModel loginModel;
    private ActivityLoginBinding binding;
    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    private String result;

    public  LoginViewModel(ActivityLoginBinding binding){
        loginModel = new LoginModel();
        this.binding = binding;
    }
    public void login(View view){
        loginModel.login(binding.etAcccout.getText().toString(), binding.etPassword.getText().toString(), new MyCallBack<Accout>() {
            @Override
            public void onSuccess(Accout accout) {
                setResult("名字:"+accout.getName()+"  密码:"+accout.getPassWord());
            }

            @Override
            public void onFail() {
                setResult("登陆失败");
            }
        });
    }

}
