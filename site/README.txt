To regen update site metadata:

java -jar ~/eclipse/eclipse36/plugins/org.eclipse.equinox.launcher_*.jar \
-application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher \
-metadataRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-artifactRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-source /home/nboldt/11/jbosstools-trunk/xulrunner/ -configs "*.*.*" \
-compress -publishArtifacts

or

java -jar ~/eclipse/eclipse36/plugins/org.eclipse.equinox.launcher_*.jar \
-application org.eclipse.equinox.p2.publisher.UpdateSitePublisher \
-metadataRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-artifactRepository file:/home/nboldt/11/jbosstools-trunk/xulrunner/ \
-source /home/nboldt/11/jbosstools-trunk/xulrunner/features/org.mozilla.xulrunner.site -configs "*.*.*" \
-compress -publishArtifacts

... or just run:

cd /home/nboldt/11/jbosstools-trunk/xulrunner/site/; mvn3 clean install

