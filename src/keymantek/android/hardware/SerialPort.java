package keymantek.android.hardware;

import java.io.FileDescriptor;

/**
 * @author li
 *
 */
public final class SerialPort
{

	// 加载本地.so类库
	static
	{
		System.loadLibrary("serialport");
	}

	/**
	 * JNI关闭串口操作
	 */
	public native static void close();

	/**
	 * JNI配置串口操作
	 * 
	 * @param baudrate
	 * @param nBits
	 * @param parity
	 * @param nStop
	 * @return
	 */
	public native static int config(int baudrate, int nBits, int parity, int nStop);

	/**
	 * JNI打开串口操作
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
