#jsHybugger 2.1.0 plugin for PhoneGap 3.x

This plugin allows you to debug the javascript code of your Android PhoneGap & Icenium apps.

## Install PhoneGap plugin

* phonegap local plugin add https://github.com/cyberflohr/cordova-plugin-jshybugger.git
* open AndroidManifest.xml and verifiy that targetSdkVersion <= 16

## Install Icenium plugin

* Download jsHybugger plugin as ZIP file
* Import/add plugin to your icenium project (no further manual adjustment necessary) 
* open AndroidManifest.xml and verifiy that targetSdkVersion <= 16

## Use plugin

* Forward TCP port:	adb forward tcp:8888 tcp:8888

* start chrome browser 

* open URL http://localhost:8888

More about jsHybugger you will find on the project website [http://www.jshybugger.com](http://www.jshybugger.com).


## Note: This plugin contains the jsHybugger Professional  edition. 
To use this plugin please register for the trial version [here](https://www.jshybugger.com/#trial).

##Sample workflow: 

1. phonegap create &lt;name-of-project>
2. cd &lt;name-of-project>
3. phonegap local plugin add https://github.com/cyberflohr/cordova-plugin-jshybugger.git
4. adb forward tcp:8888 tcp:8888
5. phonegap run android --device
6. In Chrome go to http://localhost:8888. You should see now the debugger with your javascript files.
