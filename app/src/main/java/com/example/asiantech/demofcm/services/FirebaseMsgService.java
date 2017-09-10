package com.example.asiantech.demofcm.services;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import com.example.asiantech.demofcm.R;
import com.example.asiantech.demofcm.ui.notification.NotificationActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 10/09/2017.
 * FirebaseMsgService menage notification.
 */
public class FirebaseMsgService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        // Show message notification
        createNotification(remoteMessage.getNotification().getBody());
    }

    /**
     * createNotification this method create notification
     *
     * @param message msg of notification
     */
    private void createNotification(String message) {
        // Show activity from notification
        Intent intent = new Intent(this, NotificationActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // Pending intent for notification
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
        // Create uri sound default
        Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        // Create notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_notification)
                .setContentTitle("Message notification firebase demo!!!")
                .setContentText(message)
                .setAutoCancel(true)
                .setSound(uri)
                .setContentIntent(pIntent);
        // Show notification
        NotificationManager mn = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mn.notify(0, builder.build());
    }
}
