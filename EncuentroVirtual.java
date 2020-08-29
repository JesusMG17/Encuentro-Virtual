import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
class personal
{
private static final char[] Telefono = null;
private String Nombre,Apellidos,Ciudad,Titulación;
private int Identificacion, telefono, Cedula;


//CONSTRUCTOR
public personal (String n,String a,String c,String t,int g,int f){
Identificacion=g;
Nombre=n;
Apellidos=a;
Titulación=t;
setCiudad(c);
setTelefono(f);

}
public personal(String n, String c, String a, String f, String t, int parseInt) {
	// TODO Auto-generated constructor stub
}
//MÉTODO
public void muestra(){
System.out.println("El nombre introducido es: " );
System.out.println(Nombre);
System.out.println("Los apellidos introducido son: " );
System.out.println(Apellidos);
System.out.println("Su titulacion introducido es: " );
System.out.println(Titulación);
System.out.println("Su indetificacion introducida es: " );
System.out.println(Identificacion);
System.out.println("Su telefono introducido es: " );
System.out.println(Telefono);
}
public String getCiudad() {
	return Ciudad;
}
public void setCiudad(String ciudad) {
	Ciudad = ciudad;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public int getCedula() {
	return Cedula;
}
public void setCedula(int cedula) {
	Cedula = cedula;
}
}
public class Persona{
//PROGRAMA PRINCIPAL, SE INTRODUCEN LOS DATOS
public static void main(String args[])throws IOException{

String n,t,a,c,f;
InputStreamReader k = new InputStreamReader(System.in);//ENTRADA POR TECLADO LÍNEA A LÍNEA
BufferedReader q = new BufferedReader(k);
System.out.println("Por favor intrduzca el nombre: ");
n=q.readLine();
System.out.println("Por favor introduzca sus apellidos: ");
c=q.readLine();
System.out.println("Por favor introduzca su ciudad: ");
a=q.readLine();
System.out.println("Por favor introduzca su titulacion: ");
t=q.readLine();
System.out.println("Por favor introduzca su telefono: ");
f = q.readLine();
personal Alumno= new personal(n,c,a,f,t,Integer.parseInt(t));
Alumno.muestra();
}

public static void main1(String[] args) {

    //Instanciamos el objeto Calendar
    //en fecha obtenemos la fecha y hora del sistema
    Calendar fecha = new GregorianCalendar();

    //Obtenemos el valor del año, mes, día,
    //hora, minuto y segundo del sistema
    //usando el método get y el parámetro correspondiente                                                     
    int año = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH);
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    int hora = fecha.get(Calendar.HOUR_OF_DAY);
    int minuto = fecha.get(Calendar.MINUTE);
    int segundo = fecha.get(Calendar.SECOND);

    //Mostramos por pantalla dia/mes/año
    System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + año);
    
    //Mostramos por pantalla hora:minuto:segundo
    System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);                               
}
}                         

