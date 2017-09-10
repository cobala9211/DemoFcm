package com.example.asiantech.demofcm.services;

import com.example.asiantech.demofcm.MainApplication;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 10/09/2017.
 * FirebaseInstanceIdService instance id service.
 */
public class FirebaseIDService extends FirebaseInstanceIdService {

    private FirebaseIDService() {
        // No-op.
    }

    @Override
    public void onTokenRefresh() {
       /* String token = FirebaseInstanceId.getInstance().getToken();
        MainApplication.getInstance().saveDeviceToken(token);*/
    }
}
