#jsHybugger 2.1.2 plugin for PhoneGap 3.x

This plugin allows you to debug the javascript code of your Android PhoneGap & Icenium apps.

## Install PhoneGap plugin

* phonegap local plugin add https://github.com/cyberflohr/cordova-plugin-jshybugger.git

## Install Icenium plugin

* Download jsHybugger plugin as ZIP file
* Import/add plugin to your icenium project (no further manual adjustment necessary) 

## Note: This plugin contains the jsHybugger Professional  edition. 
To use this plugin please register for the trial version [here](https://www.jshybugger.com/#trial).

More about jsHybugger you will find on the project website [http://www.jshybugger.com](http://www.jshybugger.com).

##Sample workflow: 

1. phonegap create &lt;name-of-project>
2. cd &lt;name-of-project>
3. phonegap local plugin add https://github.com/cyberflohr/cordova-plugin-jshybugger.git
4. phonegap build android 
5. copy trial license file to directory platforms\android\res\xml
6. phonegap run android --device
7. In Chrome Canary go to chrome://inspect, for Chrome first install the [ADB plugin](https://chrome.google.com/webstore/detail/adb/dpngiggdglpdnjdoaefidgiigpemgage). On the "inspect page" you should now see an entry named "jsHybugger", klick the inspect link to start debugging.
