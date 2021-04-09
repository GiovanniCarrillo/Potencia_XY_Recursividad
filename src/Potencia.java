public class Potencia {
    private int cont=0;

    public int potXY(int x, int y){
        if(cont<y){
            cont++;
            return x*potXY(x,y);
        }
            return 1;
        
    }
}
