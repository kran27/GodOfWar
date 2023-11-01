//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public abstract class a extends FullCanvas implements Runnable {
    public int a;
    public int b;
    private long c;
    public MIDlet midlet;
    public d d;
    private boolean e;
    public boolean f;
    private int g = -1;
    private int[] h;
    private byte[] i;
    public byte[] j;
    private boolean[] k;
    private int l;
    private byte[] m;
    private short[] n;
    private c[] o;
    private char[] p;
    private Font q = Font.getFont(0, 0, 0);
    private short[] r;
    private int[][] s;
    private byte[][] t;
    private int[][] u;
    private char[][] v;
    private int[][] w;
    private int[][] z;
    private int[][] A;
    private char[][] B;
    private char[][] C;
    private DataInputStream D;
    private short[] E;
    private int F;
    private static final byte[] G = new byte[32];
    public volatile int H;
    public volatile int I;
    private volatile int J;
    private volatile int K;
    private volatile int L;
    public boolean M;
    public boolean N;
    private boolean O;
    public int P = 10;
    public int Q = 10;
    public int R = 100;
    private boolean S;
    private int T;
    private int U;
    private int V;
    private int W;
    public volatile boolean X;
    private volatile boolean Y;
    private volatile boolean Z;
    private Thread aa;
    private volatile boolean ab;
    private volatile boolean ac;
    private volatile long ad;
    private volatile int ae = -1;
    private int af = 2;
    private volatile boolean ag;

    static {
        G[1] = -1;
        G[2] = -3;
        G[3] = 35;
        G[4] = -8;
        G[5] = -4;
        G[6] = -2;
        G[8] = -5;
        G[9] = -10;
        G[10] = 42;

        for(int var0 = 0; var0 < 10; ++var0) {
            G[16 + var0] = (byte)(48 + var0);
        }

        G[27] = -6;
        G[29] = -7;
    }

    public abstract void a(Graphics var1);

    public abstract void a();

    public static int parseInt(String var0, int var1) {
        try {
            return Integer.parseInt(var0);
        } catch (Exception var2) {
            return var1;
        }
    }

    public static void a(int[] var0, int var1) {
        int var5 = var1--;

        boolean var2;
        do {
            if (var5 != 1) {
                var5 = var5 * 197 >> 8;
            }

            var2 = false;
            int var3 = var1 - var5;

            for(int var4 = var1; var3 >= 0; --var4) {
                if (var0[var3] > var0[var4]) {
                    int var6 = var0[var3];
                    var0[var3] = var0[var4];
                    var0[var4] = var6;
                    var2 = true;
                }

                --var3;
            }
        } while(var2 || var5 > 1);

    }

    public static byte[] a(int var0) {
        RecordStore var2 = null;

        byte[] var1;
        try {
            int var3 = (var2 = RecordStore.openRecordStore(String.valueOf(var0), false)).getNumRecords();
            int var4 = 0;

            int var5;
            for(var5 = 1; var5 <= var3; ++var5) {
                var4 += var2.getRecordSize(var5);
            }

            var1 = new byte[var4];
            var4 = 0;

            for(var5 = 1; var5 <= var3; ++var5) {
                var4 += var2.getRecord(var5, var1, var4);
            }
        } catch (Throwable var7) {
            var1 = (byte[])null;
        }

        if (var2 != null) {
            try {
                var2.closeRecordStore();
            } catch (Throwable var6) {
            }
        }

        return var1;
    }

    public static boolean a(int var0, byte[] var1) {
        String var2 = String.valueOf(var0);
        RecordStore var3 = null;
        boolean var4 = true;

        try {
            String[] var5;
            int var6;
            if ((var5 = RecordStore.listRecordStores()) != null) {
                for(var6 = 0; var6 < var5.length; ++var6) {
                    if (var2.equals(var5[var6])) {
                        RecordStore.deleteRecordStore(var2);
                        break;
                    }
                }
            }

            if (var1 != null) {
                var3 = RecordStore.openRecordStore(var2, true);
                var6 = (var1.length + 4096 - 1) / 4096;
                int var7 = 0;

                for(int var8 = 1; var8 <= var6; ++var8) {
                    int var9;
                    if ((var9 = var1.length - var7) > 4096) {
                        var9 = 4096;
                    }

                    var3.addRecord(var1, var7, var9);
                    var7 += var9;
                }
            }
        } catch (Throwable var11) {
            var4 = false;
        }

        if (var3 != null) {
            try {
                var3.closeRecordStore();
            } catch (Throwable var10) {
            }
        }

        return var4;
    }

    public final synchronized void a(boolean var1) {
        if (var1 || !this.e) {
            byte[] var2;
            if (var1) {
                (var2 = new byte[3])[0] = (byte)(this.f ? 1 : 0);
                a(-9, var2);
                return;
            }

            this.e = true;
            if ((var2 = a((int)-9)) == null || var2.length != 3) {
                var2 = new byte[]{-1, -1, -1};
                a(-9, var2);
            }

            this.f = var2[0] != 0;
        }

    }

    public final c[] b(int var1) {
        return this.b(var1, (byte[])null);
    }

    public final c[] b(int var1, byte[] var2) {
        try {
            DataInputStream var6;
            int var3 = (var6 = this.d(var1)).readChar();
            var6.readByte();
            boolean var4 = false;
            byte[] var7 = new byte[var6.readShort() - 4];
            int var5 = var6.readChar();
            char var8 = var6.readChar();
            var6.readFully(var7);
            if (this.k == null) {
                this.k = new boolean[16];
            }

            int var16;
            for(var16 = 0; var16 < 16; ++var16) {
                this.k[var16] = (var5 >> var16 & 1) == 0;
            }

            var5 = 5;
            var16 = 0;
            int[] var9 = new int[10];

            for(int var10 = 0; var10 < 3; ++var10) {
                for(int var11 = 0; var11 < (var10 == 0 ? 2 : 4); ++var11) {
                    var9[var16++] = this.k[var10] ? (this.k[var5++] ? 2 : 1) : 0;
                }
            }

            Image var17 = this.d(var3, var2);
            short[] var18 = new short[10];
            c[] var12 = new c[var8];

            for(int var13 = 0; var13 < var8; ++var13) {
                var12[var13] = new c(var17);
                var5 = 0;

                for(int var14 = 0; var14 < var18.length; ++var14) {
                    var16 = 0;
                    if ((var3 = var9[var14] - 1) >= 0) {
                        var5 += var13 << var3;
                        if (var3 == 0) {
                            var16 = var7[var5];
                            if (var14 > 1 && var14 != 6 && var14 != 7) {
                                var16 &= 255;
                            }
                        } else {
                            var16 = (var7[var5] & 255) << 8 | var7[var5 + 1] & 255;
                        }

                        var5 += var8 - var13 << var3;
                    }

                    var18[var14] = (short)var16;
                }

                var12[var13].a(var18);
            }

            return var12;
        } catch (Exception var15) {
            return null;
        }
    }

    public final Image c(int var1, byte[] var2) {
        Image var3 = null;
        this.f(var1);
        var1 &= 1023;
        int var4 = this.e(var1);
        this.a(this.i, var4, var2);
        var3 = Image.createImage(this.i, var4, this.h[var1]);
        this.a(this.i, var4, var2);
        return var3;
    }

    private void a(byte[] var1, int var2, byte[] var3) {
        if (var3 != null) {
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1, var2, var1.length - var2));

            try {
                this.a(var4);
                int var5 = 0;

                byte var6;
                for(var2 += this.l; var5 < var3.length; var3[var5++] = var6) {
                    var6 = var1[var2];
                    var1[var2++] = var3[var5];
                }

                return;
            } catch (IOException var7) {
            }
        }

    }

    private int a(DataInputStream var1) throws IOException {
        var1.skip(8L);
        this.l = 8;

        while(true) {
            int var2 = var1.readInt();
            int var3 = var1.readInt();
            this.l += 8;
            if (1347179589 == var3) {
                return var2;
            }

            if (1229278788 == var3) {
                return -1;
            }

            var1.skip((long)(var2 + 4));
            this.l += var2 + 4;
        }
    }

    public final byte[] c(int var1) {
        this.f(var1);
        var1 &= 1023;
        byte[] var2 = new byte[this.h[var1]];
        System.arraycopy(this.i, this.e(var1), var2, 0, var2.length);
        return var2;
    }

    public final DataInputStream d(int var1) {
        this.f(var1);
        var1 &= 1023;
        return new DataInputStream(new ByteArrayInputStream(this.i, this.e(var1), this.h[var1]));
    }

    private int e(int var1) {
        int var2 = 0;

        while(true) {
            --var1;
            if (var1 < 0) {
                return var2;
            }

            var2 += this.h[var1];
        }
    }

    private void f(int var1) {
        if ((var1 >>= 10) != 0 && var1 != this.g) {
            if (var1 > 0) {
                try {
                    DataInputStream var2 = new DataInputStream(this.getClass().getResourceAsStream("/RP" + var1));
                    this.b(var2);
                    var2.close();
                } catch (Exception var3) {
                }
            } else {
                this.b((DataInputStream)null);
            }

            this.g = var1;
        }
    }

    public final boolean b(DataInputStream var1) {
        this.h = null;
        this.j = null;
        this.i = null;
        if (var1 == null) {
            this.g = -1;
            return false;
        } else {
            this.g = 0;

            try {
                int var4 = var1.read();
                int var2 = 1 + (var4 & 1) << 1;
                char var9 = var1.readChar();
                byte[] var5 = new byte[var2 * var9];
                var1.readFully(var5);
                this.h = new int[var9];
                int var3 = 0;

                for(int var6 = 0; var6 < var9; ++var6) {
                    for(int var7 = var2 - 1; var7 >= 0; --var7) {
                        int[] var10000 = this.h;
                        var10000[var6] |= (255 & var5[var3++]) << (var7 << 3);
                    }
                }

                this.j = new byte[var9];
                var1.readFully(this.j);
                this.i = new byte[var1.readInt()];
                var1.readFully(this.i);
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    public final String g(int var1) {
        short var2 = this.n[var1];

        try {
            return new String(this.m, var2, this.n[var1 + 1] - var2, "UTF-8");
        } catch (Exception var3) {
            return null;
        }
    }

    public final void h(int var1) {
        if (var1 == -1) {
            this.m = null;
            this.n = null;
        } else {
            try {
                DataInputStream var2 = this.d(var1);
                this.n = new short[var2.readShort() + 1];
                int var3 = this.h[var1 & 1023];
                this.m = new byte[var3 - (this.n.length << 1)];
                short var4 = 0;

                int var5;
                for(var5 = 0; var5 < this.n.length - 1; ++var5) {
                    this.n[var5] = var4;
                    short var7;
                    if ((var7 = var2.readShort()) > 0) {
                        var2.readFully(this.m, var4, var7);
                    }

                    var4 += var7;
                }

                this.n[var5] = var4;
            } catch (Exception var6) {
            }
        }
    }

    public static void a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
        b(var0, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public static void b(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
        var0.drawRGB(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public final void a(c[] var1) {
        this.o = var1;
        if (this.o != null && var1[3].bb == 255) {
            var1[3].bb = 0;
            short var2 = 0;

            for(int var3 = 0; var3 < var1.length; ++var3) {
                c var4 = var1[var3];
                var2 = (short)(var2 + (var4.aU << 8) + (var4.aV & 255));
                var4.aU = var4.aY;
                var4.aV = var4.aZ;
                var4.aY = var2;
            }
        }

    }

    private void i(int var1) {
        if (this.p == null || this.p.length < var1) {
            this.p = new char[var1];
        }

    }

    public final int a(String var1) {
        return this.a((String)var1, 0, var1.length());
    }

    public final int a(String var1, int var2, int var3) {
        this.i(var3);

        for(int var4 = 0; var4 < var3; ++var4) {
            this.p[var4] = var1.charAt(var2 + var4);
        }

        return this.a((char[])this.p, 0, var3);
    }

    public final int a(char var1) {
        this.i(1);
        this.p[0] = var1;
        return this.a((char[])this.p, 0, 1);
    }

    public final int a(char[] var1, int var2, int var3) {
        if (this.o != null) {
            var3 += var2;

            int var4;
            for(var4 = 0; var2 < var3; ++var2) {
                c var5 = this.b(var1[var2]);
                var4 += var5 != null ? var5.ba : this.o[2].bb;
            }

            return var4;
        } else {
            return var3 == 0 ? 0 : this.q.charsWidth(var1, var2, var3);
        }
    }

    private c b(char var1) {
        int var2 = 0;
        int var3 = this.o.length - 1;

        while(var2 <= var3) {
            int var4 = var2 + var3 >> 1;
            char var5;
            if ((var5 = (char)this.o[var4].aY) < var1) {
                var2 = var4 + 1;
            } else {
                if (var5 <= var1) {
                    return this.o[var4];
                }

                var3 = var4 - 1;
            }
        }

        return null;
    }

    public final int b() {
        return this.o != null ? this.o[1].bb : this.q.getBaselinePosition();
    }

    public final int c() {
        return this.o != null ? this.o[0].bb : this.q.getHeight();
    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5) {
        this.a(var1, (String)var2, 0, var2.length(), var3, var4, var5);
    }

    public final void a(Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
        this.i(var4);

        for(int var8 = 0; var8 < var4; ++var8) {
            this.p[var8] = var2.charAt(var3 + var8);
        }

        this.a(var1, (char[])this.p, 0, var4, var5, var6, var7);
    }

    public final void a(Graphics var1, char[] var2, int var3, int var4, int var5, int var6, int var7) {
        if ((var7 & 64) != 0) {
            var6 -= this.b();
        } else if ((var7 & 32) != 0) {
            var6 -= this.c();
        }

        if ((var7 & 9) != 0) {
            var5 -= this.a(var2, var3, var4) >> (var7 & 1);
        }

        if (this.o != null) {
            for(var4 += var3; var3 < var4; ++var3) {
                c var8;
                if ((var8 = this.b(var2[var3])) != null) {
                    var8.a(var1, var5, var6, 0);
                    var5 += var8.ba;
                } else {
                    var5 += this.o[2].bb;
                }
            }

        } else {
            if (var4 != 0) {
                if (var1.getFont() != this.q) {
                    var1.setFont(this.q);
                }

                var1.drawChars(var2, var3, var4, var5, var6, 20);
            }

        }
    }

    public static void a(Image var0, int var1, int var2, int var3, int var4, Graphics var5, int var6, int var7) {
        int var8 = var5.getClipX();
        int var9 = var5.getClipY();
        int var10 = var5.getClipWidth();
        int var11 = var5.getClipHeight();
        var5.clipRect(var6, var7, var3, var4);
        var5.drawImage(var0, var6 - var1, var7 - var2, 20);
        var5.setClip(var8, var9, var10, var11);
    }

    public static int a(int[] var0, int var1, int var2) {
        int var3 = 0;

        while(var3 <= var1) {
            int var4 = var3 + var1 >> 1;
            int var5;
            if ((var5 = var0[var4]) < var2) {
                var3 = var4 + 1;
            } else {
                if (var5 <= var2) {
                    return var4;
                }

                var1 = var4 - 1;
            }
        }

        return var1 + 1;
    }

    public final void j(int var1) {
        int var2;
        if (this.r != null) {
            for(var2 = 0; var2 < this.r.length; ++var2) {
                if (var1 == (this.r[var2] & 32767)) {
                    return;
                }
            }
        }

        this.r = a(this.r, (short)var1);
        int var3 = this.r.length - 1;

        try {
            this.D = this.d(var1);
            this.D.read();
            int var4 = this.D.readChar();
            this.s = a(this.s, var4);
            int[] var5 = this.s[var3];
            var1 = this.a(var5);

            for(var2 = 0; var2 < var4; ++var2) {
                var5[var2] |= (63 & this.e()) << 10;
            }

            this.t = a(this.t, var1);
            byte[] var6 = this.t[var3];
            this.u = a(this.u, var1);
            var5 = this.u[var3];

            for(var2 = 0; var2 < var1; ++var2) {
                var4 = this.d();
                var6[var2] = (byte)var4;
                var5[var2] = var4 >> 8;
            }

            this.b(var5);
            char var7 = this.D.readChar();
            this.v = a((char[][])this.v, (int)var7);
            this.w = a((int[][])this.w, (int)var7);
            var1 = this.a(this.w[var3]);
            this.z = a(this.z, var1);
            var5 = this.z[var3];
            int var8 = 0;

            for(var2 = 0; var2 < var1; ++var2) {
                if (var8 == 0) {
                    var4 = this.d();
                    var8 = 8;
                }

                var8 -= 2;
                var5[var2] = 3 & var4 >> var8;
            }

            this.b(var5);
            var1 = 0;

            for(var2 = 0; var2 < var7; ++var2) {
                var4 = this.d();
                int[] var10000 = this.w[var3];
                var10000[var2] |= var4 << 8;
                this.v[var3][var2] = (char)var1;
                var1 += var4;
            }

            this.A = a(this.A, var1);
            this.B = a(this.B, var1);
            var5 = this.A[var3];
            char[] var9 = this.B[var3];

            for(var2 = 0; var2 < var1; var5[var2++] = this.e() << 21) {
            }

            int var10001;
            for(var2 = 0; var2 < var1; var5[var10001] |= this.e() << 21 >>> 11) {
                var10001 = var2++;
            }

            for(var2 = 0; var2 < var1; var5[var10001] |= this.d()) {
                var10001 = var2++;
            }

            for(var2 = 0; var2 < var1; var9[var2++] = (char)(this.d() << 6)) {
            }

            for(var2 = 0; var2 < var1; var9[var10001] |= (char)this.d()) {
                var10001 = var2++;
            }

            char var11 = this.D.readChar();
            this.C = a((char[][])this.C, (int)var11);

            for(var2 = 0; var2 < var11; ++var2) {
                this.C[var3][var2] = (char)this.d();
            }
        } catch (Exception var10) {
        }

        this.D = null;
    }

    private int a(int[] var1) throws Exception {
        int var2 = 0;

        int var3;
        for(int var4 = 0; var4 < var1.length; var2 += var3) {
            var3 = this.d();
            var1[var4++] = var2 << 16 | var3;
        }

        return var2;
    }

    private void b(int[] var1) throws Exception {
        int var2 = var1.length;

        int var10001;
        int var3;
        for(var3 = 0; var3 < var2; var1[var10001] |= this.d() << 22) {
            var10001 = var3++;
        }

        for(var3 = 0; var3 < var2; var1[var10001] |= this.e() << 22 >>> 10) {
            var10001 = var3++;
        }

        for(var3 = 0; var3 < var2; var1[var10001] |= this.e() << 22 >>> 20) {
            var10001 = var3++;
        }

    }

    private int d() throws Exception {
        int var1;
        return (var1 = this.D.read()) == 255 ? this.D.readChar() : var1;
    }

    private int e() throws Exception {
        byte var1;
        return (var1 = this.D.readByte()) == -128 ? this.D.readShort() : var1;
    }

    private static short[] a(short[] var0, short var1) {
        if (var0 == null) {
            var0 = new short[0];
        }

        short[] var2 = new short[var0.length + 1];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        var2[var0.length] = var1;
        return var2;
    }

    private static int[][] a(int[][] var0, int var1) {
        if (var0 == null) {
            var0 = new int[0][];
        }

        int[][] var2 = new int[var0.length + 1][];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        var2[var0.length] = new int[var1];
        return var2;
    }

    private static byte[][] a(byte[][] var0, int var1) {
        if (var0 == null) {
            var0 = new byte[0][];
        }

        byte[][] var2 = new byte[var0.length + 1][];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        var2[var0.length] = new byte[var1];
        return var2;
    }

    private static char[][] a(char[][] var0, int var1) {
        if (var0 == null) {
            var0 = new char[0][];
        }

        char[][] var2 = new char[var0.length + 1][];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        var2[var0.length] = new char[var1];
        return var2;
    }

    private static short[] a(short[] var0, int var1) {
        if (var0 == null) {
            var0 = new short[0];
        }

        if (var1 > var0.length) {
            short[] var2 = new short[var1];
            System.arraycopy(var0, 0, var2, 0, var0.length);
            var0 = var2;
        }

        return var0;
    }

    public final void a(int var1, boolean var2) {
        int var3;
        for(var3 = 0; var1 != (this.r[var3] & 32767); ++var3) {
        }

        short[] var10000;
        if (var2) {
            var10000 = this.r;
            var10000[var3] = (short)(var10000[var3] | '耀');
        } else {
            var10000 = this.r;
            var10000[var3] = (short)(var10000[var3] & 32767);
        }
    }

    private static void a(Object[] var0, char[] var1, Object[] var2) {
        for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = var0[var1[var3]];
        }

    }

    public final void f() {
        int var2 = 0;
        int var1;
        if (this.r != null) {
            for(var1 = 0; var1 < this.r.length; ++var1) {
                if (this.r[var1] < 0) {
                    ++var2;
                }
            }
        }

        if (var2 > 0) {
            char[] var3 = new char[var2];
            short[] var4 = this.r;
            this.r = new short[var2];
            var1 = 0;

            for(int var5 = 0; var5 < var4.length; ++var5) {
                if (var4[var5] < 0) {
                    var3[var1] = (char)var5;
                    this.r[var1++] = var4[var5];
                }
            }

            a(this.s, var3, this.s = new int[var2][]);
            a(this.t, var3, this.t = new byte[var2][]);
            a(this.u, var3, this.u = new int[var2][]);
            a(this.v, var3, this.v = new char[var2][]);
            a(this.w, var3, this.w = new int[var2][]);
            a(this.z, var3, this.z = new int[var2][]);
            a(this.A, var3, this.A = new int[var2][]);
            a(this.B, var3, this.B = new char[var2][]);
            a(this.C, var3, this.C = new char[var2][]);
        } else {
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.E = null;
        }
    }

    public final void k(int var1) {
        this.E = a(this.E, var1 * 8);
    }

    public final void a(int var1, int var2, int var3) {
        int var4;
        for(var4 = 0; var2 != (this.r[var4] & 32767); ++var4) {
        }

        var1 *= 8;
        this.E = a(this.E, var1 + 8);
        this.E[var1 + 0] = (short)var4;
        this.E[var1 + 1] = (short)var3;
        this.E[var1 + 2] = 0;
        this.E[var1 + 3] = (short)(this.s[var4][var3] << 16 >> 26);
        this.E[var1 + 4] = 0;
        this.E[var1 + 5] = 0;
        this.E[var1 + 6] = 0;
        this.E[var1 + 7] = 0;
    }

    public final void a(int var1, int var2) {
        var1 *= 8;
        var2 *= 8;
        this.E = a(this.E, var2 + 8);
        System.arraycopy(this.E, var1, this.E, var2, 8);
    }

    public final boolean b(int var1, int var2) {
        var1 *= 8;
        int var3;
        if ((var3 = this.E[var1 + 3]) == 0) {
            this.a = 0;
            this.b = 0;
            return false;
        } else {
            short var4 = this.E[var1 + 0];
            int var5 = this.E[var1 + 2];
            var2 += this.E[var1 + 4] & '\uffff';
            int var6 = this.E[var1 + 5];
            int var7 = this.E[var1 + 6];
            int var8;
            int var9 = (var8 = this.s[var4][this.E[var1 + 1]]) >>> 16;
            int var10 = var8 & 1023;
            int var11 = var5;
            int var13 = var5 == this.E[var1 + 7] ? 0 : this.t[var4][var9 + var5] >> 6 & 3;

            char var12;
            int var14;
            while(var2 >= (var12 = this.C[var4][this.t[var4][var9 + var5] & 63])) {
                var2 -= var12;
                ++var5;
                if (var5 == var10) {
                    if (var3 > 0) {
                        --var3;
                        if (var3 == 0) {
                            --var5;
                            var2 = var12;
                            break;
                        }
                    }

                    var5 = 0;
                    var8 = this.u[var4][var9 + (var10 - 1)];
                    var6 -= var8 << 10 >> 22;
                    var7 -= var8 << 20 >> 22;
                }

                if ((var14 = this.t[var4][var9 + var5] >> 6 & 3) >= var13) {
                    var13 = var14;
                    var11 = var5;
                }
            }

            var14 = (var8 = this.u[var4][var9 + var5]) << 10 >> 22;
            int var15 = var8 << 20 >> 22;
            if ((var8 & 3) > 0 && var3 != 0 && (var5 + 1 != var10 || var3 != 1)) {
                int var16;
                int var17;
                if (var5 + 1 == var10) {
                    var16 = (var8 = this.u[var4][var9 + var5]) << 10 >> 22;
                    var17 = var8 << 20 >> 22;
                    var8 = 0;
                } else {
                    var16 = 0;
                    var17 = 0;
                    var8 = var5 + 1;
                }

                var8 = this.u[var4][var9 + var8];
                var16 += var8 << 10 >> 22;
                var17 += var8 << 20 >> 22;
                int var18 = (var2 << 12) / var12;
                var14 += (var16 - var14) * var18 >> 12;
                var15 += (var17 - var15) * var18 >> 12;
            }

            this.a = var14 - var6;
            this.b = var15 - var7;
            this.E[var1 + 2] = (short)var5;
            this.E[var1 + 3] = (short)var3;
            this.E[var1 + 4] = (short)var2;
            this.E[var1 + 5] = (short)var14;
            this.E[var1 + 6] = (short)var15;
            this.E[var1 + 7] = (short)var11;
            return var3 != 0;
        }
    }

    public final void a(c[] var1, int var2, int var3, int var4, int var5, int[] var6) {
        var2 = this.l(var2);
        int var7 = (var2 = this.w[this.F][var2]) >>> 16;
        int[] var8 = this.z[this.F];
        int var9 = var7 + (var2 & 255);
        int var10 = Integer.MAX_VALUE;
        int var11 = Integer.MAX_VALUE;
        int var12 = Integer.MIN_VALUE;

        int var13;
        c var15;
        int var17;
        for(var13 = Integer.MIN_VALUE; var7 < var9; var13 = Math.max(var13, var17 + var15.aX)) {
            int var14 = (var2 = var8[var7++]) & 3 ^ var5;
            int var16 = (var15 = var1[var2 >>> 22]).aU + (var2 << 10 >> 22);
            if ((var14 & 2) != 0) {
                var16 = -(var16 + var15.aW);
            }

            var17 = var15.aV + (var2 << 20 >> 22);
            if ((var14 & 1) != 0) {
                var17 = -(var17 + var15.aX);
            }

            var10 = Math.min(var10, var16);
            var11 = Math.min(var11, var17);
            var12 = Math.max(var12, var16 + var15.aW);
        }

        var6[0] = var3 + var10;
        var6[1] = var4 + var11;
        var6[2] = var12 - var10;
        var6[3] = var13 - var11;
    }

    public final int a(short[] var1, int var2, int var3) {
        var2 = this.l(var2);
        int var4 = (var2 = this.w[this.F][var2]) >>> 16;
        int[] var5 = this.z[this.F];
        int var6 = var2 & 255;
        int var7 = var4 + var6;

        int var9;
        for(int var8 = 0; var4 < var7 && var8 + 3 < var1.length; var1[var8++] = (short)var9) {
            var2 = var5[var4++];
            var1[var8++] = (short)(var2 >>> 22);
            var9 = var2 & 3 ^ var3;
            var1[var8++] = (short)(((var9 & 2) == 0 ? 1 : -1) * (var2 << 10 >> 22));
            var1[var8++] = (short)(((var9 & 1) == 0 ? 1 : -1) * (var2 << 20 >> 22));
        }

        return var6;
    }

    public final void a(Graphics var1, c[] var2, int var3, int var4, int var5, int var6) {
        this.b(var1, var2, this.l(var3), var4, var5, var6);
    }

    private void b(Graphics var1, c[] var2, int var3, int var4, int var5, int var6) {
        int var7 = (var3 = this.w[this.F][var3]) >>> 16;
        int[] var8 = this.z[this.F];

        int var11;
        c var12;
        for(int var9 = var7 + (var3 & 255); var7 < var9; var12.aV = (short)(var12.aV - var11)) {
            int var10 = (var3 = var8[var7++]) << 10 >> 22;
            var11 = var3 << 20 >> 22;
            c var10000 = var12 = var2[var3 >>> 22];
            var10000.aU = (short)(var10000.aU + var10);
            var12.aV = (short)(var12.aV + var11);
            var12.a(var1, var4, var5, var3 & 3 ^ var6);
            var12.aU = (short)(var12.aU - var10);
        }

    }

    public final int b(short[] var1, int var2, int var3) {
        var2 = this.l(var2);
        int var4 = this.v[this.F][var2];
        int var5 = this.w[this.F][var2] >> 8 & 255;
        int var6 = var4 + var5;

        int var12;
        for(int var7 = 0; var4 < var6 && var7 + 4 < var1.length; var1[var7++] = (short)var12) {
            int var8 = (var2 = this.A[this.F][var4]) >> 21;
            int var9 = var2 << 11 >> 21;
            int var10 = var2 & 1023;
            char var13;
            int var11 = (var13 = this.B[this.F][var4++]) >> 6;
            var12 = var13 & 63;
            if ((var3 & 2) != 0) {
                var8 = -(var8 + var10);
            }

            if ((var3 & 1) != 0) {
                var9 = -(var9 + var11);
            }

            var1[var7++] = (short)var8;
            var1[var7++] = (short)var9;
            var1[var7++] = (short)var10;
            var1[var7++] = (short)var11;
        }

        return var5;
    }

    private int l(int var1) {
        var1 *= 8;
        this.F = this.E[var1 + 0];
        int var2 = this.E[var1 + 1];
        var2 = (this.s[this.F][var2] >>> 16) + this.E[var1 + 7];
        return this.u[this.F][var2] >>> 22;
    }

    public final synchronized void g() {
        this.J = 0;
        this.K = 0;
        this.L |= this.H;
        this.I = 0;
        this.H = 0;
    }

    public final synchronized void h() {
        this.I = this.J;
        this.J = 0;
        this.L &= this.K;
        this.K &= ~this.L;
        this.H = this.I | this.K;
        this.L = 0;
    }

    private void b(int var1, boolean var2) {
        if (var1 != 0) {
            synchronized(this) {
                for(int var4 = 1; var4 < G.length; ++var4) {
                    if (G[var4] == var1) {
                        int var5 = 1 << var4;
                        if (var2) {
                            this.J |= var5;
                            this.K |= var5;
                            this.L &= ~var5;
                        } else {
                            this.L |= var5;
                        }
                    }
                }

            }
        }
    }

    public void keyPressed(int var1) {
        if (this.N && this.O) {
            this.N = false;
            this.f = this.M;
            this.ag = true;
        }

        var1 = m(var1);
        this.b(var1, true);
        super.keyPressed(var1);
    }

    public void keyReleased(int var1) {
        var1 = m(var1);
        this.b(var1, false);
        super.keyReleased(var1);
    }

    public void keyRepeated(int var1) {
        var1 = m(var1);
        super.keyRepeated(var1);
    }

    private static int m(int var0) {
        return var0;
    }

    public final void i() {
        this.P = this.Q;
        this.S = true;
    }

    public final void paint(Graphics var1) {
        if (this.Z) {
            if (352 != this.T || 416 != this.U) {
                if (this.X) {
                    int var3 = 416 - this.U + 1 >>> 1;
                    var1.setColor(-16777216);
                    if (var3 > 0) {
                        if (this.W > 0) {
                            var1.fillRect(0, 0, 352, this.W);
                        }

                        var1.fillRect(0, 416 - var3, 352, var3);
                    }

                    if ((var3 = 352 - this.T + 1 >>> 1) > 0) {
                        if (this.V > 0) {
                            var1.fillRect(0, this.W, this.V, this.U);
                        }

                        var1.fillRect(352 - var3, this.W, var3, this.U);
                    }
                }

                var1.translate(this.V, this.W);
            }

            this.b(var1);
            this.a(var1);
            this.Z = false;
        }
    }

    public final void c(int var1, int var2) {
        this.Y = true;
        if (var1 <= 0) {
            var1 = 352;
        }

        if (var2 <= 0) {
            var2 = 416;
        }

        this.T = var1;
        this.U = var2;
        this.V = 352 - var1;
        this.W = 416 - var2;
        if (this.V < 0) {
            ++this.V;
        }

        if (this.W < 0) {
            ++this.W;
        }

        this.V >>= 1;
        this.W >>= 1;
    }

    public final void b(Graphics var1) {
        var1.setClip(0, 0, this.T, this.U);
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        if ((this.V | this.W) != 0) {
            if (var2 < 0) {
                var4 += var2;
                var2 = 0;
            }

            int var6;
            if ((var6 = var2 + var4 - this.T) > 0) {
                var4 -= var6;
            }

            if (var3 < 0) {
                var5 += var3;
                var3 = 0;
            }

            int var7;
            if ((var7 = var3 + var5 - this.U) > 0) {
                var5 -= var7;
            }
        }

        var1.setClip(var2, var3, var4, var5);
    }

    public final void j() {
        this.Y = true;
    }

    public void n(int var1) {
        if (var1 == 3) {
            if (this.d != null) {
                this.d.shutdown();
            }

            this.ac = true;
            this.midlet.notifyDestroyed();
        }

        if (var1 == 0 || var1 == 1 || var1 == 2) {
            this.Y = true;
            this.S = true;
            this.g();
        }

    }

    public final void hideNotify() {
        this.o(1);
    }

    public final void showNotify() {
        this.o(2);
        if (this.aa == null) {
            this.aa = new Thread(this);
            this.aa.start();
        }

    }

    public final synchronized void o(int var1) {
        if (var1 == 3) {
            this.n(var1);
        } else if (this.ab && (var1 == 1 || var1 == 2)) {
            if (var1 == 1) {
                this.O = false;
                if (!this.N) {
                    this.N = true;
                    this.M = this.f;
                    this.f = false;
                }
            }

            synchronized(this.aa) {
                this.ae = var1;
                this.ad = System.currentTimeMillis();
            }
        }
    }

    private void k() {
        label77:
        while(this.ae != -1) {
            if (this.af != 1) {
                if (this.d != null) {
                    this.d.o();
                }

                this.n(1);
                this.af = 1;
            }

            synchronized(this.aa) {
                if (this.ae == 1) {
                    this.ae = -1;
                }
            }

            while(true) {
                while(true) {
                    if (this.ae != 2 || !this.isShown()) {
                        continue label77;
                    }

                    if ((int)(System.currentTimeMillis() - this.ad) < 750) {
                        try {
                            Thread.sleep(250L);
                            Thread.yield();
                        } catch (Exception var3) {
                        }
                    } else {
                        synchronized(this.aa) {
                            if (this.ae != 2) {
                                continue;
                            }

                            this.ae = -1;
                        }

                        if (this.d != null) {
                            this.d.o();
                        }

                        this.n(2);
                        this.af = 2;
                        this.O = true;
                    }
                }
            }
        }

        if (this.ag) {
            this.ag = false;
            this.n(5);
        }

    }

    public final boolean platformRequest(String var1) {
        if (this.d != null) {
            this.d.o();
        }

        try {
            if (this.midlet.platformRequest(var1)) {
                this.o(3);
            }

            return true;
        } catch (Throwable var2) {
            return false;
        }
    }

    public final Image d(int var1, byte[] var2) {
        return this.c(var1, var2);
    }

    public final byte[] p(int var1) {
        return this.c(var1);
    }

    public final void run() {
        this.ab = true;
        this.n(0);

        for(; !this.ac; Thread.yield()) {
            this.k();
            if (!this.isShown()) {
                try {
                    Thread.sleep(100L);
                } catch (Exception var6) {
                }

                this.S = true;
            } else {
                long var1 = System.currentTimeMillis();
                if (this.S) {
                    this.S = false;
                    this.P = this.Q;
                } else {
                    int var3;
                    if ((var3 = (int)(var1 - this.c)) > this.R || var3 < 0) {
                        var3 = this.R;
                    }

                    this.P = var3;
                    if (this.P < this.Q) {
                        int var4;
                        if ((var4 = this.Q - this.P) < 10) {
                            var4 = 10;
                        }

                        this.P = this.Q;

                        try {
                            Thread.sleep((long)var4);
                        } catch (Exception var9) {
                        }
                    }
                }

                this.c = var1;
                this.a();
                if (this.d != null) {
                    this.d.run();
                }

                try {
                    Thread.sleep(20L);
                } catch (Exception var8) {
                }

                if (this.ac) {
                    return;
                }

                if (this.isShown()) {
                    this.X = this.Y;
                    this.Y = false;
                    this.Z = true;
                    long var10 = System.currentTimeMillis();

                    do {
                        this.repaint();
                        this.serviceRepaints();
                        if (this.Z) {
                            if ((int)(System.currentTimeMillis() - var10) > 250 || !this.isShown()) {
                                this.Y = true;
                                break;
                            }

                            Thread.yield();
                            if (!this.Z) {
                                break;
                            }

                            try {
                                Thread.sleep(20L);
                            } catch (Exception var7) {
                            }
                        }
                    } while(this.Z);

                    this.Z = false;
                }
            }
        }

    }

    public a(MIDlet var1) {
        this.midlet = var1;
        this.c(352, 416);
    }
}
