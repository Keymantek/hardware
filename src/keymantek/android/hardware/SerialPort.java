package keymantek.android.hardware;

import java.io.FileDescriptor;

/**
 * @author li
 *
 */
public final class SerialPort
{

	// ���ر���.so���
	static
	{
		System.loadLibrary("serialport");
	}

	/**
	 * JNI�رմ��ڲ���
	 */
	public native static void close();

	/**
	 * JNI���ô��ڲ���
	 * 
	 * @param baudrate
	 * @param nBits
	 * @param parity
	 * @param nStop
	 * @return
	 */
	public native static int config(int baudrate, int nBits, int parity, int nStop);

	/**
	 * JNI�򿪴��ڲ���
	 * 
	 * @param port
	 * @param baudrate
	 * @param nBits
	 * @param parity
	 * @param nStop
	 * @return
	 */
	public native static FileDescriptor open(int port, int baudrate, int nBits, int parity, int nStop);
}
