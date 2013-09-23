#jsHybugger 2.0 plugin for PhoneGap 3.x

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

More about jsHybugger you will find on the project website [http://www.jshybugger.org](http://www.jshybugger.org).


## Note: This plugin contains the jsHybugger community edition. 
If you are interessed in DOM & CSS inspection, Live editing, local & session storage management then try out the jsHybugger Pro version and register for the trial version [here](https://www.jshybugger.com/#trial).

To use the trial/pro version with this phonegap plugin, you must replace (after plugin installation) the CE jar file  jshybuggerce-bundle-&lt;version>.jar with the downloaded pro version jshybugger-bundle-&lt;version>.jar

##Sample workflow: 

1. Download trial or pro version of jsHybugger from www.jshybugger.com. So you have jshybugger-bundle-&lt;version>.jar and a license file.
2. phonegap create &lt;name-of-project>
3. cd &lt;name-of-project>
4. phonegap local plugin add https://github.com/cyberflohr/cordova-plugin-jshybugger.git
5. adb forward tcp:8888 tcp:8888
6. phonegap run android --device
7. In Chrome go to http://localhost:8888. You should see the debugger but without elements view.
8. Now replace every occurence of jshybuggerce-bundle-&lt;version>.jar with jshybugger-bundle-&lt;version>.jar. You can use: find -name "js*.jar"
9. phonegap run android --device
10. In Chrome go to http://localhost:8888. You are asked for a license, after uploading a license the elements view is available.
