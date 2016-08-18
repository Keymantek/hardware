/*
 * Copyright 2009 Cedric Priscal
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */

package com.example.uartdemo;

import java.io.FileDescriptor;

/**
 * P44 SerialPort����JNI�࣬���������Ӳ����ͨ��
 * 
 * @author li
 *
 */
public final class SerialPort
{
	// ���ر���.so���
	static
	{
		System.loadLibrary("devapi");
		System.loadLibrary("SerialPortP44");
	}

	/**
	 * JNI�رմ��ڲ���
	 * 
	 * @param port
	 *            �˿�
	 */
	public native static void close(int port);

	/**
	 * JNI�򿪴��ڲ���
	 * 
	 * @param port
	 *            �˿�
	 * @param baudrate
	 *            ������
	 * @return ���ھ��
	 */
	public native static FileDescriptor open(int port, int baudrate);

	/**
	 * VDD 3.3v����
	 */
	public native static void power3v3off();

	/**
	 * VDD 3.3v����
	 */
	public native static void power3v3on();

	/**
	 * ����GPIO�ߵ�ƽ
	 * 
	 * @param pin
	 *            �˿�
	 */
	public native static void setGpioHigh(int pin);

	/**
	 * ����GPIO�͵�ƽ
	 * 
	 * @param pin
	 *            �˿�
	 */
	public native static void setGpioLow(int pin);

	private SerialPort()
	{

	}

}