//P3.4

package app;

public class Sheet {
    private int width;
    private int height;
    private String name;

    public Sheet() {
        width = 841;
        height = 1189;
        name = "A0";
    }

    public Sheet cutInHalf() {
        Sheet halfSheet = new Sheet();
        halfSheet.width = width / 2;
        halfSheet.height = height;
        halfSheet.name = "A1";
        return halfSheet;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public String name() {
        return name;
    }
}
