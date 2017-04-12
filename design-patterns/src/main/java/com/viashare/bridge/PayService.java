package com.viashare.bridge;

/**
 * Created by Jeffy on 17/4/12.
 */
public abstract class PayService {

    protected PayEncrypt payEncrypt;

    public abstract boolean pay();
}
