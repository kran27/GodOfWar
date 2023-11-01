//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b {
    private final boolean ah;
    private final int ai;
    private final int aj;
    private int ak;
    private int al;
    private Image am;
    private Graphics an;
    private int ao;
    private int ap;
    private boolean aq;
    private int ar;
    private short[] as;
    private final boolean at;
    private Image au;
    private char[] av;
    private char[] aw;
    private int ax;
    private int ay;
    private int az;
    private c[] aA;
    private int[] aB;
    private int[] aC;
    private int aD;
    private boolean aE;
    private boolean aF;
    private int[] aG;
    private c[] aH;
    private int[] aI;
    private short[] aJ;
    private short[] aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private char[] aP;
    private int aQ;
    private boolean aR;

    public static b d(int var0, int var1) {
        return new b(true, false, var0, var1);
    }

    private b(boolean var1, boolean var2, int var3, int var4) {
        this.ah = var1;
        this.ai = var3;
        this.aj = var4;
        if (var1 && this.am == null) {
            this.am = Image.createImage(var3, var4);
            this.an = this.am.getGraphics();
        }

        this.at = var2;
        this.r(0);
    }

    public final void e(int var1, int var2) {
        this.ak = var1;
        this.al = var2;
    }

    public final void c(Graphics var1) {
        if (this.ah) {
            this.d(var1);
        }

    }

    private void d(Graphics var1) {
        this.l();
        this.e(var1);
    }

    private void e(Graphics var1) {
        int var2 = this.ak % this.ai;
        int var3 = this.al % this.aj;
        int var4;
        if (var2 == 0) {
            if (var3 == 0) {
                a.a(this.am, 0, 0, this.ai, this.aj, var1, 0, 0);
            } else {
                var4 = this.aj - var3;
                a.a(this.am, 0, var3, this.ai, var4, var1, 0, 0);
                a.a(this.am, 0, 0, this.ai, var3, var1, 0, var4);
            }
        } else if (var3 == 0) {
            var4 = this.ai - var2;
            a.a(this.am, var2, 0, var4, this.aj, var1, 0, 0);
            a.a(this.am, 0, 0, var2, this.aj, var1, var4, 0);
        } else {
            var4 = this.aj - var3;
            int var5 = this.ai - var2;
            a.a(this.am, var2, var3, var5, var4, var1, 0, 0);
            a.a(this.am, 0, var3, var2, var4, var1, var5, 0);
            a.a(this.am, var2, 0, var5, var3, var1, 0, var4);
            a.a(this.am, 0, 0, var2, var3, var1, var5, var4);
        }
    }

    private void q(int var1) {
        int var4 = this.ak + this.ai;

        for(int var5 = this.al + this.aj; var1 >= 0; var1 = this.aJ[var1]) {
            int var3;
            int var2 = (var3 = this.aI[var1]) >> 17;
            var3 = (short)(var3 >> 1) >> 1;
            c var6;
            if (var2 < var4 && var3 < var5 && this.ak < var2 + (var6 = this.aH[var1]).aW && this.al < var3 + var6.aX) {
                this.aP[this.aQ++] = (char)var1;
            }
        }

    }

    private void l() {
        int var1;
        if ((var1 = this.aO) >= 0) {
            if (!this.aq) {
                this.aR = true;
                this.a(this.ao, this.ap, this.ai, this.aj);
                this.aR = false;
            }

            this.aO = -1;
        }

        if (this.aq) {
            this.aq = false;
            this.ao = this.ak - this.ai;
            this.ap = this.al - this.aj;
        }

        if (this.ao == this.ak && this.ap == this.al) {
            this.q(var1);
        } else {
            int var2 = this.ak;
            int var3 = Math.min(this.ai, Math.abs(this.ao - this.ak));
            if (this.ao < this.ak) {
                var2 += this.ai - var3;
            }

            this.ao = this.ak;
            int var4 = this.al;
            int var5 = Math.min(this.aj, Math.abs(this.ap - this.al));
            if (this.ap < this.al) {
                var4 += this.aj - var5;
            }

            this.ap = this.al;
            this.aQ = 0;
            this.q(this.aL);
            if (var3 == this.ai && var5 == this.aj) {
                this.a(this.ak, this.al, var3, var5);
            } else {
                if (var3 > 0) {
                    this.a(var2, this.al, var3, this.aj);
                }

                if (var5 > 0) {
                    this.a(this.ak, var4, this.ai, var5);
                }

            }
        }
    }

    private void a(int var1, int var2, int var3, int var4) {
        int var5 = var1 % this.ai;
        int var6 = var2 % this.aj;
        int var7 = var5 + var3 - this.ai;
        int var8 = var6 + var4 - this.aj;
        if (var7 <= 0) {
            if (var8 <= 0) {
                this.a(this.an, var1, var2, var5, var6, var3, var4);
            } else {
                var4 -= var8;
                this.a(this.an, var1, var2, var5, var6, var3, var4);
                var2 += var4;
                this.a(this.an, var1, var2, var5, 0, var3, var8);
            }
        } else {
            var3 -= var7;
            if (var8 <= 0) {
                this.a(this.an, var1, var2, var5, var6, var3, var4);
                var1 += var3;
                this.a(this.an, var1, var2, 0, var6, var7, var4);
            } else {
                var4 -= var8;
                this.a(this.an, var1, var2, var5, var6, var3, var4);
                var2 += var4;
                this.a(this.an, var1, var2, var5, 0, var3, var8);
                var1 += var3;
                this.a(this.an, var1, var2, 0, 0, var7, var8);
                var2 -= var4;
                this.a(this.an, var1, var2, 0, var6, var7, var4);
            }
        }
    }

    private void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (!this.aR) {
            if (this.as != null) {
                this.b(var1, var2, var3, var4, var5, var6, var7);
            }

            if (this.az > 0) {
                this.a(var2, var3, var4, var5, var6, var7, var1);
            }
        }

        if (this.aL >= 0) {
            this.a(var2, var3, var4, var5, var6, var7, this.aR, var1);
        }

    }

    private void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.getClipX();
        int var9 = var1.getClipY();
        int var10 = var1.getClipWidth();
        int var11 = var1.getClipHeight();
        int var12;
        int var13 = (var12 = (var2 + var6 - 1) / this.ax) - var2 / this.ax;
        int var14 = (var3 + var7 - 1) / this.ay;
        var12 += var14 * this.ar;
        var14 -= var3 / this.ay;
        var2 %= this.ax;
        var3 %= this.ay;
        int var15 = var2;
        int var16 = var3;
        int var17;
        if ((var17 = -(var2 + var6) % this.ax) < 0) {
            var17 += this.ax;
        }

        int var18;
        if ((var18 = -(var3 + var7) % this.ay) < 0) {
            var18 += this.ay;
        }

        var2 = var4 - var2 + this.ax * var13;
        var3 = var5 - var3 + this.ay * var14;

        for(var7 = var14; var7 >= 0; --var7) {
            for(var6 = var13; var6 >= 0; --var6) {
                int var19;
                if ((var19 = this.as[var12--] & 4095) > 0) {
                    --var19;
                    var4 = 0;
                    var5 = 0;
                    int var20 = 0;
                    int var21 = 0;
                    if (var6 == 0) {
                        var4 = var15;
                    }

                    if (var6 == var13) {
                        var20 = var17;
                    }

                    if (var7 == 0) {
                        var5 = var16;
                    }

                    if (var7 == var14) {
                        var21 = var18;
                    }

                    if (!this.at) {
                        var1.setClip(var2 + var4, var3 + var5, this.ax - var4 - var20, this.ay - var5 - var21);
                        var1.drawImage(this.au, var2 - this.av[var19], var3 - this.aw[var19], 20);
                    }
                }

                var2 -= this.ax;
            }

            var12 += 1 + var13 - this.ar;
            var2 += this.ax * (var13 + 1);
            var3 -= this.ay;
        }

        var1.setClip(var8, var9, var10, var11);
    }

    public final void a(int var1, int var2, Image var3, int var4, int var5) {
        this.m();
        this.ar = var1;
        this.as = new short[var1 * var2];
        this.ax = var4;
        this.ay = var5;
        var4 = var3.getWidth();
        var5 = var3.getHeight();
        int var6 = var4 / this.ax * (var5 / this.ay);
        var4 -= this.ax;
        var5 -= this.ay;
        if (!this.at) {
            this.au = var3;
            this.av = new char[var6];
            this.aw = new char[var6];
            int var7 = 0;

            for(int var8 = 0; var8 <= var5; var8 += this.ay) {
                for(int var9 = 0; var9 <= var4; var9 += this.ax) {
                    this.av[var7] = (char)var9;
                    this.aw[var7] = (char)var8;
                    ++var7;
                }
            }

        }
    }

    private void m() {
        this.as = null;
        if (!this.at) {
            this.au = null;
            this.av = null;
            this.aw = null;
        }
    }

    public final void b(int var1, int var2, int var3) {
        this.as[var2 * this.ar + var1] = (short)var3;
        this.aq = true;
    }

    public final void c(int var1, boolean var2) {
        this.az = 0;
        this.aA = null;
        this.aB = null;
        this.aC = null;
        this.aD = 0;
        this.aE = true;
        this.aG = null;
        this.aq = true;
        if (var1 > 0) {
            this.aF = var2;
            this.aA = new c[var1];
            this.aB = new int[var1];
            this.aC = new int[var1];
            this.aG = new int[var1];
        }

    }

    public final void a(c var1, int var2, int var3, int var4) {
        this.aA[this.az] = var1;
        var2 += var1.s(var4);
        var3 += var1.t(var4);
        this.aB[this.az] = var2 << 17 | var3 << 17 >>> 15 | var4;
        this.aC[this.az] = (this.aF ? var3 : var2) << 16 | this.az;
        this.aD = Math.max(this.aD, this.aF ? var1.aX : var1.aW);
        ++this.az;
    }

    private void a(int var1, int var2, int var3, int var4, int var5, int var6, Graphics var7) {
        int var8 = var7.getClipX();
        int var9 = var7.getClipY();
        int var10 = var7.getClipWidth();
        int var11 = var7.getClipHeight();
        var7.setClip(var3, var4, var5, var6);
        if (this.aE) {
            a.a(this.aC, this.az);
            this.aE = false;
        }

        var5 += var1;
        var6 += var2;
        int var12 = this.aF ? var6 : var5;
        int var16 = 0;

        int var13;
        int var14;
        int var15;
        c var17;
        for(int var18 = a.a(this.aC, this.az - 1, (this.aF ? var2 : var1) - this.aD << 16); var18 < this.az && (var13 = this.aC[var18]) >> 16 < var12; ++var18) {
            var13 &= 65535;
            var14 = (var15 = this.aB[var13]) >> 17;
            var15 = (short)(var15 >> 1) >> 1;
            if (var14 < var5 && var15 < var6 && var1 < var14 + (var17 = this.aA[var13]).aW && var2 < var15 + var17.aX) {
                this.aG[var16++] = var13;
            }
        }

        a.a(this.aG, var16);
        var1 -= var3;
        var2 -= var4;

        for(var12 = 0; var12 < var16; ++var12) {
            var13 = this.aG[var12];
            var17 = this.aA[var13];
            var15 = (var14 = this.aB[var13]) & 3;
            var17.a(var7, (var14 >> 17) - var17.s(var15) - var1, ((short)(var14 >> 1) >> 1) - var17.t(var15) - var2, var15);
        }

        var7.setClip(var8, var9, var10, var11);
    }

    public final void r(int var1) {
        this.aH = null;
        this.aI = null;
        this.aJ = null;
        this.aK = null;
        this.aL = -1;
        this.aM = -1;
        this.aN = -1;
        this.aq = true;
        this.aO = -1;
        this.aP = null;
        this.aQ = 0;
        if (var1 > 0) {
            this.aH = new c[var1];
            this.aI = new int[var1];
            this.aJ = new short[var1];

            for(int var2 = 0; var2 < var1 - 1; this.aJ[var2++] = (short)var2) {
            }

            this.aJ[var1 - 1] = -1;
            this.aK = new short[var1];
            this.aN = 0;
            if (this.ah) {
                this.aP = new char[var1];
            }
        }

    }

    public final int b(c var1, int var2, int var3, int var4) {
        int var5 = this.aN;
        this.aN = this.aJ[var5];
        if (this.aL < 0) {
            this.aL = var5;
        } else {
            this.aJ[this.aM] = (short)var5;
        }

        this.aJ[var5] = -1;
        this.aK[var5] = (short)this.aM;
        this.aM = var5;
        if (this.aO < 0) {
            this.aO = var5;
        }

        this.aH[var5] = var1;
        var2 += var1.s(var4);
        var3 += var1.t(var4);
        this.aI[var5] = var2 << 17 | var3 << 17 >>> 15 | var4;
        return var5;
    }

    private void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, Graphics var8) {
        int var9 = var8.getClipX();
        int var10 = var8.getClipY();
        int var11 = var8.getClipWidth();
        int var12 = var8.getClipHeight();
        var8.setClip(var3, var4, var5, var6);
        int var13 = 0;
        boolean var14 = false;
        if (var7) {
            var13 = this.aO;
        } else if (this.ah) {
            var14 = true;
        }

        boolean var15 = false;
        var5 += var1;
        var6 += var2;
        int var18 = var1 - var3;
        int var19 = var2 - var4;

        while(true) {
            int var20;
            if (var14) {
                if (var13 == this.aQ) {
                    break;
                }

                var20 = this.aP[var13++];
            } else {
                if (var13 < 0) {
                    break;
                }

                var20 = var13;
                var13 = this.aJ[var13];
            }

            int var17;
            var3 = (var17 = this.aI[var20]) >> 17;
            var4 = (short)(var17 >> 1) >> 1;
            c var16;
            if (var3 < var5 && var4 < var6 && var1 < var3 + (var16 = this.aH[var20]).aW && var2 < var4 + var16.aX) {
                var17 &= 3;
                var16.a(var8, var3 - var16.s(var17) - var18, var4 - var16.t(var17) - var19, var17);
            }
        }

        var8.setClip(var9, var10, var11, var12);
    }
}
