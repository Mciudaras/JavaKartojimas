package PirmaPaskaita;

/**
 * Created by Mindaugas on 2017-04-05.
 */
public class KMI {
    private float weight;
    private float height;

    public KMI(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public float KMI(){
        return weight / (height * height);
    }
}
