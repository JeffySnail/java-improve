package com.viashare.bridge;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

/**
 * Created by Jeffy on 17/4/12.
 */
public class MD5Encrypt implements PayEncrypt{

    public String sign() {
        System.out.println("采用MD5签名");
        return "采用MD5签名";
    }
}
