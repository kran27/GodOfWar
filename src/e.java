//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.io.DataInputStream;
import java.util.Random;

public final class e extends a {
    private static boolean bp = false;
    private final d soundManager;
    public c[] br;
    public c[] bs;
    public c[] bt;
    public c[] bu;
    public int bv;
    public int bw;
    public String bx;
    public int by = 0;
    public boolean bz = false;
    public static int bA = 0;
    public static final int[] bB = new int[]{10240, 12288, 33792, 29696, 30720, 32768};
    public static final int[] bC = new int[]{23, 24, 21, 20, 22, 19};
    public static int bD;
    public static int bE;
    public boolean bF;
    public boolean bG = false;
    public boolean bH = false;
    public static int halfWidth;
    public static int bL;
    public static int x;
    public int y;
    public int bM = 0;
    public static int bN;
    public static int bO;
    public int bP;
    public static Random bQ;
    private static boolean bR = false;
    private b bS;
    private Image bT;
    private static int bU;
    private static int bV;
    public int[] bW = new int[4];
    private c[] bX;
    public int bY = 0;
    private static boolean bZ = false;
    private static boolean ca = false;
    public static int[] cb;
    public static byte[] cc;
    public int cd;
    public int ce;
    public int cf;
    public boolean cg;
    public boolean ch;
    public boolean ci;
    public boolean cj;
    public int ck;
    public int cl;
    public int cm;
    public int cn;
    public boolean co;
    public int cp;
    public int cq;
    public boolean cr;
    public boolean cs;
    public boolean ct;
    public boolean cu;
    public boolean cv;
    public boolean cw;
    public boolean cx;
    public boolean cy;
    public boolean cz;
    public boolean cA;
    public static byte cB = 4;
    public boolean cC;
    public int cD;
    public boolean cE;
    public int cF = 0;
    public int cG = 0;
    public int cH = 200;
    public int cI = -1;
    public int cJ = -1;
    public int cK;
    public int cL;
    public int cM;
    public int cN = -1;
    public int[] cO;
    public int[] cP;
    public boolean[] cQ;
    public boolean[] cR;
    public int cS = 0;
    public int cT = 0;
    public int cU = 60;
    public static c[] cV;
    public int cW;
    public int cX;
    public int cY;
    public int cZ;
    public int[] da = new int[2];
    public boolean db = false;
    public boolean dc;
    public int dd = -1;
    public c[] de;
    public static final byte[] df = new byte[]{11, 2, 2, 2, 2};
    public boolean dg = false;
    public int dh;
    public int[] di = new int[40];
    public int[] dj = new int[40];
    public int dk;
    public int dl;
    public boolean dm;
    public int dn;
    public boolean d_o = false;
    public boolean dp = false;
    public int dq = 0;
    public static byte dr = 3;
    public boolean ds;
    public static byte dt = 0;
    public boolean du = false;
    public int dv = 0;
    public int dw = 0;
    public static String dx;
    public int dy;
    public static c[] dz;
    public int dA = 0;
    public int dB;
    private byte[] dC;
    private short[] dD;
    private static int dE;
    private static int dF;
    private static int dG;
    private static int dH;
    private static int dI;
    public int dJ;
    public int[] dK;
    public int[] dL;
    public int dM;
    public int dN;
    public int count;
    public int dO;
    public int dP;
    public int dQ;
    public int dR = -1;
    public static final int[] dS = new int[]{9217, 19456, 20480, 21504, 22528, 23552, 24576, 25600, 26624, 27648};
    public int dT;
    public int dU;
    public int dV;
    public String dW;
    public static final int[] dX = new int[]{-1, -1, -1, 2, 0, 1, 1, 0, 2, 2};
    private byte[] dY;
    private int dZ;
    private int ea;
    private int eb;
    public c[] ec;
    public static int[] ed = new int[10];
    public int[] ee = new int[10];
    public int[] ef = new int[10];
    public int[] eg = new int[10];
    public int eh = -1;
    public c[] ei;
    public int[] ej = new int[10];
    public static int[] ek = new int[10];
    public int[] el = new int[10];
    public static int[] em = new int[10];
    public int[] en = new int[10];
    public int[] eo = new int[10];
    public int[] ep = new int[10];
    public boolean[] eq = new boolean[10];
    public static int er = -1;
    public c[] es;
    public int[] et = new int[20];
    public static int[] eu = new int[20];
    public static int[] ev = new int[20];
    public int[] ew = new int[20];
    public int[] ex = new int[20];
    public static int ey = -1;
    public c[] ez;
    public int[] eA = new int[20];
    public int[] eB = new int[20];
    public static int[] eC = new int[20];
    public int[] eD = new int[20];
    public int[] eE = new int[20];
    public static int eF = -1;
    public int[] eG;
    public static int[] eH;
    public int[] eI;
    public int[] eJ;
    public c[] eK;
    public c[] eL;
    public int eM = -1;
    public int eN;
    public int eO;
    public int eP;
    public static int eQ;
    public static c[] eR;
    public int eS = -1;
    public int[] eT;
    public static int[] eU;
    public boolean[] eV;
    public int[] eW;
    public int[] eX;
    public boolean[] eY;
    public static int[] eZ;
    public int[] fa;
    public static int[] fb;
    public int[] fc;
    public static int fd = -1;
    public c[] fe;
    public static int[] ff;
    public static int[] fg;
    public static int[] fh;
    public int[] fi;
    public static int[] fj;
    public static int[] fk;
    public int[] fl;
    public int[] fm;
    public int[] fn;
    public static int[] fo;
    public int[] fp;
    public static boolean[] fq;
    public boolean[] fr;
    public byte[] fs;
    public int[] ft;
    public static int[] fu;
    public int[] fv;
    public int[] fw;
    public int[] fx;
    public static int[] fy;
    public int[] fz;
    public static int[] fA;
    public int[] fB;
    public c[] fC;
    public int[] fD = new int[10];
    public int[] fE = new int[10];
    public int[] fF = new int[10];
    public static int[] fG = new int[10];
    public static int[] fH = new int[10];
    public int[] fI = new int[10];
    public int[] fJ = new int[10];
    public int fK = -1;
    public c[] fL;
    public int[] fM = new int[15];
    public int[] fN = new int[15];
    public static int[] fO = new int[15];
    public int[] fP = new int[15];
    public int[] fQ = new int[15];
    public int[] fR = new int[15];
    public static int[] fS = new int[15];
    public int[] fT = new int[15];
    public int fU = -1;
    public boolean fV;
    public boolean fW;
    public c[] fX;
    public static c[] fY;
    public c[] fZ;
    public c[] ga;
    public int gb;
    public int gc = 0;
    public int gd;
    public static int[] ge = new int[15];
    public int[] gf = new int[15];
    public int gg;
    public static int gh;
    public int gi;
    public byte gj;
    public int[] gk = new int[15];
    public byte[] gl = new byte[15];
    public int[] gm = new int[15];
    public byte[] gn = new byte[15];
    public static int[] go = new int[15];
    public int[] gp = new int[15];
    public static int[] gq = new int[15];
    public static int[] gr = new int[15];
    public int[] gs = new int[15];
    public byte[] gt = new byte[15];
    public int[] gu = new int[15];
    public int[] gv = new int[15];
    public static byte[] gw = new byte[15];
    public static byte[] gx = new byte[15];
    public static byte[] gy = new byte[15];
    public short[] gz = new short[15];
    public short[] gA = new short[15];
    public byte[] gB = new byte[15];
    public boolean[] gC = new boolean[15];
    public boolean[] gD = new boolean[15];
    public boolean[] gE = new boolean[15];
    public static int[] gF = new int[15];
    public byte[] gG = new byte[15];
    public int[] gH = new int[15];
    public static int[] gI = new int[15];
    public int[] gJ = new int[15];
    public int[] gK = new int[15];
    public boolean[] gL = new boolean[15];
    public static int[] gM = new int[15];
    public static boolean[] gN = new boolean[15];
    public int[] gO = new int[15];
    public static int[] gP = new int[15];
    public static boolean[] gQ = new boolean[15];
    public static short[] gR = new short[30];
    public static boolean gS = true;
    public boolean gT;
    public boolean gU = true;
    public static boolean gV = true;
    public int gW;
    public int[] gX;
    public int[] gY;
    public int[] gZ;
    public int[] ha;
    public boolean[] hb;
    public c[] hc;
    public int[] hd;
    public int[] he;
    public int[] hf;
    public static byte[] hg;
    public c[] hh;
    public int[] hi;
    public int[] hj;
    public int[] hk;
    public static int[] hl;
    public int[] hm;
    public int[] hn;
    public int[] ho;
    public byte[] hp;
    public byte[] hq;
    public static boolean[] hr;
    public static int hs = -1;
    public c[] ht;
    public int hu = -1;
    public int[] hv;
    public int[] hw;
    public static int[] hx;
    public static int[] hy;
    public int[] hz;
    public static int[] hA;
    public int[] hB;
    public byte[] hC;
    public byte[] hD;
    public static boolean[] hE;
    public static boolean[] hF;
    public c[] hG;
    public int hH = -1;
    public int hI;
    public int hJ;
    public static boolean[] hK;
    public int[] hL;
    public int[] hM;
    public static int[] hN;
    public int[] hO = new int[10];
    public c[] hP;
    public int hQ = -1;
    public int hR = 0;
    public c[] hS;
    public static final int[] hT = new int[80];
    public static final int[] hU = new int[80];
    public static final int[] hV = new int[20];
    public static final int[] hW = new int[20];
    public static final int[] hX = new int[20];
    public static final int[] hY = new int[20];
    public static final int[] hZ = new int[20];
    public static final int[] ia = new int[20];
    public int ib = -1;
    public c[] ic;
    public static final byte[] ie = new byte[]{2, 2, 2, 4, 4, 4, 8};
    public static final byte[] i_f = new byte[]{4, 4, 10, 10, 18, 18};
    public static final byte[] ig = new byte[]{2, 3, 4, 5, 6};
    public static final int[] ih = new int[]{128, 256, 512, 1024, 1536};
    public int ii = 0;
    public boolean ij;
    public int ik;
    public int il;
    public int im;
    public static boolean in;
    public int io;
    public int ip;
    public static final int[] iq = new int[]{2, 4, 5, 6, 8};
    public boolean ir;
    public int is;
    public int it;
    public int iu;
    public int iv;
    public int iw;
    public int ix;
    public static int iy;
    public static int iz;
    public int iA = -1;
    public boolean iB;
    public static boolean iC;
    public static boolean iD;
    public boolean iE;
    public boolean iF;
    public boolean iG;
    public byte iH;
    public boolean iI;
    public boolean iJ;
    public boolean iK;
    public boolean iL;
    public static boolean iM;
    public static boolean iN;
    public boolean iO;
    public boolean iP;
    public boolean iQ;
    public boolean iR;
    public int iS;
    public static int iT;
    public boolean iU;
    public boolean iV;
    public boolean iW;
    public static boolean iX;
    public static int iY;
    public int iZ;
    public boolean ja;
    public static int jb;
    public int jc;
    public static int jd;
    public int je = 0;
    public int jf = -1;
    public int jg;
    public int jh;
    public static boolean ji;
    public static byte jj;
    public byte jk;
    public static byte jl;
    public static byte jm;
    public static final int[] jn;
    public static final int[] jo;
    public static final int[] jp;
    public static final int[] jq;
    public static byte jr;
    public static byte js;
    public int jt;
    public int ju;
    public int jv;
    public int jw;
    public static boolean jx;
    public static boolean jy;
    public boolean jz = false;
    public static int jA;
    public static byte jB;
    public int jC;
    public static int jD;
    public int jE;
    public int jF;
    public int jG;
    public static int jH;
    public int jI;
    public int jJ;
    public int jK;
    public int jL;
    public int jM;
    public static int jN;
    public int jO;
    public short[] jP = new short[20];
    public static boolean jQ;
    public boolean jR;
    public boolean jS;
    public int jT;
    public int jU;
    public int jV;
    public int jW = -1;
    public static int jX;
    public boolean jY = true;
    public static boolean jZ;
    public boolean ka = false;
    public boolean kb = false;
    public boolean kc = false;
    public int kd = 0;
    public int ke;
    public int kf;
    public int kg = 0;
    public int kh = 0;
    public short[] ki = new short[256];
    public int kj = 0;
    public int kk;
    public int kl = -1;
    public int km;
    public boolean kn;
    public static int ko;
    public static int kp;
    public static int kq;
    public static int id;
    public static String[] kr;
    public static String[] ks;
    public static byte[] kt;
    public static int ku;
    public static int kv;
    public static int kw;
    public static boolean kx;
    public static final int[] ky;
    public static final int[] kz;
    public static final int[] kA;
    public static final byte[] kB;
    public static final byte[] kC;
    public int kD;
    public int kE;
    public int kF;
    public int kG;
    public int kH;
    public int kI;
    public int kJ;
    public boolean kK;
    public static byte[] kL;
    public static byte[] kM;
    public static int[] kN;
    public static boolean kO;
    public int kP;
    public int kQ = -1;
    public static int[] kR;
    public static int kS;
    public int kT;
    public int kU;
    public int kV;
    public boolean kW;
    public boolean kX = false;
    public boolean kY = false;
    public int kZ;
    public int la;
    public int lb;
    public int lc;
    public int ld;
    public boolean le = false;
    public int lf;
    public static boolean lg;

    static {
        int[] var10000 = new int[]{320, 420, 690, 400, 500, 590, 1030};
        jd = 0;
        jn = new int[]{1000, 2000, 3000, 4000};
        jo = new int[]{1000, 2000, 3000, 4000};
        jp = new int[]{1000, 2000, 3000, 4000};
        jq = new int[]{1000, 2000, 3000, 4000};
        jr = 0;
        js = 0;
        jx = false;
        jy = false;
        jX = -1;
        jZ = true;
        var10000 = new int[]{-1, -1, -1};
        byte[] var0 = new byte[]{13, 4, 4};
        ky = new int[]{40, -1, -3, -3, -3};
        kz = new int[]{42, -1, -3, -3, -3};
        kA = new int[]{44, -1, -3, -3, -3};
        kB = new byte[]{13, 4, 2, 2, 2};
        kC = new byte[]{13, 4, 4, 4, 4};
        var10000 = new int[]{-1, 64};
        kO = true;
    }

    private void p() {
        int var1;
        if ((var1 = super.I) != 0) {
            if ((var1 & 2097408) != 0) {
                this.bv = 8;
            } else if ((var1 & 4194336) != 0) {
                this.bv = 5;
            } else if ((var1 & 1048580) != 0) {
                this.bv = 2;
            } else if ((var1 & 262146) != 0) {
                this.bv = 1;
            } else if ((var1 & 16777280) != 0) {
                this.bv = 6;
            } else if ((var1 & 131072) != 0) {
                this.bv = 17;
            } else if ((var1 & 524288) != 0) {
                this.bv = 19;
            } else if ((var1 & 8388608) != 0) {
                this.bv = 23;
            } else if ((var1 & 33554432) != 0) {
                this.bv = 25;
            } else if ((var1 & 65536) != 0) {
                this.bv = 16;
            } else if ((var1 & 1024) != 0) {
                this.bv = 10;
            } else if ((var1 & 8) != 0) {
                this.bv = 3;
            } else if ((var1 & 134217728) != 0) {
                this.bv = 27;
            } else {
                this.bv = 0;
            }

            if ((var1 & 603979776) != 0) {
                this.bv = 29;
                return;
            }
        } else {
            this.bv = 0;
        }

    }

    private void q() {
        int var1;
        if ((var1 = super.H) != 0) {
            if ((var1 & 2097408) != 0) {
                this.bw = 8;
            } else if ((var1 & 4194336) != 0) {
                this.bw = 5;
            } else if ((var1 & 1048580) != 0) {
                this.bw = 2;
            } else if ((var1 & 262146) != 0) {
                this.bw = 1;
            } else if ((var1 & 16777280) != 0) {
                this.bw = 6;
            } else if ((var1 & 131072) != 0) {
                this.bw = 17;
            } else if ((var1 & 524288) != 0) {
                this.bw = 19;
            } else if ((var1 & 8388608) != 0) {
                this.bw = 23;
            } else if ((var1 & 33554432) != 0) {
                this.bw = 25;
            } else if ((var1 & 65536) != 0) {
                this.bw = 16;
            } else if ((var1 & 1024) != 0) {
                this.bw = 10;
            } else if ((var1 & 8) != 0) {
                this.bw = 3;
            } else if ((var1 & 134217728) != 0) {
                this.bw = 27;
            } else if ((var1 & 604012544) != 0) {
                this.bw = 29;
            } else {
                this.bw = 0;
            }
        } else {
            this.bw = 0;
        }
    }

    public e(GOWMIDlet var1) {
        super(var1);
        super.R = 100;
        super.Q = 20;
        this.c(width, height);
        this.soundManager = new d(this, 12);
        this.soundManager.setMuteState(false);
        x = 0;

        try {
            this.bF = parseInt(var1.getAppProperty("ENABLECHEATS"), 0) == 1;
        } catch (Exception var4) {
            this.bF = false;
        }

        try {
            this.dV = parseInt(var1.getAppProperty("DEMO"), 0);
            this.dW = var1.getAppProperty("DemoBuyURL");
        } catch (Exception var3) {
            this.dV = 0;
            this.dW = "";
        }

        try {
            this.bx = var1.getAppProperty("carrierurl");
        } catch (Exception var2) {
            this.bx = null;
        }
    }

    public final void n(int var1) {
        if (var1 != 0) {
            if (var1 == 1) {
                if (x != 102 && x != 107) {
                    this.cp = this.ck >> 8;
                    this.cq = this.cl >> 8;
                }

                if (x != 107 && x != 102) {
                    this.y = x;
                }

                if (x != 100 && x != 78 && x != 105 && x != 108 && x != 101 && x != 102 && x != 104 && x != 106 && x != 109 && x != 103 && x != 79 && x != -3 && x != 16 && x != 107 && x != 0 && x != 1) {
                    x = 80;
                    this.kn = false;
                } else if (x != 79 && x != 106 && x != 108 && x != 109 && x != -3 && x != 1 && x != 16 && x != 107 && x != 0 && x != 78) {
                    this.c(bL - (bD << 1), bL - (bD << 1), 35, 35);
                    this.kn = false;
                    this.cd = bL - (bD << 1) << 8;
                    this.ce = bL - (bD << 1) << 8;
                    this.cg = false;
                    x = 102;
                    this.kW = true;
                }

                this.le = false;
                this.kX = true;
            } else if (var1 == 5) {
                if (this.kn && x == 80) {
                    this.kn = false;
                    this.playSound(0);
                }
            } else if (var1 == 2) {
                if (x == 80) {
                    this.playSound(0);
                }
            } else if (var1 == 3) {
                this.soundManager.o();
            }
        }

        super.n(var1);
    }

    public final void a() {
        bN = super.P >> this.kd;
        this.h();
        this.p();
        this.q();
        int var4;
        switch (x) {
            case 0:
                if (this.bM <= 13) {
                    this.s();
                    return;
                }

                this.bX = null;
                this.b((DataInputStream)null);
                this.kX = true;
                this.L(1);
                this.bX = null;
                ks = new String[3];
                ks[0] = this.getResourceString(36);
                ks[1] = "";
                ks[2] = "";
                this.a(kA, kC);
                x = 78;
                this.f();
                this.bM = 0;
                return;
            case 1:
                this.r();
                if (this.bz) {
                    aj();
                    if (this.by == 0) {
                        this.ag();
                        this.c(false);
                        cc = this.c(this.dR);
                        this.iA = -1;
                        gh = -1;
                        this.gi = -1;
                    }

                    if (this.by <= 10) {
                        this.a(cc, false);
                        return;
                    }

                    this.g();
                    cc = null;
                    if (this.gW >= 1) {
                        --this.gW;
                    }

                    this.y();
                    var4 = this.by;
                    this.by = 0;
                    this.by = var4;
                    this.bz = false;
                    this.c(false);
                    this.t();
                    this.bS.e(bU, bV);
                    this.c(bL, bL, 35, 35);
                    this.dp = true;
                    if (this.bY <= 0) {
                        this.cv = true;
                        return;
                    }
                }

                return;
            case 78:
                if (this.bv == 27 || this.bv == 8) {
                    this.h(bB[bA]);
                    this.kX = true;
                    this.j();
                    ks = new String[3];
                    ks[0] = this.getResourceString(36);
                    ks[1] = "";
                    ks[2] = "";
                    this.a(kA, kC);
                    x = 79;
                    return;
                }

                if (this.bv == 1) {
                    if (bA > 0) {
                        --bA;
                        return;
                    }

                    return;
                } else {
                    if (this.bv == 6) {
                        if (bA < 5) {
                            ++bA;
                            return;
                        }
                    } else if (this.bv == 29) {
                        this.ap();
                        return;
                    }

                    return;
                }
            case 79:
                this.al();
                this.r();
                if ((this.bv == 27 || this.bv == 29) && this.cd == 0) {
                    if (this.bv == 27) {
                        this.soundManager.setMuteState(true);
                    } else {
                        this.soundManager.setMuteState(false);
                    }

                    bp = this.soundManager.n();
                    this.playSound(0);
                    if (this.ck == bL << 8) {
                        this.c(0, 0, 35, 35);
                    } else {
                        this.c(bL, bL, 35, 35);
                    }

                    this.kX = true;
                    return;
                }

                return;
            case 80:
                this.bP = bQ.nextInt();
                if (this.cd == 0) {
                    this.ao();
                    this.an();
                }

                this.r();
                if (this.bv == 48 && this.bF) {
                    for(var4 = 0; var4 < 10; ++var4) {
                        int var10001 = 9 + var4;
                        int[] var10002 = kR;
                        kR[var10001] = var10002[9 + var4] |= 50331648;
                    }

                    return;
                }

                return;
            case 101:
            case 102:
            case 105:
            case 108:
                break;
            case 104:
                this.kd = 0;
                if (this.hQ == 10) {
                    this.jI += 3;
                    this.jF += this.jI / 64;
                    if (this.jF > this.jI) {
                        this.jF = this.jI;
                    }
                } else {
                    this.jJ += 3;
                    jH += this.jJ / 64;
                    if (jH > this.jJ) {
                        jH = this.jJ;
                    }
                }

                if (this.hR <= 0) {
                    x = 100;
                    this.kW = true;
                    if (this.jF > this.jI && this.hQ == 10) {
                        this.jF = this.jI;
                    } else if (this.hQ == 9) {
                        jH = this.jJ;
                    }
                }

                this.hR -= 3;
            case 100:
                this.dA += bN;
                if (this.dA >= 250) {
                    this.dA = 0;
                    if (this.dB == 0) {
                        this.dB = 16777215;
                    } else {
                        this.dB = 0;
                    }
                }

                this.dm = false;
                break;
            case 106:
                this.r();
                this.E(134);
                if (!this.E(133)) {
                    if (this.ds) {
                        c var1 = cV[this.du ? 37 : 34];
                        c var2 = cV[this.du ? 41 : 38];
                        int var3;
                        if (!this.du) {
                            for(var3 = 0; var3 <= dr; ++var3) {
                                cV[34 + var3] = var3 + 1 > dr ? var1 : cV[34 + var3 + 1];
                                cV[38 + var3] = var3 + 1 > dr ? var2 : cV[38 + var3 + 1];
                            }
                        } else {
                            for(var3 = 0; var3 <= dr; ++var3) {
                                cV[37 - var3] = var3 + 1 > dr ? var1 : cV[37 - var3 - 1];
                                cV[41 - var3] = var3 + 1 > dr ? var2 : cV[41 - var3 - 1];
                            }
                        }
                    }

                    this.ds = false;
                    this.a(133, 1025, 2);
                }

                this.v();
                this.al();
                return;
            case 107:
                if (!this.dg) {
                    this.ah();
                }

                if (this.dg) {
                    if (this.bw == 1) {
                        this.dh = 24;
                    } else {
                        this.dh = 4;
                    }

                    if (this.bw == 6) {
                        this.dh = -24;
                    }

                    this.kI += bN * this.dh;
                    if (this.kI < 0) {
                        this.kI = 0;
                    }

                    if ((this.kI >> 8 > 70 + this.height - bD || this.bw == 29 && this.cd == this.ck) && x == 107 && this.ck < bL << 8) {
                        this.c(bL, bL, 35, 35);
                        if (this.bY > 0) {
                            this.cv = true;
                        } else {
                            this.cw = true;
                            this.bY = -1;
                        }
                    }
                } else if (this.bv == 29 && this.cd == this.ck) {
                    this.cr = true;
                    this.c(bL, bL, 35, 35);
                    this.kX = true;
                }

                this.r();
                return;
            case 109:
                this.r();
                if (this.cd == this.ck && this.ce == this.cl && !this.cg) {
                    if (this.bv == 27) {
                        this.a(133, 1025, 2);
                        this.a(134, 1025, 3);
                        if (this.dV > 0 && this.dT >= this.dV) {
                            lg = true;
                            this.platformRequest(this.dW);
                            this.ap();
                        } else {
                            this.cE = true;
                            this.K(1);
                            this.c(bL, bL, 35, 35);
                        }
                    }

                    if (this.bv == 29) {
                        this.c(bL, bL, 35, 35);
                        this.cy = true;
                        this.eM = -1;
                        return;
                    }
                }

                return;
            default:
                return;
        }

        this.bP = bQ.nextInt();
        if ((x == 100 || x == 105 || x == 108) && !this.dm) {
            this.E();
        }

        if (x == 105) {
            this.bw = 0;
            this.bv = 0;
        }

        if (x == 101) {
            if (this.cd >= this.ck && this.cd < this.height << 8) {
                this.dn += bN >> 4 - (this.bw == 8 ? 3 : 0);
            }

            this.w();
        } else {
            this.dn = 0;
        }

        this.t();
        this.bS.e(bU, bV);
        this.r();
    }

    private void c(int var1, int var2, int var3, int var4) {
        this.ci = this.cd <= var1 << 8;
        this.cj = this.ce <= var2 << 8;
        this.cg = this.cj || this.ci;
        if (this.cg) {
            this.cf = 375;
        }

        this.ck = var1 << 8;
        this.cl = var2 << 8;
        this.cm = var3;
        this.cn = var4;
        this.bz = false;
        this.cz = false;
        this.cy = false;
        this.ch = false;
    }

    private void r() {
        if (this.cd >= this.ck && this.ce >= this.cl && (x == 105 || x == 100)) {
            this.dm = false;
        }

        if (this.cd == this.ck && this.ce == this.cl && this.cf > 0) {
            if (this.cf == 375 && x != 101 && x != 105) {
                this.playSound(1);
            }

            this.cf -= bN;
            if (this.cf < 0) {
                this.cf = 0;
                return;
            }
        } else {
            if (x == 1) {
                if (this.cd == this.ck && this.ce == this.cl && this.cg && this.bY <= 0) {
                    if (!this.cv) {
                        if (!bR) {
                            this.c(bL - (bD << 1), bL - (bD << 1), 35, 35);
                        } else {
                            this.c(bL - (bD << 1) - bD, bL - (bD << 1) - bD, 35, 35);
                        }

                        this.cg = false;
                    } else {
                        this.c(0, 0, 35, 35);
                        x = 100;
                        this.kW = true;
                        this.by = 0;
                        this.bY = 0;
                        this.dp = false;
                        this.cv = false;
                    }
                } else if (this.bY > 0 && this.by >= 10 && this.cd >= this.ck && this.ce >= this.cl && this.cg) {
                    this.dp = true;
                    int[] var2;
                    (var2 = new int[3])[0] = -1;
                    var2[1] = this.bY;
                    var2[2] = -1;
                    this.eM = -1;
                    this.a(var2, df, 12, 35, width - 40, 346, 30);
                    this.dg = true;
                    this.c(35, 35, 35, 35);
                    this.kI = 0;
                    x = 107;
                } else if (this.bY > 0 && this.by > 10 && !this.cg && this.cd == this.ck && this.ce == this.cl) {
                    this.dg = true;
                    this.dp = true;
                    this.c(bL, bL, 35, 35);
                    this.bz = true;
                } else if (this.cd == this.ck && this.ce == this.cl && !this.cg && !this.bz) {
                    this.cg = false;
                    this.bz = true;
                }
            } else if (x == 101) {
                if (this.cd == this.ck && this.ce == this.cl && this.cg && this.dg) {
                    this.a(this.da, df, 12, 35, width - 40, 346, 30);
                    if (ks != null) {
                        ks[0] = "";
                        ks[2] = "";
                    }

                    this.c(35, 35, 35, 35);
                    x = 107;
                    this.kI = 0;
                }
            } else if (x == 102) {
                if (this.cd == this.ck && this.ce == this.cl && this.cg) {
                    if (this.cz) {
                        this.c(this.cp, this.cq, 35, 35);
                        x = this.y;
                        this.cz = false;
                        this.cg = false;
                        this.a(this.da, df, 12, 0, width - 40, bD * 5 + bE, 30);
                    } else if (this.cy) {
                        this.cy = false;
                        this.ag();
                        this.playSound(0);
                        this.c(true);
                        this.b((DataInputStream)null);
                        kS = 0;
                        this.kT = 0;
                        x = 80;
                        this.c(0, 0, 35, 35);
                        this.K(1);
                    } else if (this.cx) {
                        this.ap();
                    } else if (this.cA) {
                        this.j();
                        ks = new String[3];
                        ks[0] = "";
                        ks[2] = "";
                        this.a(this.bt);
                        ks[1] = this.getResourceString(114) + "\n" + this.getResourceString(292) + "\n\n\n\n";
                        this.a(ky, kB);
                        this.c(35, 35, 35, 35);
                        x = 107;
                        this.kI = 0;
                    } else {
                        this.c(bL - (bD << 1), bL - (bD << 1), 35, 35);
                        this.ch = true;
                    }

                    this.cg = false;
                }
            } else if (x == 80) {
                if (this.cd == this.ck && this.ce == this.cl && this.cg && this.ct) {
                    this.ct = false;
                    this.j();
                    ks = new String[3];
                    ks[0] = "";
                    ks[2] = "";
                    this.a(this.bt);
                    if (this.cs) {
                        ks[1] = this.getResourceString(115);
                        int var1;
                        if ((var1 = ks[1].indexOf(37)) != -1) {
                            ks[1] = ks[1].substring(0, var1) + "1.4.58" + ks[1].substring(var1 + 1, ks[1].length());
                        }

                        this.a(kz, kB);
                    } else {
                        ks[1] = this.getResourceString(114) + "\n" + this.getResourceString(292) + "\n\n\n\n";
                        this.a(ky, kB);
                    }

                    this.c(35, 35, 35, 35);
                    x = 107;
                }
            } else if (x == 79) {
                if (this.cd == this.ck && this.ce == this.cl && this.cg) {
                    this.c(0, 0, 35, 35);
                    this.le = false;
                    this.kX = true;
                    this.K(1);
                    x = 80;
                }
            } else if (x != 107) {
                if (x == 109) {
                    if (this.cd == this.ck && this.ce == this.cl && this.cg) {
                        if (!this.cy && !this.cE) {
                            this.c(bL - (bD << 1), bL - (bD << 1), 35, 35);
                        } else if (this.cE) {
                            this.a(133, 1025, 2);
                            this.a(134, 1025, 3);
                            x = 106;
                            this.c(0, 0, 35, 35);
                        } else {
                            x = 80;
                            this.playSound(0);
                            this.cy = false;
                            this.K(1);
                            if (this.dU >= 10) {
                                kS = 9;
                            } else {
                                kS = this.dU + 9;
                            }

                            this.ag();
                            this.c(true);
                            this.b((DataInputStream)null);
                            this.dp = false;
                            this.kT = 0;
                            this.c(0, 0, 35, 35);
                        }
                    }
                } else if (x == 108 && this.cd == this.ck && this.ce == this.cl && this.cg) {
                    if (!this.cy && !this.cz) {
                        if (bR) {
                            this.c(bL - (bD << 1) - bD - (bD >> 2), bL - (bD << 1) - bD - (bD >> 2), 35, 35);
                        } else {
                            this.c(bL - bE - (bD >> 2), bL - bE - (bD >> 2), 35, 35);
                        }

                        this.ch = true;
                    } else if (!this.cz && this.cy) {
                        this.cy = false;
                        this.ag();
                        this.playSound(0);
                        this.c(true);
                        this.b((DataInputStream)null);
                        this.kT = 0;
                        kS = 0;
                        x = 80;
                        this.c(0, 0, 35, 35);
                        this.K(1);
                    } else {
                        x = 100;
                        this.kW = true;
                        this.c(0, 0, 35, 35);
                        this.ch = true;
                    }
                }
            } else {
                if (this.cd != this.ck || this.ce == this.cl) {
                    this.j();
                }

                if (this.cd == this.ck && this.ce == this.cl && this.cr) {
                    if (!this.cA) {
                        x = 80;
                        this.cr = false;
                        kS = 0;
                        this.kT = 0;
                        this.c(0, 0, 35, 35);
                    } else if (this.cd == bL << 8) {
                        this.eM = this.cD;
                        this.cA = false;
                        this.cr = false;
                        this.c(bL - (bD << 1), bL - (bD << 1), 35, 35);
                        x = 102;
                    }
                } else if (this.cd == this.ck && this.ce == this.cl && this.cw && this.bY < 0) {
                    this.c(bL - (bD << 1), bL - (bD << 1), 35, 35);
                    this.dp = true;
                    this.cw = false;
                    this.le = false;
                    ++kS;
                    ++this.dT;
                    if (this.dT > this.dU && (this.dV <= 0 || this.dT < this.dV)) {
                        this.dU = this.dT;
                    }

                    if (this.dT < 10) {
                        this.dR = dS[this.dT];
                    }

                    this.co = true;
                    this.bz = false;
                    this.ag();
                    if (this.dT < 10) {
                        x = 109;
                    } else {
                        this.ag();
                        this.playSound(0);
                        this.c(true);
                        this.b((DataInputStream)null);
                        this.c(0, 0, 35, 35);
                        this.kT = 0;
                        kS = 0;
                        this.dp = false;
                        x = 80;
                        this.K(1);
                    }
                } else if (this.cd >= this.ck && this.ce >= this.cl && this.bY > 0 && this.cv) {
                    x = 100;
                    this.kW = true;
                    this.dp = false;
                    this.cv = false;
                    this.by = 0;
                    this.bY = 0;
                    this.c(0, 0, 35, 35);
                }
            }

            if (x == 102 && this.ch && this.cf < 0) {
                this.ch = false;
                x = this.y;
                this.dm = true;
                this.kW = true;
            }

            if (this.cd > 139) {
                if (x == 108 && this.cd == this.ck && !this.cg) {
                    if (this.bv != 8 && this.bv != 27) {
                        if (this.bv == 29) {
                            this.c(bL, bL, 35, 35);
                            this.cy = true;
                        }
                    } else if (!bR) {
                        this.iw = this.iu;
                        this.ix = this.iv;
                        jQ = this.jR;
                        bU = this.iw - halfWidth - ((jQ ? 1 : -1) * width >> 2);
                        bV = this.ix - width + 2;
                        this.cY = bU << 8;
                        this.cZ = bV << 8;
                        this.jS = false;
                        this.D(0);
                        this.jF = this.jI;
                        this.jG = this.jI;
                        jH = this.jJ;
                        this.c(bL, bL, 35, 35);
                        this.ch = true;
                        this.kW = true;
                        this.jf = -1;
                        this.cz = true;
                    }
                } else if (x == 102 && this.cd == this.ck && !this.cg) {
                    if (this.bv != 8 && this.bv != 27) {
                        if (this.bv == 29) {
                            if (this.cC) {
                                this.cC = false;
                            } else {
                                this.c(bL, bL, 35, 35);
                                this.cz = true;
                            }
                        } else if (this.bv == 2) {
                            if (!this.cC) {
                                ++cB;
                                if (cB > 4) {
                                    cB = 4;
                                }
                            }
                        } else if (this.bv == 5 && !this.cC) {
                            --cB;
                            if (cB < 1) {
                                cB = 1;
                            }
                        }
                    } else if (cB == 4) {
                        this.soundManager.setMuteState(!this.soundManager.n());
                        bp = this.soundManager.n();
                    } else if (cB == 2 && this.cC) {
                        this.c(bL, bL, 35, 35);
                        this.eM = -1;
                        this.cy = true;
                    } else if (cB == 1 && this.cC) {
                        this.c(bL, bL, 35, 35);
                        this.cx = true;
                    } else if ((cB == 2 || cB == 1) && !this.cC) {
                        this.cC = true;
                    } else if (cB == 3) {
                        this.dg = false;
                        this.c(bL, bL, 35, 35);
                        this.cA = true;
                        this.cD = this.eM;
                        this.eM = -1;
                    } else {
                        this.cC = false;
                        this.cA = false;
                    }
                }
            }

            if (this.cd < this.ck && this.ci && (this.co && this.ce <= this.ce || !this.co)) {
                this.kW = true;
                this.cd += bN * this.cm;
                if (this.cd >= this.ck) {
                    this.cd = this.ck;
                    if (x == 105) {
                        this.dm = false;
                    }
                }
            }

            if (this.ce < this.cl && this.cj) {
                this.ce += bN * this.cm;
                this.kW = true;
                if (this.ce > this.cl) {
                    this.ce = this.cl;
                }
            }

            if (this.cd > this.ck && !this.ci) {
                this.kW = true;
                this.cd -= bN * this.cm;
                if (this.cd <= this.ck) {
                    this.cd = this.ck;
                }

                this.cu = true;
            }

            if (this.ce > this.cl && !this.cj) {
                this.kW = true;
                this.ce -= bN * this.cn;
                if (this.ce < this.cl) {
                    this.ce = this.cl;
                }
            }
        }

    }

