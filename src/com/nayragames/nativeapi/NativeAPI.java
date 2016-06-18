package com.nayragames.nativeapi;

public class NativeAPI {

	static {
	     System.loadLibrary("nayragames");
	}
	
	public static native float ApiVersion();
	public static native String ApiName();
	public static native String authorName();
	
	public native void xyz();
	
}
