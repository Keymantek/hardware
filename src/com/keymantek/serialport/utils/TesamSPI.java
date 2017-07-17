package com.keymantek.serialport.utils;


public class TesamSPI {

	private final String    DEBUG_TAG  = "ccy"; 
	public int Open(){
		return init();
	}
	
	public int Write(byte[] data,int offset, int length){
		return sendData( data,  offset, length);
	}
	
	public int Read(byte[] data,int offset, int length){
		return recvData( data, offset, length);
	}
	
	public int  Close(){
		return deInit();
	}
		
	private native int init();
		
	private native  int deInit();
		
	public native int sendData(byte[] data,int offset, int length);
			
	public native int recvData(byte[] data,int offset, int length);
	
	public native int setMode(int mode);
	public native int setFreq(int freq);
	public native int setBits(int bits);
	public native int setIOControl(int diy);
	
	static {
		System.loadLibrary("TesamSPI");
	}
}