    private void a(int var1, int var2, int var3, short[] var4, boolean var5) {
        int var6;
        for(var6 = 0; var6 < var4.length; ++var6) {
            var4[var6] = 0;
        }

        this.b(var4, var3, var5 ? 0 : 2);

        for(var6 = 0; var6 < var4.length; var6 += 5) {
            var4[var6] = (short)(var4[var6] + var1);
            var4[var6 + 1] = (short)(var4[var6 + 1] + var2);
        }

    }

    private void s() {
        int var3;
        switch (this.bM) {
            case 0:
                this.k(138);
                this.width = this.getWidth();
                this.height = this.getHeight();
                halfWidth = this.width >> 1;
                bL = this.height >> 1;
                this.h(10240);
                byte[] var1;
                cb = new int[(var1 = this.c(1053)).length / 3];
                int var2 = 0;

                for(var3 = 0; var3 < var1.length; var3 += 3) {
                    cb[var2] = var1[var3] << 18 | var1[var3 + 1] << 10 | var1[var3 + 2] << 2;
                    ++var2;
                }

                bQ = new Random();
                this.c(true);
                this.bX = this.b(1037);
                this.eK = this.b(1035);
                this.j(1024);
                this.a(1024, true);
                this.eL = this.b(1030);
                this.hP = this.b(1038);
                this.j(1026);
                this.a(1026, true);
                break;
            case 1:
                this.bt = this.b(1031);
                this.a(this.bt);
                bD = this.c();
                bE = bD >> 1;
                this.lf = this.a("W") * 4;
                this.hS = this.b(1034);

                for(var3 = 0; var3 < 5; ++var3) {
                    this.al();
                }
            case 2:
            case 6:
            case 9:
            case 10:
            case 11:
            default:
                break;
            case 3:
                this.j(1025);
                this.a(1025, true);
                cV = this.b(1036);
                this.j(1027);
                this.a(1027, true);
                this.de = this.b(1040);
                dz = this.b(1029);
                this.am();
                break;
            case 4:
                this.soundManager.registerSound(0, 1063, -1, 0);// main theme
                this.soundManager.registerSound(1, 1064, 1, 0); // menu close
                this.soundManager.registerSound(2, 1062, 1, 0); // hit ground
                this.soundManager.registerSound(3, 1061, 1, 0); // blades swoosh (long)
                this.soundManager.registerSound(4, 1060, 1, 0); // blades swoosh (short)
                this.soundManager.registerSound(5, 1059, 1, 0); // sword swoosh (low)
                this.soundManager.registerSound(6, 1058, 1, 0); // sword swoosh (high)
                this.soundManager.registerSound(7, 1057, 1, 0); // enemy hit 1
                this.soundManager.registerSound(8, 1056, 1, 0); // enemy hit 2
                this.soundManager.registerSound(9, 1055, 1, 0); // enemy hit 3
                this.soundManager.registerSound(10, 1054, 1, 0);// enemy hit 4
                break;
            case 5:
                this.j(2048);
                this.a(2048, true);
                this.j(2049);
                this.j(2050);
                this.a(2049, true);
                this.a(2050, true);
                break;
            case 7:
                this.j(3074);
                this.a(3074, true);
                this.j(3072);
                this.a(3072, true);
                this.j(3073);
                this.a(3073, true);
                this.j(5122);
                this.a(5122, true);
                break;
            case 8:
                this.j(5121);
                this.a(5121, true);
                this.j(6145);
                this.a(6145, true);
                this.j(6144);
                this.a(6144, true);
                this.j(5120);
                this.a(5120, true);
                this.j(28672);
                this.a(28672, true);
                this.j(7168);
                this.a(7168, true);
                break;
            case 12:
                kR[5] = (kR[5] & -256) + 68;
                kR[5] &= -50331649;
                if (this.bx == null) {
                    kR[6] &= -50331649;
                }
                break;
            case 13:
                this.j();
                if (!ca) {
                    bZ = true;
                    this.bX = this.b(8193);
                    this.j(8192);
                    this.a(0, 8192, 0);
                    ca = true;
                } else {
                    ca = this.b(0, super.P);
                    if (!ca) {
                        bO = 0;
                    }
                }

                this.j();
        }

        if (!ca && this.bM <= 13) {
            ++this.bM;
        }

        for(int var4 = 0; var4 < 6 && !ca; ++var4) {
            this.al();
        }

    }

    private void c(boolean var1) {
        if (var1) {
            this.bu = this.b(1039);
            this.br = this.b(1032);
            this.bs = this.b(1033);
            this.le = false;
            this.kX = true;
            this.kP = this.bu[3].aW;
            this.f();
            this.dT = this.dU;
            this.b((DataInputStream)null);
        } else {
            this.a(132, 1027, 10);
            this.bu = null;
            this.br = null;
            this.bs = null;
        }
    }

    private void t() {
        int var1 = bN << 8;
        int var2;
        int var3;
        if (this.cI > 0) {
            var2 = this.cI;
            var3 = this.cJ;
        } else {
            var2 = this.iw;
            var3 = this.ix;
        }

        int var10000 = (jQ && this.cI < 0 ? 1 : -1) * (jX != 109 && jX != 110 ? width : -width ) >> 2;
        boolean var4 = false;
        int var14 = var10000 - (this.iJ ? (jQ ? this.width >> 2 : -(this.width >> 2)) : 0);
        if (jX == 116) {
            var14 = 0;
        }

        int var5 = this.iJ ? 104 : 0;
        int var6 = var2 - halfWidth + var14;
        int var7 = var3 - 350 + var5;
        int var8 = (var6 - bU + this.cS) * bN;
        int var9 = (var7 - bV + this.cT) * bN;
        if (Math.abs(var8) > var1) {
            if (var8 > 0) {
                var8 = var1;
            } else {
                var8 = -var1;
            }
        }

        if (Math.abs(var9) > var1) {
            if (var9 > 0) {
                var9 = var1;
            } else {
                var9 = -var1;
            }
        }

        this.cY += var8;
        this.cZ += var9;
        var6 = this.cY >> 8;
        var7 = this.cZ >> 8;
        this.cW = bU - var6;
        this.cX = bV - var7;
        bU = var6;
        bV = var7;
        boolean var10 = false;
        boolean var11 = false;
        if (this.cI < 0) {
            int var12;
            int var13;
            for(var12 = this.cN - 1; var12 >= 0; --var12) {
                if (a(this.cO[var12], this.cP[var12], bU, bV, width, height)) {
                    if (!this.cR[var12]) {
                        var10 = true;
                        var13 = this.cU * bN >> 8;
                        if (this.cQ[var12]) {
                            this.cS -= var13;
                        } else {
                            this.cS += var13;
                        }

                        if (!a(this.cO[var12], this.cP[var12], bU + this.cS, bV + this.cT, width, height)) {
                            this.cS = this.cO[var12] - bU - (this.cQ[var12] ? width : 0);
                        }
                    } else {
                        var11 = true;
                        var13 = this.cU * bN >> 8;
                        if (this.cQ[var12]) {
                            this.cT -= var13;
                        } else {
                            this.cT += var13;
                        }

                        if (!a(this.cO[var12], this.cP[var12], bU + this.cS, bV + this.cT, width, height)) {
                            this.cT = this.cP[var12] - bV - (this.cQ[var12] ? height : 0);
                        }
                    }
                }
            }

            for(var12 = this.hu; var12 >= 0; --var12) {
                if (hE[var12] && a(hy[var12] + (hF[var12] ? hA[var12] : 0), this.hz[var12], bU, bV, width, height)) {
                    var10 = true;
                    var13 = this.cU * bN >> 8;
                    if (hF[var12]) {
                        this.cS -= var13;
                    } else {
                        this.cS += var13;
                    }

                    if (!a(hy[var12] + (hF[var12] ? hA[var12] : 0), this.hz[var12], bU + this.cS, bV + this.cT, width, height)) {
                        this.cS = hy[var12] + (hF[var12] ? hA[var12] : 0) - bU - (hF[var12] ? width : 0);
                    }
                }
            }

            bU += this.cS;
            bV += this.cT;
            if (!var10 && this.cS != 0) {
                if (this.cS > 0) {
                    this.cS -= this.cU * bN >> 8;
                    if (this.cS < 0) {
                        this.cS = 0;
                    }
                } else {
                    this.cS += this.cU * bN >> 8;
                    if (this.cS > 0) {
                        this.cS = 0;
                    }
                }
            }

            if (!var11 && this.cT != 0) {
                if (this.cT > 0) {
                    this.cT -= this.cU * bN >> 8;
                    if (this.cT < 0) {
                        this.cT = 0;
                    }
                } else {
                    this.cT += this.cU * bN >> 8;
                    if (this.cT > 0) {
                        this.cT = 0;
                    }
                }
            }

            this.cW -= this.cS;
            this.cX -= this.cT;
            if (this.cF != 0) {
                if (this.cG + this.cG * this.kd >= this.cH) {
                    bV += this.cF;
                    bU += this.cF * ((this.bP & 1) == 1 ? -1 : 1);
                    this.cF += this.cF < 0 ? 1 : -1;
                    this.cF = -this.cF;
                    this.cG = 0;
                } else {
                    this.cG += bN;
                }
            } else {
                this.cH = 0;
            }
        } else if (var8 != 0 && this.cK <= 3500) {
            this.cK += bN;
        } else {
            this.cI = -1;
            this.cJ = -1;
            this.kW = true;
            this.cK = 0;
        }

        if (bU < 0) {
            bU = 0;
            this.cY = 0;
            this.cW = 0;
        }

        if (bU >= this.cL) {
            bU = this.cL;
            this.cY = this.cL << 8;
            this.cW = 0;
        }

        if (bV < 0) {
            bV = 0;
            this.cZ = 0;
            this.cX = 0;
        }

        if (bV >= this.cM) {
            bV = this.cM;
            this.cZ = this.cM << 8;
            this.cX = 0;
        }

    }

    private void u() {
        this.kK = false;
        this.da[0] = -1;
        this.da[1] = this.eN;
        ks = new String[3];
        ks[0] = "";
        ks[1] = this.getResourceString(this.da[1]);
        this.a(this.bt);
        if (ks[1].charAt(0) == '!') {
            x = 105;
            this.dm = true;
            this.D(this.di[this.dk]);
            if (this.gg != -1) {
                this.k(this.dj[this.dl], this.gg);
                return;
            }
        } else {
            if (ks[1].charAt(0) == '^') {
                this.eM = parseInt(ks[1].substring(1, 2), 0);
                if (this.eM > 3) {
                    int var1 = this.eM - 3 - 1;
                    this.ii = var1;
                    jx = this.ii == 1;
                    jy = this.ii == 2;
                    this.jz = this.ii == 3;
                }
            } else {
                this.eM = -1;
            }

            ks[1].charAt(0);
            if (ks[1].charAt(0) == '*') {
                if (ks[1].length() != 1) {
                    this.dg = true;
                    this.c(bL, bL, 35, 35);
                } else {
                    this.d_o = true;
                }

                this.kX = true;
                return;
            }

            this.dg = false;
            this.a(this.da, df, 12, 0, width - 40, bD * 5 + bE, 30);
        }

    }

    private void v() {
        if (this.dv <= 0 && !this.ds) {
            switch (this.bv) {
                case 1:
                case 2:
                    this.a(133, 1025, 1);
                    this.ds = true;
                    ++dt;
                    if (dt > dr) {
                        dt = 0;
                    }

                    this.du = false;
                    break;
                case 3:
                case 29:
                    this.a(133, 1025, 4);
                    if (!this.cE) {
                        x = 100;
                    } else {
                        this.cE = false;
                        x = 1;
                        this.c(bL, bL, 35, 35);
                    }

                    this.kW = true;
                    break;
                case 5:
                case 6:
                    this.a(133, 1025, 0);
                    this.ds = true;
                    --dt;
                    if (dt < 0) {
                        dt = dr;
                    }

                    this.du = true;
            }

            switch (this.bw) {
                case 8:
                case 27:
                    if (this.jM > 0 && this.jM >= this.dq) {
                        if (this.dq < 16) {
                            ++this.dq;
                        }
                    } else if (this.jM < this.dq) {
                        this.dq = this.jM;
                    } else if (this.jM <= 0) {
                        this.dq = 0;
                    }

                    switch (dt) {
                        case 0:
                            if (jl <= 3) {
                                this.jt += this.dq;
                                if (this.jt >= jn[jl]) {
                                    this.dq = jn[jl] - (this.jt - this.dq);
                                    if (jl == 0 || jl == 1 || jl == 2) {
                                        ++jj;
                                    }

                                    this.jt = 0;
                                    ++jl;
                                    this.dv = 2500;
                                }
                            } else {
                                this.dq = 0;
                            }
                            break;
                        case 1:
                            if (jm <= 3) {
                                this.ju += this.dq;
                                if (this.ju < jo[jm]) {
                                    break;
                                }

                                this.dq = jo[jm] - (this.ju - this.dq);
                                if (jm == 0 || jm == 1 || jm == 3) {
                                    ++this.jk;
                                }

                                this.ju = 0;
                                ++jm;
                                this.dv = 2500;
                                break;
                            }

                            this.dq = 0;
                            break;
                        case 2:
                            if (jr < 4) {
                                this.jv += this.dq;
                                if (this.jv >= jp[jr]) {
                                    this.dq = jp[jr] - (this.jv - this.dq);
                                    this.jv = 0;
                                    ++jr;
                                    this.dv = 2500;
                                }
                            } else {
                                this.dq = 0;
                            }
                            break;
                        case 3:
                            if (js < 4) {
                                this.jw += this.dq;
                                if (this.jw >= jq[js]) {
                                    this.dq = jq[js] - (this.jw - this.dq);
                                    this.jw = 0;
                                    ++js;
                                    this.dv = 2500;
                                }
                            } else {
                                this.dq = 0;
                            }
                    }

                    this.jM -= this.dq;
                    if (this.jM < 0) {
                        this.jM = 0;
                    }
                    break;
                default:
                    this.dq = 0;
            }
        } else {
            this.dv -= bN;
        }

        if (this.bF) {
            if (this.bw == 25) {
                this.jM += 20;
                return;
            }

            if (this.bw == 23) {
                this.jM -= 20;
                if (this.jM < 0) {
                    this.jM = 0;
                }
            }
        }

    }

    private void w() {
        if (this.cd >= this.ck && this.kK) {
            switch (this.bv) {
                case 1:
                case 2:
                    if (this.kG >= 5) {
                        this.dn = 0;
                        this.kG -= 5;
                        return;
                    }

                    if (this.eN > this.eO) {
                        --this.eN;
                        this.dn = 0;
                        this.u();
                        return;
                    }
                    break;
                case 5:
                case 6:
                case 8:
                case 27:
                    if (this.kH > 0) {
                        this.dn = 0;
                        this.kG = this.kH;
                        return;
                    }

                    if ((this.eM <= 3 || this.bv != 27) && this.eM > 3) {
                        break;
                    }

                    this.dn = 0;
                    this.kG = -1;
                    this.kH = -1;
                    ++this.eN;
                    if (this.eN >= this.eP) {
                        if (!this.d_o) {
                            x = 100;
                            this.c(0, 0, 35, 35);
                            this.kW = true;
                            this.dg = false;
                            this.eP = -1;
                            this.eN = -1;
                            this.eO = -1;
                            return;
                        }

                        this.j();
                        ++this.dT;
                        if (this.dT > this.dU && (this.dV <= 0 || this.dT < this.dV)) {
                            this.dU = this.dT;
                        }

                        this.dR = dS[this.dT];
                        this.ag();
                        this.kX = true;
                        this.bX = null;
                        this.dp = true;
                        x = 1;
                        this.bz = false;
                        this.c(bL, bL, 35, 35);
                        return;
                    }

                    this.u();
                    return;
                case 29:
                    if (this.cd == this.ck) {
                        this.cp = this.ck >> 8;
                        this.cq = this.cl >> 8;
                        this.y = x;
                        x = 102;
                        cB = 4;
                        this.c(bL, bL, 35, 35);
                    }
            }
        }

    }

    public final void a(Graphics var1) {
        switch (x) {
            case 0:
                this.x(var1);
                if (!ca && this.bM <= 13) {
                    a(var1, this.bM, 13, true);
                    return;
                }
                break;
            case 1:
            case 80:
            case 109:
                if (!this.dp && x != 1) {
                    this.z(var1);
                }

                this.f(var1);
                if (x == 109 && this.cd == this.ck && this.ce == this.cl && !this.cg) {
                    this.a(var1, 28, 29);
                    return;
                }
                break;
            case 78:
                this.y(var1);
                this.bu[0].a(var1, halfWidth, 0, 0);
                this.bu[1].a(var1, halfWidth, 0, 0);
                int var2 = this.bu[1].aV + this.bu[1].bb + (bD >> 1);

                for(int var3 = 0; var3 <= 5; ++var3) {
                    this.drawString(var1, this.getResourceString(bC[var3]), halfWidth, var2, 1);
                    if (var3 == bA) {
                        dz[2].a(var1, (halfWidth >> 1) - dz[2].aW, var2 + (bD >> 2), 0);
                        dz[3].a(var1, this.width - (halfWidth >> 1), var2 + (bD >> 2), 0);
                    }

                    var2 = var2 + bD + (bD >> 2);
                }

                if (this.ck != bL << 8) {
                    this.a(var1, 0, 1);
                    return;
                }

                this.b(var1);
                return;
            case 79:
                this.y(var1);
                this.bu[0].a(var1, halfWidth, 0, 0);
                this.bu[1].a(var1, halfWidth, 0, 0);
                this.a(var1, false);
                this.f(var1);
                if (this.ck != bL << 8) {
                    this.a(var1, 28, 29);
                    return;
                }

                this.b(var1);
                return;
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 108:
                if (x == 100 && this.cd <= 0 && !this.kW) {
                    this.a(var1, 0, 0, width, (height - 14));
                } else {
                    this.kW = true;
                    this.b(var1);
                }

                this.g(var1);
                if (x != 101) {
                    this.i(var1);
                }

                if (x == 100) {
                    if (this.db && this.dc == jQ && !in && a(this.iw, this.ix, bU, bV, this.width, this.height)) {
                        this.a(var1, this.de, 131, 17, this.height - 30, 0);
                    }

                    if (in && this.io >= 0 && this.io < this.im && this.iA >= 0) {
                        this.a(var1, this.de, 131, go[this.iA] - bU, this.gp[this.iA] - this.gA[this.iA] - (this.gA[this.iA] >> 2) - bV, 0);
                    }
                }

                if (x == 104) {
                    var1.setColor(855564);
                    var1.fillRect(halfWidth >> 3, bL - (bL >> 1), this.width - (halfWidth >> 2), bL + bD);
                    var1.setColor(4269080);
                    var1.drawRect((halfWidth >> 3) - 1, bL - (bL >> 1) - 1, this.width - (halfWidth >> 2) + 1, bL + bD + 1);
                    var1.setColor(5911589);
                    var1.drawRect((halfWidth >> 3) - 2, bL - (bL >> 1) - 2, this.width - (halfWidth >> 2) + 3, bL + bD + 3);
                    this.eL[0].a(var1, (halfWidth >> 3) - 3, bL - (bL >> 1) - 2, 0);
                    this.eL[0].a(var1, this.width - (halfWidth >> 3) + 3, bL - (bL >> 1) - 2, 2);
                    this.eL[0].a(var1, (halfWidth >> 3) - 3, bL + (bL >> 1) + 2 + bD, 1);
                    this.eL[0].a(var1, this.width - (halfWidth >> 3) + 3, bL + (bL >> 1) + 2 + bD, 3);
                    this.a(var1, this.hP, 136, halfWidth, bL - (bD << 1), 0);
                    if (this.hQ == 9) {
                        this.drawString(var1, this.getResourceString(148), halfWidth, bL + bD, 1);
                        if (this.hR < 96) {
                            this.drawString(var1, this.getResourceString(189), halfWidth, bL + (bD << 1) + bD, 1);
                        } else {
                            this.drawString(var1, this.getResourceString(151), halfWidth, bL + (bD << 1) + bD, 1);
                        }
                    } else {
                        this.drawString(var1, this.getResourceString(147), halfWidth, bL + bD, 1);
                        if (this.hR < 96) {
                            this.drawString(var1, this.getResourceString(158), halfWidth, bL + (bD << 1) + bD, 1);
                        } else {
                            this.drawString(var1, this.getResourceString(151), halfWidth, bL + (bD << 1) + bD, 1);
                        }
                    }
                }

                this.f(var1);
                if (x == 101 && this.cd >= this.ck && !this.dg) {
                    this.a(var1, false);
                }

                switch (x) {
                    case 100:
                        if (this.kW) {
                            this.a(var1, 160, 197);
                            return;
                        }

                        return;
                    case 101:
                        if (this.kK) {
                            this.a(var1, 174, 197);
                            return;
                        }

                        this.a(var1, -1, -1);
                        return;
                    case 102:
                        if (this.cd == this.ck && !this.cg) {
                            if ((cB == 1 || cB == 2) && this.cC) {
                                this.a(var1, 28, 29);
                                return;
                            }

                            if (cB == 4 && cB != 3) {
                                this.a(var1, 200, 199);
                                return;
                            }

                            this.a(var1, 0, 199);
                            return;
                        }

                        return;
                    case 103:
                    default:
                        return;
                    case 104:
                        return;
                    case 105:
                        this.a(var1, -1, 197);
                        return;
                }
            case 106:
                this.h(var1);
                this.f(var1);
                if (this.dv <= 0) {
                    if (this.jM > 0) {
                        this.a(var1, !this.ds ? (this.dy <= 3 ? 149 : -1) : -1, !this.ds ? (this.cE ? 174 : 2) : -1);
                        return;
                    }

                    this.a(var1, -1, !this.ds ? (this.cE ? 174 : 2) : -1);
                    return;
                }

                this.a(var1, -1, -1);
                return;
            case 107:
                if (super.X) {
                    this.y(var1);
                    this.a(var1, true);
                }

                this.f(var1);
                if (x == 107 && this.cd <= 8960) {
                    if (!this.dg) {
                        this.a(var1, -1, 2);
                        return;
                    }

                    this.a(var1, -1, 240);
                    return;
                }
        }

    }

    private void f(Graphics var1) {
        int var2 = this.cd >> 8;
        int var3 = this.ce >> 8;
        if (var2 > 0) {
            if ((!this.cg || this.ch || this.cy || this.cA || this.cz || this.cx) && (x == 108 || x == 102 || x == 1 || x == 109)) {
                var1.setColor(0);
                var1.fillRect(0, var2 + 1, width, height - (var3 << 1) - 1);
                if (x == 108) {
                    if (!bR) {
                        this.drawString(var1, this.getResourceString(173), halfWidth, bL + bE + (bD >> 3), 33);
                    } else {
                        this.drawString(var1, this.getResourceString(173), halfWidth, bL - (bD << 1) + (bD >> 1), 33);
                        this.drawString(var1, this.getResourceString(206), halfWidth, bL - (bD >> 2) + (bD >> 1), 33);
                        this.drawString(var1, String.valueOf(this.gd), halfWidth, bL + bD + (bD >> 2), 33);
                        if (this.gd > this.jV) {
                            this.drawString(var1, this.getResourceString(207), halfWidth, bL + (bD << 1) + (bD >> 1), 33);
                        } else {
                            this.drawString(var1, this.getResourceString(208) + String.valueOf(this.jV), halfWidth, bL + (bD << 1) + (bD >> 1), 33);
                        }
                    }
                } else if (x == 102) {
                    this.drawString(var1, !bR ? this.getResourceString(54 + this.dT) : this.getResourceString(66), halfWidth, bL - (bD >> 1), 33);
                    if (cB == 4) {
                        this.drawString(var1, this.getResourceString(47) + " " + (this.soundManager.n() ? this.getResourceString(234) : this.getResourceString(235)), halfWidth, bL + bD + bE, 33);
                        dz[3].a(var1, this.width - 7 - 10, bL + (bD >> 1) + 1, 0);
                    } else if (cB == 2 && !this.cC) {
                        this.drawString(var1, this.getResourceString(50), halfWidth, bL + bD + bE, 33);
                        dz[2].a(var1, 17 - dz[2].aW, bL + (bD >> 1) + 1, 0);
                        dz[3].a(var1, this.width - 7 - 10, bL + (bD >> 1) + 1, 0);
                    } else if (cB == 2 && this.cC) {
                        this.drawString(var1, this.getResourceString(186), halfWidth, bL + bD + bE, 33);
                    } else if (cB == 1 && !this.cC) {
                        this.drawString(var1, this.getResourceString(1), halfWidth, bL + bD + bE, 33);
                        dz[2].a(var1, 17 - dz[2].aW, bL + (bD >> 1) + 1, 0);
                    } else if (cB == 1 && this.cC) {
                        this.drawString(var1, this.getResourceString(185), halfWidth, bL + bD + bE, 33);
                    } else if (cB == 3) {
                        this.drawString(var1, this.getResourceString(46), halfWidth, bL + bD + bE, 33);
                        dz[3].a(var1, this.width - 7 - 10, bL + (bD >> 1) + 1, 0);
                        dz[2].a(var1, 17 - dz[2].aW, bL + (bD >> 1) + 1, 0);
                    }
                } else if (x == 1) {
                    this.a(this.bt);
                    if (bR) {
                        this.drawString(var1, this.getResourceString(66), halfWidth, bL - bD - (bD >> 1), 33);
                        this.drawString(var1, this.getResourceString(190), halfWidth, bL - (bD >> 1), 33);
                        this.drawString(var1, this.getResourceString(238), halfWidth, bL + (bD >> 1), 33);
                        this.drawString(var1, this.getResourceString(39), halfWidth, bL + bD + (bD >> 1) + (bD >> 2), 33);
                        a(var1, this.by, 11, true);
                    } else {
                        this.drawString(var1, this.getResourceString(54 + this.dT), halfWidth, bL - bE, 33);
                        this.drawString(var1, this.getResourceString(39), halfWidth, bL + bE, 33);
                        a(var1, this.by, 11, true);
                    }
                } else if (x == 109) {
                    if (this.dT >= this.dV && this.dV != 0) {
                        this.drawString(var1, this.getResourceString(279), halfWidth, bL, 33);
                        this.drawString(var1, this.getResourceString(280), halfWidth, bL + bD, 33);
                    } else {
                        this.drawString(var1, this.getResourceString(54 + this.dT - 1) + this.getResourceString(169), halfWidth, bL, 33);
                        this.drawString(var1, this.getResourceString(168) + this.getResourceString(54 + this.dT) + this.getResourceString(159), halfWidth, bL + bD, 33);
                    }
                }
            }

            var1.setColor(855564);
            var1.fillRect(0, 0, width, var2);
            var1.setColor(4269080);
            var1.drawLine(0, var2 - 1, width, var2 - 1);
            var1.setColor(5911589);
            var1.drawLine(0, var2, width, var2);
            var1.setColor(4269080);
            var1.drawLine(0, var2 - 1, width, var2 - 1);
            var1.setColor(855564);
            var1.fillRect(0, height - var3, width, var3);
            var1.setColor(10246204);
            var1.drawLine(0, height - var3, width, height - var3);
            var1.setColor(4269080);
            var1.drawLine(0, height - var3 + 1, width, height - var3 + 1);
            if (!this.cg && x == 108) {
                this.a(var1, bR ? -1 : 198, 45);
            }

            this.eL[0].a(var1, 0, var2, 1);
            this.eL[0].a(var1, width, var2, 3);
            this.eL[0].a(var1, 0, height - (var3 - 1), 0);
            this.eL[0].a(var1, width, height - (var3 - 1), 2);
        }

        if (x == 80 && this.cd == 0) {
            switch (this.lc) {
                case 0:
                    this.a(var1, 0, 1);
                    return;
                case 9:
                    if (this.dU >= kS - this.lc + 1) {
                        this.a(var1, 196, 2);
                        return;
                    }

                    this.a(var1, 120, 2);
                    return;
                case 23:
                    this.a(var1, 28, 29);
                    return;
                case 30:
                    this.a(var1, 28, 29);
                    return;
                default:
                    this.a(var1, 0, 2);
            }
        }

    }

    private void g(Graphics var1) {
        this.bS.c(var1);
        var1.translate(-bU, -(bV + this.dw));
        this.l(var1);
        this.o(var1);
        this.p(var1);
        this.s(var1);
        this.m(var1);
        this.t(var1);
        this.q(var1);
        this.r(var1);
        this.j(var1);
        if (this.iA >= 0 && !in && jX != 109 && jX != 113 && this.gl[this.iA] != 2) {
            this.v(var1);
            this.u(var1);
        } else {
            this.u(var1);
            this.v(var1);
        }

        this.k(var1);
        this.w(var1);
        this.n(var1);
        var1.translate(bU, bV + this.dw);
    }

