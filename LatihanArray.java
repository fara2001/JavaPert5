//Nama : Fahmi Rasyied
//NIM : 191011400421

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; 
public class LatihanArray{
public static void main( String[] args ){
    System.out.println("Nama : Fahmi Rasyied");
    System.out.println("NIM : 191011400421");
BufferedReader dataIn = new BufferedReader(new
InputStreamReader(System.in));
String BacaInput = "";
Byte JmlData = 0;
Byte DataArray[];
System.out.print("Jumlah data :");
try{
BacaInput = dataIn.readLine();
}
catch( IOException e ){
System.out.println("Ada kesalahan !");
}
JmlData = new Byte (BacaInput);
DataArray = new Byte[JmlData];
//Membaca data dari keyboard
System.out.println();
for (Byte i = 0;i<JmlData;i++){
System.out.print("DataArray["+i+"] = ");
try{
BacaInput = dataIn.readLine();
}
catch( IOException e ){
System.out.println("Ada kesalahan !");
}
DataArray[i] = new Byte (BacaInput);
}
//Menampilkan data dari array
System.out.println();
for (Byte i = 0;i<JmlData;i++){
System.out.println("DataArray["+i+"] = "+DataArray[i]);
} 
Arrays.sort(DataArray);
System.out.println("Setelah Diurutkan dari terkecil ke terbesar menjadi : ");  
for (int i = 0; i < DataArray.length; i++)   
{       
System.out.println(DataArray[i]);   
}
System.out.println("Setelah Diurutkan dari terbesar ke terkecil menjadi : ");
for (int i = DataArray.length-1; i>=0; i--)   
{       
System.out.println(DataArray[i]);   
}

int i;
int nambah;
int lokasi = 1;
int maksimum;
int minimum;
int ngurang;
maksimum = DataArray[0];
minimum = DataArray[0];
nambah = lokasi+1;
ngurang = lokasi-1;
    for(i = 0; i < JmlData; i++) {
      if (DataArray[i] > maksimum){
        maksimum = DataArray[i];
        lokasi = i+1;
      }
    }
    for(i = 0; i < JmlData; i++) {
        if (DataArray[i] < minimum){
          minimum = DataArray[i];
          lokasi = i+1;
        }
      }
    System.out.println("Nilai maksimum adalah " +maksimum);
    System.out.println("Nilai minimum adalah " +minimum);

}
}
