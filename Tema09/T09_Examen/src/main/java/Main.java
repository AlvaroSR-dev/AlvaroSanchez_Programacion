import controller.ControllerJSON;

/**
 *      Crea una base de datos llamadas empresa con una tabla llamada factura la --
        cual tiene los siguientes campos: id, compania, pais, telefono, total. --

            a. Realiza la lectura del JSON ubicado en la siguiente dirección --
            importa todas las facturas a la base de datos https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261 --

            b. Crea una tabla filtrada con los mismos campos que la tabla anterior. --
            Mediante un menú pide al usuario que seleccione:

                i. Buscar por total: el usuario introducirá un total y se mostrarán todos los
                datos de la factura cuyo valor sea mayor o igual al introducido y los
                agregará a la tabla filtrada --

                ii. Buscar por país: el usuario introducirá un país y se mostrarán todos los
                datos de la factura cuyo país sea el introducido y los agregará a la tabla
                filtrada
**/

public class Main {
    public static void main(String[] args) {
        ControllerJSON controllerJSON = new ControllerJSON();
        // controllerJSON.leerFacturas();
        controllerJSON.buscarTotal(10000);
    }
}
