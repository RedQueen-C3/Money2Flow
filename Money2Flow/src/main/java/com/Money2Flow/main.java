package com.Money2Flow;

public class main {
    public static void main(String[] args) {
        // Prueba de instancia clase Empresa

        Empresa IbmCloud = new Empresa("IBM", "Calle qualaby 42 Sidney", "4855555", "1234-5");
        System.out.println(IbmCloud.getNombre());
        IbmCloud.setTelefono("3435673");
        System.out.println(IbmCloud.getTelefono());

        // Prueba de instancia clase Empleado

        Empleado user1 = new Empleado("Liliana Vargas", "liliana@gmail.com", IbmCloud, "Administrativo");
        System.out.println(user1.getNombreEmpleado());
        user1.setRolEmpleado("Operativo");
        System.out.println(user1.getRolEmpleado());


        //Prueba de instancia clase MovimientoDinero
        movimientoDinero helado = new movimientoDinero(-500.0, "Compra de Helado", user1);
        System.out.println(helado.getConcepto());
        helado.setMonto(-543.6);
        System.out.println(helado.getMonto());

        //Prueba del método set para la clase empleado
        user1.setNombreEmpleado("Juan Camilo Cardona");
        System.out.println(user1.getNombreEmpleado());

        //Prueba del método set para la clase empresa
        IbmCloud.setNombre("AVF");
        System.out.println(IbmCloud.getNombre());

        //Prueba  Pablo
        IbmCloud.setDireccion("Cra 73bis#22b-23, Modelia");
        System.out.println(IbmCloud.getDireccion());


    }
}
