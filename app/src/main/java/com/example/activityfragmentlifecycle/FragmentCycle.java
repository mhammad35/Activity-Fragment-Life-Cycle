package com.example.activityfragmentlifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FragmentCycle extends Fragment {
    final String TAG ="demo";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG,"onCreateView");
        Toast.makeText(getActivity(),"Activity: onCreateView", Toast.LENGTH_SHORT).show();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cycle, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttach");

    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(),"Activity: OnStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onStart");

    }


    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(),"Activity: OnResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(),"Activity: onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
         Toast.makeText(getActivity(),"Activity: OnStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onStop");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
         Toast.makeText(getActivity(),"Activity: OnDestroyView", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onDestroyView");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
         Toast.makeText(getActivity(),"Activity: OnDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onDestroy");
    }
}
