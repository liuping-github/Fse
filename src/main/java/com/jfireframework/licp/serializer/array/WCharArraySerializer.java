package com.jfireframework.licp.serializer.array;

import java.nio.ByteBuffer;
import com.jfireframework.baseutil.collection.buffer.ByteBuf;
import com.jfireframework.licp.InternalLicp;
import com.jfireframework.licp.util.BufferUtil;

public class WCharArraySerializer extends AbstractArraySerializer<Character[]>
{
    
    public WCharArraySerializer()
    {
        super(Character[].class);
    }
    
    @Override
    public void serialize(Character[] src, ByteBuf<?> buf, InternalLicp licp)
    {
        Character[] array = src;
        buf.writePositive(array.length);
        for (Character each : array)
        {
            if (each == null)
            {
                buf.put((byte) 0);
            }
            else
            {
                buf.put((byte) 1);
                buf.writeChar(each);
            }
        }
    }
    
    @Override
    public Character[] deserialize(ByteBuf<?> buf, InternalLicp licp)
    {
        int length = buf.readPositive();
        Character[] array = new Character[length];
        licp.putObject(array);
        for (int i = 0; i < length; i++)
        {
            boolean exist = buf.get() == 1 ? true : false;
            if (exist)
            {
                array[i] = buf.readChar();
            }
            else
            {
                array[i] = null;
            }
        }
        return array;
    }
    
    @Override
    public Character[] deserialize(ByteBuffer buf, InternalLicp licp)
    {
        int length = BufferUtil.readPositive(buf);
        Character[] array = new Character[length];
        licp.putObject(array);
        for (int i = 0; i < length; i++)
        {
            boolean exist = buf.get() == 1 ? true : false;
            if (exist)
            {
                array[i] = BufferUtil.readChar(buf);
            }
            else
            {
                array[i] = null;
            }
        }
        return array;
    }
}