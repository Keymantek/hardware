package com.keymantek.serialport.utils;

public class TesamSPI
{

	static
	{
		System.loadLibrary("TesamSPI");
	}
	private final String DEBUG_TAG = "ccy";

	public int Close()
	{
		return deInit();
	}

	public native int deInit();

	public native int init();

	public int Open()
	{
		return init();
	}

	public int Read(byte[] data, int offset, int length)
	{
		return recvData(data, offset, length);
	}

	public native int recvData(byte[] data, int offset, int length);

	public native int sendData(byte[] data, int offset, int length);

	public native int setBits(int bits);

	public native int setFreq(int freq);

	public native int setIOControl(int diy);

	public native int setMode(int mode);

	public int Write(byte[] data, int offset, int length)
	{
		return sendData(data, offset, length);
	}
}
