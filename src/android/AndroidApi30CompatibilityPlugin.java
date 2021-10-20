package org.apache.cordova.plugin;

import android.webkit.WebSettings;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.LOG;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
* This class echoes a string called from JavaScript.
*/
public class AndroidApi30CompatibilityPlugin extends CordovaPlugin {

    public static final String TAG = "AndroidApi30CompatibilityPlugin";
    // private SystemWebView systemWebView;

    @Override
    protected void pluginInitialize() {
        LOG.d(TAG, "Initializing plugin");

        SystemWebView systemWebView = (SystemWebView) this.webView.getView();

        systemWebView.post(new Runnable() {
          @Override
          public void run() {
            final WebSettings settings = systemWebView.getSettings();

            LOG.d(TAG, "Setting setAllowFileAccess=true");
            settings.setAllowFileAccess(true); // https://github.com/apache/cordova-android/pull/1222
          }
       });
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        LOG.d(TAG, "NOOP action");        
        return true;
    }
}