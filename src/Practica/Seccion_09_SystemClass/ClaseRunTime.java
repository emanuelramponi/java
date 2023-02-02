package Practica.Seccion_09_SystemClass;

public class ClaseRunTime {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); //obtenemos la instancia de tiempo de ejecucion y retorna un objeto de tipo proceso
        Process proceso;
        try{
            if (System.getProperty("os.name").toLowerCase().startsWith("Windows")){
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").startsWith("Mac")){
                proceso = rt.exec("textedit");
            }else if(System.getProperty("os.name").contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso = rt.exec("gedit");
            }
            else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
    System.exit(0);
    }
}
