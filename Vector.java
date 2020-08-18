import java.lang.Math; 

public class Vector{
    private float[] vector = new float[2];
    public Vector(float[] vector){
        this.vector = vector;
    }
    public float getDir(){
        return (float)Math.atan2((double)vector[1], (double)vector[0]);
    }
    public void turnby(){
        
    }
    static Vector mult(Vector Vec, float scalar){
        float[] input = {Vec.get()[0]*scalar,Vec.get()[1]*scalar};
        Vector ret = new Vector(input);
        return ret;
    }
    public void mult(float scalar){
        vector[0] = vector[0]*scalar;
        vector[1] = vector[1]*scalar;
    }
    static Vector add(Vector Vec, float scalar){
        float[] input = {Vec.get()[0]+scalar,Vec.get()[1]+scalar};
        Vector ret = new Vector(input);
        return ret;
    }
    public void add(float scalar){
        vector[0] = vector[0]+scalar;
        vector[1] = vector[1]+scalar;
    }
    static Vector div(Vector Vec, float scalar){
        float[] input = {Vec.get()[0]/scalar,Vec.get()[1]/scalar};
        Vector ret = new Vector(input);
        return ret;
    }
    public void div(float scalar){
        vector[0] = vector[0]/scalar;
        vector[1] = vector[1]/scalar;
    }
    static Vector sub(Vector Vec, float scalar){
        float[] input = {Vec.get()[0]-scalar,Vec.get()[1]-scalar};
        Vector ret = new Vector(input);
        return ret;
    }
    public void sub(float scalar){
        vector[0] = vector[0]-scalar;
        vector[1] = vector[1]-scalar;
    }
    static Vector unit(Vector Vec){
        Vector ret = Vector.div(Vec, self.getMag());
        return ret;
    }
    public void unit(){
        self.div(self.getMag());
    }
    public float getMag(){
        return Math.sqrt((double)(Math.pow((double)vector[0], 2)+Math.pow((double)vector[1], 2)));
    }
    public float[] get(){
        return self.vector;
    }

    
}