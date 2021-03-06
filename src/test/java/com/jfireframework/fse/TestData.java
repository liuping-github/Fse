package com.jfireframework.fse;

import java.io.Serializable;

public class TestData implements Serializable
{
    private int       a = 213212312;
    private boolean   b = false;
    private char      c = 'c';
    private byte      d = 0x11;
    private short     e = 24;
    private long      f = 1213124131312321L;
    private double    g = 231321.2132;
    private float     h = (float) 4986.2;
    private String    i = "123452312316789a";
    private int[]     j = new int[]{1, 2, 4, 5};
    private boolean[] k = new boolean[]{true, false, true, false, false, false, true};
    private char[]    l = new char[]{'a', 'v', 'q', 'j', 'h', 'e', 'f'};
    private byte[]    m = new byte[]{0x32, 0x12, 0x34, (byte) 0x96};
    private short[]   n = new short[]{3, 8, 213, 451, 312, 45};
    private long[]    o = new long[]{12313131313l, 524141431313l, 3131231231425l, 1313123121l};
    private double[]  p = new double[]{6468613646.48646d, 4646.456d, 546864648867.466d};
    private float[]   q = new float[]{46486.2f, 49849.2f, 646854.6f};
    private String[]  r = new String[]{"abcdf12345", "abdfcgf12323"};

    public boolean equals(Object x)
    {
        if (x instanceof TestData)
        {
            TestData target = (TestData) x;
            if (target.a == a && target.b == b && target.c == c && target.d == d && target.e == e && target.f == f && target.g == g && target.h == h && target.i.equals(i))
            {
                for (int i = 0; i < target.j.length; i++)
                {
                    if (target.j[i] != j[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < k.length; i++)
                {
                    if (target.k[i] != k[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < l.length; i++)
                {
                    if (target.l[i] != l[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < m.length; i++)
                {
                    if (target.m[i] != m[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < n.length; i++)
                {
                    if (target.n[i] != n[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < o.length; i++)
                {
                    if (target.o[i] != o[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < p.length; i++)
                {
                    if (p[i] != target.p[i])
                    {
                        return false;
                    }
                }
                for (int i = 0; i < r.length; i++)
                {
                    if (target.r[i].equals(r[i]) == false)
                    {
                        return false;
                    }
                }
                for (int i = 0; i < q.length; i++)
                {
                    if (q[i] != target.q[i])
                    {
                        return false;
                    }
                }
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public boolean isB()
    {
        return b;
    }

    public void setB(boolean b)
    {
        this.b = b;
    }

    public char getC()
    {
        return c;
    }

    public void setC(char c)
    {
        this.c = c;
    }

    public byte getD()
    {
        return d;
    }

    public void setD(byte d)
    {
        this.d = d;
    }

    public short getE()
    {
        return e;
    }

    public void setE(short e)
    {
        this.e = e;
    }

    public long getF()
    {
        return f;
    }

    public void setF(long f)
    {
        this.f = f;
    }

    public double getG()
    {
        return g;
    }

    public void setG(double g)
    {
        this.g = g;
    }

    public float getH()
    {
        return h;
    }

    public void setH(float h)
    {
        this.h = h;
    }

    public String getI()
    {
        return i;
    }

    public void setI(String i)
    {
        this.i = i;
    }

    public int[] getJ()
    {
        return j;
    }

    public void setJ(int[] j)
    {
        this.j = j;
    }

    public boolean[] getK()
    {
        return k;
    }

    public void setK(boolean[] k)
    {
        this.k = k;
    }

    public char[] getL()
    {
        return l;
    }

    public void setL(char[] l)
    {
        this.l = l;
    }

    public byte[] getM()
    {
        return m;
    }

    public void setM(byte[] m)
    {
        this.m = m;
    }

    public short[] getN()
    {
        return n;
    }

    public void setN(short[] n)
    {
        this.n = n;
    }

    public long[] getO()
    {
        return o;
    }

    public void setO(long[] o)
    {
        this.o = o;
    }

    public double[] getP()
    {
        return p;
    }

    public void setP(double[] p)
    {
        this.p = p;
    }

    public float[] getQ()
    {
        return q;
    }

    public void setQ(float[] q)
    {
        this.q = q;
    }

    public String[] getR()
    {
        return r;
    }

    public void setR(String[] r)
    {
        this.r = r;
    }
}
