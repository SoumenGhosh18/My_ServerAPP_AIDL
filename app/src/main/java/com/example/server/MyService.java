package com.example.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       return (IBinder) iMyAidlInterface;
    }
    IMyAidlInterface iMyAidlInterface = new IMyAidlInterface.Stub() {
        @Override
        public String send(String s) throws RemoteException {
            return s+ " data received";
        }
    };
}
