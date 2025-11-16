public class temp {
    int n;
    float celsius;
    float fahrenheit;

    temp(){

    }
    public void f(float celsius){
        fahrenheit = (celsius * 9/5) + 32;
    }
    temp(int n, float celsius, float fahrenheit){
        this.n = n;
        this.celsius = celsius ;
        this.fahrenheit = fahrenheit;
    }

    public void tempDetails(){
        System.out.println("City " + n + "\n");
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "\n");
    }
 
}
