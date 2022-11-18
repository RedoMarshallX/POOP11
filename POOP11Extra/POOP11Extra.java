package poop11extra;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POOP11Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construcción de alumnos
        Alumno alu1 = new Alumno("Isaías","Rosas","Meza","319005481","19");
        Alumno alu2 = new Alumno("Jean","Garcia","Soto","319105739","20");
        Alumno alu3 = new Alumno("Arturo","Meza","Sánchez","3198627","20");
        Alumno alu4 = new Alumno("Diana","Nava","Pineda","32943681","21");
        Alumno alu5 = new Alumno("Balam","Diaz","Zamacona","23654892","25");
        Alumno alu6 = new Alumno("Thomas","Pérez","Marquez","145678950","22");
        Alumno alu7 = new Alumno("Jose","Ayub","Pliego","5976152","23");
        Alumno alu8 = new Alumno("Bruno","Gonzalez","Madrigal","245789263","26");
        Alumno alu9 = new Alumno("Vania","Carranza","Ramírez","324796256","19");
        Alumno alu10 = new Alumno("Miguel","Estrada","Cortés","943126407","18");
        List<Object> lista = new ArrayList<>();
        lista.add(alu1);
        lista.add(alu2);
        lista. add(alu3);
        lista. add(alu4);
        lista. add(alu5);
        lista. add(alu6);
        lista. add(alu7);
        lista. add(alu8);
        lista. add(alu9);
        lista. add(alu10);
        ListIterator<Object> iterador=lista.listIterator();
        // Generación del archivo
        try{
            FileWriter fw = new FileWriter("listaAlumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            while(iterador.hasNext()){
            salida.println(iterador.next());
            }
            salida.close();
            fw.close();
            bw.close();
        }catch(IOException ex) {
            Logger.getLogger(POOP11Extra.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Lectura del archivo
        int i=0;
        try {
            FileReader fr = new FileReader("listaAlumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            StringBuilder texto = new StringBuilder();
            String linea = br.readLine();
            
            while(linea!=null) {
                texto.append(linea+",");
                linea=br.readLine();
            }
            i=0;
            // StringTokenizer
            List<String> Nombre= new ArrayList<>();
            List<String> ApPat= new ArrayList<>();
            List<String> ApMat= new ArrayList<>();
            List<String> Numcuenta= new ArrayList<>();
            List<String> Edad= new ArrayList<>();
            String texto1=texto.toString();
            StringTokenizer tokenizador = new  StringTokenizer(texto1,",");
            while(tokenizador.hasMoreTokens()){
                switch(i){
                    case 0:
                        Nombre.add(tokenizador.nextToken());
                        break;
                    case 1:
                        ApPat.add(tokenizador.nextToken());
                        break;
                    case 2:
                        ApMat.add(tokenizador.nextToken());
                        break;
                    case 3:
                        Numcuenta.add(tokenizador.nextToken());
                        break;
                    case 4:
                        Edad.add(tokenizador.nextToken());
                        break;
                }
                i=i+1;
                if(i==5){
                    i=0;
                }
            }
            br.close();
            //Generador de nombres y edades aleatorios
            System.out.println(Edad.toString());
            System.out.println(Nombre.toString());
            List<Object> lista1 = new ArrayList<>();
            lista1.addAll(lista);
            for (int j = 0; j < 10; j++) {
                int a = (int)(Math.random()*(9-0+1)+0);
                int b = (int)(Math.random()*(9-0+1)+0);
                int c= (int)(Math.random()*(9-0+1)+0);
                int d= (int)(Math.random()*(9-0+1)+0);
                int e= (int)(Math.random()*(9-0+1)+0);
                lista1.add(new Alumno(Nombre.get(a),ApPat.get(b),ApMat.get(c),Numcuenta.get(d),Edad.get(e)));
            }
            //ListIterator
            ListIterator<Object> iterador1=lista1.listIterator();
            System.out.println(lista1.toString());
             try (FileWriter f = new FileWriter("listaAlumnos.csv", true);
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);){
                 p.println("#,#,#,#,# Lista Inflada,#,#,#,#");
                 i=0;
                 while(iterador1.hasNext()){
                     p.println(iterador1.next());
                     if(i==9){
                         p.println("#,#,#,#,Datos Combinados tokenizados,#,#,#");
                     }
                     i=i+1;
                 }
                 p.close();
           
        } catch (IOException ex) {
            Logger.getLogger(POOP11Extra.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11Extra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(POOP11Extra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
