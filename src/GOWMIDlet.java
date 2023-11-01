//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GOWMIDlet extends MIDlet {
    private a be;

    public GOWMIDlet() {
    }

    public void startApp() {
        if (this.be == null) {
            this.be = new e(this);
            Display.getDisplay(this).setCurrent(this.be);
        } else {
            this.be.showNotify();
        }
    }

    public void destroyApp(boolean var1) {
        this.be.o(3);
    }

    public void pauseApp() {
        this.be.hideNotify();
    }
}
