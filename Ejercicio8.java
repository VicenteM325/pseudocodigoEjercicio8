public class Ejercicio8{
    public static void main(String[] args){
    int contador = 0;
    do{
        int aleatorio = (int)(Math.random()*100+1);
        if(aleatorio % 5 == 0){
            System.out.println( aleatorio + "");
            try {
       
                 Thread.sleep(5*20);
                 }
                    catch (Exception e) {
                    System.out.println(e);
                }
            contador ++;
        }
    }while(contador < 300);
    }
}