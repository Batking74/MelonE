package com.example.melone;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class onCompleteListener<T> implements com.google.android.gms.tasks.OnCompleteListener<com.google.firebase.auth.AuthResult> {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {

    }
}
