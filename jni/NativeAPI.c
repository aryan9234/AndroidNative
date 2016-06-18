#include <jni.h>
#include "com_nayragames_nativeapi_NativeAPI.h"

JNIEXPORT jfloat JNICALL Java_com_nayragames_nativeapi_NativeAPI_ApiVersion(JNIEnv *env, jclass javaThis){
	return (1.0);
}

JNIEXPORT jstring JNICALL Java_com_nayragames_nativeapi_NativeAPI_ApiName(JNIEnv *env, jclass javaThis){
	return (*env)->NewStringUTF(env, "Nayra_Native");
}

JNIEXPORT jstring JNICALL Java_com_nayragames_nativeapi_NativeAPI_authorName(JNIEnv *env, jclass javaThis){
	return (*env)->NewStringUTF(env, "ABHISHEK ARYAN");
}

JNIEXPORT void JNICALL Java_com_nayragames_nativeapi_NativeAPI_xyz(JNIEnv *env, jobject javaThis){

}
