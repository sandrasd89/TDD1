public class Coche {
    public int velocidad_Sandra_Saez;

    public void acelerar_Sandra_Saez(int aceleracion) {
        velocidad_Sandra_Saez += aceleracion;
    }

    public void decelerar_Sandra_saez(int deceleracion) {
        velocidad_Sandra_Saez -= deceleracion;
        if (velocidad_Sandra_Saez < 0) velocidad_Sandra_Saez = 0;
    }
}
