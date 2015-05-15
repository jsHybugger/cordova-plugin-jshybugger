/*
 * Copyright 2013–2014 SF Systems GmbH (info@jshybugger.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jshybugger.cordova;

import java.lang.reflect.Method;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.jshybugger.DebugServiceClient;

import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;

/**
 * Attach webview to jsHybugger debugging service at plug-in initialization time.
 * @author cyberflohr
 *
 */
public class JsHybuggerPlugin extends CordovaPlugin {

	private DebugServiceClient dbgClient;

	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		
		super.initialize(cordova, webView);
		
		if (webView instanceof WebView) { // if cordova < 4.0
			dbgClient = DebugServiceClient.attachWebView((WebView)webView, cordova.getActivity());
		} else {
			try {
				Method method = webView.getClass().getMethod("getView");
			    if (method != null) {
			        WebView view = (WebView)method.invoke(webView);
			        dbgClient = DebugServiceClient.attachWebView(view, cordova.getActivity());
			    }
			} catch (Exception ex) {
				Log.w("JsHybuggerPlugin", "Plugin initialization failed", ex);
			}
		}
	}

	@Override
	public Uri remapUri(Uri uri) {

		return Uri.parse(dbgClient.getDebugUrl(uri.toString()));
	}
}