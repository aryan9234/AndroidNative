package com.nayragames.nativeapi;

/** When This Class access first time then library loaded in memory.
 * nayragames is the name of module which is passed in Android.mk file of jni folder.
 * We pass APP_ABI := armeabi armeabi-v7a x86 mips in Application.mk for different
 * 						type of cpu architecture (7 currently supported in Android).
 */

public class NativeAPI {

	/** When This Class access first time then library loaded in memory.*/

	static {
	     System.loadLibrary("nayragames");
	}

	/** Native static method */

	public static native float ApiVersion();
	public static native String ApiName();
	public static native String authorName();

	/** native method */

	public native void xyz();
	
}
