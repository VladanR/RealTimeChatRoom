package com.example.roronoazoro.realtimechatroom.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.roronoazoro.realtimechatroom.MainActivity;
import com.example.roronoazoro.realtimechatroom.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SplashFragment extends Fragment {

    @BindView(R.id.splash_image) ImageView splash;
    @BindView(R.id.sign_in) Button signInButton;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.sign_in)
    public void onSignIn() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}
