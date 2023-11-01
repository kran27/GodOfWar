//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.nokia.mid.sound.Sound;
import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

public final class d implements Runnable {
    private a be;
    private int bf;
    private volatile boolean bg;
    private int bh;
    private int bi;
    private int[] bj;
    private int[] bk;
    private Sound[] bl;
    private Sound bm;
    private Player[] bn;
    private Player bo;

    public final synchronized void shutdown() {
        if (!this.bg) {
            this.bg = true;
            this.u(-1);
        }

    }

    public final boolean n() {
        this.be.a(false);
        if (!this.bg) {
            if (this.be.N) {
                if (this.be.M) {
                    return true;
                }
            } else if (this.be.f) {
                return true;
            }
        }

        return false;
    }

    public final void b(boolean var1) {
        if (this.n() != var1) {
            if (this.be.N) {
                this.be.M = var1;
                return;
            }

            this.o();
            this.be.f = var1;
            this.be.a(true);
        }

    }

    private static String a(byte var0) {
        if (var0 == 14) {
            return "video/3gp";
        } else if (var0 == 15) {
            return "video/3gpp";
        } else if (var0 == 16) {
            return "video/h263-2000";
        } else if (var0 == 17) {
            return "video/h264";
        } else if (var0 == 19) {
            return "video/mpeg4";
        } else if (var0 == 20) {
            return "video/x-pn-realvideo";
        } else if (var0 == 1) {
            return "audio/x-wav";
        } else if (var0 == 2) {
            return "audio/mpeg";
        } else if (var0 == 3) {
            return "audio/amr";
        } else if (var0 == 4) {
            return "audio/aac";
        } else if (var0 == 7) {
            return "application/vnd.nokia.ringing-tone";
        } else {
            return var0 == 8 ? "audio/x-tone-seq" : "audio/midi";
        }
    }

    public final synchronized void run() {
        int var1;
        if (this.n() && this.be.f && (var1 = this.bh) >= 0) {
            if (this.bi >= 0) {
                this.o();
            }

            this.bh = -1;
            Player var2;
            if ((var2 = this.bn[var1]) != null) {
                try {
                    var2.prefetch();
                } catch (Throwable var8) {
                    return;
                }

                try {
                    var2.setMediaTime(0L);
                } catch (Throwable var7) {
                }

                try {
                    var2.setLoopCount(this.bj[var1]);
                } catch (Throwable var6) {
                }

                try {
                    var2.start();
                } catch (Throwable var5) {
                    return;
                }

                this.bo = var2;
            } else {
                Sound var3;
                if ((var3 = this.bl[var1]) != null) {
                    int var4 = this.bj[var1];
                    var3.play(var4 == -1 ? 0 : var4);
                }

                this.bm = var3;
            }

            this.bi = var1;
        }

    }

    public final synchronized void b(int var1, int var2, int var3, int var4) {
        if (!this.bg) {
            if (this.bl[var1] != null || this.bn[var1] != null) {
                this.u(var1);
            }

            this.bj[var1] = var3;
            this.bk[var1] = var4;

            try {
                byte[] var5 = this.be.p(var2);
                if (this.be.j[var2 & 1023] == 7) {
                    this.bl[var1] = new Sound(var5, 1);
                    return;
                }

                this.bn[var1] = Manager.createPlayer(new ByteArrayInputStream(var5), a(this.be.j[var2 & 1023]));
                this.bn[var1].realize();
                this.bn[var1].prefetch();
                return;
            } catch (Throwable var7) {
            }
        }

    }

    private synchronized void u(int var1) {
        if (var1 == -1) {
            for(var1 = 0; var1 < this.bf; ++var1) {
                this.u(var1);
            }

        } else {
            if (this.bi == var1 || this.bh == var1) {
                this.o();
            }

            if (this.bn[var1] != null) {
                this.bn[var1].close();
                this.bn[var1] = null;
            }

            if (this.bl[var1] != null) {
                this.bl[var1].release();
                this.bl[var1] = null;
            }

        }
    }

    public final void v(int var1) {
        if (this.n() && this.be.f && (this.bl[var1] != null || this.bn[var1] != null) && (this.bh < 0 || this.bk[this.bh] <= this.bk[var1])) {
            int var2;
            if ((var2 = this.bi) >= 0) {
                Player var3;
                if ((var3 = this.bo) != null && var3.getState() == 400 && this.bk[var2] > this.bk[var1]) {
                    return;
                }

                Sound var4;
                if ((var4 = this.bm) != null && var4.getState() == 0 && this.bk[var2] > this.bk[var1]) {
                    return;
                }
            }

            this.bh = var1;
        }

    }

    public final synchronized void o() {
        if (this.bo != null) {
            try {
                if (this.bo.getState() == 400) {
                    this.bo.stop();
                }
            } catch (Throwable var2) {
            }

            this.bo = null;
        }

        if (this.bm != null) {
            try {
                if (this.bm.getState() == 0) {
                    this.bm.stop();
                }
            } catch (Throwable var1) {
            }

            this.bm = null;
        }

        this.bh = -1;
        this.bi = -1;
    }

    public d(a var1, int var2) {
        this.be = var1;
        this.bh = -1;
        this.bi = -1;
        this.bf = var2;
        this.bj = new int[var2];
        this.bk = new int[var2];
        this.bl = new Sound[var2];
        this.bn = new Player[var2];
        var1.d = (d)this;
    }
}
