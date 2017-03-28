package com.jfireframework.licp.field.impl;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import com.jfireframework.baseutil.collection.buffer.ByteBuf;
import com.jfireframework.licp.InternalLicp;
import com.jfireframework.licp.interceptor.LicpFieldInterceptor;

public class BooleanField extends AbstractCacheField
{
    
    public BooleanField(Field field, LicpFieldInterceptor fieldInterceptor)
    {
        super(field, fieldInterceptor);
    }
    
    @Override
    public void write(Object holder, ByteBuf<?> buf, InternalLicp licp)
    {
        boolean value = unsafe.getBoolean(holder, offset);
        if (fieldInterceptor != null)
        {
            value = fieldInterceptor.serializeBoolean(value);
        }
        if (value)
        {
            buf.put((byte) 1);
        }
        else
        {
            buf.put((byte) 0);
        }
    }
    
    @Override
    public void read(Object holder, ByteBuf<?> buf, InternalLicp licp)
    {
        boolean value = buf.get() == 1 ? true : false;
        if (fieldInterceptor != null)
        {
            value = fieldInterceptor.deserializeBoolean(value);
        }
        unsafe.putBoolean(holder, offset, value);
    }
    
    @Override
    public void read(Object holder, ByteBuffer buf, InternalLicp licp)
    {
        boolean value = buf.get() == 1 ? true : false;
        if (fieldInterceptor != null)
        {
            value = fieldInterceptor.deserializeBoolean(value);
        }
        unsafe.putBoolean(holder, offset, value);
    }
    
}
