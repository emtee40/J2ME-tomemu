package javax.microedition.lcdui;

import java.util.Vector;

public abstract class Canvas extends Displayable {

    public static final int UP = 1;
    public static final int DOWN = 6;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int FIRE = 8;
    public static final int GAME_A = 9;
    public static final int GAME_B = 10;
    public static final int GAME_C = 11;
    public static final int GAME_D = 12;
    public static final int KEY_NUM0 = 48;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;
    private boolean suppressKeyEvents;
    private int embeddedPlayers;
    private Vector mmList;

    public Canvas() {
        //compiled code
        System.out.println("Compiled Code");
    }

    public boolean isDoubleBuffered() {
        //compiled code
        System.out.println("Compiled Code");
        return false;
    }

    public boolean hasPointerEvents() {
        //compiled code
        System.out.println("Compiled Code");
        return false;
    }

    public boolean hasPointerMotionEvents() {
        //compiled code
        System.out.println("Compiled Code");
        return false;
    }

    public boolean hasRepeatEvents() {
        //compiled code
        System.out.println("Compiled Code");
        return true;
    }

    public int getKeyCode(int gameAction) {
        //compiled code
        System.out.println("Compiled Code");
        return 0;
    }

    public String getKeyName(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
        return "";
    }

    public int getGameAction(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
        return keyCode;
    }

    public void setFullScreenMode(boolean mode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void keyPressed(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void keyRepeated(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void keyReleased(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void pointerPressed(int x, int y) {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void pointerReleased(int x, int y) {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void pointerDragged(int x, int y) {
        //compiled code
        System.out.println("Compiled Code");
    }

    public final void serviceRepaints() {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void showNotify() {
        //compiled code
        System.out.println("Compiled Code");
    }

    protected void hideNotify() {
        //compiled code
        System.out.println("Compiled Code");
    }
    
    protected void sizeChanged(int w, int h) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callShowNotify(Display d) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callHideNotify(Display d) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callPaint(Graphics g, Object target) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callSizeChanged(int w, int h) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callKeyPressed(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callKeyReleased(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callKeyRepeated(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
    }

    private boolean allowKey(int keyCode) {
        //compiled code
        System.out.println("Compiled Code");
        return false;
    }

    void callPointerPressed(int x, int y) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callPointerReleased(int x, int y) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void callPointerDragged(int x, int y) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void incEmbeddedPlayers(int count) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void addMMListener(Object mmil) {
        //compiled code
        System.out.println("Compiled Code");
    }

    void mmSetVisible(boolean vis) {
        //compiled code
        System.out.println("Compiled Code");
    }
}