    private void h(Graphics var1) {
        this.y(var1);
        this.a(this.bt);
        this.drawString(var1, this.getResourceString(149), halfWidth, bD, 1);
        dx = String.valueOf(this.jM) + " ~";
        this.drawString(var1, dx, 188, 56, 8);
        dx = this.getResourceString(116 + dt);
        dz[0].a(var1, halfWidth, 102 - dz[0].aX, 0);
        if (dx.indexOf(10) != -1) {
            this.drawString(var1, dx.substring(0, dx.indexOf(10)), halfWidth, 104, 1);
            this.drawString(var1, dx.substring(dx.indexOf(10) + 1, dx.length()), halfWidth, 104 + bD, 1);
        } else {
            this.drawString(var1, this.getResourceString(116 + dt), halfWidth, 104, 1);
        }

        int var2 = 0;
        if (dt == 0) {
            this.dy = jl;
            if (jl <= 3) {
                var2 = jn[this.dy] - this.jt;
            }
        } else if (dt == 1) {
            this.dy = jm;
            if (jm <= 3) {
                var2 = jo[this.dy] - this.ju;
            }
        } else if (dt == 3) {
            this.dy = js;
            if (js <= 3) {
                var2 = jq[this.dy] - this.jw;
            }
        } else {
            this.dy = jr;
            if (jr <= 3) {
                var2 = jp[this.dy] - this.jv;
            }
        }

        if (this.dy <= 3) {
            this.drawString(var1, this.getResourceString(223) + String.valueOf(this.dy + 1), halfWidth, 104 + (bD << 1), 1);
            this.drawString(var1, String.valueOf(var2) + "~", 188, 156 + (bD << 1), 8);
            this.drawString(var1, this.getResourceString(224), halfWidth, 156 + (bD << 1) + bD, 1);
            this.drawString(var1, this.getResourceString(225), halfWidth, 156 + (bD << 2), 1);
        } else {
            this.drawString(var1, this.getResourceString(241), halfWidth, 104 + (bD << 1), 1);
        }

        dz[1].a(var1, halfWidth, 104 + (bD << 1) + bD, 0);
        if (this.dv > 0) {
            var1.setColor(855564);
            var1.fillRect(halfWidth - (halfWidth >> 1), bL - (bL >> 2), halfWidth, (bL >> 1) + bD);
            var1.setColor(4269080);
            var1.drawRect(halfWidth - (halfWidth >> 1) - 1, bL - (bL >> 2) - 1, halfWidth + 1, (bL >> 1) + 1 + bD);
            var1.setColor(5911589);
            var1.drawRect(halfWidth - (halfWidth >> 1) - 2, bL - (bL >> 2) - 2, halfWidth + 3, (bL >> 1) + 3 + bD);
            if (dx.indexOf(10) != -1) {
                this.drawString(var1, dx.substring(0, dx.indexOf(10)), halfWidth, bL - bD - (bD >> 1), 1);
                this.drawString(var1, dx.substring(dx.indexOf(10) + 1, dx.length()), halfWidth, bL - (bD >> 1), 1);
            } else {
                this.drawString(var1, this.getResourceString(116 + dt), halfWidth, bL - (bL >> 2), 1);
            }

            this.drawString(var1, this.getResourceString(222), halfWidth, bL + bD, 1);
        }

    }

    private void i(Graphics var1) {
        this.a(var1, cV, 133, 0, 0, 0);
        int var2;
        if ((var2 = 38 + this.ii + (dt > 0 ? 4 - dt : 0)) > 41) {
            var2 = 38 + (var2 - 41) - 1;
        }

        cV[var2].a(var1, 12, 27, 0);
        var1.setColor(4342338);
        var1.drawRect(56, 17, this.jI * 9 >> 8, 4);
        var1.drawRect(56, 23, this.jJ * 9 >> 8, 3);
        var1.setColor(0);
        var1.fillRect(56, 18, this.jI * 9 >> 8, 3);
        var1.fillRect(56, 23, this.jJ * 9 >> 8, 3);
        var1.setColor(4783872);
        var1.fillRect(56, 18, this.jF * 9 >> 8, 3);
        if (jH <= 0 && (jx || this.jz || jy)) {
            var1.setColor(this.dB);
            var1.fillRect(56, 23, this.jJ * 9 >> 8, 3);
        } else {
            var1.setColor(104191);
            var1.fillRect(56, 23, jH * 9 >> 8, 3);
        }

        this.drawString(var1, String.valueOf(this.jM), 79, 33, 1);
    }

    private void j(Graphics var1) {
        for(int var2 = this.hH; var2 >= 0; --var2) {
            int var3 = this.hL[var2];
            int var4 = this.hM[var2];
            int var5 = var3 - bU;
            int var6 = var4 - bV;
            if (var5 + (this.hI << 1) >= 0 && var6 + this.hJ >= 0 && var5 - this.hI <= width && var6 - this.hJ <= height) {
                this.a(var1, this.hG, var2 + 121, var3, var4, 0);
            }
        }

    }

    private void k(Graphics var1) {
        for(int var2 = this.ib; var2 >= 0; --var2) {
            for(int var3 = 0; var3 < 4; ++var3) {
                int var4 = (var2 << 2) + var3;
                int var5 = hT[var4];
                int var6 = hU[var4];
                int var7 = var5 - bU;
                int var8 = var6 - bV;
                if (var7 + this.hS[hZ[var2]].aW >= 0 && var8 + this.hS[hZ[var2]].aX >= 0 && var7 - this.hS[hZ[var2]].aW <= width && var8 - this.hS[hZ[var2]].aX <= height) {
                    this.hS[(hZ[var2] << 2) + var3].a(var1, var5, var6, 0);
                }
            }
        }

    }

    private void l(Graphics var1) {
        for(int var2 = ey; var2 >= 0; --var2) {
            if (this.et[var2] >= 0) {
                int var3 = eu[var2];
                int var4 = ev[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.ex[var2] >= 0 && var6 + this.ew[var2] >= 0 && var5 - this.ex[var2] <= width && var6 - this.ew[var2] <= height) {
                    this.a(var1, this.es, var2 + 10, var3, var4, 0);
                }
            }
        }

    }

    private void m(Graphics var1) {
        for(int var2 = er; var2 >= 0; --var2) {
            if (this.ej[var2] >= 0) {
                int var3 = ek[var2];
                int var4 = this.el[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.ep[var2] >= 0 && var6 + this.eo[var2] >= 0 && var5 - this.ep[var2] <= width && var6 - this.eo[var2] <= height) {
                    this.a(var1, this.ei, var2 + 30, var3, var4, 0);
                }
            }
        }

    }

    private void n(Graphics var1) {
        for(int var2 = eF; var2 >= 0; --var2) {
            if (this.eA[var2] >= 0) {
                int var3 = this.eB[var2];
                int var4 = eC[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.eE[var2] >= 0 && var6 + this.eD[var2] >= 0 && var5 - this.eE[var2] <= width && var6 - this.eD[var2] <= height) {
                    this.a(var1, this.ez, var2 + 40, var3, var4, 0);
                }
            }
        }

    }

    private void o(Graphics var1) {
        for(int var2 = this.fU; var2 >= 0; --var2) {
            if (this.fM[var2] >= 0) {
                int var3 = fO[var2];
                int var4 = this.fP[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.fT[var2] >= 0 && var6 + fS[var2] >= 0 && var5 - this.fT[var2] <= width && var6 - fS[var2] <= height) {
                    this.a(var1, this.fL, var2 + 70, var3, var4, 0);
                }
            }
        }

    }

    private void p(Graphics var1) {
        for(int var2 = this.fK; var2 >= 0; --var2) {
            if (this.fD[var2] >= 0) {
                int var3 = fG[var2];
                int var4 = fH[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.fJ[var2] >= 0 && var6 + this.fI[var2] >= 0 && var5 - this.fJ[var2] <= width && var6 - this.fI[var2] <= height) {
                    this.a(var1, this.fC, var2 + 60, var3, var4, this.fF[var2]);
                }
            }
        }

    }

    private void q(Graphics var1) {
        for(int var2 = hs; var2 >= 0; --var2) {
            if (this.hi[var2] >= 0) {
                int var3 = this.hj[var2];
                int var4 = this.hk[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.hn[var2] >= 0 && var6 + this.ho[var2] >= 0 && var5 <= width && var6 - this.ho[var2] <= height) {
                    this.a(var1, this.hh, var2 + 111, var3, var4, 0);
                }
            }
        }

    }

    private void r(Graphics var1) {
        for(int var2 = this.hu; var2 >= 0; --var2) {
            if (this.hv[var2] >= 0) {
                int var3 = hy[var2];
                int var4 = this.hz[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + (hA[var2] << 1) >= 0 && var6 + this.hB[var2] >= 0 && var5 - hA[var2] <= width && var6 - this.hB[var2] <= height) {
                    this.a(var1, this.ht, var2 + 116, var3, var4, 0);
                }
            }
        }

    }

    private void s(Graphics var1) {
        for(int var2 = this.eS; var2 >= 0; --var2) {
            int var3 = this.eT[var2];
            int var4 = eU[var2];
            int var5 = var3 - bU;
            int var6 = var4 - bV;
            if (var5 + this.eW[var2] >= 0 && var6 + this.eX[var2] >= 0 && var5 - this.eW[var2] <= width && var6 - this.eX[var2] <= height) {
                this.a(var1, eR, var2 + 106, var3, var4, 0);
            }
        }

    }

    private void t(Graphics var1) {
        for(int var2 = fd; var2 >= 0; --var2) {
            if (fo[var2] >= 0) {
                int var3 = fh[var2];
                int var4 = this.fi[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + fk[var2] >= 0 && var6 + this.fm[var2] >= 0 && var5 - fk[var2] <= width && var6 - this.fm[var2] <= height) {
                    this.a(var1, this.fe, var2 + 100, var3, var4, 0);
                }
            }
        }

    }

    private void u(Graphics var1) {
        for(int var2 = this.gW; var2 >= 0; --var2) {
            if (this.gk[var2] >= 0) {
                int var3 = go[var2];
                int var4 = this.gp[var2];
                int var5 = var3 - bU;
                int var6 = var4 - bV;
                if (var5 + this.gz[var2] >= 0 && var6 + this.gA[var2] >= 0 && var5 - this.gz[var2] <= width && var6 - this.gA[var2] <= height) {
                    boolean var7 = this.gE[var2];
                    switch (this.gl[var2]) {
                        case 1:
                            this.a(var1, this.fX, var2 + 85, go[var2], this.gp[var2], var7 ? 0 : 2);
                            break;
                        case 2:
                            this.a(var1, fY, var2 + 85, go[var2], this.gp[var2], var7 ? 0 : 2);
                            break;
                        case 3:
                            if (gh == var2) {
                                this.a(var1, this.ga, var2 + 85, go[var2], this.gp[var2], var7 ? 0 : 2);
                            } else {
                                this.a(var1, this.fZ, var2 + 85, go[var2], this.gp[var2], var7 ? 0 : 2);
                            }
                    }

                    if (this.gs[var2] > 0) {
                        this.a(var1, this.ec, 137, go[var2], this.gp[var2], 0);
                        this.b(137, bN);
                    }

                    if (x == 100 && (this.iA < 0 && this.gs[var2] <= 0 && gF[var2] < gI[var2] >> 1 && !this.gC[var2] && gF[var2] >= 0 || this.gl[var2] == 3 && this.gm[var2] == 12 && gh != var2 && this.gi != var2 || this.gl[var2] == 2 && this.gm[var2] == 12 && gh != var2)) {
                        this.a(var1, this.de, 132, go[var2], this.gp[var2] - this.gA[var2] - (this.gi == var2 ? -(this.gA[var2] >> 3) : this.gA[var2] >> 2), 0);
                    }
                }
            }
        }

    }

    private void v(Graphics var1) {
        this.a(var1, this.ic, 135, this.iw, this.ix, jQ ? 0 : 2);
    }

    private void w(Graphics var1) {
        for(int var2 = this.eh; var2 >= 0; --var2) {
            if (ed[var2] >= 0) {
                this.a(var1, this.ec, ed[var2], this.ee[var2], this.ef[var2], this.eg[var2]);
            }
        }

    }

    private void f(int var1, int var2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var10000;
        switch (var1) {
            case 0:
                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    var10 = this.dK[var8] / 22;
                    var11 = this.dL[var8] / 22;

                    for(var12 = 0; var12 <= var9; ++var12) {
                        this.c(var10 + var12, var11, 8192);
                    }
                }

                return;
            case 3:
                this.cN = var2;
                this.cR = new boolean[var2];
                this.cQ = new boolean[var2];
                this.cO = new int[var2];
                this.cP = new int[var2];

                for(var5 = 0; var5 < var2; ++var5) {
                    this.cO[var5] = this.dK[var5];
                    this.cP[var5] = this.dL[var5];
                    this.cR[var5] = this.x(1) == 1;
                    this.cQ[var5] = this.x(1) == 1;
                }

                return;
            case 4:
                this.hH = var2 - 1;
                this.hO = new int[var2];
                this.hL = new int[var2];
                this.hM = new int[var2];
                hK = new boolean[var2];
                hN = new int[var2];
                var8 = 1 << this.dT;

                for(var9 = 0; var9 < var2; ++var9) {
                    this.hO[var9] = this.x(3);
                    hN[var9] = this.x(10);
                    if (this.hO[var9] == 3) {
                        if (hN[var9] > 0) {
                            hN[var9] = -1;
                        } else {
                            hN[var9] = -2;
                        }
                    }

                    this.hL[var9] = this.dK[var9];
                    this.hM[var9] = this.dL[var9];
                    if ((hN[var9] != -1 || (jA & var8) != var8) && (hN[var9] != -2 || (jA & var8 << 10) != var8 << 10)) {
                        hK[var9] = false;
                    } else {
                        hK[var9] = true;
                        hN[var9] = 0;
                        var10000 = this.hO;
                        var10000[var9] += 4;
                    }

                    this.a(121 + var9, 5120, this.hO[var9]);
                    if (hK[var9]) {
                        this.b(121 + var9, 2000);
                    }

                    this.a(this.hG, 121 + var9, 0, 0, 0, this.bW);
                    this.hI = this.bW[2];
                    this.hJ = this.bW[3];
                }
            case 1:
            case 2:
            case 15:
            case 16:
            case 19:
            case 20:
            case 24:
            default:
                return;
            case 5:
                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    var10 = this.dK[var8] / 22;
                    var11 = this.dL[var8] / 22;

                    for(var12 = 0; var12 <= var9; ++var12) {
                        this.c(var10, var11 + var12, 8);
                    }
                }

                return;
            case 6:
                for(var3 = 0; var3 < 40; ++var3) {
                    this.di[var3] = this.x(10);
                }

                for(var3 = 0; var3 < 40; ++var3) {
                    this.dj[var3] = this.x(10);
                }

                return;
            case 7:
                this.hv = new int[var2];
                this.hw = new int[var2];
                hx = new int[var2];
                hy = new int[var2];
                this.hz = new int[var2];
                hA = new int[var2];
                this.hB = new int[var2];
                this.hC = new byte[var2];
                this.hD = new byte[var2];
                hE = new boolean[var2];
                hF = new boolean[var2];

                for(var8 = 0; var8 < var2; ++var8) {
                    this.hu = var8;
                    this.hv[var8] = this.x(6) << 1;
                    hE[var8] = this.x(1) == 1;
                    hF[var8] = this.x(1) == 1;
                    this.a(116 + var8, 2048, this.hv[var8]);
                    this.a(this.ht, 116 + var8, 0, 0, 0, this.bW);
                    hy[var8] = this.dK[var8];
                    this.hz[var8] = this.dL[var8];
                    this.hw[var8] = this.dK[var8] / 22;
                    hx[var8] = this.dL[var8] / 22;
                    hA[var8] = this.bW[2];
                    this.hB[var8] = this.bW[3];
                    this.hC[var8] = (byte)(hA[var8] / 22);
                    this.hD[var8] = (byte)(this.hB[var8] / 22);
                    var9 = this.hw[var8];
                    var10 = hx[var8];
                    if (!this.b(116 + var8, 1)) {
                        this.n(var8, 2);
                        this.B(var8);
                    } else {
                        for(var11 = 0; var11 < this.hC[var8]; ++var11) {
                            for(var12 = 1; var12 <= this.hD[var8]; ++var12) {
                                this.c(var9 + var11, var10 - var12, 1);
                            }
                        }
                    }
                }

                return;
            case 8:
                this.eG = new int[var2];
                eH = new int[var2];
                this.eI = new int[var2];
                this.eJ = new int[var2];
                eQ = var2 - 1;

                for(var8 = 0; var8 < var2; ++var8) {
                    this.eG[var8] = this.dK[var8] / 22;
                    eH[var8] = this.dL[var8] / 22;
                    this.c(this.eG[var8], eH[var8], 128);
                    this.eI[var8] = this.x(10);
                    this.eJ[var8] = this.x(3);
                }

                return;
            case 9:
                this.fs = new byte[var2];
                this.ft = new int[var2];
                fu = new int[var2];

                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    this.fs[var8] = (byte)this.x(3);
                    var10 = this.dK[var8] / 22;
                    var11 = this.dL[var8] / 22;
                    this.ft[var8] = var10;
                    fu[var8] = var11;

