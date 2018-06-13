package pe.com.ricindigus.controlasistenciainei;

public class SQLConstantes {
    public static String DB_PATH = "/data/data/pe.com.ricindigus.controlasistenciainei/databases/";
    public static String DB_NAME = "mydatabase.sqlite";

    public static String tablanacional = "nacional";
    public static String tablausuariolocal = "usuario_local";


    public static String nacional_codigo = "codigo";
    public static String nacional_sede = "sede";
    public static String nacional_aplicacion = "local_aplicacion";
    public static String nacional_aula = "aula";
    public static String nacional_apepat = "apepat";
    public static String nacional_discapacidad = "discapacidad";

    public static String usuario_local_usuario = "usuario";
    public static String usuario_local_clave = "clave";
    public static String usuario_local_nombrelocal = "nombreLocal";
    public static String usuario_local_sede = "sede";


    public static final String WHERE_CLAUSE_CLAVE = "clave=?";

    public static final String[] COLUMNAS_NACIONAL = {
            nacional_codigo,nacional_apepat,nacional_aplicacion,
            nacional_aula, nacional_discapacidad, nacional_sede
    };

    public static final String[] COLUMNAS_USUARIO_LOCAL = {
            usuario_local_clave, usuario_local_nombrelocal,
            usuario_local_sede, usuario_local_usuario
    };

}
