Running the `run-ecj.sh` script will output the following:
```
Processing annotations
java.lang.IllegalArgumentException: Unknown location : CLASS_OUTPUT
	at org.eclipse.jdt.internal.compiler.apt.util.EclipseFileManager.getFileForOutput(EclipseFileManager.java:436)
	at org.eclipse.jdt.internal.compiler.apt.dispatch.BatchFilerImpl.createResource(BatchFilerImpl.java:89)
	at org.apache.logging.log4j.core.config.plugins.processor.PluginProcessor.writeCacheFile(PluginProcessor.java:117)
	at org.apache.logging.log4j.core.config.plugins.processor.PluginProcessor.process(PluginProcessor.java:78)
	at org.eclipse.jdt.internal.compiler.apt.dispatch.RoundDispatcher.handleProcessor(RoundDispatcher.java:142)
	at org.eclipse.jdt.internal.compiler.apt.dispatch.RoundDispatcher.round(RoundDispatcher.java:124)
	at org.eclipse.jdt.internal.compiler.apt.dispatch.BaseAnnotationProcessorManager.processAnnotations(BaseAnnotationProcessorManager.java:162)
	at org.eclipse.jdt.internal.compiler.Compiler.processAnnotations(Compiler.java:940)
	at org.eclipse.jdt.internal.compiler.Compiler.compile(Compiler.java:450)
	at org.eclipse.jdt.internal.compiler.Compiler.compile(Compiler.java:426)
	at org.eclipse.jdt.internal.compiler.batch.Main.performCompilation(Main.java:4693)
	at org.eclipse.jdt.internal.compiler.batch.Main.compile(Main.java:1781)
	at org.eclipse.jdt.internal.compiler.batch.Main.main(Main.java:1485)
Processing annotations
No elements to process
1. ERROR: Unknown location : CLASS_OUTPUT
1 problem (1 error)
```

This can be reproduced with both OpenJDK and Oracle's Java 8.