                    for(var12 = 0; var12 <= var9; ++var12) {
                        this.c(var10, var11 + var12, 256);
                    }
                }

                return;
            case 10:
                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    var10 = this.dK[var8] / 22;
                    var11 = this.dL[var8] / 22;

                    for(var12 = 0; var12 <= var9; ++var12) {
                        this.c(var10 + var12, var11, 64);
                    }
                }

                return;
            case 11:
            case 12:
            case 13:
                c[] var15 = (c[])null;
                byte var13 = -1;
                byte var14 = -1;
                if (var1 == 11) {
                    var15 = this.fX;
                    var13 = 1;
                    var14 = 0;
                    if (this.fV) {
                    }
                } else if (var1 == 12) {
                    var15 = fY;
                    var13 = 2;
                    var14 = 0;
                    if (this.fW) {
                    }
                } else if (var1 == 13) {
                    var15 = this.fZ;
                    var13 = 3;
                    var14 = 0;
                }

                for(var8 = this.gW; var8 < this.gW + var2; ++var8) {
                    this.gk[var8] = var8;
                    go[var8] = this.dK[var8 - this.gW];
                    this.gp[var8] = this.dL[var8 - this.gW];
                    this.gu[var8] = go[var8] / 22;
                    this.gv[var8] = (this.gp[var8] - 1) / 22;
                    this.c(this.gu[var8], this.gv[var8] - 1, 2);
                    this.gm[var8] = var14;
                    this.gk[var8] = var8;
                    this.gl[var8] = var13;
                    gP[var8] = 0;
                    gq[var8] = go[var8];
                    gr[var8] = this.gp[var8];
                    this.gK[var8] = this.gp[var8] - this.gv[var8] * 22 << 8;
                    this.gs[var8] = 0;
                    gx[var8] = (byte)this.x(3);
                    gy[var8] = gx[var8];
                    this.gO[var8] = this.x(10) * 1000;
                    this.gg = this.x(1) == 1 ? var8 : 0;
                    gM[var8] = this.gO[var8];
                    gI[var8] = this.x(16);
                    gF[var8] = gI[var8];
                    this.gH[var8] = this.x(16);
                    this.gG[var8] = (byte)this.x(10);
                    this.gt[var8] = (byte)this.x(10);
                    this.gE[var8] = this.x(1) != 1;
                    gN[var8] = this.gE[var8];
                    gQ[var8] = this.x(1) == 1;
                    if (var1 == 13) {
                        boolean var16 = this.x(1) == 1;
                        boolean var17 = this.x(1) == 1;
                        if (gQ[var8]) {
                            var14 = 1;
                        }

                        if (var16 && !var17) {
                            this.ga = this.b(13313, dX[this.dT] >= 0 ? this.c(13315 + dX[this.dT]) : null);
                            this.j(13312);
                            gh = var8;
                            var10000 = gF;
                            var10000[var8] <<= 2;
                            gI[var8] = gF[var8];
                        } else if (var17) {
                            this.ga = this.b(14337);
                            this.j(14336);
                            this.gi = var8;
                            gh = var8;
                            var10000 = gF;
                            var10000[var8] <<= 2;
                            gI[var8] = gF[var8];
                        } else {
                            this.j(15360);
                        }
                    } else if (gQ[var8]) {
                        var14 = 1;
                    }

                    this.k(var14, var8);
                    this.a(var15, 85 + var8, 0, 0, 0, this.bW);
                    this.gz[var8] = (short)this.bW[2];
                    gw[var8] = (byte)(this.gz[var8] / 22 >> 1);
                    if (gw[var8] == 0) {
                        gw[var8] = 1;
                    }

                    this.gA[var8] = (short)this.bW[3];
                    this.gB[var8] = (byte)(this.gA[var8] / 22);
                }

                this.gW += var2;
                return;
            case 14:
                this.gX = new int[var2];
                this.gY = new int[var2];
                this.gZ = new int[var2 * 15];
                this.ha = new int[var2 * 15];
                this.hb = new boolean[var2 * 15];

                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    this.gX[var8] = this.dK[var8] / 22;
                    this.gY[var8] = this.dL[var8] / 22;

                    for(var10 = 0; var10 < 15; ++var10) {
                        if (var10 < 15) {
                            this.gZ[var10 + var8 * 15] = this.x(10);
                            this.ha[var10 + var8 * 15] = this.x(10);
                            this.hb[var10 + var8 * 15] = this.x(1) != 1;
                        } else {
                            this.x(10);
                            this.x(10);
                            this.x(1);
                        }
                    }

                    for(var10 = 0; var10 < var9; ++var10) {
                        this.c(this.gX[var8], this.gY[var8] + var10, 4);
                    }
                }

                return;
            case 17:
                eF = var2 - 1;

                for(var5 = 0; var5 < var2; ++var5) {
                    this.eA[var5] = this.x(6);
                    this.eB[var5] = this.dK[var5];
                    eC[var5] = this.dL[var5];
                    this.a(40 + var5, 3072, this.eA[var5]);
                    this.a(this.ez, 40 + var5, 0, 0, 0, this.bW);
                    this.eE[var5] = this.bW[2];
                    this.eD[var5] = this.bW[3];
                }

                return;
            case 18:
                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    var10 = this.dK[var8] / 22;
                    var11 = this.dL[var8] / 22;

                    for(var12 = 0; var12 <= var9; ++var12) {
                        this.c(var10 + var12, var11, 16);
                    }
                }

                return;
            case 21:
                this.fK = var2 - 1;

                for(var8 = 0; var8 < var2; ++var8) {
                    this.fD[var8] = this.x(6) << 1;
                    fG[var8] = this.dK[var8];
                    fH[var8] = this.dL[var8];
                    this.fF[var8] = 0;
                    this.a(60 + var8, 5121, this.fD[var8]);
                    this.a(this.fC, 60 + var8, 0, 0, 0, this.bW);
                    this.fJ[var8] = this.bW[2];
                    this.fI[var8] = this.bW[3];
                }

                return;
            case 22:
                for(var4 = 0; var4 < var2; ++var4) {
                    var3 = 0;

                    for(var5 = 0; var5 < 1; ++var5) {
                        if (this.x(1) == 1) {
                            var3 |= 1 << var5;
                        }
                    }

                    var5 = this.dK[var4] / 22;
                    var6 = this.dL[var4] / 22;
                    var7 = this.x(10);
                    var8 = this.x(10);
                    var9 = this.x(10);
                    var10 = this.x(10);

                    for(var11 = 0; var11 <= var7; ++var11) {
                        this.c(var5, var6 - var11, var3);
                    }

                    for(var11 = 0; var11 <= var8; ++var11) {
                        this.c(var5, var6 + var11, var3);
                    }

                    for(var11 = 0; var11 <= var9; ++var11) {
                        this.c(var5 - var11, var6, var3);
                    }

                    for(var11 = 0; var11 <= var10; ++var11) {
                        this.c(var5 + var11, var6, var3);
                    }
                }

                return;
            case 23:
                this.hd = new int[var2];
                this.he = new int[var2];
                this.hf = new int[var2];
                hg = new byte[var2];
                this.dJ = var2;

                for(var5 = var2 - 1; var5 >= 0; --var5) {
                    this.hd[var5] = this.x(8);
                    this.he[var5] = this.dK[var2 - var5 - 1];
                    this.hf[var5] = this.dL[var2 - var5 - 1];
                    hg[var5] = (byte)this.x(3);
                }

                return;
            case 25:
                for(var8 = 0; var8 < var2; ++var8) {
                    this.c(this.dK[var8] / 22, this.dL[var8] / 22, 1024);
                }

                return;
            case 26:
                this.is = this.dK[0];
                this.it = this.dL[0];
                this.iu = this.is;
                this.iv = this.it;
                this.iQ = false;
                this.iJ = false;
                this.jF = this.jI;
                jH = this.jJ;
                this.jS = false;
                iC = false;
                this.iw = this.is;
                this.ix = this.it;
                return;
            case 27:
                hs = var2 - 1;
                this.hi = new int[var2];
                this.hj = new int[var2];
                this.hk = new int[var2];
                hl = new int[var2];
                this.hm = new int[var2];
                this.hn = new int[var2];
                this.ho = new int[var2];
                this.hp = new byte[var2];
                this.hq = new byte[var2];
                hr = new boolean[var2];

                for(var8 = 0; var8 < var2; ++var8) {
                    this.hi[var8] = this.x(3);
                    hr[var8] = this.x(1) == 1;
                    this.a(111 + var8, 6144, this.hi[var8]);
                    this.a(this.hh, 111 + var8, 0, 0, 0, this.bW);
                    this.hj[var8] = this.dK[var8];
                    this.hk[var8] = this.dL[var8];
                    hl[var8] = this.dK[var8] / 22;
                    this.hm[var8] = this.dL[var8] / 22;
                    this.hn[var8] = this.bW[2];
                    this.ho[var8] = this.bW[3];
                    this.hp[var8] = (byte)(this.hn[var8] / 22);
                    this.hq[var8] = (byte)(this.ho[var8] / 22);
                    var9 = hl[var8];
                    var10 = this.hm[var8];

                    for(var11 = 0; var11 < this.hp[var8]; ++var11) {
                        for(var12 = 1; var12 <= this.hq[var8]; ++var12) {
                            this.c(var9 + var11, var10 - var12, 1);
                            this.c(var9 + var11, var10 - var12, 512);
                            if (hr[var8]) {
                                this.c(var9 + var11, var10 - var12, 8);
                            }
                        }
                    }

                    this.c(var9, var10, 1);
                }

                return;
            case 28:
                this.fw = new int[var2];
                this.fv = new int[var2];
                this.fx = new int[var2];
                fy = new int[var2];
                this.fz = new int[var2];
                fA = new int[var2];
                this.fB = new int[var2];

                for(var8 = 0; var8 < var2; ++var8) {
                    this.fv[var8] = this.dK[var8] / 22;
                    this.fw[var8] = this.dL[var8] / 22;
                    this.fx[var8] = this.x(10);
                    fy[var8] = this.x(10);
                    this.fz[var8] = this.x(3);
                    this.fB[var8] = this.x(10);
                    fA[var8] = 0;

                    for(var9 = 0; var9 <= this.fx[var8]; ++var9) {
                        for(var10 = 0; var10 <= fy[var8]; ++var10) {
                            this.c(this.fv[var8] + var9, this.fw[var8] + var10, 32);
                        }
                    }
                }

                return;
            case 29:
                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.x(10);
                    var10 = this.dK[var8] / 22;
                    var11 = this.dL[var8] / 22;

                    for(var12 = 0; var12 <= var9; ++var12) {
                        this.c(var10 + var12, var11, 16384);
                    }
                }

                return;
            case 30:
                for(var8 = 0; var8 < var2; ++var8) {
                    if (this.x(1) != 0) {
                        this.c(this.dK[var8] / 22, this.dL[var8] / 22, 2048);
                    } else {
                        this.c(this.dK[var8] / 22, this.dL[var8] / 22, 4096);
                    }
                }

                return;
            case 31:
                for(var5 = 0; var5 < var2; ++var5) {
                    var4 = 0;

                    for(var6 = 0; var6 < 1; ++var6) {
                        if (this.x(1) == 1) {
                            var4 |= 1 << var6;
                        }
                    }

                    var6 = this.dK[var5] / 22;
                    var7 = this.dL[var5] / 22;
                    this.c(var6, var7, var4);
                }

                return;
            case 32:
                er = var2 - 1;

                for(var5 = 0; var5 < var2; ++var5) {
                    this.ej[var5] = this.x(6) << 1;
                    ek[var5] = this.dK[var5];
                    this.el[var5] = this.dL[var5];
                    this.eq[var5] = this.x(1) == 1;
                    this.a(30 + var5, 5122, this.ej[var5]);
                    this.b(this.jP, 30 + var5, 0);
                    em[var5] = this.jP[0] + ek[var5];
                    this.en[var5] = this.jP[1] + this.el[var5];
                    this.ep[var5] = this.jP[2];
                    this.eo[var5] = this.jP[3];
                }

                return;
            case 33:
                this.fU = var2 - 1;

                for(var8 = 0; var8 < var2; ++var8) {
                    this.fM[var8] = this.x(6);
                    this.fN[var8] = this.x(10);
                    var9 = this.x(3) * 100;
                    fO[var8] = this.dK[var8];
                    this.fP[var8] = this.dL[var8];
                    this.fQ[var8] = this.dK[var8];
                    this.fR[var8] = this.dL[var8];
                    this.a(70 + var8, 6145, this.fM[var8]);
                    this.a(this.fL, 70 + var8, 0, 0, 0, this.bW);
                    this.b(70 + var8, var9);
                    this.fT[var8] = this.bW[2];
                    fS[var8] = this.bW[3];
                }

                return;
            case 34:
                this.eS = var2 - 1;
                this.eT = new int[var2];
                eU = new int[var2];
                this.eY = new boolean[var2];
                fb = new int[var2];
                this.fa = new int[var2];
                this.fc = new int[var2 + 1 << 2];
                eZ = new int[var2];
                this.eW = new int[var2];
                this.eV = new boolean[var2];
                this.eX = new int[var2];

                for(var8 = 0; var8 < var2; ++var8) {
                    var9 = this.dK[var8] / 22;
                    var10 = this.dL[var8] / 22;
                    this.eT[var8] = var9 * 22;
                    eU[var8] = var10 * 22;
                    this.fa[var8] = var9;
                    fb[var8] = var10;
                    this.eY[var8] = false;
                    this.eV[var8] = this.x(1) == 1;
                    eZ[var8] = 0 + (this.eV[var8] ? 4 : 0);
                    this.fc[var8 << 2] = this.x(3);
                    this.fc[(var8 << 2) + 1] = this.x(3);
                    this.fc[(var8 << 2) + 2] = this.x(3);
                    this.fc[(var8 << 2) + 3] = this.x(3);
                    this.a(106 + var8, 2050, eZ[var8]);
                    this.a(eR, 106 + var8, 0, 0, 0, this.bW);
                    this.eW[var8] = this.bW[2];
                    this.eX[var8] = this.bW[3];
                }

                return;
            case 35:
                fd = var2 - 1;
                fh = new int[var2];
                this.fi = new int[var2];
                ff = new int[var2];
                fg = new int[var2];
                fq = new boolean[var2];
                this.fn = new int[var2];
                fo = new int[var2];
                this.fp = new int[var2];
                fj = new int[var2];
                this.fl = new int[var2];
                fk = new int[var2];
                this.fm = new int[var2];
                this.fr = new boolean[var2];

                for(var8 = 0; var8 < var2; ++var8) {
                    fh[var8] = this.dK[var8];
                    this.fi[var8] = this.dL[var8];
                    ff[var8] = this.dK[var8] / 22;
                    fg[var8] = this.dL[var8] / 22;
                    this.fn[var8] = this.x(3);
                    this.fp[var8] = this.x(10);
                    fq[var8] = this.x(1) == 1;
                    this.fr[var8] = this.x(1) == 1;
                    fo[var8] = (this.fp[var8] << 2) + 0;
                    this.a(100 + var8, 2049, fo[var8]);
                    this.a(this.fe, 100 + var8, 0, 0, 0, this.bW);
                    fj[var8] = this.bW[2] / 22;
                    this.fl[var8] = this.bW[3] / 22;
                    fk[var8] = this.bW[2];
                    this.fm[var8] = this.bW[3];
                    fo[var8] = (this.fp[var8] << 2) + 2 - (fq[var8] ? 2 : 0);
                    this.a(100 + var8, 2049, fo[var8]);

                    for(var9 = 0; var9 < this.fl[var8]; ++var9) {
                        for(var10 = 0; var10 < fj[var8]; ++var10) {
                            if (fq[var8]) {
                                this.d(ff[var8] + var10, fg[var8] - var9, 1);
                            } else {
                                this.c(ff[var8] + var10, fg[var8] - var9, 1);
                            }
                        }
                    }
                }

                return;
            case 36:
                ey = var2 - 1;

                for(var5 = 0; var5 < var2; ++var5) {
                    this.et[var5] = this.x(6);
                    eu[var5] = this.dK[var5];
                    ev[var5] = this.dL[var5];
                    this.a(10 + var5, 3074, this.et[var5]);
                    this.a(this.es, 10 + var5, 0, 0, 0, this.bW);
                    this.ex[var5] = this.bW[2];
                    this.ew[var5] = this.bW[3];
                }

        }
    }

    private void a(byte[] var1, boolean var2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        switch (this.by) {
            case 0:
                if (!var2) {
                    this.bS = null;
                    this.dD = null;
                    this.dC = null;
                }

                for(var3 = 0; var3 < 10; ++var3) {
                    ed[var3] = -1;
                }

                this.a(var1);
                this.x(1);
                this.x(10);
                this.d(var2);
                this.x(1);
                this.count = this.x(16);
                this.dO = this.x(4);
                int[] var10 = new int[this.count];

                for(var4 = 0; var4 < this.count; ++var4) {
                    var10[var4] = this.x(this.dO);
                }

                this.dP = w(this.count);
                var4 = 0;
                var5 = 0;
                if (var2 && dF != 0) {
                    var4 = dF;
                    var5 = dE;
                }

                dE = this.x(16);
                dF = this.x(16);
                if (!var2) {
                    this.dM = 22 * dE;
                    this.dN = 22 * dF;
                    this.cL = this.dM - width;
                    this.cM = this.dN - height;
                }

                dG = dE * dF;
                if (!var2) {
                    this.dD = new short[dG];
                }

                this.dC = new byte[dG];

                for(var6 = 0; var6 < this.dC.length; ++var6) {
                    this.dC[var6] = (byte)this.x(this.dP);
                }

                this.x(8);
                this.d(this.count, var2);
                //TODO: make sure this actually works lol
                this.bS = bS.d(width, height);
                this.bS.a(dE, dF, this.bT, 22, 22);
                var7 = 0;

                for(int var8 = 0; var8 < dF; ++var8) {
                    for(int var9 = 0; var9 < dE; ++var9) {
                        this.bS.b(var9, var8, 1 + var10[this.dC[var7] & 255]);
                        ++var7;
                    }
                }

                this.dC = null;
                this.count = this.x(10);
                if (!var2) {
                    dH = dE * 22;
                    dI = dF * 22;
                }

                this.dQ = w(dH * dI + 1);
                dH = dE * 22;
                dI = dF * 22;
                if (var2 && var4 != 0) {
                    dF = var4;
                    dE = var5;
                }
            case 1:
            default:
                break;
            case 2:
                if (!var2) {
                    this.ht = this.b(2051, dX[this.dT] >= 0 ? this.c(2059 + dX[this.dT]) : null);
                }
                break;
            case 3:
                if (!var2) {
                    this.ic = this.b(28673, dX[this.dT] >= 0 ? this.c(28675 + dX[this.dT]) : null);
                }
                break;
            case 4:
                if (!var2) {
                    this.hc = this.b(3076, dX[this.dT] >= 0 ? this.c(3084 + dX[this.dT]) : null);
                }
                break;
            case 5:
                if (!var2) {
                    if (this.fV) {
                        this.fX = this.b(18433, dX[this.dT] >= 0 ? this.c(18435 + dX[this.dT]) : null);
                        this.j(18432);
                    } else {
                        this.fX = this.b(4097, dX[this.dT] >= 0 ? this.c(4099 + dX[this.dT]) : null);
                        this.j(4096);
                    }

                    if (this.fW) {
                        fY = this.b(16385, dX[this.dT] >= 0 ? this.c(16387 + dX[this.dT]) : null);
                        this.j(16384);
                    } else {
                        fY = this.b(17409, dX[this.dT] >= 0 ? this.c(17411 + dX[this.dT]) : null);
                        this.j(17408);
                    }

                    this.fZ = this.b(15361, dX[this.dT] >= 0 ? this.c(15363 + dX[this.dT]) : null);
                    this.j(15360);
                }
                break;
            case 6:
                if (!var2) {
                    this.ei = this.b(5125, dX[this.dT] >= 0 ? this.c(5142 + dX[this.dT]) : null);
                    this.fC = this.b(5124, dX[this.dT] >= 0 ? this.c(5132 + dX[this.dT]) : null);
                    this.hh = this.b(6146, dX[this.dT] >= 0 ? this.c(6150 + dX[this.dT]) : null);
                }
                break;
            case 7:
                if (!var2) {
                    this.fL = this.b(6147, dX[this.dT] >= 0 ? this.c(6153 + dX[this.dT]) : null);
                    this.hG = this.b(5123, dX[this.dT] >= 0 ? this.c(5129 + dX[this.dT]) : null);
                }
                break;
            case 8:
                if (!var2) {
                    this.fe = this.b(2052, dX[this.dT] >= 0 ? this.c(2062 + dX[this.dT]) : null);
                    eR = this.b(2053, dX[this.dT] >= 0 ? this.c(2065 + dX[this.dT]) : null);
                }
                break;
            case 9:
                if (!var2) {
                    this.es = this.b(3077, dX[this.dT] >= 0 ? this.c(3087 + dX[this.dT]) : null);
                    this.ez = this.b(3075, dX[this.dT] >= 0 ? this.c(3081 + dX[this.dT]) : null);
                    this.ec = this.b(7169, (byte[])null);
                    this.a(137, 7168, 31);
                }
        }

        if (this.by == 10 && !var2 || var2) {
            this.dJ = 0;
            if (!var2) {
                this.bS.r(1000);
            }

            this.kj = 0;

            while(this.count-- > 0) {
                var3 = this.x(10);
                var4 = this.x(16);
                var5 = 0;
                this.dK = new int[var4];
                this.dL = new int[var4];
                var6 = 0;

                for(var7 = 0; var7 < var4; ++var7) {
                    for(var5 += this.x(this.dQ); var5 >= dH; ++var6) {
                        var5 -= dH;
                    }

                    this.dK[var7] = var5;
                    this.dL[var7] = var6;
                }

                this.f(var3, var4);
            }

            for(var3 = this.hH; var3 >= 0; --var3) {
                if (hK[var3]) {
                    this.g(this.hL[var3] / 22, this.hM[var3] / 22);
                }
            }

            this.dY = null;
            this.x();
            this.ai();
            this.b((DataInputStream)null);
        }

        ++this.by;
    }

    private void x() {
        short[] var1 = new short[256];
        int var2 = 0;

        int var3;
        for(var3 = 0; var3 < this.dJ; ++var3) {
            this.a(136, 3073, this.hd[var3]);
            var2 += this.a(var1, 136, 0);
        }

        this.bS.c(this.dJ + var2, dE <= dF);

        for(var3 = 0; var3 <= 7; ++var3) {
            for(int var4 = this.dJ - 1; var4 >= 0; --var4) {
                if (hg[var4] == var3) {
                    this.a(136, 3073, this.hd[var4]);
                    int var5 = this.a(var1, 136, 0);

                    for(int var6 = 0; var6 < var5; ++var6) {
                        this.bS.a(this.hc[var1[var6 * 4]], this.he[var4] + var1[var6 * 4 + 1], this.hf[var4] + var1[var6 * 4 + 2], var1[var6 * 4 + 3]);
                    }
                }
            }
        }

        this.he = null;
        this.hf = null;
        this.hd = null;
        hg = null;
    }

    private void d(boolean var1) {
        if (!var1) {
            this.bY = this.x(10);
            jQ = this.x(1) != 1;
            this.jR = jQ;
            this.fV = this.x(1) == 1;
            this.fW = this.x(1) == 1;
            this.x(1);
            int var2 = this.x(16);
            this.jO = this.jO < var2 ? var2 : this.jO;
        }

    }

    private static int w(int var0) {
        int var1 = -1;

        int var10000;
        do {
            var10000 = var0 - 1;
            ++var1;
        } while(var10000 >> var1 > 0);

        return var1;
    }

    private void a(byte[] var1) {
        this.dY = var1;
        this.dZ = 0;
        this.ea = 0;
        this.eb = 0;
    }

    private int x(int var1) {
        int var2 = 0;

        int var4;
        for(int var3 = var1; var3 > 0; var3 -= var4) {
            if (this.eb == 0) {
                this.ea = this.dY[this.dZ++] & 255;
                this.eb = 8;
            }

            var4 = Math.min(var3, this.eb);
            var2 |= (this.ea >> 8 - this.eb & ~(-1 << var4)) << var1 - var3;
            this.eb -= var4;
        }

        return var2;
    }

    private void d(int var1, boolean var2) {
        for(int var3 = 0; var3 < var1; ++var3) {
            for(int var4 = 0; var4 < 1; ++var4) {
                if (this.x(1) == 1 && !var2) {
                    short[] var10000 = this.dD;
                    var10000[var3] = (short)(var10000[var3] | 1 << var4);
                }
            }
        }

        if (!var2) {
            this.bT = this.c(2058, dX[this.dT] >= 0 ? this.c(2068 + dX[this.dT]) : null);
        }

    }

    private void y(int var1) {
        this.a(0 + this.eh, 0 + ed[var1]);
        this.eg[var1] = this.eg[this.eh];
        this.ee[var1] = this.ee[this.eh];
        this.ef[var1] = this.ef[this.eh];
        ed[this.eh] = -1;
        if (this.eh >= 0) {
            --this.eh;
        }

    }

    private void z(int var1) {
        if (this.ej[er] >= 0) {
            this.a(er + 30, var1 + 30);
        }

        this.ej[var1] = this.ej[er];
        ek[var1] = ek[er];
        this.el[var1] = this.el[er];
        this.ep[var1] = this.ep[er];
        this.eo[var1] = this.eo[er];
        em[var1] = em[er];
        this.en[var1] = this.en[er];
        this.ej[er] = -1;
        if (er > 0) {
            --er;
        }

    }

    private void A(int var1) {
        if (this.fD[this.fK] >= 0) {
            this.a(this.fK + 60, var1 + 60);
        }

        this.fD[var1] = this.fD[this.fK];
        fG[var1] = fG[this.fK];
        fH[var1] = fH[this.fK];
        this.fF[var1] = this.fF[this.fK];
        this.fE[var1] = this.fE[this.fK];
        this.fI[var1] = this.fI[var1];
        this.fJ[var1] = this.fJ[var1];
        this.fD[this.fK] = -1;
        if (this.fK >= 0) {
            --this.fK;
        }

    }

    private void B(int var1) {
        if (this.hv[this.hu] >= 0) {
            this.a(this.hu + 116, var1 + 116);
        }

        this.hv[var1] = this.hv[this.hu];
        hy[var1] = hy[this.hu];
        this.hz[var1] = this.hz[this.hu];
        this.hw[var1] = this.hw[this.hu];
        hx[var1] = hx[this.hu];
        this.hC[var1] = this.hC[this.hu];
        this.hD[var1] = this.hD[this.hu];
        this.hv[this.hu] = -1;
        if (this.hu >= 0) {
            --this.hu;
        }

    }

    private void g(int var1, int var2) {
        this.d(var1 + 1, var2, 128);
        this.d(var1 - 1, var2 + 1, 128);
        this.d(var1 - 1, var2, 128);
        this.d(var1 + 1, var2 + 1, 128);
        this.d(var1, var2 + 1, 128);
        this.d(var1, var2, 128);
    }

    private void C(int var1) {
        int var2 = var1 << 2;
        int var3 = this.ib << 2;
        System.arraycopy(hT, var3, hT, var2, 4);
        System.arraycopy(hU, var3, hU, var2, 4);
        hY[var1] = hY[this.ib];
        hV[var1] = hV[this.ib];
        hW[var1] = hW[this.ib];
        hX[var1] = hX[this.ib];
        hZ[var1] = hZ[this.ib];
        ia[var1] = ia[this.ib];
        if (this.ib >= 0) {
            --this.ib;
        }

    }

    private void d(int var1, int var2, int var3, int var4) {
        if (var4 != 0 && (var3 != 0 || jN < this.jO)) {
            if (var3 == 1 || var3 == 2) {
                var4 <<= 3;
            }

            byte var5;
            byte var6;
            if (var4 > 60) {
                var5 = 18;
                var6 = 9;
            } else {
                var5 = 6;
                var6 = 3;
            }

            int var7 = -1;
            int var8;
            if (var3 == 3) {
                for(var8 = this.gW; var8 >= 0; --var8) {
                    if (a(bU - 88, bV - 88, 528, 592, go[var8] - this.gz[var8], this.gp[var8] - this.gA[var8], this.gz[var8] << 1, this.gA[var8])) {
                        ++var7;
                        if (var7 >= this.bW.length) {
                            var7 = this.bW.length - 1;
                            break;
                        }

                        this.bW[var7] = var8;
                    }
                }

                if (var7 == -1) {
                    return;
                }

                jH -= 256;
                if (jH <= 0) {
                    jH = 0;
                    this.ad();
                }
            }

            var8 = 0;
            boolean var9 = false;

            while(true) {
                while(!var9) {
                    this.bP = bQ.nextInt();
                    int[] var10000;
                    int var10001;
                    if (this.ib >= 18 && var4 > 0) {
                        var9 = true;
                        var10000 = ia;
                        var10001 = this.ib - 1;
                        var10000[var10001] += var4;
                        var4 = 0;
                    } else {
                        ++this.ib;
                        int var10 = this.ib << 2;
                        int var11 = (this.bP & 128) > 0 ? 1 : -1;
                        int var12 = var1 + var11 * (this.bP & 15);
                        hT[var10++] = var12;
                        hT[var10++] = var12;
                        hT[var10++] = var12;
                        hT[var10++] = var12;
                        var10 -= 4;
                        hV[this.ib] = var11 * (this.bP & 7) << 8;
                        var11 = (this.bP & 256) > 0 ? 1 : -1;
                        var12 = var2 + var11 * (this.bP & 15) - 10;
                        hU[var10++] = var12;
                        hU[var10++] = var12;
                        hU[var10++] = var12;
                        hU[var10] = var12;
                        hW[this.ib] = (this.bP >> 3 & 7) << 8;
                        hZ[this.ib] = var3;
                        hY[this.ib] = 0;
                        if (var3 == 3) {
                            hX[this.ib] = this.bW[var8];
                            ++var8;
                            if (var8 > var7) {
                                var8 = 0;
                            }
                        } else {
                            hX[this.ib] = -1;
                        }

                        if (var4 > 24) {
                            ia[this.ib] = var5;
                            var4 -= var5;
                        } else {
                            ia[this.ib] = var6;
                            var4 -= var6;
                        }

                        if (var4 < 0) {
                            var10000 = ia;
                            var10001 = this.ib;
                            var10000[var10001] += var4;
                            var4 = 0;
                            var9 = true;
                        }
                    }
                }

                return;
            }
        }
    }

    private void y() {
        this.iE = false;
        this.iA = -1;
        in = false;
        this.db = false;
        this.jS = false;
        this.ad();
        this.iS = this.iw / 22;
        iT = this.ix / 22;
        this.jF = this.jI;
        this.jG = this.jF;
        bU = this.iw - halfWidth - ((jQ ? 1 : -1) * width >> 2);
        bV = this.ix - 350;
        this.cY = bU << 8;
        this.cZ = bV << 8;
        this.jf = -1;
        this.jg = -1;
        this.D(0);
        this.a(133, 1025, 4);
        this.a(this.ic, 135, 0, 0, 0, this.bW);
        this.jE = this.ix % 22;
        jD = this.iw % 22;
        iY = this.bW[2] >> 1;
        this.iZ = this.bW[3];
        this.jC = this.iZ / 22;
        this.jT = iY >> 1;
        this.jU = -(iY >> 1);
    }

    private void h(int var1, int var2) {
        if (super.a != 0) {
            this.iw += (!jQ || super.a <= 0) && (jQ || super.a >= 0) ? this.jU : this.jT - 1;
        }

        if (super.b < 0) {
            this.ix -= this.iZ;
        } else {
            --this.ix;
        }

        int var5 = var1;
        int var6 = this.D();
        jD = this.iw - var1 * 22 << 8;
        if (jD <= 0) {
            var5 = var1 - 1;
            jD += 5632;
        } else if (jD >= 5632) {
            var5 = var1 + 1;
            jD -= 5632;
        }

        this.jE = this.ix - var6 * 22 << 8;
        if (super.a != 0) {
            this.iw -= (!jQ || super.a <= 0) && (jQ || super.a >= 0) ? this.jU : this.jT - 1;
        }

        if (super.b < 0) {
            this.ix += this.iZ;
        } else {
            ++this.ix;
        }

        int var7 = (super.a > 0 ? super.a : -super.a) << 8;
        int var8 = (super.b > 0 ? super.b : -super.b) << 8;
        int var9 = var7;
        int var10 = var8;
        this.jY = true;
        jZ = true;
        if (var7 > var8) {
            if (var7 > 5632) {
                var8 = (var8 * 22 << 8) / var7;
                var7 = 5632;
            }
        } else if (var8 > 5632) {
            var7 = (var7 * 22 << 8) / var8;
            var8 = 5632;
        }

        int var3;
        if ((!jQ || super.a <= 0) && (jQ || super.a >= 0)) {
            var3 = -var7;
        } else {
            var3 = var7;
        }

        int var4 = super.b > 0 ? var8 : -var8;
        int var11 = 0;
        int var12 = 0;
        this.ke = 0;
        this.kf = 0;

        int var13;
        while(var11 < var9 || var12 < var10) {
            jD += var3;
            this.jE += var4;
            if (jD >= 5632) {
                jD -= 5632;
                ++var5;
            } else if (jD < 0) {
                jD += 5632;
                --var5;
            }

            if (this.jE >= 5632) {
                this.jE -= 5632;
                ++var6;
            } else if (this.jE < 0) {
                this.jE += 5632;
                --var6;
            }

            this.i(var5, var6);
            if ((this.j(var5, var6) & 32) == 0) {
                this.jg = -1;
                this.jf = -1;
            } else {
                this.kW = true;
                if (this.jf == -1) {
                    for(var13 = 0; var13 < this.fv.length; ++var13) {
                        if (a(var1, var2, this.fv[var13], this.fw[var13], this.fx[var13], fy[var13])) {
                            if (fA[var13] < this.fB[var13] && this.fB[var13] > 0 && this.jg <= 0) {
                                this.jf = var13;
                                this.jg = 2000;
                                if (fA[0] < this.fB[var13]) {
                                    ji = true;
                                }
                            } else {
                                this.jg = -1;
                                this.jf = -1;
                                this.kW = true;
                            }
                        }
                    }
                }
            }

            if (this.jY) {
                this.ke += var3;
                var11 += var7;
            } else {
                jD -= var3;
                var9 = var11;
                if ((this.j(var1, var2) & 1) != 0 && !this.kb) {
                    this.ke = 0;
                    if ((!jQ || super.a <= 0) && (jQ || super.a >= 0)) {
                        this.iw = var1 * 22 + (iY >> 1);
                    } else {
                        this.iw = (var1 + 1) * 22 - (iY >> 1);
                    }
                }
            }

            if (jZ) {
                this.kf += var4;
                var12 += var8;
            } else {
                this.jE -= var4;
                var10 = var12;
                if (super.b < 0 && this.iJ) {
                    var6 += this.jC + 1;
                }
            }
        }

        this.iw += this.ke >> 8;
        this.ix += this.kf >> 8;
        if (var11 > var9) {
            var13 = var11 - var9 >> 8;
            this.iw -= var3 > 0 ? var13 : -var13;
        }

        if (var12 > var10) {
            var13 = var12 - var10 >> 8;
            this.ix -= var4 > 0 ? var13 : -var13;
        }

        if (!this.jY) {
            if (jD < 0) {
                --var5;
            } else if (jD > 22) {
                ++var5;
            }
        }

        this.iS = var5;
        iT = var6;
    }

    private boolean z() {
        int var1 = (!jQ || this.jW != 22) && (jQ || this.jW != 23) ? -1 : 1;
        byte var2 = 0;
        if (this.iH == 1) {
            var2 = 1;
        }

        int var3 = hl[iz] + (var1 < 0 ? this.hp[iz] - 1 : 0);
        int var4 = iT;
        int var5 = this.hq[iz];
        if (this.jW == 23 && var5 <= this.jC) {
            var5 = this.jC + 1;
        }

        int var6;
        for(var6 = 0; var6 < var5; ++var6) {
            if ((this.j(var3 + var1 + var1, var4 - var6) & 1) != 0) {
                return false;
            }

            if (this.jW == 23 && ((this.j(var3 + var1 + var1 + var1, var4 - var6) & 1) != 0 || (this.j(var3 + var1 + var1 + var1 + var1, var4 - var6) & 1) != 0)) {
                return false;
            }

            if ((this.j(var3 + var1 * (this.hp[iz] + var2), var4 - var6) & 1) != 0) {
                var2 = 0;
            }
        }

        if (this.jW == 23 && (this.j(this.iS + var1, var4) & 1) != 0) {
            return false;
        } else {
            int var7;
            for(var6 = 0; var6 < this.hp[iz]; ++var6) {
                for(var7 = 0; var7 < this.hq[iz]; ++var7) {
                    this.d(hl[iz] + var6, var4 - var7, 1);
                    this.d(hl[iz] + var6, var4 - var7, 512);
                    if (hr[iz]) {
                        this.d(hl[iz] + var6, var4 - var7, 8);
                    }
                }
            }

            int[] var10000 = hl;
            int var10001 = iz;
            var10000[var10001] += var1 > 0 ? 1 + var2 : -(1 + var2);

            for(var6 = 0; var6 < this.hp[iz]; ++var6) {
                for(var7 = 0; var7 < this.hq[iz]; ++var7) {
                    this.c(hl[iz] + var6, var4 - var7, 1);
                    this.c(hl[iz] + var6, var4 - var7, 512);
                    if (hr[iz]) {
                        this.c(var3 + var6 + var2 + this.hp[iz] * var1, var4 - var7, 8);
                    }
                }
            }

            this.kc = true;
            this.a(111 + iz, 6144, this.hi[iz] + (3 << var2));
            return true;
        }
    }

    private void i(int var1, int var2) {
        boolean var3 = jQ && super.a > 0 || !jQ && super.a < 0;
        if ((this.j(var1, var2) & 1024) != 0) {
            this.iu = var1 * 22;
            this.iv = var2 * 22;
            this.jR = jQ;
        }

        int var4;
        int var5;
        int var6;
        if ((this.j(var1, var2) & 256) != 0) {
            for(var4 = var2; (this.j(var1, var4) & 256) != 0; --var4) {
            }

            ++var4;

            label629:
            for(var5 = 0; var5 < this.fs.length; ++var5) {
                if (this.ft[var5] == var1 && fu[var5] == var4) {
                    var6 = 0;

                    while(true) {
                        if (var6 >= fq.length) {
                            break label629;
                        }

                        if (this.fn[var6] == this.fs[var5]) {
                            fq[var6] = !fq[var6];
                        }

                        ++var6;
                    }
                }
            }

            while((this.j(var1, var4) & 256) != 0) {
                this.d(var1, var4, 256);
                ++var4;
            }
        }

        int var7;
        if ((this.j(var1, var2) & 4) != 0) {
            var4 = var2;

            for(var5 = 0; (this.j(var1, var2 - var5) & 4) != 0; ++var5) {
                --var4;
                this.d(var1, var2 - var5, 4);
            }

            var5 = 1;
            ++var4;

            while((this.j(var1, var2 + var5) & 4) != 0) {
                this.d(var1, var2 + var5, 4);
                ++var5;
            }

            var6 = -1;

            for(var7 = 0; var7 < this.gX.length; ++var7) {
                if (this.gX[var7] == var1 && this.gY[var7] == var4) {
                    var6 = var7;
                    break;
                }
            }

            for(var7 = 0; var7 <= this.gW; ++var7) {
                gx[var7] = gy[var7];
                if (this.gZ[this.gt[var7] + var6 * 15] != 0) {
                    gq[var7] = this.gZ[this.gt[var7] + var6 * 15] * 22;
                    gr[var7] = this.ha[this.gt[var7] + var6 * 15] * 22;
                    gN[var7] = this.hb[this.gt[var7] + var6 * 15];
                    if (!a(bU - 88, bV - 88, 528, 592, go[var7] - this.gz[var7], this.gp[var7] - this.gA[var7], this.gz[var7] << 1, this.gA[var7])) {
                        gF[var7] = gI[var7];
                        go[var7] = gq[var7];
                        this.gp[var7] = gr[var7];
                        this.d(this.gu[var7], this.gv[var7] - 1, 2);
                        this.gu[var7] = go[var7] / 22;
                        this.gv[var7] = this.gp[var7] / 22;
                        this.c(this.gu[var7], this.gv[var7] - 1, 2);
                        switch (this.gl[var7]) {
                            case 1:
                                this.k(0, var7);
                                break;
                            case 2:
                                this.k(0, var7);
                                break;
                            case 3:
                                this.k(0, var7);
                        }
                    }
                }
            }
        }

        var4 = 0;
        this.ka = false;

        int var8;
        for(var5 = this.iZ; var5 > 0; var5 -= 22) {
            if (var2 < dF) {
                if (var2 - var4 < 0 || var2 - var4 >= dF) {
                    this.jY = false;
                    break;
                }

                if (var5 > 0) {
                    if (this.jY && var1 >= 0) {
                        this.jY = (this.j(var1, var2 - var4) & 1) == 0;
                    } else {
                        this.jY = false;
                    }

                    if (!this.jY) {
                        if (this.jW != 22 && this.iP && (this.j(var1, var2 - var4) & 512) != 0) {
                            var6 = jQ ? 1 : -1;

                            for(var7 = 0; (this.j(var1 + var7, var2) & 512) != 0 && !jQ; var7 += var6) {
                            }

                            var7 += jQ ? 0 : 1;

                            for(var8 = hs; var8 >= 0; --var8) {
                                if (hl[var8] == var1 + var7 && this.hm[var8] == var2 + 1) {
                                    this.kb = true;
                                    this.iw = var1 * 22 + (!jQ ? this.jT : this.jU);
                                    this.D(21);
                                    iz = var8;
                                }
                            }
                        }
                        break;
                    }
                }

                if (var1 < 0 || var1 >= dE) {
                    this.jY = false;
                }

                if (super.b >= 0) {
                    ++var4;
                } else {
                    --var4;
                }

                if (iM && var5 - 22 <= 0 && super.b == 0 && (this.j(var1, var2 - var4) & 16) == 0) {
                    this.jY = false;
                    this.D(26);
                    ++this.ix;
                }
            }
        }

        var5 = var1;
        if (super.a == 0 && super.b != 0) {
            var5 = var1 + (jQ ? 1 : -1);
        }

        if (super.b >= 0) {
            var4 = this.jC;
            if (this.jE < 2816) {
                ++var4;
            }
        } else {
            var4 = 0;
        }

        var6 = var2 - var4;
        var7 = jQ ? -1 : 1;
        if (this.jF > 0 && !this.iR && (this.j(var5, var6 - 1) & 1) == 0 && ((this.j(var5, var6) & 1) != 0 || this.iQ) && (this.j(var5 + var7, var6) & 1) == 0 && (this.j(var5 + var7, var6 - 1) & 1) == 0 && (this.j(var5 + var7, var6 + this.jC) & 1) == 0 && super.b != 0 && (!this.iJ || this.iQ) && !iN && !this.iU && x != 105) {
            if (this.iQ && super.b < 0) {
                this.D(38);
                var8 = 0;
                if ((this.j(var5, var2) & 1) == 0) {
                    ++var8;
                }

                this.ix = (var2 + var8) * 22 + this.iZ;
            } else if (this.jW != 40 && !this.iJ) {
                this.D(37);
                this.ix = (var2 - var4) * 22 + this.iZ;
            }

            this.kf = 0;
            if (!jQ) {
                ++var5;
            }

            this.iw = var5 * 22 + (jQ ? -(iY >> 1) : iY >> 1);
            this.ke = 0;
            jZ = false;
            this.jY = false;
        } else {
            if (!this.jY && super.a != 0) {
                var4 = var3 ? -1 : 1;
            } else {
                var4 = 0;
            }

            var8 = var2;
            int var9;
            if ((var9 = super.b > 0 ? var2 - this.jC : var2 + this.jC) < 0) {
                var9 = 0;
            }

            if (super.b != 0) {
                boolean var10 = false;

                for(int var11 = iY; var11 > 0; var11 -= 22) {
                    if (var1 + var4 >= 0 && var1 + var4 < dE) {
                        if (jZ) {
                            jZ = (this.j(var1 + var4, var8) & 1) == 0;
                            if (((this.j(var1 + var4, var9) & 16) != 0 || (this.j(var1 + var4, var9) & 8192) != 0) && jX != 121 && this.jW != 38 && this.jF > 0) {
                                if ((this.j(var1 + var4, var9) & 8192) != 0 && jX != 24 && jX != 25 && !this.iL) {
                                    this.D(120);
                                    this.ix = (var9 + 1) * 22 + this.iZ;
                                    jZ = false;
                                    this.kf = 0;
                                    this.iV = true;
                                } else if ((this.j(var1 + var4, var9) & 16) != 0) {
                                    this.ix = (var9 + 1) * 22 + this.iZ;
                                    jZ = false;
                                    this.kf = 0;
                                    this.D(45);
                                }
                            }
                        }

                        if (!jZ && super.b > 0 && !iM && this.jW != 38) {
                            this.ix = var2 * 22;
                            this.kf = 0;
                            this.ka = true;
                            int var12 = var1;
                            if (jQ && super.a > 0 || !jQ && super.a < 0) {
                                var12 = var1 - 1;
                            } else if (super.a != 0) {
                                var12 = var1 + 1;
                            }

                            if ((this.j(var12, var2) & 16384) != 0 && jX != 48) {
                                this.D(50);
                            } else if (this.jW != 77 && this.jW != 95 && this.jW != 108 && this.jW != 114 && this.jW != 115 && this.jW != 116 && this.jW != 60 && jX != 120 && jX != 121 && jX != 48) {
                                if (in) {
                                    this.A();
                                }

                                this.D(27);
                                if (this.kg >= 4) {
                                    this.cF = this.kg;
                                }
                            } else if (this.jW != 77 && this.jW != 60) {
                                if (this.jW == 95 && !var10) {
                                    var10 = true;
                                    this.d(this.iw, this.ix - this.iZ + (this.iZ >> 2), 3, ih[js]);
                                }
                            } else {
                                this.iU = true;
                                this.cF += 6;
                                this.ai();
                                this.playSound(2);
                            }
                        }

                        if (!jZ && (jX == 24 || jX == 25) && super.b < 0) {
                            this.D(99);
                            break;
                        }

                        if (var8 < 0 || var8 >= dF) {
                            jZ = false;
                        }

                        if (super.a == 0) {
                            break;
                        }
                    }

                    int var10000;
                    if (var3) {
                        --var4;
                        var10000 = var4;
                    } else {
                        ++var4;
                        var10000 = var4;
                    }

                    var4 = var10000;
                }
            }

            if (this.iJ && this.jW != 38) {
                int var13 = var1;
                var1 += jQ ? 1 : -1;
                if ((this.j(var1, var8) & 8) == 0) {
                    jZ = false;
                    this.ix = (var8 + (super.b < 0 ? 1 : 0)) * 22 + (super.b < 0 ? this.iZ : 0);
                    if (super.b >= 0 || (this.j(var1, var8) & 1) != 0) {
                        if (jX == 34) {
                            this.D(26);
                        } else {
                            this.D(33);
                        }

                        jZ = false;
                    }

                    if (super.b < 0) {
                        this.iQ = true;
                    }
                }

                var1 = var13;
            }

            if (!this.jY && super.a != 0 && !this.ka && this.jW != 38 && !this.iJ && !this.iL) {
                if ((!jQ || super.a <= 0 || jD << 8 <= 22 - (iY >> 1)) && (jQ || super.a >= 0 || jD >> 8 >= iY >> 1)) {
                    if (!jQ && super.a > 0 && jD << 8 > 22 - (iY >> 1) || jQ && super.a < 0 && jD >> 8 < iY >> 1) {
                        this.iw = (var1 + 1) * 22 - this.jU;
                        this.kb = true;
                        if ((this.j(var1, var8 + (super.b > 0 ? -1 : 1)) & 8) != 0 && (this.j(var1, var8 + (super.b > 0 ? -this.jC : this.jC)) & 8) != 0 && super.b != 0) {
                            this.D(33);
                        }
                    }
                } else {
                    this.iw = var1 * 22 - this.jT;
                    this.kb = true;
                    if ((this.j(var1, var8 + (super.b > 0 ? -1 : 1)) & 8) != 0 && (this.j(var1, var8 + (super.b > 0 ? -this.jC : this.jC)) & 8) != 0 && this.jW != 38 && super.b != 0) {
                        this.D(33);
                    }
                }

                this.ke = 0;
            }

            if (!this.jY && super.a != 0) {
                if (this.jW == 9) {
                    this.D(0);
                } else if (this.jW == 51) {
                    this.D(50);
                }
            }

            if (in && (!this.jY || !jZ)) {
                this.A();
            }

        }
    }

    private int j(int var1, int var2) {
        return var1 >= 0 && var1 < dE && var2 >= 0 && var2 < dF ? this.dD[var1 + dE * var2] : 65;
    }

    private void c(int var1, int var2, int var3) {
        if (var1 >= 0 && var1 < dE && var2 >= 0 && var2 < dF) {
            short[] var10000 = this.dD;
            int var10001 = var1 + dE * var2;
            var10000[var10001] = (short)(var10000[var10001] | var3);
        }
    }

    private void d(int var1, int var2, int var3) {
        if (var1 >= 0 && var1 < dE && var2 >= 0 && var2 < dF) {
            short[] var10000 = this.dD;
            int var10001 = var1 + dE * var2;
            var10000[var10001] = (short)(var10000[var10001] & ~var3);
        }
    }

    private void A() {
        if (this.gl[this.iA] == 1) {
            this.k(0, this.iA);
        } else if (this.gl[this.iA] == 2) {
            this.k(0, this.iA);
        } else if (this.gl[this.iA] == 3) {
            this.k(0, this.iA);
        }

        this.D(26);
        in = false;
        this.kd = 0;
    }

    private void k(int var1, int var2) {
        this.gD[var2] = this.gl[var2] == 1 && (var1 == 13 || var1 == 17 || var1 == 23 || var1 == 12 || var1 == 15 || var1 == 16 || var1 == 14 || var1 == 21);
        this.gC[var2] = this.gl[var2] == 1 && (var1 == 19 || var1 == 18 || var1 == 26 || var1 == 20);
        if (this.gl[var2] == 1) {
            if (var1 != 5 && var1 != 6 && var1 != 16 && var1 != 15) {
                if (var1 != 8 && var1 != 9 && var1 != 10 && var1 != 24) {
                    if (var1 != 2 && var1 != 7) {
                        if (var1 != 11 && var1 != 21 && var1 != 3) {
                            if (var1 == 1) {
                                gP[var2] = bQ.nextInt() & 511;
                            }

                            this.gn[var2] = -1;
                        } else {
                            this.gn[var2] = 3;
                        }
                    } else {
                        this.gn[var2] = 2;
                    }
                } else {
                    this.gs[var2] = 0;
                    this.gn[var2] = 1;
                }
            } else {
                this.gn[var2] = 0;
            }
        } else if (this.gl[var2] == 2) {
            if (var1 != 7 && var1 != 12 && var1 != 13) {
                this.gn[var2] = -1;
            } else {
                this.gs[var2] = 0;
                this.gn[var2] = 1;
            }

            if (var1 == 1) {
                gP[var2] = bQ.nextInt() & 511;
            }
        } else if (this.gl[var2] == 3) {
            if (var1 != 7 && var1 != 13 && var1 != 17 && var1 != 16) {
                this.gn[var2] = -1;
            } else {
                this.gs[var2] = 0;
                this.gn[var2] = 1;
            }

            if (var1 == 1) {
                gP[var2] = bQ.nextInt() & 511;
            }
        }

        if ((this.iA != -1 && var2 != this.iA || this.cI > 0) && !this.gC[var2] && var1 != 7 && var1 != 11) {
            switch (this.gl[var2]) {
                case 1:
                    if (this.gm[var2] == 0 && var1 != 27) {
                        return;
                    }

                    if (var1 != 27) {
                        var1 = 0;
                    }
                    break;
                case 2:
                    if ((this.gm[var2] == 0 || this.gm[var2] == 12 || this.gm[var2] == 10) && var1 != 14) {
                        return;
                    }

                    if (var1 != 14) {
                        var1 = 0;
                    }
                    break;
                case 3:
                    if ((this.gm[var2] == 0 || this.gm[var2] == 12 || this.gm[var2] == 11) && var1 != 18) {
                        return;
                    }

                    if (var1 != 18) {
                        var1 = 0;
                    }
            }
        }

        this.gm[var2] = var1;
        if (this.gl[var2] == 1) {
            if (this.fV) {
                this.a(85 + var2, 18432, var1);
            } else {
                this.a(85 + var2, 4096, var1);
            }
        } else if (this.gl[var2] == 2) {
            if (this.fW) {
                this.a(85 + var2, 16384, var1);
            } else {
                this.a(85 + var2, 17408, var1);
            }
        } else {
            if (this.gl[var2] == 3) {
                if (gh == var2 && this.gi != var2) {
                    this.a(85 + var2, 13312, var1);
                    return;
                }

                if (this.gi == var2) {
                    this.a(85 + var2, 14336, var1);
                    return;
                }

                this.a(85 + var2, 15360, var1);
            }

        }
    }

    private void B() {
        this.D(14);
        this.k(24, this.iA);
        this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 1, this.gH[this.iA]);
        gF[this.iA] = -1;
        this.a(go[this.iA] - (this.gz[this.iA] >> 1), this.gp[this.iA] - (this.gA[this.iA] >> 1), 22, !jQ ? 2 : 0, false);
    }

    private void D(int var1) {
        this.ik = 0;
        this.il = 0;
        iy = 0;
        this.jW = var1;
        jB = 0;
        boolean var2 = false;
        if (var1 == 22 && jx) {
            var1 = 20;
        }

        if ((var1 == 5 || var1 == 8) && jx) {
            ++var1;
        } else if (var1 == 100 && jx) {
            ++var1;
        } else if (var1 == 38 && jx) {
            var1 = 39;
        } else if (var1 == 27 && jx) {
            var1 = 29;
        } else if (var1 == 3) {
            if (jx) {
                var1 = 4;
            }
        } else if (var1 == 97 && jx) {
            var1 = 98;
        }

        if (var1 != 14 && var1 != 88 && var1 != 90 && var1 != 89 && var1 != 91 && var1 != 108 && var1 != 109 && var1 != 114 && var1 != 116 && var1 != 115 && var1 != 113 && var1 != 93 && var1 != 92 && var1 != 12 && var1 != 13 && var1 != 117 && (this.gi != this.iA || this.iA >= 0 && this.gm[this.iA] != 16)) {
            in = false;
            this.kd = 0;
            this.iA = -1;
            this.kW = true;
        }

        if (var1 != 31) {
            this.iI = false;
        } else {
            this.iI = true;
        }

        if (var1 == 0) {
            this.iR = false;
            if (this.iV) {
                var1 = 10;
            } else if (jx) {
                var1 = 1;
            }
        } else if (var1 == 31 && jx) {
            var1 = 32;
        } else if (var1 != 54 && var1 != 36 && var1 != 47) {
            this.ja = false;
            this.iR = false;
            this.ij = false;
        } else {
            this.iR = true;
            var2 = true;
            if (!this.iJ && !iM) {
                if (this.ij) {
                    this.ij = false;
                    this.jc = 0;
                }

                if (jx) {
                    var1 = 72 + this.jc;
                    if (this.jc < this.jk) {
                        ++this.jc;
                    } else {
                        this.ja = false;
                        var1 = 77;
                        this.jW = 77;
                        this.ij = true;
                    }
                } else {
                    var1 += this.jc;
                    if (this.jc < jj) {
                        ++this.jc;
                    } else {
                        var1 = 60;
                        this.ij = true;
                        this.ja = false;
                        this.jW = 60;
                    }
                }
            }
        }

        iD = var1 == 7 || var1 == 5 || var1 == 8 || var1 == 6 || var1 == 101 || var1 == 119 || var1 == 118 || var1 == 100 || var1 == 5;
        if (var1 == 67) {
            var2 = true;
            this.iL = true;
            if (jx) {
                var1 = 83 + this.jc;
                if (this.jc > 3 - (jl < 3 ? 1 : 0)) {
                    var1 = 83;
                    this.jc = 0;
                } else if (this.jc == 2 - (jl < 3 ? 1 : 0)) {
                    var1 = 85;
                }
            } else {
                var1 = 67 + this.jc;
                if (this.jc >= 3 - (jl < 3 ? 1 : 0)) {
                    var1 = 67;
                    this.jc = 0;
                } else if (this.jc == 2 - (jl < 3 ? 1 : 0)) {
                    var1 = 69;
                }
            }

            ++this.jc;
        } else {
            this.iL = false;
        }

        if (var1 == 91 || var1 == 92 || var1 == 93) {
            this.iL = true;
        }

        if (!this.iL && !this.iR) {
            this.jc = 0;
        }

        if (var1 != 35 && var1 != 34 && var1 != 36 && var1 != 33) {
            this.iJ = false;
            this.iQ = false;
        } else {
            this.iJ = true;
        }

        iM = var1 == 45 || var1 == 47 || var1 == 46 || var1 == 119 || var1 == 118;
        if (var1 == 9) {
            this.iP = true;
            if (this.iV) {
                var1 = 11;
            }
        } else {
            this.iP = false;
        }

        if (var1 != 37 && var1 != 40) {
            iN = false;
            this.iQ = false;
        } else {
            iN = true;
        }

        this.iO = var1 == 30;
        this.iG = var1 == 21 || var1 == 22 || var1 == 23 || var1 == 20;
        this.iK = var1 == 50 || var1 == 51;
        if (var1 != 15 && var1 != 17) {
            this.iF = false;
        } else {
            this.iF = true;
            if (jx) {
                ++var1;
            }
        }

        if (var2 && !iM && this.jF > 0) {
            int var3 = this.bP & 1;
            if(jx && !this.iJ) {
                this.playSound(5 + var3);
            } else {
                this.playSound(3 + var3);
            }
        }

        jX = var1;
        this.a(135, 28672, var1);
    }

    private boolean E(int var1) {
        return this.b(var1, bN);
    }

    private int C() {
        return this.iw / 22;
    }

    private int D() {
        int var1;
        return (var1 = this.ix / 22) > dF ? dF : var1;
    }

    private void E() {
        int var1 = this.C();
        int var2 = (this.jE >> 8) + 1 >= 22 ? iT + 1 : iT;
        int var3 = this.iw - (iY >> 1);
        int var4 = this.ix;
        this.iU = iC;
        boolean var5 = this.iV;
        if (!this.iU) {
            this.iV = (this.j(var1, var2) & 8192) != 0 && jX != 99 && jX != 24 && jX != 25 && jX != 26;
            this.iU = (this.j(var1, var2) & 1) != 0;
            this.iW = (this.j(var1, var2 - 1) & 2048) != 0;
            iX = (this.j(var1, var2 - 1) & 4096) != 0;
        }

        if (this.iV && !var5) {
            if (this.iP) {
                this.iU = true;
                this.D(9);
            }
        } else if (!this.iV && var5 && this.iP) {
            this.D(9);
        }

        boolean var6 = this.b(135, bN);
        iy += bN;
        this.l(var1, var2);
        if (this.jW != 52 && this.jW != 53) {
            if (this.jW == 26) {
                super.b += this.kg;
                this.kh += bN;
                if (this.kh > 200) {
                    this.kh -= 200;
                    this.kg += this.kg >= 8 ? 0 : 4;
                }
            } else {
                this.kh = 0;
                this.kg = 0;
            }

            if (super.b < 0 && this.jW != 60) {
                this.iU = false;
            }

            if (x != 105 && x != 108 && x != 101) {
                if (!in && this.iA < 0 && this.cI < 0) {
                    switch (this.bw) {
                        case 1:
                            this.O();
                            break;
                        case 2:
                            this.R();
                        case 3:
                        case 4:
                        case 7:
                        case 8:
                        default:
                            break;
                        case 5:
                            this.Q();
                            break;
                        case 6:
                            this.P();
                    }
                }

                if (!in && this.cI < 0) {
                    var6 = this.g(var6);
                    if (this.bF) {
                        if (this.bv == 23) {
                            this.jF = -1;
                        }

                        if (this.bv == 16) {
                            this.bG = !this.bG;
                        }

                        if (this.bv == 25) {
                            this.jF = this.jI;
                        }

                        if (this.bv == 19) {
                            this.bH = !this.bH;
                        }
                    }
                } else if (this.cI < 0) {
                    this.H();
                }

                this.G();
                if (!this.iU && !this.iV && !this.iL && !iM && !iC && this.jW != 26 && this.jW != 99 && this.jW != 48 && (this.jc != 5 && this.jc != 6 && this.jc != this.jk || !jx) && !this.iO && var6) {
                    this.f(var6);
                } else if (!var6) {
                    this.e(var6);
                } else if (this.jW == 3 && !this.jS) {
                    this.D(28);
                }

                if (this.jF <= 0 && this.iA < 0 && (!this.iG || jX == 21)) {
                    if (!this.iU && jX != 26) {
                        this.D(26);
                    } else if (this.iU && jX != 52 && jX != 53) {
                        this.D(52);
                        this.jF = 0;
                    }
                }
            } else {
                this.h(var6);
            }

            this.h(var1, var2);
        } else if (this.jW == 52 && !var6 && x != 108) {
            this.c(bL, bL, 35, 35);
            x = 108;
            this.cd = 0;
            this.ce = 0;
        }

        if (!this.iR && !this.iL) {
            jb = 0;
        } else {
            jb += bN;
        }

        if (this.bG) {
            this.jF = this.jI;
        }

        this.I();
        if (jX == 9 && ((this.j(this.iS + (jQ ? 1 : -1), iT + 2) & 16384) != 0 || (this.j(this.iS + (jQ ? 1 : -1), iT + 3) & 16384) != 0)) {
            this.D(48);
        }

        this.a(this.iw, this.ix, 135, this.jP, jQ);
        this.je -= bN;
        if (this.je < 0 && jd != 0) {
            this.je = 0;
            jd = 0;
            this.kW = true;
        }

        this.playSound();
        this.F();
        this.S();
        this.T();
        this.U();
        this.V();
        this.W();
        this.X();
        this.Y();
        this.Z();
        this.aa();
        this.ab();
        this.m(var3, var4);
        this.E(132);
        this.ac();
    }

    private void F() {
        for(int var1 = this.eh; var1 >= 0; --var1) {
            if (ed[var1] >= 0 && !this.E(ed[var1] + 0)) {
                this.y(var1);
            }
        }

    }

    private void e(boolean var1) {
        if (this.jW == 31 && !var1) {
            for(int var2 = this.hH; var2 >= 0; --var2) {
                if (!hK[var2] && a(this.hL[var2], this.hM[var2], this.hI, this.hJ, this.iw - this.jT, this.ix, iY, this.iZ)) {
                    this.hO[var2] += 4;
                    this.D(31);
                    this.a(121 + var2, 5120, this.hO[var2]);
                    hK[var2] = true;
                    this.g(this.iS, iT);
                }
            }
        }

        if (this.jW == 27 && !this.jS && !jx) {
            this.D(28);
        } else if (this.jW == 27 && this.jS) {
            this.D(3);
        } else if (this.jS && this.jW == 3) {
            this.D(3);
        } else if (this.jW == 38) {
            this.D(0);
        } else if (this.jW == 40) {
            this.D(26);
        } else if (jX == 121) {
            if ((this.j(this.iS, iT + 1) & 8192) != 0) {
                this.iV = true;
            }

            this.D(0);
        } else if (jX == 120) {
            this.ix += 22;
            this.D(26);
        } else if (this.jW != 47 && this.jW != 119 && this.jW != 118) {
            if (this.jW == 97) {
                this.D(3);
            } else if (this.jW == 88) {
                if (this.io >= this.im) {
                    gF[this.iA] = 1;
                    this.D(89);
                    this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 2, this.gH[this.iA] >> 1);
                    this.k(10, this.iA);
                } else {
                    this.D(90);
                    this.k(0, this.iA);
                }

                in = false;
                this.kd = 0;
            } else if (this.iR && this.ja) {
                jQ = this.ir;
                this.D(54);
                jb = 0;
                this.ja = false;
            } else {
                if ((this.iU || !this.ja) && !in) {
                    if (this.jW == 23) {
                        this.D(21);
                        return;
                    }

                    if (this.jW == 36) {
                        this.D(33);
                        return;
                    }

                    if ((!this.jS || !this.iU) && (this.iU || this.iV && jX != 26 && jX != 25 && jX != 70 && !this.iL && jX != 24)) {
                        if (jX == 48) {
                            this.D(50);
                            return;
                        }

                        this.D(0);
                        return;
                    }

                    if (this.jW != 26 && this.iL) {
                        this.D(70);
                        return;
                    }

                    if ((!this.iV || jX == 70) && !this.iU && !iM) {
                        this.D(26);
                    }
                } else {
                    if (!in) {
                        this.D(67);
                        jQ = this.ir;
                        this.ja = false;
                        return;
                    }

                    in = false;
                    this.kd = 0;
                    this.ja = false;
                    if (this.io >= this.im) {
                        if (gh != this.iA) {
                            gF[this.iA] = 1;
                            this.D(92);
                            this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 1, this.gH[this.iA]);
                            this.k(11, this.iA);
                            return;
                        }

                        if (this.gi != this.iA) {
                            this.D(109);
                            this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 2, this.gH[this.iA]);
                            this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 1, this.gH[this.iA]);
                            gF[this.iA] = gI[this.iA];
                            if (this.dT >= 4) {
                                this.k(14, this.iA);
                                return;
                            }

                            this.k(15, this.iA);
                            return;
                        }

                        if (this.gi == this.iA) {
                            this.D(115);
                            gF[this.iA] = gI[this.iA];
                            this.gE[this.iA] = jQ;
                            this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 2, this.gH[this.iA]);
                            this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 1, this.gH[this.iA]);
                            this.k(14, this.iA);
                            ++this.gj;
                            if (this.gj >= 3) {
                                this.gT = true;
                            }

                            if (this.gj > 3) {
                                gF[this.iA] = -1;
                                return;
                            }
                        }
                    } else {
                        if (gh != this.iA) {
                            this.D(93);
                            this.k(0, this.iA);
                            return;
                        }

                        if (this.gi != this.iA) {
                            gF[this.iA] = gI[this.iA];
                            this.k(0, this.iA);
                            this.D(110);
                            return;
                        }

                        if (this.gi == this.iA) {
                            this.D(116);
                            gF[this.iA] = gI[this.iA];
                            this.gE[this.iA] = jQ;
                            this.k(12, this.iA);
                            return;
                        }
                    }
                }

            }
        } else {
            this.D(45);
        }
    }

    private void f(boolean var1) {
        if ((this.jW != 24 && this.jW != 25 && this.jW != 44 && this.jW != 38 || var1) && (this.jW == 24 || this.jW == 25 || this.jW == 44 || this.jW == 40 || this.jW == 38 || this.jW == 108 || this.jW == 114 || this.jW == 116 || this.jW == 115 || jX == 121 || jX == 120 || iN || this.iJ || iM)) {
            if ((this.jW == 47 || this.jW == 118 || this.jW == 119) && !var1) {
                this.D(45);
            } else {
                if (this.iU && this.jW != 24 && this.jW != 26) {
                    this.D(0);
                }

            }
        } else {
            this.D(26);
        }
    }

    private void G() {
        if (this.bw != 6 && this.jS) {
            this.jS = false;
            this.D(0);
        }

        if (this.bw != 2 && this.bw != 5) {
            if (this.jW == 9) {
                this.D(0);
            } else if (this.jW == 46) {
                this.D(45);
            } else if (this.iK && this.jW != 50) {
                this.D(50);
            }
        }

        if (this.bw != 1 && jX == 35 || this.bw != 6 && jX == 34) {
            this.D(33);
        }

        if ((this.bw != 8 || jH <= 0) && this.jW == 94) {
            this.D(0);
            if (jH <= 0) {
                jH = 0;
            }

            this.ad();
        }

        if (this.bw == 8 && this.jW == 94) {
            jH -= 12;
        }

    }

    private boolean g(boolean var1) {
        switch (this.bv) {
            case 1:
                this.N();
                break;
            case 2:
                this.K();
                break;
            case 3:
                this.ds = false;
                this.a(133, 1025, 2);
                this.a(134, 1025, 3);
                x = 106;
                break;
            case 5:
                this.L();
                break;
            case 6:
                this.M();
                break;
            case 8:
                var1 = this.i(var1);
                break;
            case 10:
            case 27:
                if (!this.jS && !this.iR) {
                    ++this.ii;
                    if (this.ii > 3) {
                        this.ii = 0;
                    }

                    jx = this.ii == 1;
                    jy = this.ii == 2;
                    this.jz = this.ii == 3;
                    if (this.jW == 0) {
                        this.D(0);
                    }
                }
                break;
            case 29:
                if (this.ck == this.cd) {
                    this.cp = this.ck >> 8;
                    this.cq = this.cl >> 8;
                    this.y = x;
                    this.c(bL, bL, 35, 35);
                    x = 102;
                    cB = 4;
                }
        }

        return var1;
    }

    private void l(int var1, int var2) {
        if (!in && (this.j(var1, var2) & 128) > 0) {
            for(int var3 = eQ; var3 >= 0; --var3) {
                if (this.eG[var3] == var1 && eH[var3] == var2) {
                    this.eN = this.eI[var3];
                    this.eO = this.eI[var3];
                    String var4 = this.getResourceString(this.eN);
                    if (!this.db && var4.charAt(0) == '@') {
                        this.db = true;
                        this.dc = parseInt(var4.substring(2, 3), 0) == 1;
                        this.dd = parseInt(var4.substring(1, 2), 0);
                        this.a(131, 1027, this.dd);
                    } else {
                        int var5;
                        if (this.db) {
                            var5 = super.a;
                            int var6 = super.b;
                            this.E(131);
                            super.a = var5;
                            super.b = var6;
                        } else {
                            x = 101;
                            this.c(95, 35, 35, 35);
                            if (x != 105) {
                                this.eP = this.eO + this.eJ[var3];

                                for(var5 = eQ; var5 >= 0; --var5) {
                                    if (this.eI[var5] == this.eN) {
                                        this.d(this.eG[var5], eH[var5], 128);
                                    }
                                }

                                ks = new String[2];
                                this.u();
                            }
                        }
                    }
                }
            }

        } else {
            this.db = false;
        }
    }

    private void H() {
        boolean var1 = false;
        int var2 = super.a;
        int var3 = super.b;
        this.E(131);
        super.a = var2;
        super.b = var3;
        if (this.io >= 0 && this.io < this.im) {
            switch (this.bv) {
                case 1:
                    if (this.ip == 0) {
                        var1 = true;
                    }
                    break;
                case 2:
                    if (this.ip == 1) {
                        var1 = true;
                    }
                case 3:
                case 4:
                case 7:
                default:
                    break;
                case 5:
                    if (this.ip == 3) {
                        var1 = true;
                    }
                    break;
                case 6:
                    if (this.ip == 4) {
                        var1 = true;
                    }
                    break;
                case 8:
                    if (this.ip == 2) {
                        var1 = true;
                    }
            }

            if (var1) {
                int var4 = this.ae();
                this.ip = var4;
                ++this.io;
                this.a(131, 1027, iq[this.ip]);
                return;
            }

            if (this.bv != 0 && this.bv != 27 && this.bv != 29 && this.bv != 4 && this.bv != 9) {
                this.io = -1;
            }
        }

    }

    private void h(boolean var1) {
        if (x == 105) {
            if (!this.iU && !this.iL && this.jW != 24 && !this.iV && !iM && !iC) {
                if (this.jW == 37) {
                    this.D(40);
                    ++this.ix;
                } else {
                    this.D(26);
                }
            }

            if (!var1 && this.jW != 26) {
                if (this.di[this.dk + 1] != 0 || this.dj[this.dl + 1] != 0 && this.gg >= 0) {
                    if (this.di[this.dk + 1] == 0) {
                        this.D(this.di[this.dk]);
                    } else {
                        ++this.dk;
                        this.D(this.di[this.dk]);
                    }
                } else {
                    this.af();
                }
            }

            if (this.bv == 29 && this.ck == this.cd && this.cl == this.ce) {
                this.cp = this.ck >> 8;
                this.cq = this.cl >> 8;
                this.y = x;
                x = 102;
                cB = 4;
                this.c(bL, bL, 35, 35);
            }
        }

    }

    private void I() {
        if (this.jF >= this.jG && !this.iE || this.iA >= 0 || iD || this.iG || this.iR || jX == 60 || jX == 77 || this.jF <= 0 || !this.iU || this.iw == this.iu && this.ix == this.iv) {
            if (iM && this.jF < this.jG && !iD && !this.iR) {
                if (this.iB == jQ) {
                    this.D(118);
                } else {
                    this.D(119);
                }
            } else if (this.iA >= 0) {
                this.jF = this.jG;
            }
        } else {
            this.iE = false;
            if (!this.jS && jX != 27 && jX != 28 && jX != 29) {
                if (this.jG - this.jF > 50) {
                    jQ = this.iB;
                    this.D(7);
                } else if (jQ == this.iB) {
                    this.D(5);
                } else {
                    this.D(100);
                }
            } else if (this.jS) {
                this.iE = false;
                if (jX != 97) {
                    jQ = this.iB;
                    this.D(97);
                }
            }
        }

        this.jG = this.jF;
    }

    private void playSound() {
        if (this.jf != -1 && this.fB[this.jf] - fA[this.jf] <= 3 && this.jg > 0) {
            if (this.fB[this.jf] <= 0) {
                this.jg -= bN;
                if (this.jg <= 0) {
                    this.kW = true;
                }
            }

            this.jh -= bN;
            if (this.jh < 0) {
                this.jh = 200 - this.jh;
                ji = !ji;
                this.kW = true;
            }
        }

    }

    private boolean i(boolean var1) {
        short var2;
        if (!this.iI && !this.iG && !this.iF && this.iU && this.iA < 0 && !this.iV) {
            if (this.jW != 0 && this.jW != 3) {
                if (this.iU && !jy && !this.jz && (!jx || jH >= 0)) {
                    var2 = 150;
                    if (jx && this.jc > this.jk || !jx && this.jc > jj) {
                        var2 = 600;
                    }

                    if (jb > var2) {
                        this.ja = true;
                    }
                }
            } else {
                this.jS = false;
                var1 = true;
                if (jy && jH > jr + 1 << 2) {
                    this.D(94);
                } else if (this.jz && jH > 256 && this.ib < 10) {
                    this.D(95);
                    this.ad();
                } else {
                    jy = false;
                    this.jz = false;
                    if (!jx || jH <= 0) {
                        this.ad();
                    }

                    this.ir = jQ;
                    if (!jx || jH > 0) {
                        this.D(54);
                    }
                }
            }
        } else if (this.iA >= 0 && gF[this.iA] > 0) {
            if (this.gl[this.iA] == 1) {
                this.D(13);
                this.k(10, this.iA);
                this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 0, this.gH[this.iA]);
                gF[this.iA] = -1;
            } else if (this.gl[this.iA] != 2) {
            }
        } else if (!this.iU && !this.iV && !this.iJ && !iM && jX != 120 && jX != 121 && !this.iR && this.jW != 37) {
            if (jx && jH <= 0 || jy || this.jz) {
                this.ad();
            }

            if (!this.iL) {
                this.ir = jQ;
                this.D(67);
            } else {
                var2 = 150;
                if (jx && this.jc > this.jk || !jx && this.jc > jj) {
                    var2 = 600;
                }

                if (jb > var2) {
                    this.ja = true;
                }
            }
        } else if (iM && !this.iR) {
            if (this.jW != 47) {
                this.ad();
                this.D(47);
            }
        } else if (this.iJ && !this.iR) {
            this.ad();
            this.D(36);
        } else if (jX == 21) {
            this.D(0);
        }

        return var1;
    }

    private void K() {
        if (this.iG && this.jW == 21) {
            if (jQ) {
                this.D(23);
                this.iH = 0;
            } else {
                this.D(22);
                this.iH = 1;
            }

            if (!this.z()) {
                this.D(21);
            } else {
                this.playSound(7);
            }
        } else if (this.iA >= 0 && gF[this.iA] > 0 && this.gl[this.iA] == 1 && this.jW != 14 && !this.iJ) {
            jQ = false;
            this.gE[this.iA] = false;
            this.B();
        } else {
            if (jQ && (this.iR || this.iL) && this.iA < 0 && !this.iJ) {
                short var1 = 150;
                if (jx && this.jc > this.jk || !jx && this.jc > jj) {
                    var1 = 600;
                }

                if (jb > var1) {
                    this.ja = true;
                    this.ir = false;
                    return;
                }
            } else if (this.iJ && !this.iR) {
                if (jQ) {
                    jQ = false;
                    this.D(44);
                    return;
                }
            } else if (iN && !jQ) {
                this.D(38);
            }

        }
    }

    private void L() {
        if (this.iG && this.jW == 21) {
            if (jQ) {
                this.D(22);
                this.iH = 1;
            } else {
                this.D(23);
                this.iH = 0;
            }

            if (!this.z()) {
                this.D(21);
            } else {
                this.playSound(7);
            }
        } else if (this.iA >= 0 && gF[this.iA] > 0 && this.gl[this.iA] == 1 && this.jW != 14 && !this.iJ) {
            jQ = true;
            this.gE[this.iA] = true;
            this.B();
        } else {
            if (!jQ && (this.iR || this.iL) && this.iA < 0 && !this.iJ && !iM) {
                short var1 = 150;
                if (jx && this.jc > this.jk || !jx && this.jc > jj) {
                    var1 = 600;
                }

                if (jb > var1) {
                    this.ja = true;
                    this.ir = true;
                    return;
                }
            } else if (this.iJ && !this.iR) {
                if (!jQ) {
                    jQ = true;
                    this.D(44);
                    return;
                }
            } else if (iN && jQ) {
                this.D(38);
            }

        }
    }

    private void M() {
        int var1;
        if (!this.iR && (this.jW == 0 || this.jW == 9) && this.iU) {
            for(var1 = this.gW; var1 >= 0; --var1) {
                if ((this.ix == this.gp[var1] || this.ix + 1 == this.gp[var1]) && a(go[var1] - (this.gz[var1] >> 1) - (iY >> 1), this.gp[var1], this.gz[var1] + iY, this.gA[var1], this.iw, this.ix, iY, this.iZ)) {
                    boolean var2 = true;

                    for(int var3 = this.iS; var3 < this.gu[var1]; ++var3) {
                        var2 &= (this.j(var3, iT) & 1) == 0;
                    }

                    if ((this.gs[var1] <= 0 || this.gl[var1] == 3 && this.gm[var1] == 12) && var2) {
                        this.kW = true;
                        if (gh != var1 && this.gl[var1] == 1 && gF[var1] > 0 && gF[var1] < gI[var1] >> 1) {
                            this.iA = var1;
                            this.iw = go[var1];
                            this.gE[var1] = jQ;
                            super.a = 0;
                            this.D(12);
                            this.k(22, var1);
                            break;
                        }

                        if (this.gl[var1] == 2 && (gF[var1] > 0 && gF[var1] < gI[var1] >> 1 || this.gm[var1] == 12)) {
                            this.iA = var1;
                            if (this.gm[var1] != 12 && this.gm[var1] != 10) {
                                this.iw = go[var1];
                                this.gE[var1] = jQ;
                                super.a = 0;
                                this.D(88);
                                this.kd = 1;
                                in = true;
                                this.im = 2;
                                this.io = 0;
                                this.ip = this.ae();
                                this.a(131, 1027, iq[this.ip]);
                                this.k(11, var1);
                                this.gE[var1] = !jQ;
                                break;
                            }

                            this.D(117);
                            this.iw = go[var1];
                            gF[var1] = -1;
                            this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 2, this.gH[this.iA] >> 1);
                            this.k(13, var1);
                            break;
                        }

                        if (this.gl[var1] == 3 && (gF[var1] > 0 && gF[var1] < gI[var1] >> 1 || this.gm[var1] == 12 && gh != var1)) {
                            this.iA = var1;
                            if (this.gm[var1] == 12 && gh != var1) {
                                this.D(113);
                                this.d(go[this.iA], this.gp[this.iA] - (this.gA[this.iA] >> 1), 0, this.gH[this.iA] >> 1);
                                this.iw = go[var1];
                                jQ = this.gE[var1];
                                this.gs[var1] = 0;
                                gF[var1] = -1;
                                this.k(16, var1);
                                break;
                            }

                            this.iw = go[var1];
                            this.gE[var1] = jQ;
                            super.a = 0;
                            this.kd = 1;
                            in = true;
                            this.io = 0;
                            this.im = 3;
                            this.ip = this.ae();
                            this.a(131, 1027, iq[this.ip]);
                            if (gh != var1 && this.gi != var1) {
                                this.D(91);
                                this.k(14, var1);
                            } else if (this.gi == var1) {
                                this.D(114);
                                this.k(13, var1);
                            } else if (gh == var1) {
                                this.D(108);
                                this.k(13, var1);
                            }

                            this.gE[var1] = !jQ;
                            break;
                        }
                    }
                }
            }
        }

        if (iN) {
            this.D(40);
            ++this.ix;
        } else if (this.jW == 0) {
            if (jQ) {
                for(var1 = this.hH; var1 >= 0; --var1) {
                    if (!hK[var1] && a(this.hL[var1], this.hM[var1], this.hI, this.hJ, this.iw - this.jT, this.ix, iY, this.iZ) && Math.abs(this.ix - this.hM[var1]) < 11) {
                        this.D(31);
                        this.iw = this.hL[var1] + (this.hI >> 1);
                    }
                }
            }

            for(var1 = this.eS; var1 >= 0; --var1) {
                if (jQ && this.eV[var1] && a(this.iw - (iY >> 1), this.ix - this.iZ, iY, this.iZ, this.eT[var1] - 22, eU[var1], 44, 22)) {
                    this.kk = var1;
                    this.kl = var1;
                    if (!this.eY[var1]) {
                        this.D(15);
                    } else {
                        this.D(17);
                    }

                    this.iw = this.eT[var1];
                    this.eY[var1] = !this.eY[var1];
                }
            }
        }

        if (this.iU && !this.iK && !this.iG && !this.iF && !this.iI && this.iA < 0 && jX != 24 && jX != 48 && jX != 30) {
            this.jS = true;
            this.D(3);
        }

        if (this.iV) {
            this.D(26);
        }

    }

    private void N() {
        if (this.iA < 0) {
            if (this.jW == 21) {
                this.D(24);
                return;
            }

            if (jX == 120) {
                this.D(121);
                return;
            }

            if (!this.iO && jQ && this.iW) {
                this.D(30);
                return;
            }

            if (!this.iO && !jQ && iX) {
                this.D(30);
                return;
            }

            if (!this.iI && !this.iF && !this.iJ && !iM && !iN && (this.iU || this.iV) && !this.iG && this.iA < 0 && !this.iR) {
                if (this.jS) {
                    this.jS = false;
                    this.D(0);
                    return;
                }

                if (this.jW != 24 && this.jW != 26 && this.jW != 3 && this.jW != 38 && this.jW != 30) {
                    this.D(24);
                    return;
                }
            } else {
                if (iN) {
                    this.D(38);
                    return;
                }

                if (this.jW == 24) {
                    this.D(25);
                }
            }
        }

    }

    private void O() {
        if (this.iJ && this.jW == 33 && ((this.j(this.iS + (jQ ? 1 : -1), iT - this.jC - 1) & 8) != 0 || (this.j(this.iS + (jQ ? 1 : -1), iT - this.jC - 1) & 1) == 0)) {
            this.D(35);
        }

    }

    private void P() {
        if (this.iJ) {
            if (this.jW == 33) {
                if ((this.j(this.iS + (jQ ? 1 : -1), iT + 1) & 8) != 0) {
                    this.D(34);
                    return;
                }

                this.D(26);
                return;
            }
        } else {
            if (iM) {
                this.D(26);
                return;
            }

            if (jX == 120) {
                this.D(26);
                this.ix += 22;
            }
        }

    }

    private void Q() {
        if (!this.iJ && !iN && !this.iG && this.jW != 44 && this.jW != 22 && this.jW != 38) {
            if (iM && !iD && !this.iR) {
                if (this.jW != 46) {
                    this.D(46);
                }

                jQ = true;
                return;
            }

            if (this.jW != 0 && this.jW != 3) {
                if (this.jW == 50) {
                    jQ = true;
                    if ((this.j(this.iS + 1, iT) & 1) == 0) {
                        this.D(51);
                    }
                }
            } else {
                if (((this.j(this.iS + 1, iT - 1) & 1) != 0 || (this.j(this.iS + 1, iT) & 1) != 0 || (this.j(this.iS + 1, iT - 2) & 1) != 0) && (this.j(this.iS + 1, iT) & 512) == 0) {
                    if ((this.j(this.iS + 1, iT) & 1) != 0) {
                        this.iw = (this.iS + 1) * 22 - (iY >> 1);
                    }
                } else {
                    if ((this.j(this.iS + 1, iT) & 512) != 0) {
                        int var1 = (this.j(this.iS, iT) & 512) != 0 ? -1 : 0;
                        this.iw = (this.iS + 1 + var1) * 22 - (iY >> 1);
                    }

                    this.D(9);
                    this.jS = false;
                }

                jQ = true;
            }

            if (this.jW == 9 || this.jW == 51) {
                jQ = true;
            }
        }

    }

    private void R() {
        if (!this.iJ && !iN && !this.iG && this.jW != 44 && this.jW != 22 && this.jW != 38) {
            if (iM && !iD && !this.iR) {
                if (this.jW != 46) {
                    this.D(46);
                }

                jQ = false;
                return;
            }

            if (this.jW != 0 && this.jW != 3) {
                if (this.jW == 50) {
                    jQ = false;
                    if ((this.j(this.iS - 1, iT) & 1) == 0) {
                        this.D(51);
                    }
                }
            } else {
                jQ = false;
                if (((this.j(this.iS - 1, iT) & 1) != 0 || (this.j(this.iS, iT) & 1) != 0 || (this.j(this.iS - 1, iT - 1) & 1) != 0 || (this.j(this.iS - 1, iT - 2) & 1) != 0) && (this.j(this.iS - 1, iT) & 512) == 0) {
                    if ((this.j(this.iS - 1, iT) & 1) != 0 || (this.j(this.iS, iT) & 1) != 0 || (this.j(this.iS - 1, iT - 1) & 1) != 0 || (this.j(this.iS - 1, iT - 2) & 1) != 0) {
                        this.iw = (this.iS + ((this.j(this.iS, iT) & 1) != 0 ? 1 : 0)) * 22 + (iY >> 1);
                    }
                } else {
                    if ((this.j(this.iS - 1, iT) & 512) != 0) {
                        int var1 = (this.j(this.iS, iT) & 512) != 0 ? 1 : 0;
                        this.iw = (this.iS + var1) * 22 + (iY >> 1);
                    }

                    this.D(9);
                    this.jS = false;
                }
            }

            if (this.jW == 9 || this.jW == 51) {
                jQ = false;
            }
        }

    }

    private void S() {
        for(int var1 = this.hH; var1 >= 0; --var1) {
            if (this.hO[var1] >= 0) {
                int var2 = this.hL[var1] - bU;
                int var3 = this.hM[var1] - bV;
                if (var2 + this.hI >= 0 && var3 + this.hJ >= 0 && var2 - this.hI <= width && var3 - this.hJ <= height && !this.E(var1 + 121) && hN[var1] != 0 && this.hO[var1] < 8 && this.hO[var1] >= 4) {
                    int[] var10000 = this.hO;
                    var10000[var1] += 4;
                    this.a(121 + var1, 5120, this.hO[var1]);
                    if (hN[var1] == -1) {
                        jA |= 1 << this.dT;
                        this.hR = 192;
                        ++this.jK;
                        x = 104;
                        this.hQ = 10;
                        this.a(136, 1026, 0);
                    } else if (hN[var1] == -2) {
                        jA |= 1 << this.dT << 10;
                        this.hR = 192;
                        ++this.jL;
                        x = 104;
                        this.hQ = 9;
                        this.a(136, 1026, 1);
                    } else if (hN[var1] != 0) {
                        this.d(this.hL[var1] + (this.hI >> 1), this.hM[var1] - this.hJ - 10, this.hO[var1] - 8, hN[var1]);
                    }
                }
            }
        }

    }

    private void T() {
        for(int var1 = this.ib; var1 >= 0; --var1) {
            int var2 = var1 << 2;
            int var3 = 12 * bN;
            int var4 = hX[var1] < 0 ? this.iw : go[hX[var1]];
            int var5 = hX[var1] < 0 ? this.ix : this.gp[hX[var1]];
            int[] var10000;
            if (var4 < hT[var2] && hV[var1] > -4608) {
                var10000 = hV;
                var10000[var1] -= var3;
            } else if (var4 > hT[var2] && hV[var1] < 4608) {
                var10000 = hV;
                var10000[var1] += var3;
            } else {
                hV[var1] >>= 2;
            }

            if (var5 - (this.iZ >> 1) + 11 < hU[var2] && hW[var1] > -4608) {
                var10000 = hW;
                var10000[var1] -= var3;
            } else if (var5 - (this.iZ >> 1) - 11 > hU[var2] && hW[var1] < 4608) {
                var10000 = hW;
                var10000[var1] += var3;
            } else {
                var10000 = hW;
                var10000[var1] -= hW[var1] >> 3;
            }

            if (a(hT[var2], hU[var2], var4 + this.jU, var5 - this.iZ, iY, this.iZ)) {
                if (hY[var1] <= 75) {
                    var10000 = hY;
                    var10000[var1] += bN;
                } else {
                    if (hZ[var1] == 1) {
                        if (this.jF < this.jI && this.jF > 0 && x != 108) {
                            this.jF += ia[var1];
                            this.jG += ia[var1];
                            if (this.jF > this.jI) {
                                this.jF = this.jI;
                                this.jG = this.jI;
                            }
                        }
                    } else if (hZ[var1] == 2) {
                        jH += ia[var1];
                        if (jH > this.jJ) {
                            jH = this.jJ;
                        }
                    } else if (hZ[var1] == 0) {
                        this.jM += ia[var1];
                        jN += ia[var1];
                        if (jN > this.jO) {
                            this.jM += this.jO - jN;
                            jN = this.jO;
                        }
                    } else if (hZ[var1] == 3) {
                        int var6 = hX[var1];
                        byte var7 = this.gl[var6];
                        if (var6 != this.iA && (this.gl[var6] != 1 || this.gm[var6] != 22)) {
                            var10000 = gF;
                            int var10001 = hX[var1];
                            var10000[var10001] -= ia[var1];
                        }

                        hX[var1] = -1;
                        if (var6 != this.iA && gF[var6] <= 0 && this.gn[var6] != 1 && (this.gl[var6] != 1 || this.gm[var6] != 22) && this.gn[var6] != 3) {
                            if (gh == var6) {
                                gF[var6] = (gI[var6] >> 1) - 1;
                            } else {
                                gF[var6] = -1;
                                if (!this.gD[var6] && !this.gC[var6]) {
                                    if (var7 == 1) {
                                        this.k(8, var6);
                                        this.d(go[var6], this.gp[var6] - (this.gA[var6] >> 1), 0, this.gH[var6]);
                                    } else if (var7 == 2) {
                                        this.k(7, var6);
                                        this.d(go[var6], this.gp[var6] - (this.gA[var6] >> 1), 2, this.gH[var6]);
                                    } else if (var7 == 3) {
                                        if (this.gm[var6] != 17) {
                                            this.k(7, var6);
                                        }

                                        this.d(go[var6], this.gp[var6] - (this.gA[var6] >> 1), 0, this.gH[var6]);
                                    }
                                } else {
                                    this.k(11, var6);
                                }
                            }
                        } else if (this.gl[var6] == 2 && this.gm[var6] == 12) {
                            gF[var6] = 1;
                        }
                    }

                    this.C(var1);
                }
            }

            var10000 = hT;
            var10000[var2] += hV[var1] >> 8;
            var10000 = hU;
            var10000[var2] += hW[var1] >> 8;
            System.arraycopy(hT, var2, hT, var2 + 1, 3);
            System.arraycopy(hU, var2, hU, var2 + 1, 3);
        }

    }

    private void U() {
        for(int var2 = ey + 10; var2 >= 10; --var2) {
            int var1 = var2 - 10;
            if (this.et[var1] >= 0) {
                int var3 = eu[var1] - bU;
                int var4 = ev[var1] - bV;
                if (var3 + this.ex[var1] >= 0 && var4 + this.ew[var1] >= 0 && var3 - this.ex[var1] <= width && var4 - this.ew[var1] <= height) {
                    if (!this.E(var2)) {
                        this.et[var1] = -1;
                    }

                    int[] var10000 = eu;
                    var10000[var1] += super.a;
                    var10000 = ev;
                    var10000[var1] += super.b;
                }
            }
        }

    }

    private void V() {
        for(int var2 = eF + 40; var2 >= 40; --var2) {
            int var1 = var2 - 40;
            if (this.eA[var1] >= 0) {
                int var3 = this.eB[var1] - bU;
                int var4 = eC[var1] - bV;
                if (var3 + this.eE[var1] >= 0 && var4 + this.eD[var1] >= 0 && var3 - this.eE[var1] <= width && var4 - this.eD[var1] <= height) {
                    if (!this.E(var2)) {
                        this.eA[var1] = -1;
                    }

                    int[] var10000 = this.eB;
                    var10000[var1] += super.a;
                    var10000 = eC;
                    var10000[var1] += super.b;
                }
            }
        }

    }

    private void W() {
        for(int var2 = er + 30; var2 >= 30; --var2) {
            int var1 = var2 - 30;
            if (this.ej[var1] >= 0) {
                if (!this.E(var2) && this.eq[var1]) {
                    this.ej[var1] = -1;
                    this.z(var1);
                } else if ((this.ej[var1] & 1) == 0 && a(em[var1], this.en[var1], this.ep[var1], this.eo[var1], this.iw - this.jT, this.ix - this.iZ, iY, this.iZ)) {
                    int var10002 = this.ej[var1]++;
                    this.a(var2, 5122, this.ej[var1]);
                }

                int[] var10000 = ek;
                var10000[var1] += super.a;
                var10000 = this.el;
                var10000[var1] += super.b;
            }
        }

    }

    private void X() {
        for(int var1 = this.eS; var1 >= 0; --var1) {
            int var2 = var1 + 106;
            int var3 = this.eV[var1] ? 4 : 0;
            boolean var4 = this.E(var2);
            int var5 = eZ[var1];
            if (!this.eV[var1] && (this.iU && a(this.iw - (iY >> 1), this.ix - this.iZ, iY, this.iZ, this.eT[var1], eU[var1], 22, 22) || (this.j(this.fa[var1], fb[var1]) & 1) != 0)) {
                if (!this.eY[var1]) {
                    this.eY[var1] = true;
                    this.I(var1);
                    this.kl = var1;
                }
            } else if (!this.eV[var1] && this.eY[var1]) {
                this.eY[var1] = false;
                this.I(var1);
                this.kl = var1;
            }

            if (!var4) {
                boolean var6 = false;
                if (!this.eY[var1]) {
                    if (var5 == 1 + var3) {
                        eZ[var1] = 2 + var3;
                        this.a(var2, 2050, eZ[var1]);
                        var6 = true;
                    }
                } else if (var5 == 3 + var3) {
                    eZ[var1] = 0 + var3;
                    this.a(var2, 2050, eZ[var1]);
                    var6 = true;
                }

                if ((var5 == 3 + var3 || var5 == 1 + var3) && !var6 && this.kk >= 0) {
                    this.I(this.kk);
                    this.kk = -1;
                }
            }

            if (this.kl >= 0 && this.kl == var1) {
                this.kl = -1;
                if (var5 != 0 + var3 && var5 != 3 + var3) {
                    if (var5 == 2 + var3 || var5 == 1 + var3) {
                        eZ[var1] = 3 + var3;
                        this.a(var2, 2050, eZ[var1]);
                    }
                } else {
                    eZ[var1] = 1 + var3;
                    this.a(var2, 2050, eZ[var1]);
                }
            }
        }

    }

    private void Y() {
        for(int var1 = fd; var1 >= 0; --var1) {
            int var2 = var1 + 100;
            boolean var3 = this.E(var2);
            int var4 = fo[var1] - (this.fp[var1] << 2);
            if (var3) {
                if (fq[var1]) {
                    if (var4 == 2) {
                        fo[var1] = (this.fp[var1] << 2) + 3;
                        this.a(var2, 2049, fo[var1]);
                    }
                } else if (var4 == 0) {
                    fo[var1] = (this.fp[var1] << 2) + 1;
                    this.a(var2, 2049, fo[var1]);
                }
            } else {
                int var5;
                int var6;
                if (!fq[var1]) {
                    if (var4 == 3) {
                        fo[var1] = (this.fp[var1] << 2) + 0;
                        this.a(var2, 2049, fo[var1]);
                    } else if (var4 == 1) {
                        fo[var1] = (this.fp[var1] << 2) + 2;
                        this.a(var2, 2049, fo[var1]);

                        for(var5 = 0; var5 < this.fl[var1]; ++var5) {
                            for(var6 = 0; var6 < fj[var1]; ++var6) {
                                this.c(ff[var1] + var6, fg[var1] - var5, 1);
                            }
                        }
                    }
                } else if (var4 == 1) {
                    fo[var1] = (this.fp[var1] << 2) + 2;
                    this.a(var2, 2049, fo[var1]);
                } else if (var4 == 3) {
                    fo[var1] = (this.fp[var1] << 2) + 0;
                    this.a(var2, 2049, fo[var1]);

                    for(var5 = 0; var5 < this.fl[var1]; ++var5) {
                        for(var6 = 0; var6 < fj[var1]; ++var6) {
                            this.d(ff[var1] + var6, fg[var1] - var5, 1);
                        }
                    }
                }
            }
        }

    }

    private void Z() {
        for(int var2 = this.fK + 60; var2 >= 60; --var2) {
            int var1 = var2 - 60;
            if (this.fD[var1] >= 0) {
                int var3 = fG[var1] - bU;
                int var4 = fH[var1] - bV;
                if (var3 + this.fJ[var1] >= 0 && var4 + this.fI[var1] >= 0 && var3 - this.fJ[var1] <= width && var4 - this.fI[var1] <= height) {
                    boolean var5 = !this.E(var2);
                    int[] var10000;
                    if (this.fF[var1] == 2) {
                        var10000 = fG;
                        var10000[var1] -= super.a;
                        var10000 = fH;
                        var10000[var1] -= super.b;
                    } else {
                        var10000 = fG;
                        var10000[var1] += super.a;
                        var10000 = fH;
                        var10000[var1] += super.b;
                    }

                    if ((this.iR || this.iL || jX == 30) && (this.fD[var1] & 1) == 0 && (this.jP[2] != 0 || this.jP[7] != 0) && (a(this.jP[0], this.jP[1], this.jP[2], this.jP[3], fG[var1], fH[var1] - this.fI[var1], this.fJ[var1], this.fI[var1]) || a(this.jP[5], this.jP[6], this.jP[7], this.jP[8], fG[var1], fH[var1] - this.fI[var1], this.fJ[var1], this.fI[var1]))) {
                        int var10002 = this.fD[var1]++;
                        this.a(var2, 5121, this.fD[var1]);
                        this.d(fG[var1], fH[var1] - (this.fI[var1] >> 1), 1, 25);
                    } else if (var5 && (this.fD[var1] & 1) == 1) {
                        this.n(var1, 1);
                        this.A(var1);
                    }
                }
            }
        }

    }

    private void aa() {
        for(int var1 = hs; var1 >= 0; --var1) {
            if (this.kc) {
                this.kc = false;
            } else if (!this.E(var1 + 111)) {
                this.a(var1 + 111, 6144, this.hi[var1]);
            } else {
                int[] var10000 = this.hj;
                var10000[var1] += (!jQ || this.jW != 22) && (jQ || this.jW != 23) ? -super.a : super.a;
                var10000 = this.hk;
                var10000[var1] += super.b;
            }
        }

    }

    private void ab() {
        for(int var1 = this.hu; var1 >= 0; --var1) {
            int var2 = hy[var1] - bU;
            int var3 = this.hz[var1] - bV;
            if (var2 + hA[var1] >= 0 && var3 + this.hB[var1] >= 0 && var2 - hA[var1] <= width && var3 - this.hB[var1] <= height) {
                for(int var4 = 0; var4 < this.jP.length; var4 += 5) {
                    if ((this.hv[var1] & 1) == 0) {
                        if (!jy && this.jP[var4 + 3] != 0 && a(this.jP[var4], this.jP[var4 + 1], this.jP[var4 + 2], this.jP[var4 + 3], hy[var1], this.hz[var1] - this.hB[var1], hA[var1], this.hB[var1])) {
                            if (!this.b(116 + var1, 5)) {
                                this.d(hy[var1], this.hz[var1] - (this.hB[var1] >> 1), 0, 50);
                                this.n(var1, 2);

                                for(int var5 = 1; var5 <= this.hD[var1]; ++var5) {
                                    for(int var6 = 0; var6 < this.hC[var1]; ++var6) {
                                        this.d(this.hw[var1] + var6, hx[var1] - var5, 1);
                                    }
                                }

                                int var10002 = this.hv[var1]++;
                                this.a(var1 + 116, 2048, this.hv[var1]);
                                this.B(var1);
                            }

                            this.a(hy[var1] + (jQ ? 0 : hA[var1]), this.jP[1] + (this.jP[3] >> 1), 28, !jQ ? 2 : 0, false);
                        }
                    } else {
                        this.b(116 + var1, bN);
                    }
                }
            }
        }

    }

    private void m(int var1, int var2) {
        for(int var4 = this.fU + 70; var4 >= 70; --var4) {
            int var3 = var4 - 70;
            if (this.fM[var3] >= 0) {
                boolean var5 = !this.E(var4);
                int[] var10000 = fO;
                var10000[var3] += super.a;
                var10000 = this.fP;
                var10000[var3] += super.b;
                if (var5) {
                    fO[var3] = this.fQ[var3];
                    this.fP[var3] = this.fR[var3];
                    this.a(var4, 6145, this.fM[var3]);
                }

                this.a(fO[var3], this.fP[var3], var4, gR, true);
                if (this.iA < 0 && gR[2] > 0 && a(gR[0], gR[1], gR[2], gR[3], var1, var2 - this.iZ, iY, this.iZ)) {
                    if (!this.gT) {
                        this.jF -= this.fN[var3] * bN >> 2;
                        if (this.jF < 0) {
                            this.jF = 0;
                        }
                    }

                    this.jG = this.jF;
                    if (!iD && !this.iG && !this.iR && jX != 52 && jX != 53 && jX != 60 && jX != 77 && this.iU) {
                        this.D(5);
                    }
                }
            }
        }

    }

    private void ac() {
        for(int var2 = this.gW + 85; var2 >= 85; --var2) {
            int var1 = var2 - 85;
            boolean var3 = false;
            int[] var10000;
            if (this.gk[var1] >= 0) {
                int var4 = this.gp[var1];
                int var5 = go[var1];
                byte var6 = this.gl[var1];
                int var7 = this.gm[var1];
                this.d(this.gu[var1], this.gv[var1] - 1, 2);
                this.gK[var1] = var4 - this.gv[var1] * 22 << 8;
                this.gu[var1] = F(var1);
                int var8 = this.gu[var1];
                int var9 = (this.gK[var1] >> 8) + 1 >= 22 ? this.gv[var1] + 1 : this.gv[var1];
                int var10 = this.iw - var5;
                int var11 = this.ix - var4;
                int var12 = Math.abs(var10);
                this.gb = var12;
                int var13 = Math.abs(var11);
                gV = (this.j(var8, var9) & 1) != 0;
                if ((this.j(var8, var9) & 64) != 0 && this.gn[var1] != 1 && go[var1] > 0) {
                    gF[var1] = -1;
                    if (var6 == 1) {
                        this.k(8, var1);
                        this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                    } else if (var6 == 2) {
                        this.k(7, var1);
                        this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 2, this.gH[var1]);
                    }
                }

                int var15;
                int var16;
                if (go[var1] > -10 && this.gp[var1] > -10 && (a(bU - 88, bV - 88, 528, 592, go[var1] - this.gz[var1], this.gp[var1] - this.gA[var1], this.gz[var1] << 1, this.gA[var1]) || this.gg == var1 && x == 105 || this.gl[var1] == 1 && (this.gm[var1] == 11 || this.gm[var1] == 27 || this.gm[var1] == 8 || this.gm[var1] == 9 || this.gm[var1] == 10 || this.gm[var1] == 7) || this.gl[var1] == 2 && (this.gm[var1] == 8 || this.gm[var1] == 14 || this.gm[var1] == 7 || this.gm[var1] == 10 || this.gm[var1] == 9) || this.gl[var1] == 3 && (this.gm[var1] == 10 || this.gm[var1] == 18 || this.gm[var1] == 7 || this.gm[var1] == 13 || this.gm[var1] == 17 || this.gm[var1] == 8))) {
                    boolean var14 = false;
                    if (this.gs[var1] <= 500) {
                        var14 = !this.b(var2, bN - (this.gs[var1] >> 5));
                    }

                    if ((this.gm[var1] != 11 || this.gl[var1] != 1) && (this.gm[var1] != 8 || this.gl[var1] != 2) && (this.gm[var1] != 10 || this.gl[var1] != 3)) {
                        this.gf[var1] = 0;
                        ge[var1] = 0;
                    } else {
                        super.b += ge[var1];
                        var10000 = this.gf;
                        var10000[var1] += bN;
                        if (this.gf[var1] > 200) {
                            var10000 = this.gf;
                            var10000[var1] -= 200;
                            var10000 = ge;
                            var10000[var1] += ge[var1] >= 8 ? 0 : 4;
                        }
                    }

                    if (x != 105 && this.gs[var1] <= 500) {
                        if (var14) {
                            if (x != 105) {
                                switch (var6) {
                                    case 1:
                                        if (var7 != 8 && var7 != 9 && var7 != 10) {
                                            if (!this.gD[var1] && !this.gC[var1]) {
                                                if (var12 < 66 && var13 < 22) {
                                                    if (Math.abs(this.bP & 3) == 3) {
                                                        this.k(6, var1);
                                                    } else {
                                                        this.k(5, var1);
                                                    }

                                                    this.gE[var1] = var10 >= 0;
                                                } else if (var7 != 0 && var13 < 44 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] : -gw[var1]), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] : -gw[var1]), this.gv[var1]) & 3) != 0 && var12 < 198) {
                                                    if (gP[var1] < 0) {
                                                        this.k(1, var1);
                                                    } else {
                                                        this.k(0, var1);
                                                        var10000 = gP;
                                                        var10000[var1] -= bN;
                                                    }
                                                } else if (this.gm[var1] == 25) {
                                                    this.k(1, var1);
                                                } else {
                                                    if (this.gm[var1] == 27) {
                                                        gV = true;
                                                    }

                                                    this.k(0, var1);
                                                }

                                                if (gQ[var1] && this.gm[var1] == 1) {
                                                    if ((var15 = go[var1] - gq[var1]) > 88) {
                                                        this.gE[var1] = false;
                                                    } else if (var15 < 88) {
                                                        this.gE[var1] = true;
                                                    }
                                                }
                                            } else if (this.gD[var1]) {
                                                if (var7 != 16 && var7 != 15 && var11 > 0 && var11 < 44 && var12 < 22) {
                                                    this.k(16, var1);
                                                } else if (var7 != 15 && var7 != 16 && var11 < 0 && var11 > -88 && var12 < 22) {
                                                    this.k(15, var1);
                                                } else if (var11 < 0 && var7 != 12 && var7 != 15 && var7 != 16 && var7 != 21) {
                                                    this.k(12, var1);
                                                } else if (var7 != 13 && var7 != 15 && var7 != 16 && var7 != 21) {
                                                    this.k(13, var1);
                                                } else if (var7 != 21) {
                                                    this.k(23, var1);
                                                }
                                            } else if (this.gC[var1] && (var7 == 20 || var7 == 19)) {
                                                this.k(26, var1);
                                            }
                                        } else {
                                            if (this.gc < 25) {
                                                this.n(var1, 0);
                                            }

                                            this.H(var1);
                                            this.a(go[var1], this.gp[var1], 26, 0, false);
                                            go[var1] = -1000;
                                            this.gp[var1] = -1000;
                                            var5 = -1000;
                                            var4 = -1000;
                                            ++this.gd;
                                            if (bR) {
                                                this.kW = true;
                                            }

                                            this.k(0, var1);
                                        }
                                        break;
                                    case 2:
                                        if (var7 != 7 && var7 != 12 && var7 != 13) {
                                            if (var7 != 12) {
                                                byte var20 = 0;
                                                if (this.fW) {
                                                    var20 = 1;
                                                }

                                                if (this.gm[var1] == 10) {
                                                    this.k(12, var1);
                                                } else if (var12 < 22 * (3 + var20) && var13 < 22) {
                                                    if (Math.abs(this.bP & 3) == 3) {
                                                        this.k(6, var1);
                                                    } else {
                                                        this.k(5, var1);
                                                    }

                                                    this.gE[var1] = var10 >= 0;
                                                } else {
                                                    if (this.gm[var1] == 27) {
                                                        gV = true;
                                                    }

                                                    this.k(0, var1);
                                                }
                                            }
                                        } else {
                                            if (this.gc < 25) {
                                                this.n(var1, 0);
                                            }

                                            this.H(var1);
                                            this.a(go[var1], this.gp[var1], 26, 0, false);
                                            go[var1] = -1000;
                                            this.gp[var1] = -1000;
                                            var5 = -1000;
                                            var4 = -1000;
                                            this.k(0, var1);
                                            ++this.gd;
                                            if (bR) {
                                                this.kW = true;
                                            }
                                        }

                                        if (gQ[var1] && this.gm[var1] == 1) {
                                            if ((var15 = go[var1] - gq[var1]) > 88) {
                                                this.gE[var1] = false;
                                            } else if (var15 < 88) {
                                                this.gE[var1] = true;
                                            }
                                        }
                                        break;
                                    case 3:
                                        if ((var7 != 7 && var7 != 13 && var7 != 17 || gh == var1 || this.gi == var1) && (gh != var1 || var7 != 7 && var7 != 16) && (this.gi != var1 || var7 != 16)) {
                                            if (gh == var1 && this.gi != var1 && this.gm[var1] == 15) {
                                                this.k(16, var1);
                                            }
                                        } else {
                                            if (gh == var1 && var7 == 7 || this.gi == var1) {
                                                if (this.gi != var1) {
                                                    this.eN = 266;
                                                    this.eO = 266;
                                                    this.eP = 274;
                                                } else {
                                                    this.eN = 243;
                                                    this.eO = 243;
                                                    this.eP = 245;
                                                }

                                                this.c(95, 35, 35, 35);
                                                x = 101;
                                                this.u();
                                            }

                                            if (this.gc < 25) {
                                                this.n(var1, 0);
                                            }

                                            this.H(var1);
                                            if (gh != var1) {
                                                this.a(go[var1], this.gp[var1], 26, 0, false);
                                            }

                                            go[var1] = -1000;
                                            this.gp[var1] = -1000;
                                            var5 = -1000;
                                            var4 = -1000;
                                            this.k(0, var1);
                                            ++this.gd;
                                            if (bR) {
                                                this.kW = true;
                                            }
                                        }

                                        if (gh != var1 || this.gi == var1 || this.gm[var1] != 16) {
                                            if (var7 == 11 && gh != var1) {
                                                this.k(12, var1);
                                            } else if (var7 == 16 && gh != var1 && this.gi != var1) {
                                                this.k(17, var1);
                                                gF[var1] = -1;
                                            } else if (var7 == 12 && gh != var1) {
                                                this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 1, this.gH[var1]);
                                                this.k(13, var1);
                                                gF[var1] = -1;
                                            } else if (var12 < 22 * (3 + (gh == var1 ? 1 : 0)) && var13 < 22 && this.iA < 0) {
                                                if (Math.abs(this.bP & 3) == 3) {
                                                    if (gh == var1 && (this.bP & 1) != 0) {
                                                        this.k(12, var1);
                                                    } else {
                                                        this.k(6, var1);
                                                    }
                                                } else {
                                                    this.k(3, var1);
                                                }

                                                if (!in) {
                                                    this.gE[var1] = var10 >= 11;
                                                }
                                            } else if (var7 != 0 && this.iA != var1) {
                                                super.a = 0;
                                                super.b = 0;
                                                this.k(0, var1);
                                            }

                                            if (gQ[var1] && this.gm[var1] == 1) {
                                                if ((var15 = go[var1] - gq[var1]) > 88) {
                                                    this.gE[var1] = false;
                                                } else if (var15 < 88) {
                                                    this.gE[var1] = true;
                                                }
                                            }

                                            if (this.gi == var1 && var7 == 14 && this.gj >= 3) {
                                                this.k(16, var1);
                                            } else if (this.gi == var1 && var7 == 14 && this.gj < 3) {
                                                this.k(17, var1);
                                                this.gE[var1] = !this.gE[var1];
                                            }
                                        }
                                }
                            }
                        } else if (x != 105) {
                            switch (var6) {
                                case 1:
                                    if (var7 == 1) {
                                        if (var10 > 22 && !this.gE[var1]) {
                                            this.gE[var1] = true;
                                        } else if (var10 < -22 && this.gE[var1]) {
                                            this.gE[var1] = false;
                                        }

                                        if (var12 < 66 && var13 < 22) {
                                            this.k(6, var1);
                                            this.gE[var1] = var10 >= 0;
                                        } else if (var12 < 44 && var13 > 22 && var13 < halfWidth && this.iJ && !this.fV || var12 < 88 && var13 > 22 && var13 < 44 && iM && !this.fV || var11 > 0 && var13 < 44 && var12 < 66 && this.jW != 37 && this.jW != 38 && !iM && !iN && this.jW != 38) {
                                            this.k(3, var1);
                                        }
                                    } else if (this.gD[var1]) {
                                        if (var7 != 16 && var7 != 21 && var11 > 0 && var11 < 44 && var12 < 22) {
                                            this.k(16, var1);
                                        } else if (var7 != 15 && var7 != 21 && var11 < 0 && var11 > -88 && var12 < 22) {
                                            this.k(15, var1);
                                        } else if (var11 < 0 && var7 != 12 && var7 != 15 && var7 != 16 && var7 != 21) {
                                            this.k(12, var1);
                                        } else if (var7 != 13 && var7 != 15 && var7 != 21 && var7 != 16 && var11 > 0) {
                                            this.k(13, var1);
                                        } else if (var7 == 21 && gV) {
                                            this.k(0, var1);
                                        }
                                    } else if (!this.gC[var1]) {
                                        if ((this.j(this.gu[var1], this.gv[var1] - 1) & 512) != 0 && this.gm[var1] != 8) {
                                            this.gE[var1] = !jQ;
                                            gF[var1] = -1;
                                            this.k(8, var1);
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                                        } else if (var7 == 0 && var13 < 44 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] : -gw[var1]), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] : -gw[var1]), this.gv[var1]) & 3) != 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1]) & 3) != 0 && var12 < 198) {
                                            if (gP[var1] < 0) {
                                                this.k(1, var1);
                                            } else {
                                                var10000 = gP;
                                                var10000[var1] -= bN;
                                            }
                                        } else if (var7 == 0 && var11 <= 44 && var11 > 0 && this.iU && var12 < 66) {
                                            this.k(3, var1);
                                        } else if (var7 == 21) {
                                            this.k(0, var1);
                                        } else if (this.gm[var1] == 0 && var12 < 66 && var13 < 22) {
                                            if (Math.abs(this.bP & 3) == 3) {
                                                this.k(6, var1);
                                            } else {
                                                this.k(5, var1);
                                            }

                                            this.gE[var1] = var10 >= 0;
                                        }
                                    } else {
                                        if (var10 > 22 && var12 < 99 && this.gm[var1] != 19 && this.gm[var1] != 18 && (this.j(this.gu[var1] + 1, this.gv[var1] - this.gB[var1] - 1) & 16) != 0) {
                                            this.k(18, var1);
                                            this.gE[var1] = true;
                                        } else if (var10 < -22 && var12 < 99 && this.gm[var1] != 19 && this.gm[var1] != 18 && (this.j(this.gu[var1] - 1, this.gv[var1] - this.gB[var1] - 1) & 16) != 0) {
                                            this.k(18, var1);
                                            this.gE[var1] = false;
                                        }

                                        if (this.gm[var1] != 19 && var12 < 66 && var13 < 22) {
                                            this.k(19, var1);
                                            this.gE[var1] = var10 >= 0;
                                        }
                                    }
                                    break;
                                case 2:
                                    var15 = 0;
                                    if (this.fW) {
                                        var15 = 1;
                                    }

                                    if (var7 != 1) {
                                        if ((this.j(this.gu[var1], this.gv[var1] - 1) & 512) != 0 && this.gm[var1] != 7) {
                                            this.gE[var1] = !jQ;
                                            gF[var1] = -1;
                                            this.k(7, var1);
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 2, this.gH[var1]);
                                        } else if (var7 == 0 && var13 < 44 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] : -gw[var1]), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] : -gw[var1]), this.gv[var1]) & 3) != 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1]) & 3) != 0 && var12 < 198) {
                                            if (gP[var1] < 0) {
                                                this.k(1, var1);
                                            } else {
                                                var10000 = gP;
                                                var10000[var1] -= bN;
                                            }
                                        } else if (this.gm[var1] == 0) {
                                            var16 = 0;
                                            if (this.fW) {
                                                var16 = 1;
                                            }

                                            if (var12 < 22 * (3 + var16) && var13 < 22) {
                                                if (Math.abs(this.bP & 3) == 3) {
                                                    this.k(6, var1);
                                                } else {
                                                    this.k(5, var1);
                                                }

                                                this.gE[var1] = var10 >= 0;
                                            }
                                        }
                                    } else {
                                        if (var10 > 22 && !this.gE[var1]) {
                                            this.gE[var1] = true;
                                        } else if (var10 < -22 && this.gE[var1]) {
                                            this.gE[var1] = false;
                                        }

                                        if (var12 < 22 * (3 + var15) && var13 < 22) {
                                            this.k(6, var1);
                                            this.gE[var1] = var10 >= 0;
                                        }
                                    }
                                    break;
                                case 3:
                                    if (var7 != 12) {
                                        if (var7 == 1) {
                                            if (var10 > 22 && !this.gE[var1]) {
                                                this.gE[var1] = true;
                                            } else if (var10 < -22 && this.gE[var1]) {
                                                this.gE[var1] = false;
                                            }

                                            if (var12 < 22 * (3 + (gh == var1 ? 1 : 0)) && var13 < 22) {
                                                this.k(6, var1);
                                                this.gE[var1] = var10 >= 0;
                                            }
                                        } else if ((this.j(this.gu[var1], this.gv[var1] - 1) & 512) != 0 && this.gm[var1] != 7) {
                                            gF[var1] = -1;
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                                            this.k(7, var1);
                                            this.gE[var1] = !jQ;
                                        } else if (var7 == 0 && var13 < 44 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1] - 1) & 3) == 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1]) & 3) != 0 && (this.j(this.gu[var1] + (var10 > 0 ? gw[var1] + 1 : -(gw[var1] + 1)), this.gv[var1]) & 3) != 0 && var12 < 198) {
                                            if (gP[var1] < 0) {
                                                this.k(1, var1);
                                            } else {
                                                var10000 = gP;
                                                var10000[var1] -= bN;
                                            }
                                        }
                                    }

                                    if (var7 == 0 && var12 < 22 * (3 + (gh == var1 ? 1 : 0)) && var13 < 22 && this.iA < 0) {
                                        if (Math.abs(this.bP & 3) == 3) {
                                            if (gh == var1 && (this.bP & 1) != 0) {
                                                this.k(12, var1);
                                            } else {
                                                this.k(6, var1);
                                            }
                                        } else {
                                            this.k(3, var1);
                                        }

                                        if (!in) {
                                            this.gE[var1] = var10 >= 11;
                                        }
                                    }
                            }
                        }
                    } else if ((var1 == this.gg || this.gs[var1] > 0) && this.gs[var1] <= 0 && var14) {
                        if (this.di[this.dk + 1] == 0 && this.dj[this.dl] == 0) {
                            this.af();
                        } else if (this.dj[this.dl + 1] == 0) {
                            this.k(this.dj[this.dl], var1);
                        } else {
                            ++this.dl;
                            this.k(this.dj[this.dl], var1);
                        }
                    }

                    if (this.gs[var1] <= 500) {
                        this.e(this.gu[var1], this.gv[var1], var1);
                    }

                    if (!gV && !this.gD[var1] && !this.gC[var1] && this.gn[var1] != 1 && (this.gl[var1] == 1 && this.gm[var1] != 11 && this.gm[var1] != 27 && this.gm[var1] != 3 && this.gm[var1] != 11 && this.gm[var1] != 24 || this.gl[var1] == 2 && this.gm[var1] != 8 && this.gm[var1] != 14 || this.gl[var1] == 3 && this.gm[var1] != 10 && this.gm[var1] != 18) && this.gi != var1) {
                        switch (this.gl[var1]) {
                            case 1:
                                this.k(11, var1);
                                break;
                            case 2:
                                this.k(8, var1);
                                break;
                            case 3:
                                this.k(10, var1);
                        }
                    }

                    if (!gS && (this.gm[var1] == 1 || this.gm[var1] == 18 || this.gm[var1] == 1 || this.gm[var1] == 1)) {
                        switch (this.gl[var1]) {
                            case 1:
                                this.k(0, var1);
                                break;
                            case 2:
                                this.k(0, var1);
                                break;
                            case 3:
                                this.k(0, var1);
                        }
                    }
                }

                if (x != 105 && go[var1] < 0 && (gx[var1] > 0 || bR)) {
                    var10000 = gM;
                    var10000[var1] -= bN;
                    if (gM[var1] <= 0 && this.eh < 9 && (Math.abs(gq[var1] - this.iw) > 44 || Math.abs(gr[var1] - this.ix) > 44)) {
                        if ((this.j(gq[var1] / 22, gr[var1] / 22 - 1) & 1) == 0 && (this.j(gq[var1] / 22, gr[var1] / 22 - 1) & 2) == 0) {
                            --gx[var1];
                            gM[var1] = this.gO[var1];
                            this.gC[var1] = false;
                            go[var1] = gq[var1];
                            this.gp[var1] = gr[var1];
                            gF[var1] = gI[var1];
                            this.gu[var1] = go[var1] / 22;
                            this.gv[var1] = this.gp[var1] / 22;
                            this.c(this.gu[var1], this.gv[var1] - 1, 2);
                            this.a(go[var1], this.gp[var1], 25, 0, false);
                            switch (this.gl[var1]) {
                                case 1:
                                    if (this.gC[var1]) {
                                        this.k(26, var1);
                                    } else {
                                        this.k(27, var1);
                                    }
                                    break;
                                case 2:
                                    this.k(14, var1);
                                    break;
                                case 3:
                                    this.k(18, var1);
                            }
                        } else {
                            gM[var1] = 1500;
                        }
                    }
                }

                this.a(var5, var4, var1 + 85, gR, this.gE[var1]);
                var15 = 0;

                while(true) {
                    if (var15 >= this.jP.length) {
                        if (gR[12] > 0 && a(this.iw - this.jT, this.ix - this.iZ, iY, this.iZ, gR[10], gR[11], gR[12], gR[13])) {
                            var15 = this.gG[var1];
                            if (this.gm[var1] == 6) {
                                var15 <<= 1;
                            }

                            if (gh != var1) {
                                var15 <<= 1;
                            }

                            if (gh != var1 && this.gm[var1] == 12) {
                                var15 <<= 2;
                            }

                            if (!this.jS) {
                                if (!this.gT) {
                                    this.jF -= var15;
                                    if (this.jF < 0) {
                                        this.jF = 0;
                                    }
                                }
                            } else {
                                this.iE = true;
                            }

                            this.iB = !this.gE[var1];
                        }
                        break;
                    }

                    if (this.jP[var15 + 2] != 0) {
                        int var19;
                        if (!jx && !jy) {
                            if (var15 == 0) {
                                var19 = this.ik;
                            } else {
                                var19 = this.il;
                            }
                        } else {
                            var19 = 0;
                        }

                        int var17;
                        int var18;
                        if (var19 < 2 && a(this.jP[var15], this.jP[var15 + 1], this.jP[var15 + 2], this.jP[var15 + 3], gR[0], gR[1], gR[2], gR[3])) {
                            var16 = gR[0] + (this.gE[var1] ? gR[7] : 0);
                            var17 = gR[1] + (gR[3] >> 1);
                            if (gR[1] < gR[3]) {
                                var17 = gR[3];
                            } else if (var17 > this.gp[var1]) {
                                var17 = this.gp[var1];
                            }

                            ++var19;
                            var18 = jx ? i_f[this.jc] << jm : ie[this.jc] << jl;
                            if (this.bH) {
                                var18 = 10000;
                            }

                            if (jx) {
                                jH -= (i_f[this.jc] << 1) + i_f[this.jc];
                            }

                            if (jx && !this.iL && jB < 3 || !jx && !jy) {
                                var10000 = gF;
                                var10000[var1] -= var18;
                                if (!jx) {
                                    if (var19 == 1) {
                                        ++jd;
                                    }
                                }
                                if (!var3) {
                                    this.playSound(7 + (this.bP & 1));
                                }

                                var3 = true;
                                this.kW = true;
                                this.je = 2000;
                            } else if (jy) {
                                var10000 = this.gs;
                                var10000[var1] += (ig[jr] << 5) + bN;
                            }

                            if (gF[var1] <= 0 && this.gn[var1] != 1) {
                                gF[var1] = -1;
                                if (!this.gD[var1] && !this.gC[var1]) {
                                    if (gV) {
                                        if (var6 == 1) {
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                                            this.k(9, var1);
                                        } else if (var6 == 2) {
                                            this.k(7, var1);
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 2, this.gH[var1]);
                                        } else if (var6 == 3) {
                                            if (var7 == 12 && gh != var1) {
                                                this.k(13, var1);
                                                this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 1, this.gH[var1]);
                                            } else if (gh != var1 && this.gi != var1) {
                                                this.k(7, var1);
                                                this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                                            } else {
                                                gF[var1] = (gI[var1] >> 1) - 1;
                                            }
                                        }
                                    }
                                } else {
                                    this.k(11, var1);
                                }

                                this.a(var16, var17, 0, !jQ ? 2 : 0, true);
                            } else if (this.gn[var1] != 1 && this.gn[var1] != 3) {
                                if (this.gs[var1] <= 0) {
                                    if (this.gD[var1]) {
                                        this.k(17, var1);
                                    } else if (this.gC[var1]) {
                                        this.k(20, var1);
                                    } else {
                                        this.gE[var1] = var10 > 0;
                                        if (var6 == 1) {
                                            if (this.iA == -1 && jX != 60 && jX != 77) {
                                                this.k(2, var1);
                                            } else {
                                                this.k(7, var1);
                                            }
                                        } else if (var6 == 2) {
                                            if (this.iA == -1 && jX != 60 && jX != 77) {
                                                this.k(2, var1);
                                            } else {
                                                this.k(9, var1);
                                            }
                                        } else if (var6 == 3) {
                                            if (var7 == 12 && gh != var1) {
                                                this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 1, this.gH[var1]);
                                                this.k(13, var1);
                                            } else if ((gh == var1 || this.iA == -1) && jX != 60 && jX != 77) {
                                                this.k(4, var1);
                                            } else {
                                                this.k(8, var1);
                                            }
                                        }

                                        if (!in) {
                                            this.gE[var1] = go[var1] - this.iw <= 0;
                                        }
                                    }
                                }

                                if ((!jx || jx && jB < 3) && !jy) {
                                    ++jB;
                                    this.a(var16, var17, 0, !jQ ? 2 : 0, true);
                                }
                            }

                            if (!jx && !jy && this.iA != -1) {
                                this.jP[var15] = 0;
                                this.jP[var15 + 1] = 0;
                                this.jP[var15 + 2] = 0;
                                this.jP[var15 + 3] = 0;
                            }

                            if (var15 == 0) {
                                this.ik = var19;
                            } else {
                                this.il = var19;
                            }
                        }

                        if (var19 < 2 && a(this.jP[var15], this.jP[var15 + 1], this.jP[var15 + 2], this.jP[var15 + 3], gR[5], gR[6], gR[7], gR[8])) {
                            var16 = gR[5] + (this.gE[var1] ? gR[7] : 0);
                            var17 = this.jP[var15 + 1] + (this.jP[var15 + 3] >> 1);
                            ++var19;
                            var18 = jx ? i_f[this.jc] << jm : ie[this.jc] << jl;
                            if (this.bH) {
                                var18 = 10000;
                            }

                            if (jx && jB < 3 || !jx && !jy) {
                                label1100: {
                                    var10000 = gF;
                                    var10000[var1] -= var18;
                                    if (!jx) {
                                        if (var19 != 1) {
                                            break label1100;
                                        }
                                    }
                                    if (!var3) {
                                        this.playSound(7 + (this.bP & 1));
                                    }

                                    ++jd;
                                }

                                this.kW = true;
                                var3 = true;
                                this.je = 2000;
                            } else if (jy) {
                                var10000 = this.gs;
                                var10000[var1] += (ig[jr] << 5) + bN;
                            }

                            if (gF[var1] <= 0 && this.gn[var1] != 1) {
                                gF[var1] = -1;
                                if (!this.gD[var1] && !this.gC[var1]) {
                                    if (gV) {
                                        if (var6 == 1) {
                                            this.k(8, var1);
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                                        } else if (var6 == 2) {
                                            this.k(7, var1);
                                            this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 2, this.gH[var1]);
                                        } else if (var6 == 3) {
                                            if (var7 == 12 && gh != var1 && this.gi != var1) {
                                                this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 1, this.gH[var1]);
                                                this.k(13, var1);
                                            } else if (gh != var1 && this.gi != var1) {
                                                this.d(go[var1], this.gp[var1] - (this.gA[var1] >> 1), 0, this.gH[var1]);
                                                this.k(7, var1);
                                            } else {
                                                gF[var1] = (gI[var1] >> 1) - 1;
                                            }
                                        }
                                    }
                                } else {
                                    this.k(11, var1);
                                }

                                this.a(var16, var17, 0, !jQ ? 2 : 0, true);
                            } else if (this.gn[var1] != 1 && this.gn[var1] != 3) {
                                if (this.gs[var1] <= 0) {
                                    if (this.gD[var1]) {
                                        this.k(17, var1);
                                    } else if (this.gC[var1]) {
                                        this.k(20, var1);
                                    } else {
                                        this.gE[var1] = var10 > 0;
                                        if (var6 == 1) {
                                            if (this.iA == -1 && jX != 60 && jX != 77) {
                                                this.k(2, var1);
                                            } else {
                                                this.k(7, var1);
                                            }
                                        } else if (var6 == 2) {
                                            if (this.iA == -1 && jX != 60 && jX != 77) {
                                                this.k(2, var1);
                                            } else {
                                                this.k(9, var1);
                                            }
                                        } else if (var6 == 3) {
                                            if (this.iA == -1 && jX != 60 && jX != 77) {
                                                this.k(4, var1);
                                            } else {
                                                this.k(8, var1);
                                            }
                                        }
                                    }
                                }

                                if ((!jx || jx && jB < 3) && !jy) {
                                    ++jB;
                                    this.a(var16, var17, 0, !jQ ? 2 : 0, true);
                                }
                            }

                            if (!jx && this.iA != -1) {
                                this.jP[var15] = 0;
                                this.jP[var15 + 1] = 0;
                                this.jP[var15 + 2] = 0;
                                this.jP[var15 + 3] = 0;
                            }

                            if (var15 == 0) {
                                this.ik = var19;
                            } else {
                                this.il = var19;
                            }
                        }
                    }

                    var15 += 5;
                }
            }

            if (this.gs[var1] > 0) {
                var10000 = this.gs;
                var10000[var1] -= bN + (gI[var1] >> 6);
            }
        }

    }

    private void ad() {
        jy = false;
        this.jz = false;
        jx = false;
        this.ii = 0;
    }

    private int ae() {
        int var1;
        do {
            var1 = Math.abs(this.bP % 5);
            this.bP = bQ.nextInt();
        } while(this.ip == var1);

        return var1;
    }

    private void af() {
        this.dk += 2;
        this.dl += 2;
        ++this.eN;
        if (this.eN >= this.eP) {
            this.c(0, 0, 35, 35);
            x = 100;
            this.kW = true;
            this.dg = false;
            this.eP = -1;
            this.eN = -1;
            this.eO = -1;
        } else {
            this.eO = this.eN;
            this.u();
            if (!this.d_o) {
                x = 101;
            } else {
                this.le = false;
                ++this.dT;
                if (this.dT > this.dU && (this.dV <= 0 || this.dT < this.dV)) {
                    this.dU = this.dT;
                }

                ++this.dR;
                this.dR = dS[this.dT];
                this.dp = true;
                this.bz = false;
                this.co = true;
                this.c(bL, bL, 35, 35);
                x = 109;
                this.co = true;
            }
        }
    }

    private void n(int var1, int var2) {
        c[] var3 = (c[])null;
        int var4 = 85 + var1;
        boolean var5;
        int var6;
        int var7;
        if (var2 == 0) {
            if (this.gl[var1] == 1) {
                var3 = this.fX;
            } else if (this.gl[var1] == 2) {
                var3 = fY;
            } else if (this.gl[var1] == 3) {
                if (gh != var1) {
                    var3 = this.fZ;
                } else {
                    var3 = this.ga;
                }
            }

            var5 = this.gE[var1];
            var6 = go[var1];
            var7 = this.gp[var1];
        } else if (var2 == 1) {
            var3 = this.fC;
            var4 = 60 + var1;
            var5 = this.fF[var1] != 2;
            var6 = fG[var1];
            var7 = fH[var1];
        } else {
            var3 = this.ht;
            var4 = 116 + var1;
            var5 = true;
            var6 = hy[var1];
            var7 = this.hz[var1];
        }

        int var8 = this.a(this.ki, var4, var5 ? 0 : 2);
        if (this.kj + var8 < 1000) {
            this.kj += var8;

            for(int var9 = 0; var9 < var8; ++var9) {
                int var10 = var9 << 2;
                this.bS.b(var3[this.ki[var10]], var6 + this.ki[var10 + 1], var7 + this.ki[var10 + 2], this.ki[var10 + 3]);
            }
        }

    }

    private static int F(int var0) {
        return go[var0] / 22;
    }

    private int G(int var1) {
        int var2;
        return (var2 = this.gp[var1] / 22) > dF ? dF : var2;
    }

    private void e(int var1, int var2, int var3) {
        int var6 = go[var3];
        int var7 = this.gp[var3];
        boolean var8 = this.gE[var3];
        short var9 = this.gA[var3];
        int var10 = this.gz[var3] >> 1;
        int var11 = (super.a > 0 ? super.a : -super.a) << 8;
        int var12 = (super.b > 0 ? super.b : -super.b) << 8;
        int var13 = var11;
        int var14 = var12;
        if (super.a != 0) {
            var6 += (!this.gE[var3] || super.a <= 0) && (this.gE[var3] || super.a >= 0) ? -var10 : var10 - 1;
        }

        int[] var10000;
        if (super.b < 0) {
            var7 -= var9;
            var10000 = this.gp;
            var10000[var3] -= var9;
        } else {
            --var7;
        }

        int var15 = var1;
        int var16 = this.G(var3);
        this.gJ[var3] = var6 - var1 * 22 << 8;
        if (this.gJ[var3] < 0) {
            var15 = var1 - 1;
            var10000 = this.gJ;
            var10000[var3] += 5632;
        } else if (this.gJ[var3] > 5632) {
            var15 = var1 + 1;
            var10000 = this.gJ;
            var10000[var3] -= 5632;
        }

        this.gK[var3] = var7 - var16 * 22 << 8;
        if (super.a != 0) {
            var6 -= (!var8 || super.a <= 0) && (var8 || super.a >= 0) ? -var10 : var10 - 1;
        }

        if (super.b < 0) {
            var7 += var9;
            var10000 = this.gp;
            var10000[var3] += var9;
        } else {
            ++var7;
        }

        gS = true;
        this.gU = true;
        if (var11 > var12) {
            if (var11 > 5632) {
                var12 = (var12 * 22 << 8) / var11;
                var11 = 5632;
            }
        } else if (var12 > 5632) {
            var11 = (var11 * 22 << 8) / var12;
            var12 = 5632;
        }

        int var4;
        if ((!var8 || super.a <= 0) && (var8 || super.a >= 0)) {
            var4 = -var11;
        } else {
            var4 = var11;
        }

        int var5 = super.b > 0 ? var12 : -var12;
        int var17 = 0;
        int var18 = 0;
        this.ke = 0;
        this.kf = 0;
        if (super.a != 0 && !this.gC[var3] && this.gn[var3] != 1) {
            this.f(this.gu[var3], this.gv[var3] - 1 - (super.b < 0 ? this.gB[var3] : 0), var3);
        }

        while(var17 < var13 || var18 < var14) {
            var10000 = this.gJ;
            var10000[var3] += var4;
            var10000 = this.gK;
            var10000[var3] += var5;
            if (this.gJ[var3] >= 5632) {
                var10000 = this.gJ;
                var10000[var3] -= 5632;
                ++var15;
            } else if (this.gJ[var3] < 0) {
                var10000 = this.gJ;
                var10000[var3] += 5632;
                --var15;
            }

            if (this.gK[var3] >= 5632) {
                var10000 = this.gK;
                var10000[var3] -= 5632;
                ++var16;
            } else if (this.gK[var3] < 0) {
                var10000 = this.gK;
                var10000[var3] += 5632;
                --var16;
            }

            this.kb = false;
            this.f(var15, var16, var3);
            if (gS) {
                this.ke += var4;
                var17 += var11;
            } else {
                var10000 = this.gJ;
                var10000[var3] -= var4;
                var13 = var17;
                if ((this.j(var1, var2) & 1) != 0 && !this.kb) {
                    this.ke = 0;
                    this.kb = true;
                    if ((!this.gE[var3] || super.a <= 0) && (this.gE[var3] || super.a >= 0)) {
                        go[var3] = var1 * 22 + (this.gz[var3] >> 1);
                    } else {
                        go[var3] = (var1 + 1) * 22 - (this.gz[var3] >> 1);
                    }
                }
            }

            if (this.gU) {
                this.kf += var5;
                var18 += var12;
            } else {
                var10000 = this.gK;
                var10000[var3] -= var5;
                var14 = var18;
            }
        }

        var6 += this.ke >> 8;
        var7 += this.kf >> 8;
        int var19;
        if (var17 > var13) {
            var19 = var17 - var13 >> 8;
            var6 -= var4 > 0 ? var19 : -var19;
        }

        if (var18 > var14) {
            var19 = var18 - var14 >> 8;
            var7 -= var5 > 0 ? var19 : -var19;
        }

        if (gS && !this.kb) {
            go[var3] = var6;
        }

        if (this.gU) {
            this.gv[var3] = var7 / 22;
            this.gp[var3] = var7;
        }

        this.c(this.gu[var3], this.gv[var3] - 1, 2);
    }

    private void ag() {
        this.gT = false;
        this.kH = 0;
        this.kG = 0;
        this.d_o = false;
        this.dk = 0;
        this.gj = 0;
        this.dl = 0;
        this.di = new int[40];
        this.dj = new int[40];
        this.cC = false;
        this.kk = -1;
        this.cI = -1;
        this.cK = 0;
        this.cJ = -1;
        this.gW = 0;
        hs = -1;
        this.fU = -1;
        gh = -1;
        this.gi = -1;
        hs = -1;
        this.fK = -1;
        this.eh = -1;
        er = -1;
        eF = -1;
        this.eS = -1;
        fd = -1;
        this.hu = -1;
        this.hH = -1;
        this.ib = -1;
        ey = -1;
        this.ht = null;
        eR = null;
        this.fe = null;
        this.hc = null;
        this.es = null;
        this.ez = null;
        this.fX = null;
        fY = null;
        this.fZ = null;
        this.ga = null;
        this.ei = null;
        this.fC = null;
        this.hG = null;
        this.fL = null;
        this.hh = null;
        this.ic = null;
        this.dg = false;
        this.cN = -1;
        this.f();
        this.bS = null;
        this.bT = null;
    }

    private void f(int var1, int var2, int var3) {
        short var4 = this.gA[var3];
        boolean var5;
        boolean var6 = (var5 = this.gE[var3]) && super.a > 0 || !var5 && super.a < 0;
        int var7 = 0;
        boolean var8 = false;
        this.ka = false;
        this.kb = false;

        int var9;
        int var10002;
        for(var9 = var4; var9 > 0 && gS; var9 -= 22) {
            if (var2 < dF) {
                if (var2 - var7 < 0 || var2 - var7 >= dF) {
                    break;
                }

                if (var9 > 0) {
                    if (gS && var1 >= 0) {
                        gS = (this.j(var1, var2 - var7) & 1) == 0;
                        if (var7 == 0) {
                            var8 = !gS && (this.j(var1, var2 - var7 - 1) & 1) == 0;
                        }

                        boolean var10 = gS;
                        if (this.gl[var3] == 1 && this.gm[var3] == 1 || this.gl[var3] == 2 && this.gm[var3] == 1 || this.gl[var3] == 3 && this.gm[var3] == 1) {
                            gS &= (this.j(var1, var2 - var7) & 2) == 0 || !gV || this.gC[var3] || var1 == this.gu[var3];
                        }

                        if (var10 != gS) {
                            gP[var3] = 1500;
                        }
                    }

                    if (!gS) {
                        this.kb = true;
                        if (var8 && super.a > 0 && (this.gE[var3] || super.a < 0 && !this.gE[var3]) && super.b == 0 && (this.j(var1, var2 - var7 - 1) & 1) == 0) {
                            switch (this.gl[var3]) {
                                case 1:
                                    this.k(3, var3);
                                case 2:
                                case 3:
                            }
                        }
                        break;
                    }
                }

                if (var1 < 0 || var1 >= dE) {
                    gS = false;
                    var5 = !var5;
                }

                if (super.b >= 0) {
                    ++var7;
                } else {
                    --var7;
                }

                if (this.gl[var3] == 1 && this.gC[var3] && this.gm[var3] != 26 && var9 - 22 < 0 && (this.j(var1, var2 - var7) & 16) == 0) {
                    gS = false;
                    this.k(26, var3);
                    var10002 = this.gp[var3]++;
                    break;
                }
            }
        }

        if (gS && this.gm[var3] == 1 || this.gm[var3] == 0) {
            gS = (this.j(var1, var2 + 1) & 1) == 1;
        }

        var9 = var1;
        if (super.a == 0 && super.b != 0) {
            var9 = var1 + (var5 ? 1 : -1);
        }

        if (super.b >= 0) {
            var7 = this.gB[var3];
            if (this.gK[var3] < 2816) {
                ++var7;
            }
        } else {
            var7 = 0;
        }

        int var22 = var2 - var7;
        int var11 = var5 ? -1 : 1;
        int var12;
        if (this.gl[var3] == 1 && (this.j(var9, var22 - 1) & 1) == 0 && ((this.j(var9, var22) & 1) != 0 || this.gL[var3]) && (this.j(var9 + var11, var22) & 1) == 0 && (this.j(var9 + var11, var22 - 1) & 1) == 0 && (this.j(var9 + var11, var22 + this.gB[var3]) & 1) == 0 && super.b != 0 && (!this.gD[var3] || this.gL[var3]) && !gV && this.gm[var3] != 21 && this.gm[var3] != 11) {
            if (this.gL[var3] && super.b < 0) {
                this.k(21, var3);
                var12 = 0;
                if ((this.j(var9, var2) & 1) == 0) {
                    ++var12;
                }

                this.gp[var3] = (var2 + var12) * 22 + var4;
            }

            this.kf = 0;
            if (!var5) {
                ++var9;
            }

            this.kb = true;
            go[var3] = var9 * 22 + (var5 ? -(this.gz[var3] >> 1) : this.gz[var3] >> 1);
            this.ke = 0;
            this.gU = false;
            gS = false;
        } else {
            if (!gS && super.a != 0) {
                var7 = var6 ? -1 : 1;
            } else {
                var7 = 0;
            }

            var12 = var2;
            int var13;
            if ((var13 = super.b > 0 ? var2 - this.gB[var3] : var2 + this.gB[var3]) < 0) {
                var13 = 0;
            }

            int var14;
            if (super.b != 0) {
                for(var14 = this.gz[var3]; var14 > 0; var14 -= 22) {
                    if (var1 + var7 >= 0 && var1 + var7 < dE) {
                        if (this.gU) {
                            this.gU = (this.j(var1 + var7, var12) & 1) == 0;
                            if (this.gl[var3] == 1 && !this.fV && gF[var3] > 0 && (this.j(var1 + var7, var13) & 16) != 0) {
                                this.gp[var3] = (var13 + 1) * 22 + var4;
                                this.gU = false;
                                this.kf = 0;
                                this.k(26, var3);
                            }
                        }

                        if (!this.gU && super.b > 0 && !this.gC[var3] && this.gm[var3] != 21) {
                            this.gp[var3] = var2 * 22;
                            this.kf = 0;
                            this.ka = true;
                            gV = true;
                            switch (this.gl[var3]) {
                                case 1:
                                    if (gF[var3] < 0) {
                                        this.d(go[var3], this.gp[var3] - (this.gA[var3] >> 1), 0, this.gH[var3]);
                                        this.k(8, var3);
                                    } else if (this.gm[var3] != 25) {
                                        if (this.gm[var3] != 3 && this.gm[var3] != 27) {
                                            this.k(7, var3);
                                        } else {
                                            this.k(25, var3);
                                        }
                                    }
                                    break;
                                case 2:
                                    if (gF[var3] < 0) {
                                        this.d(go[var3], this.gp[var3] - (this.gA[var3] >> 1), 2, this.gH[var3]);
                                        this.k(7, var3);
                                    } else if (this.gm[var3] != 14) {
                                        this.k(9, var3);
                                    }
                                    break;
                                case 3:
                                    this.cF += 6;
                                    if (gV) {
                                        gS = true;
                                    }

                                    if (this.gm[var3] != 6 && gh != var3) {
                                        if (gF[var3] < 0) {
                                            this.d(go[var3], this.gp[var3] - (this.gA[var3] >> 1), 0, this.gH[var3]);
                                            this.k(7, var3);
                                        } else if (this.gm[var3] != 18) {
                                            this.k(8, var3);
                                        }
                                    } else if (gh != var3) {
                                        if (this.iU && this.iA < 0 && this.gb < 88 && jX != 52 && jX != 53 && jX != 48) {
                                            this.D(27);
                                        }
                                    } else if (gF[var3] < 0) {
                                        this.k(7, var3);
                                        this.d(go[var3], this.gp[var3] - (this.gA[var3] >> 1), 0, this.gH[var3]);
                                    } else {
                                        var10002 = go[var3]++;
                                    }
                            }
                        }

                        if (!this.gU) {
                            break;
                        }

                        if (var12 < 0 || var12 >= dF) {
                            this.gU = false;
                        }

                        if (super.a == 0) {
                            break;
                        }
                    }

                    int var10000;
                    if (var6) {
                        --var7;
                        var10000 = var7;
                    } else {
                        ++var7;
                        var10000 = var7;
                    }

                    var7 = var10000;
                }
            }

            if (this.gD[var3] && this.gm[var3] != 21) {
                var14 = var1;
                var1 += var5 ? 1 : -1;
                if ((this.j(var1, var12) & 8) == 0) {
                    this.gU = false;
                    this.gp[var3] = (var12 + (super.b < 0 ? 1 : -this.gB[var3] - 1)) * 22 + var4;
                    this.gL[var3] = true;
                }

                var1 = var14;
            } else {
                this.gL[var3] = false;
            }

            if (!gS && super.a != 0 && !this.ka && !this.gD[var3]) {
                int var15;
                int var16;
                int var17;
                int var18;
                boolean var19;
                int var20;
                int var21;
                if ((!var5 || super.a <= 0) && (var5 || super.a >= 0)) {
                    this.kb = true;
                    var15 = (var14 = (var1 + 1) * 22 + (this.gz[var3] >> 1) + 1) + (this.gz[var3] >> 1);
                    var16 = var14 / 22;
                    var17 = var15 / 22;
                    var18 = var16 < var17 ? 1 : -1;
                    var19 = true;
                    var20 = Math.abs(var17 - var16);

                    for(var21 = 0; var21 <= var20; ++var21) {
                        var19 &= (this.j(var16 + var21 * var18, var2) & 1) == 0;
                    }

                    if (var19) {
                        go[var3] = var14;
                    }

                    if (this.gl[var3] == 1 && gF[var3] > 0 && !this.fV && (this.j(var1, var12 + (super.b > 0 ? -1 : 1)) & 8) != 0 && (this.j(var1, var12 + (super.b > 0 ? -this.gB[var3] : this.gB[var3])) & 8) != 0 && super.b != 0) {
                        this.k(23, var3);
                    }
                } else {
                    this.kb = true;
                    var15 = (var14 = var1 * 22 - (this.gz[var3] >> 1) - 1) - (this.gz[var3] >> 1);
                    var16 = var14 / 22;
                    var17 = var15 / 22;
                    var18 = var16 < var17 ? 1 : -1;
                    var19 = true;
                    var20 = Math.abs(var17 - var16);

                    for(var21 = 0; var21 <= var20; ++var21) {
                        var19 &= (this.j(var16 + var21 * var18, var2) & 1) == 0;
                    }

                    if (var19) {
                        go[var3] = var14;
                    }

                    if (this.gl[var3] == 1 && gF[var3] > 0 && !this.fV && (this.j(var1, var12 + (super.b > 0 ? -1 : 1)) & 8) != 0 && (this.j(var1, var12 + (super.b > 0 ? -this.gB[var3] : this.gB[var3])) & 8) != 0 && super.b != 0) {
                        this.k(23, var3);
                    }
                }

                this.ke = 0;
            }

        }
    }

    private void H(int var1) {
        int var2 = gq[var1] / 22;
        int var3 = gr[var1] / 22;
        if ((this.j(var2, var3) & 32) > 0) {
            int var4 = -1;

            int var5;
            for(var5 = 0; var5 < this.fv.length; ++var5) {
                if (a(var2, var3, this.fv[var5], this.fw[var5], this.fx[var5], fy[var5])) {
                    var4 = var5;
                }
            }

            if (var4 != -1) {
                int var10002 = fA[var4]++;
                if (fA[var4] >= this.fB[var4]) {
                    this.fB[var4] = -1;
                    fA[var4] = -1000000;

                    for(var5 = fd; var5 >= 0; --var5) {
                        if (this.fn[var5] == this.fz[var4]) {
                            fq[var5] = !fq[var5];
                            if (this.fr[var5]) {
                                this.kW = true;
                                this.cI = fh[var5];
                                this.cJ = this.fi[var5];
                            }
                        }
                    }
                }
            }
        }

    }

    private void I(int var1) {
        for(int var2 = var1 << 2; var2 < (var1 << 2) + 4; ++var2) {
            if (this.fc[var2] != 0) {
                for(int var3 = fd; var3 >= 0; --var3) {
                    if (this.fn[var3] == this.fc[var2]) {
                        fq[var3] = !fq[var3];
                        if (this.fr[var3]) {
                            this.cI = fh[var3];
                            this.cJ = this.fi[var3];
                            this.kW = true;
                        }
                    }
                }
            }
        }

    }

    private void a(int var1, int var2, int var3, int var4, boolean var5) {
        int var6 = var3;
        if (var5) {
            int var7 = this.jc - 1;
            if (!jx && jX == 60) {
                var7 = 6;
            }

            byte var8;
            if (this.iL) {
                if (jx) {
                    var8 = 17;
                } else {
                    var8 = 8;
                }
            } else if (jx) {
                var8 = 11;
            } else {
                var8 = 1;
            }

            var6 = var8 + var7;
        }

        if (this.eh < 9 && (var3 != 0 || this.eh < 9)) {
            ++this.eh;
            if (ed[this.eh] < 0) {
                this.eg[this.eh] = var4;
                this.ee[this.eh] = var1;
                this.ef[this.eh] = var2;
                ed[this.eh] = this.eh;
                this.a(this.eh, 7168, var6);
            }
        }

    }

    private void a(int[] var1, byte[] var2) {
        this.km = 220;
        this.a(this.bt);
        this.a(var1, var2, 17, 42, width - 40, 346, this.km);
    }

    private void ah() {
        bO += bN;
        if (bO >= 50) {
            bO = 0;
            if (this.bw == 1) {
                this.j(true);
                this.j();
            }

            if (this.bw == 6) {
                this.j(false);
                this.j();
            }
        }

    }

    private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
        return var0 > var2 && var0 < var2 + var4 && var1 > var3 && var1 < var3 + var5;
    }

    private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        if (var2 != 0 && var6 != 0) {
            return var0 + var2 > var4 && var4 + var6 > var0 && var1 + var3 > var5 && var5 + var7 > var1;
        } else {
            return false;
        }
    }

    private void playSound(int var1) {
        if (!this.kn) {
            this.soundManager.playSound(var1);
            if (var1 == 0 && bp) {
                this.kn = true;
            }
        }
    }

    private void ai() {
        this.kn = false;
        this.soundManager.o();
    }

    private void x(Graphics var1) {
        this.y(var1);
        if (!bZ) {
            this.bX[1].a(var1, halfWidth, bL, 0);
            this.bX[0].a(var1, halfWidth, bL, 0);
        } else {
            this.a(var1, this.bX, 0, halfWidth, bL, 0);
        }
    }

    private void y(Graphics var1) {
        this.b(var1);
        this.kW = true;
        var1.setColor(0);
        this.kX = false;
        var1.fillRect(0, 0, width, height);
    }

    private void a(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7) {
        kr = new String[var7];
        kt = new byte[var7];
        ko = var3;
        kp = var4;
        kq = var5;
        id = var6;
        kw = var1[0];
        int var9 = 0;
        this.j();
        int var10 = 0;
        String var11 = "";
        this.kD = 0;

        for(int var8 = 0; var8 < var1.length; ++var8) {
            byte var12 = var2[var8];
            int var14;
            if ((var14 = var1[var8]) >= 0) {
                var11 = this.getResourceString(var1[var8]);
            } else if (var14 == -1) {
                kr[var10] = "";
                kt[var10++] = var12;
                var11 = "";
            } else if (var14 == -3) {
                var11 = ks[var9++];
            }

            if (!var11.equals("")) {
                if (var11.charAt(0) == '&') {
                    var11 = var11.substring(2, var11.length());
                } else if (var11.charAt(0) == '^') {
                    var11 = var11.substring(2, var11.length());
                } else if (var11.charAt(0) == '*') {
                    var11 = var11.substring(1, var11.length());
                }
            }

            int var13 = var11.length();
            int var15 = 0;

            int var20;
            for(int var16 = 0; var15 < var13; var16 = var15 = var20 + 1) {
                int var18 = 0;
                boolean var19 = false;
                int var17;
                if (this.eM >= 0 && var10 % 5 * bD < this.eK[0].aX << 1) {
                    var17 = var5 - (this.eK[0].aW + 8);
                } else {
                    var17 = var5 - 1 - 5;
                }

                while(var18 <= var17 && var16 < var13) {
                    if ((var20 = var11.charAt(var16)) == 10) {
                        var19 = true;
                        break;
                    }

                    var18 += this.a((char)var20);
                    ++var16;
                }

                if (var8 == 0 && kw != -1) {
                    this.kE = 0;
                    this.kF = var16;
                    var16 = var13;
                }

                if (var19) {
                    var20 = var16;
                } else if (var16 == var13) {
                    var20 = var13 - 1;
                } else if ((var20 = Math.max(var11.lastIndexOf(32, var16), var11.lastIndexOf(46, var16 - 1))) == -1) {
                    var20 = Math.min(var16 - 1, var13 - 1);
                } else if (var20 < var15) {
                    var20 = var16 - 1;
                }

                if (var20 == var11.length()) {
                    --var20;
                }

                kr[var10] = var11.substring(var15, var20 + 1).trim();
                kt[var10++] = var12;
                this.kD += bD;
            }
        }

        ku = var10;
        kv = 0;
        this.kG = 0;
        kx = false;
        this.i();
    }

    private static void aj() {
        kr = null;
        kt = null;
        ks = null;
    }

    private void j(boolean var1) {
        if (var1) {
            if (kv > 0) {
                --kv;
                this.j();
                return;
            }
        } else if (kv < ku && !kx) {
            ++kv;
            this.j();
        }

    }

    private void a(Graphics var1, boolean var2) {
        this.a(var1, 0, kp, width, id);
        byte var4 = 0;
        this.kK = true;
        if (id / bD >= ku) {
            var4 = 3;
        }

        int var6 = kp;
        if (this.dg) {
            var6 = 381 - (this.kI >> 8);
        } else if (x == 79) {
            var6 += 35;
        }

        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (x == 101) {
            var6 -= this.c() >> 1;
        }

        this.kJ = 0;

        int var3;
        int var12;
        for(var3 = this.kG > 0 ? this.kG : kv; var3 < ku && var6 < kp + id; ++var3) {
            var11 = var3;
            if (var9 < 1) {
                var11 = var9;
            }

            byte var8;
            var12 = ((var8 = kt[var11]) & 2) != 0 ? 4 : 1;
            int var7 = ko + var4 + ((var8 & 2) != 0 ? 0 : kq - 5 >> 1) + 1;
            if (this.eM >= 0 && var6 - bD - kp < this.eK[0].aX) {
                var7 += this.eK[0].aW + 8;
            }

            String var13 = kr[var11];
            if (x == 101 && !var13.equals("")) {
                if (var13.length() > this.dn - this.kJ) {
                    var13 = var13.substring(0, this.dn - this.kJ);
                    this.kJ += var13.length();
                    this.kK = false;
                } else {
                    this.kJ += var13.length();
                }
            }

            if (var3 == kv && kw != -1) {
                if (this.br != null) {
                    this.a(this.bs);
                } else {
                    this.a(this.bt);
                }
            } else {
                this.a(this.bt);
            }

            this.j();
            this.drawString(var1, var3 == kv && kw != -1 ? var13.substring(this.kE, this.kF) : var13, var7, var6, var12);
            var6 += bD;
            if (x == 101 && var6 >= id && var11 < ku) {
                this.kH = var11;
                if (kr[var11].equals("") || this.kH + 1 == ku) {
                    this.kH = -1;
                }
                break;
            }

            this.kH = -1;
            if (var9++ < 2) {
                var10 = var6;
            }
        }

        kx = var3 == ku;
        this.b(var1);
        this.kW = true;
        if (var4 == 0 && var2 && !this.dg) {
            var1.setColor(10377532);
            var12 = id - (var10 - 35) - 4;
            var1.drawRect(ko + kq + 10 - 1, var10 - 4, 5, var12);
            int var16 = var10 + kv * var12 / ku - 3;
            int var14 = var10 + var3 * var12 / ku - 3;
            var1.setColor(15425792);
            var1.fillRect(ko + kq + 10, var16, 4, var14 - var16 - 1);
        }

        if (this.eM >= 0) {
            if (this.eM > 3) {
                var12 = this.eM - 3 - 1 + 38;
                byte var18 = 0;
                byte var17 = 0;
                if (var12 == 41) {
                    var18 = -3;
                }

                if (var12 == 39) {
                    var17 = -3;
                }

                int var15;
                if ((var15 = var12 + (dt > 0 ? 4 - dt : 0)) > 41) {
                    var15 = 38 + (var15 - 41) - 1;
                }

                cV[89].a(var1, ko + (this.eK[this.eM].aW >> 3) - cV[89].aU, kp + bD - cV[89].aV, 0);
                cV[var15].a(var1, 19 - cV[var15].aU + var18, 19 - cV[var15].aV + var17, 0);
            } else {
                this.eK[this.eM].a(var1, ko + (this.eK[this.eM].aW >> 3), kp + bD, 0);
            }

            this.a(136, 1024, 0);
            this.a(var1, this.eK, 136, ko + (this.eK[this.eM].aW >> 3), kp + bD, 0);
        }

        if ((var11 < ku - 1 || this.eN < this.eP - 1) && x == 101) {
            dz[1].a(var1, halfWidth, 95 - dz[1].aX - 2, 0);
        }

    }

    private void K(int var1) {
        kL = new byte[76];
        boolean var2 = false;
        int var3 = a(jl, kL, 0);
        var3 = a(jm, kL, var3);
        var3 = a(jj, kL, var3);
        var3 = a(this.jk, kL, var3);
        var3 = a(jr, kL, var3);
        var3 = a(js, kL, var3);
        var3 = a(this.jK, kL, var3);
        var3 = a(this.jL, kL, var3);
        var3 = a(this.jM, kL, var3);
        var3 = a(this.jv, kL, var3);
        var3 = a(this.jw, kL, var3);
        var3 = a(this.jt, kL, var3);
        var3 = a(this.ju, kL, var3);
        var3 = a(this.dU, kL, var3);
        var3 = a(jN, kL, var3);
        var3 = a(this.jO, kL, var3);
        var3 = a(jA, kL, var3);
        if (this.gd > this.jV && bR) {
            this.jV = this.gd;
        }

        a(this.jV, kL, var3);
        this.ak();
        a(var1 + 1, kL);
        this.ak();
    }

    private void L(int var1) {
        kL = a(var1 + 1);
        if (kL == null) {
            jj = 3;
            this.jk = 2;
            jr = 0;
            js = 0;
            this.jK = 0;
            this.jL = 0;
            this.jI = 1024;
            this.jJ = 1024;
            this.jM = 0;
            this.jv = 0;
            this.jw = 0;
            this.jt = 0;
            this.ju = 0;
            jl = 0;
            jm = 0;
            this.dT = 0;
            this.dU = 0;
            jN = 0;
            this.jO = 0;
            jA = 0;
            this.jV = 0;
        } else {
            jl = (byte)a(kL, 0);
            jm = (byte)a(kL, 4);
            jj = (byte)a(kL, 8);
            this.jk = (byte)a(kL, 12);
            if (jj < 3) {
                jj = 3;
            }

            if (this.jk < 2) {
                this.jk = 2;
            }

            jr = (byte)a(kL, 16);
            js = (byte)a(kL, 20);
            this.jK = a(kL, 24);
            this.jL = a(kL, 28);
            this.jI = this.jK * 192 + 1024;
            this.jJ = this.jL * 192 + 1024;
            this.jM = a(kL, 32);
            this.jv = a(kL, 36);
            this.jw = a(kL, 40);
            this.jt = a(kL, 44);
            this.ju = a(kL, 48);
            this.dU = a(kL, 52);
            this.dT = this.dU;
            jN = a(kL, 56);
            this.jO = a(kL, 60);
            jA = a(kL, 64);
            this.jV = a(kL, 68);
        }

        this.ak();
    }

    private void ak() {
        for(int var1 = 0; var1 < 10; ++var1) {
            if (var1 <= this.dU) {
                int var10001 = 9 + var1;
                int[] var10002 = kR;
                kR[var10001] = var10002[9 + var1] |= 50331648;
            } else {
                kR[9 + var1] &= -50331649;
            }
        }

    }

    private static int a(int var0, byte[] var1, int var2) {
        var1[var2++] = (byte)(var0 >> 24 & 255);
        var1[var2++] = (byte)(var0 >> 16 & 255);
        var1[var2++] = (byte)(var0 >> 8 & 255);
        var1[var2++] = (byte)(var0 & 255);
        return var2;
    }

    private static int a(byte[] var0, int var1) {
        return ((var0[0 + var1] & 255) << 24) + ((var0[1 + var1] & 255) << 16) + ((var0[2 + var1] & 255) << 8) + (var0[3 + var1] & 255);
    }

    private void al() {
        int var2 = width - (this.kP - (this.kP >> 2));
        if (kM == null) {
            kM = new byte[var2 * 182];
            kN = new int[var2 * 182];
        }

        int var3 = 0;
        int var4;
        if (kO) {
            for(var4 = 0; var4 < var2; ++var4) {
                if ((var4 & 3) == 0) {
                    var3 = bQ.nextInt();
                } else {
                    var3 >>= 8;
                }

                kM[var4 + 181 * var2] = (byte)(var3 & 255);
                kM[var4 + 180 * var2] = (byte)Math.max(0, (kM[var4 + 181 * var2] & 255) - 4);
                kO = false;
            }
        } else {
            kO = true;
        }

        int var5;
        int var6;
        int var7;
        for(var5 = 1; var5 < 181; ++var5) {
            int var1 = var5 * var2;

            for(var6 = 0; var6 < var2; ++var6) {
                var4 = var6 + var1;
                var7 = (kM[var4] & 255) + (kM[var4 + var2] & 255);
                if (var5 > 45) {
                    var7 = var7 + (kM[var4 + 1] & 255) + (kM[var4 - 1] & 255) >> 2;
                } else {
                    var7 >>= 1;
                }

                --var7;
                if (var7 < 0) {
                    var7 = 0;
                }

                kM[var4 - var2] = (byte)var7;
            }
        }

        var5 = 0;

        for(var7 = 0; var7 < 182; ++var7) {
            for(int var8 = 0; var8 < var2; ++var8) {
                var6 = Math.max(kM[var5] & 255, 0);
                kN[var5] = cb[var6];
                ++var5;
            }
        }

    }

    private void b(Graphics var1, boolean var2) {
        this.al();
        int var3 = var2 ? 0 : 151;
        //TODO: Fix screen updates outside of original bounds
        int var4 = var2 ? (height - 194) : 227;
        a(var1, kN, 0, width - (this.kP - (this.kP >> 2)), var3, var4, width - (this.kP - (this.kP >> 2) + 1), 182, false);
    }

    private void a(Graphics var1, int var2, int var3) {
        this.kV = var3;
        this.kU = var2;
        this.a(this.bt);
        var1.setColor(0);
        var1.fillRect(0, (height - 14), width, 14);
        var1.setColor(9787452);
        var1.drawLine(0, (height - 14), width, (height - 14));
        var1.setColor(4269078);
        var1.drawLine(0, (height - 13), width, (height - 13));
        if ((this.cd == this.ck && this.ce == this.cl || x == 106) && this.cI < 0 && (!in || x == 102)) {
            if (var2 != -1) {
                this.drawButtonString(var1, 0, var2, 2);
            }

            if (var3 != -1) {
                this.drawButtonString(var1, width, var3, 0);
            }

            if (x == 100) {
                if (!bR) {
                    if (this.jf == -1 || this.fB[this.jf] <= 0 && this.jg <= 0) {
                        if (jd > 1 && this.je > 0 && x == 100 && this.ce <= 0 && this.kQ < jd) {
                            this.drawString(var1, jd + " " + this.getResourceString(171), halfWidth, (height - 14) + bE - 6, 1);
                        }
                    } else {
                        String var4 = this.fB[this.jf] - fA[this.jf] + " " + this.getResourceString(195);
                        int var5 = this.a(var4);
                        if (ji && this.fB[this.jf] > 0) {
                            this.drawString(var1, var4, halfWidth, (height - 14) + bE - 6, 1);
                        }

                        if (this.jf >= 0 && this.fB[this.jf] > 0) {
                            int var6 = halfWidth - (var5 >> 1) - 7;
                            int var7 = halfWidth + (var5 >> 1) + 7;
                            var1.setColor(13868629);
                            var1.drawLine(var6 - 8, (height - 13), var6 - 8, height);
                            var1.drawLine(var7 + 8, (height - 13), var7 + 8, height);
                            var1.setColor(14116120);
                            var1.drawLine(var6 - 7, (height - 13), var6 - 7, height);
                            var1.drawLine(var7 + 7, (height - 13), var7 + 7, height);
                            var1.setColor(14114838);
                            var1.drawLine(var6 - 6, (height - 13), var6 - 6, height);
                            var1.drawLine(var7 + 6, (height - 13), var7 + 6, height);
                            var1.setColor(14111501);
                            var1.drawLine(var6 - 5, (height - 13), var6 - 5, height);
                            var1.drawLine(var7 + 5, (height - 13), var7 + 5, height);
                            var1.setColor(14172934);
                            var1.drawLine(var6 - 4, (height - 13), var6 - 4, height);
                            var1.drawLine(var7 + 4, (height - 13), var7 + 4, height);
                            var1.setColor(14038016);
                            var1.drawLine(var6 - 3, (height - 13), var6 - 3, height);
                            var1.drawLine(var7 + 3, (height - 13), var7 + 3, height);
                            var1.setColor(13116929);
                            var1.drawLine(var6 - 2, (height - 13), var6 - 2, height);
                            var1.drawLine(var7 + 2, (height - 13), var7 + 2, height);
                            var1.setColor(10885383);
                            var1.drawLine(var6 - 1, (height - 13), var6 - 1, height);
                            var1.drawLine(var7 + 1, (height - 13), var7 + 1, height);
                            var1.setColor(7146758);
                            var1.drawLine(var6, (height - 13), var6, height);
                            var1.drawLine(var7, (height - 13), var7, height);
                        }
                    }
                } else if (this.gd >= 1000) {
                    this.drawString(var1, this.getResourceString(275), halfWidth, (height - 14) + bE - 6, 1);
                } else {
                    this.drawString(var1, this.getResourceString(246) + this.gd, halfWidth, (height - 14) + bE - 6, 1);
                }
            } else {
                this.kW = true;
            }
        }

        this.kW = false;
    }

    private void drawButtonString(Graphics var1, int var2, int resourceIndex, int var4) {
        String var5 = this.getResourceString(resourceIndex);
        this.drawString(var1, var5, var2 - (var4 == 0 ? this.a(var5) + 3 : -3), (height - 14) + bE - 6, 20);
    }

    private void a(Graphics var0, int var1, int var2, boolean var3) {
        if (x != 1) {
            var2 -= 2;
            var1 -= 2;
        }

        int var4 = 398;
        if (x == 1) {
            var4 = bL + 5 + (bD >> 2);
            if (bR) {
                var4 += bD + (bD >> 2);
            }
        }

        int var5 = var2 * 5 + (var2 + 1) * 2 - 1;
        int var6 = (width - var5) / 2;
        var0.setColor(0);
        var0.fillRect(var6 - 1, var4 - 1, var5 + 3, 13);
        var0.setColor(15690496);
        var0.drawRect(var6, var4, var5, 10);
        var0.setColor(16711680);
        var4 += 2;
        var6 += 2;
        int var7;
        if (var3) {
            for(var7 = 0; var7 < var1; ++var7) {
                var0.fillRect(var6, var4, 5, 7);
                var6 += 7;
            }
        }

        var0.setColor(3737600);
        int var10000 = var3 ? var1 : 0;
        var7 = var3 ? var1 : 0;

        for(int var8 = var10000 < 0 ? 0 : var7; var8 < var2; ++var8) {
            if (!var3) {
                if (var8 == var1) {
                    var0.setColor(16711680);
                } else {
                    var0.setColor(3737600);
                }
            }

            var0.fillRect(var6, var4, 5, 7);
            var6 += 7;
        }

    }

    private void am() {
        byte[] var1;
        int var2;
        kR = new int[var2 = (var1 = this.c(1028)).length >> 2];

        for(int var3 = var2 - 1; var3 >= 0; --var3) {
            int var4 = var3 << 2;
            kR[var3] = ((var1[var4] & 255) << 24) + ((var1[var4 + 1] & 255) << 16) + ((var1[var4 + 2] & 255) << 8) + (var1[var4 + 3] & 255);
        }

    }

    private static int o(int var0, int var1) {
        int var2 = var0;

        while(var0 < kR.length && (kR[var0] & 4194304) == 0) {
            ++var0;
            if ((kR[var0] & var1) != 0) {
                return var0;
            }

            if ((kR[var0] & 4194304) != 0) {
                return var2;
            }
        }

        return var2;
    }

    private static int p(int var0, int var1) {
        int var2 = var0;

        do {
            if ((kR[var0] & 8388608) == 0) {
                --var0;
                if ((kR[var0] & var1) != 0) {
                    var2 = var0;
                }
            }

            if ((kR[var0] & 8388608) != 0 && (kR[var0] & var1) == 0) {
                return var2;
            }
        } while((kR[var0] & var1) == 0);

        return var2;
    }

    private void an() {
        int var1 = kS;
        int var2;
        int var3 = (var2 = kR[kS]) >> 26;
        int var4 = var2 >> 8 & 255;
        switch (var3) {
            case 0:
                if (this.bv == 8 || this.bv == 27) {
                    if (var4 == 9 && this.dT == 0) {
                        bR = false;
                        this.dT = 0;
                        this.dR = 9217;
                        this.c(bL, bL, 35, 35);
                        x = 1;
                        this.ag();
                        this.soundManager.o();
                        this.bz = false;
                        this.cg = true;
                    } else {
                        var1 = var4;
                    }
                }
                break;
            case 1:
                if (this.bv == 8 || this.bv == 27) {
                    this.soundManager.setMuteState(!this.soundManager.n());
                    bp = this.soundManager.n();
                    if (!this.soundManager.n()) {
                        this.kn = false;
                    }

                    this.playSound(0);
                }
            case 2:
            case 7:
            default:
                break;
            case 3:
                if (this.bv == 8 || this.bv == 27) {
                    this.cs = false;
                    this.ct = true;
                    this.c(bL, bL, 35, 35);
                }
                break;
            case 4:
                if (this.bv == 8 || this.bv == 27) {
                    this.cs = true;
                    this.ct = true;
                    this.c(bL, bL, 35, 35);
                }
                break;
            case 5:
                if (this.bv == 8 || this.bv == 27) {
                    this.dT = kS - this.lc;
                    this.dp = false;
                    this.dR = dS[this.dT];
                    bR = false;
                    this.c(bL, bL, 35, 35);
                    x = 1;
                    this.bz = false;
                    this.ag();
                    this.ai();
                }
                break;
            case 6:
                if (this.bv == 8 || this.bv == 27) {
                    this.dR = 9216;
                    this.dT = 0;
                    this.gd = 0;
                    bR = true;
                    this.c(bL, bL, 35, 35);
                    x = 1;
                    this.bz = false;
                    this.ag();
                    this.ai();
                }
                break;
            case 8:
                if (this.bv == 8 || this.bv == 27) {
                    this.ap();
                }
                break;
            case 9:
                if (this.bv == 8 || this.bv == 27) {
                    this.c(false);
                    x = this.y;
                }
                break;
            case 10:
                if (this.bv == 8 || this.bv == 27) {
                    this.ag();
                    this.playSound(0);
                    this.b((DataInputStream)null);
                    this.K(1);
                    this.kT = kS;
                    var1 = var4;
                }
                break;
            case 11:
                if (this.bv == 8 || this.bv == 27 || this.bv == 29) {
                    if (this.bv != 29) {
                        if (this.kY) {
                            lg = true;
                            this.platformRequest(this.bx);
                            this.ap();
                        } else {
                            byte[] var5 = new byte[76];
                            a(2, var5);
                            this.L(1);
                        }
                    }

                    var1 = var4;
                    if (this.kY) {
                        var1 = 0;
                        this.kY = false;
                    }
                }
                break;
            case 12:
                if (this.bv == 8 || this.bv == 27) {
                    ++bA;
                    if (bA > 5) {
                        bA = 0;
                    }

                    this.h(bB[bA]);
                    this.kW = true;
                }
        }

        if (this.bv != 0) {
            this.le = false;
            this.kX = true;
        }

        if (this.bv == 2) {
            var1 = p(var1, 33554432);
        }

        if (this.bv == 5) {
            var1 = o(var1, 33554432);
        }

        if (this.d_o) {
            this.le = false;
            ++kS;
            ++this.dT;
            if (this.dT > this.dU) {
                this.dU = this.dT;
            }

            ++this.dR;
            x = 1;
            this.co = true;
            this.bz = false;
            this.ai();
        }

        if (this.bv == 29 && var3 != 11) {
            if (this.kV != 2 && this.kV != 29) {
                if (this.kV == 1) {
                    var1 = 23;
                }
            } else {
                var1 = this.kT;
                this.le = false;
            }
        } else if (this.bv == 27 && var3 == 0 && this.kU == 0 && (var4 != 9 || this.dT != 0)) {
            var1 = var4;
            this.le = false;
        }

        if (kS != var1) {
            kS = var1;
            if ((kR[kS] & 33554432) == 0) {
                kS = o(var1, 33554432);
            }

            this.j();
        }

    }

    private void ao() {
        if (this.bv == 8 || this.bv == 27) {
            int var1 = kR[kS];
            this.kX = true;
            switch (var1 & 255) {
                case 5:
                    this.kY = true;
            }
        }

    }

    private void ap() {
        if (x != 0 && x != 79 && !lg) {
            this.K(1);
        }

        this.o(3);
    }

    private void z(Graphics var1) {
        int var2 = 0;
        int var3 = 0;
        //i think this looks stupid
        //if (this.width > this.height) {
        //    var2 = -(this.width >> 3);
        //}

        if (this.kX || (this.cd > 0 || this.cu) && this.le && x != 1) {
            this.y(var1);
        }

        this.a(this.bs);
        this.drawString(var1, this.getResourceString(274), halfWidth + var2, this.bu[0].aX + this.bu[1].aX, 1);
        this.a(this.br);
        int var4 = kS;
        int var6 = 0;

        while(var4 == 1 || var4 > 1 && (kR[var4] & 8388608) == 0) {
            --var4;
            if ((kR[var4] & 16777216) != 0) {
                ++var6;
            }
        }

        int var7 = var4;
        var4 = kS;

        int var8;
        for(var8 = 0; var8 < var6; ++var8) {
            var4 = p(var4, 16777216);
        }

        this.lc = var4;

        for(var8 = 0; var8 < var6; ++var8) {
            var4 = p(var4, 33554432);
        }

        this.ld = var4;
        this.kZ = 0;
        int var10 = var4;
        int var11 = var4;
        if (this.le && this.cd <= 0 && !this.cu) {
            this.a(var1, 0, 220, width, 182);
        } else {
            this.b(var1);
        }

        this.b(var1, true);

        for(int var13 = this.le && this.cd <= 0 && !this.cu ? 2 : 0; var13 <= 4; ++var13) {
            this.bu[var13].a(var1, var13 < 2 ? halfWidth + var2 : this.width + 0, var13 < 2 ? 0 : this.height, 0);
        }

        if (this.cu) {
            this.cu = false;
        }

        this.le = true;
        this.lb = this.bu[0].aX + this.bu[1].aX + (bD << 1);
        if (-this.bu[2].aV + this.lb >= this.height && var2 == 0) {
            var3 = -(this.width >> 3);
        }

        while(true) {
            if ((kR[var11] & 16777216) != 0) {
                var10 = var11;
            }

            if ((kR[var11] & 33554432) != 0) {
                var7 = var11;
            }

            if ((kR[var11] & 4194304) != 0) {
                this.kZ = this.width < this.kZ ? this.width : this.kZ;
                this.la = halfWidth;
                var1.setColor(0, 0, 255);
                var4 = this.lc;
                this.a(this.br);

                boolean var16;
                do {
                    int var9;
                    int var5 = (var9 = kR[var4]) >> 26;
                    if ((var9 & 16777216) != 0) {
                        int var14;
                        if ((var14 = var9 & 255) == 23) {
                            int var15 = bA + 1 > 5 ? 0 : bA + 1;
                            var14 = bC[var15];
                        }

                        String var17 = this.getResourceString(var14);
                        switch (var5) {
                            case 1:
                                var17 = var17 + " " + (bp ? this.getResourceString(234) : this.getResourceString(235));
                            case 0:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                                if (var4 == kS) {
                                    if (var14 != 28 && var14 != 29) {
                                        if (var4 > this.ld) {
                                            dz[2].a(var1, halfWidth - this.lf - (dz[2].aW << 1) + var2 + var3, this.lb + (bD >> 3) + 1, 0);
                                        }

                                        this.drawString(var1, var17, this.la + var2 + var3, this.lb, 1);
                                        if (var4 < var7) {
                                            dz[3].a(var1, halfWidth + this.lf + dz[3].aW + var2 + var3, this.lb + (bD >> 3) + 1, 0);
                                        }
                                    }

                                    this.lb += bD + (bD >> 2);
                                }
                            case 2:
                            case 7:
                        }
                    }

                    if (var16 = var4 < var10) {
                        var4 = o(var4, 16777216);
                    }
                } while(var16);

                return;
            }

            ++var11;
        }
    }
}
