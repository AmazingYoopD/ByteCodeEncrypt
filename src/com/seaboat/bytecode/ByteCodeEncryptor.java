package com.seaboat.bytecode;
/**
 * 
 * @author seaboat
 * @date 2017-07-06
 * @version 1.0
 * <pre><b>email: </b>849586227@qq.com</pre>
 * <pre><b>blog: </b>http://blog.csdn.net/wangyangzhizhou</pre>
 * <p>ByteCodeEncryptor provides a native encrypt method.</p>
 */
public class ByteCodeEncryptor {
  static{
    System.load("D:\\Microsoft Visual Studio 10.0\\Projects\\demoDll\\x64\\Debug\\FeByteCodeEncryptor.dll");
  }
  
  public native static byte[] encrypt(byte[] text);
  
}
