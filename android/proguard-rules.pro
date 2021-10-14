-keepattributes SourceFile,LineNumberTable
-keepattributes RuntimeVisibleAnnotations,
                RuntimeVisibleParameterAnnotations,
                RuntimeVisibleTypeAnnotations,
                AnnotationDefault
-renamesourcefileattribute SourceFile
# Retain the generic signature of retrofit2.Call until added to Retrofit.
# Issue: https://github.com/square/retrofit/issues/3580.
# Pull request: https://github.com/square/retrofit/pull/3579.
-keep,allowobfuscation,allowshrinking class retrofit2.Call

-keep,allowobfuscation,allowshrinking class dev.msfjarvis.claw.android.** { *; }

-dontobfuscate

-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.AnnotationsKt

-keepclassmembers class kotlinx.serialization.json.** {
    *** Companion;
}
-keepclasseswithmembers class kotlinx.serialization.json.** {
    kotlinx.serialization.KSerializer serializer(...);
}

-keep,includedescriptorclasses class dev.msfjarvis.claw.model.**$$serializer { *; }
-keepclassmembers class dev.msfjarvis.claw.model.** {
    *** Companion;
}
-keepclasseswithmembers class dev.msfjarvis.claw.model.** {
    kotlinx.serialization.KSerializer serializer(...);
}

-dontwarn org.bouncycastle.jsse.BCSSLParameters
-dontwarn org.bouncycastle.jsse.BCSSLSocket
-dontwarn org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
-dontwarn org.conscrypt.Conscrypt$Version
-dontwarn org.conscrypt.Conscrypt
-dontwarn org.conscrypt.ConscryptHostnameVerifier
-dontwarn org.openjsse.javax.net.ssl.SSLParameters
-dontwarn org.openjsse.javax.net.ssl.SSLSocket
-dontwarn org.openjsse.net.ssl.OpenJSSE
