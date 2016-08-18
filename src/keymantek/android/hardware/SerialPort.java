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
	 *            ������
	 * @param nBits
	 *            ����λ
	 * @param parity
	 *            ��żУ��
	 * @param nStop
	 *            ֹͣλ
	 * @return ���ý��
	 */
	public native static int config(int baudrate, int nBits, int parity, int nStop);

	/**
	 * JNI�򿪴��ڲ���
	 * 
	 * @param port
	 *            ����
	 * @param baudrate
	 *            ������
	 * @param nBits
	 *            ����λ
	 * @param parity
	 *            ��żУ��
	 * @param nStop
	 *            ֹͣλ
	 * @return ���ھ��
	 */
	public native static FileDescriptor open(int port, int baudrate, int nBits, int parity, int nStop);

	private SerialPort()
	{

	}
}
