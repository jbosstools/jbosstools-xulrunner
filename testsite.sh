#!/bin/bash

java -jar ~/eclipse/eclipse36/plugins/org.eclipse.equinox.launcher_*.jar \
-application org.eclipse.equinox.p2.director \
-metadataRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-artifactRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-profile SDKProfile -installIU org.jboss.tools.xulrunner.feature.feature.group \
-destination /home/nboldt/eclipse/35clean/eclipse
-Declipse.p2.data.area=/home/nboldt/eclipse/35clean/eclipse/p2
