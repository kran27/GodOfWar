//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.nokia.mid.ui.DirectUtils;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class c {
    private static final short[] aS = new short[]{0, 16384, 8192, 24576};
    private Image aT;
    public short aU;
    public short aV;
    public short aW;
    public short aX;
    public short aY;
    public short aZ;
    public short ba;
    public short bb;
    public short bc;
    public short bd;

    public c(Image var1) {
        this.aT = var1;
    }

    public final void a(short[] var1) {
        this.aU = var1[0];
        this.aV = var1[1];
        this.bc = var1[2];
        this.bd = var1[3];
        this.aW = var1[4];
        this.aX = var1[5];
        this.aY = var1[6];
        this.aZ = var1[7];
        this.ba = var1[8];
        this.bb = var1[9];
    }

    public final void a(Graphics var1, int var2, int var3, int var4) {
        var2 += (var4 & 2) == 0 ? this.aU : -(this.aU + this.aW);
        var3 += (var4 & 1) == 0 ? this.aV : -(this.aV + this.aX);
        int var5 = var1.getClipX();
        int var6 = var1.getClipY();
        int var7 = var1.getClipWidth();
        int var8 = var1.getClipHeight();
        int var9 = 0;
        int var10 = 0;
        if (var4 != 0) {
            var9 = var1.getTranslateX();
            var10 = var1.getTranslateY();
            if (var9 != 0 || var10 != 0) {
                var1.translate(-var9, -var10);
                var2 += var9;
                var3 += var10;
                var1.setClip(var5 + var9, var6 + var10, var7, var8);
            }
        }

        var1.clipRect(var2, var3, this.aW, this.aX);
        var2 += (var4 & 2) == 0 ? -this.bc : this.bc + this.aW - this.aT.getWidth();
        var3 += (var4 & 1) == 0 ? -this.bd : this.bd + this.aX - this.aT.getHeight();
        if (var4 == 0) {
            var1.drawImage(this.aT, var2, var3, 20);
        } else {
            DirectUtils.getDirectGraphics(var1).drawImage(this.aT, var2, var3, 20, aS[var4]);
        }

        if (var4 != 0 && (var9 != 0 || var10 != 0)) {
            var1.translate(var9, var10);
        }

        var1.setClip(var5, var6, var7, var8);
    }

    public final int s(int var1) {
        return (var1 & 2) == 0 ? this.aU : -(this.aU + this.aW);
    }

    public final int t(int var1) {
        return (var1 & 1) == 0 ? this.aV : -(this.aV + this.aX);
    }
}
