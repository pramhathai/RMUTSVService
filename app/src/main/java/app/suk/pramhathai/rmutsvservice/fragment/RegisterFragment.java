package app.suk.pramhathai.rmutsvservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.suk.pramhathai.rmutsvservice.R;

/**
 * Created by DR-PC61059 on 7/11/2560.
 */

public class RegisterFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view inflater.inflate(R.layout.fragment_register,container,false);
        return view;
    }
}   // Main Class
