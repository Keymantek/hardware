package keymantek.android.hardware;

/**
 * P41��Դ����
 *
 * @author li
 *
 */
public final class GPIO
{
	/**
	 * TAG
	 */
	private static final String TAG = "GPIO";

	static
	{
		System.loadLibrary("dev");
	}

	/**
	 * ��Դ����
	 *
	 * @param nGpioName
	 *            GPIO����
	 * @param nlevel
	 *            1�ϵ� 0�µ�
	 */
	public native static void setGpio(int nGpioName, int nlevel);

	/**
	 * ��Դ����
	 *
	 * @param nGpioName
	 *            GPIO����
	 * @param bOpen
	 *            true �ϵ� false �µ�
	 */
	public static void setGPIO(int nGpioName, boolean bOpen)
	{
		setGpio(nGpioName, bOpen ? 1 : 0);
	}

	private GPIO()
	{

	}
}
