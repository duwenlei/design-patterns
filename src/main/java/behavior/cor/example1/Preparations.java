package behavior.cor.example1;

/**
 * 准备工作
 *
 * @author duwenlei
 * @version 1.0
 * @ClassName Preparations
 * @Date 2023/9/5 16:22
 * @Description TODO
 */
public class Preparations {
    /**
     * 刷牙
     */
    private boolean brushTooth;

    /**
     * 洗脸
     */
    private boolean washFace;

    /**
     * 穿衣服
     */
    private boolean dressed;

    public boolean isBrushTooth() {
        return brushTooth;
    }

    public void setBrushTooth(boolean brushTooth) {
        this.brushTooth = brushTooth;
    }

    public boolean isWashFace() {
        return washFace;
    }

    public void setWashFace(boolean washFace) {
        this.washFace = washFace;
    }

    public boolean isDressed() {
        return dressed;
    }

    public void setDressed(boolean dressed) {
        this.dressed = dressed;
    }
}
