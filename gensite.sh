#!/bin/bash

#To regen update site metadata:
rm -fr /home/nboldt/11/jbosstools-trunk/xulrunner/artifacts.jar /home/nboldt/11/jbosstools-trunk/xulrunner/content.jar

#java -jar ~/eclipse/eclipse36/plugins/org.eclipse.equinox.launcher_*.jar \
#-application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher \
#-metadataRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
#-artifactRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
#-source /home/nboldt/11/jbosstools-trunk/xulrunner/ -configs "*.*.*" \
#-compress -publishArtifacts

java -jar ~/eclipse/eclipse36/plugins/org.eclipse.equinox.launcher_*.jar \
-application org.eclipse.equinox.p2.publisher.UpdateSitePublisher \
-metadataRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-artifactRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-source /home/nboldt/11/jbosstools-trunk/xulrunner/ -configs "*.*.*" \
-compress -publishArtifacts
