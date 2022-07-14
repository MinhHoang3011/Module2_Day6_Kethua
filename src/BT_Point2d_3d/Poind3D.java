public class Poind3D extends Poind2D {
    private float z= 0.0f;
    public Poind3D(){
    }
    public Poind3D(float x, float y, float z){
        super(x,y);
        this.z= z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z= z;
    }
    public float[] getXYZ(){
        float[] array={getX(),getY(),z};
        return array;
    }
    public String toString(){
        return super.toString()+" "+ z;
    }
}
