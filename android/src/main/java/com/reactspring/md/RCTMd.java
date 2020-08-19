package com.reactspring.md;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewManager;

public class RCTMd extends ReactContextBaseJavaModule {
    public RCTMd(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RCTMd";
    }

    @ReactMethod
    public void md5(String data, Promise promise) {
        try {
            String result = MD5(data, "MD5");
            promise.resolve(result);
        } catch (Exception e) {
            promise.reject("-1", e.getMessage());
        }
    }

    private String MD5 (String text, String algorithm) {
        String MD5 = "";

        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(text.getBytes("UTF-8"));
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < byteData.length ; i++) {
                sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
            }

            MD5 = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); MD5 = null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace(); MD5 = null;
        }

        return MD5;
    }

    public static class RCTShaPackage implements ReactPackage {
        @Override
        public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
            return Arrays.<NativeModule>asList(
                    new RCTMd(reactContext)
            );
        }

        public List<Class<? extends JavaScriptModule>> createJSModules() {
            return Collections.emptyList();
        }

        @Override
        public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
            return Arrays.asList();
        }
    }
}
