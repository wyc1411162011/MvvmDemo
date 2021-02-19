package com.wyc.view;

import android.app.Activity;
import android.os.Bundle;

import com.wyc.viewmodel.LoginViewModel;

import androidx.databinding.DataBindingUtil;

public class LoginActivity extends Activity {
    com.wyc.view.databinding.ActivityLoginBinding loginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login);
        LoginViewModel loginViewModel = new LoginViewModel(loginBinding);
        loginBinding.setLoginViewModel(loginViewModel);
    }
}