package com.thekirankumar.youtubeauto;

import android.os.Handler;
import android.webkit.JavascriptInterface;


/**
 * Created by kiran.kumar on 08/01/18.
 */

public class JavascriptCallback {

    private final Handler handler;
    private JSCallbacks callbacks;

    public JavascriptCallback(JSCallbacks callbacks) {
        this.handler = new Handler();
        this.callbacks = callbacks;
    }

    @JavascriptInterface
    public void onVideoEvent(final String event) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                callbacks.onJSVideoEvent(event);
            }
        });
    }

    @JavascriptInterface
    public void onVideoDiscovered() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                callbacks.onVideoElementDiscovered();
            }
        });
    }

    public interface JSCallbacks {
        void onJSVideoEvent(String event);

        void onVideoElementDiscovered();
    }

}
