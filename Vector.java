/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vector;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author oscar
 */
public class Vector {

    public static void main(String[] args) {
      // 1. Declarar una lista vacía
        ArrayList<String> VaciaLista = new ArrayList<>();
        System.out.println("la lista esta vacia" + VaciaLista);

        // 2. Declarar una lista con más de 5 elementos
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Elemento1");
        miLista.add("Elemento2");
        miLista.add("Elemento3");
        miLista.add("Elemento4");
        miLista.add("Elemento5");
        miLista.add("Elemento6");
        miLista.add("Elemento7");
        System.out.println("la  lista es:" + miLista);

        // 3. Encuentre la longitud de su lista
        int longi = miLista.size();
        System.out.println("la longitud de la lista es" + miLista);

        // 4. Obtener el primer elemento, el elemento central y el último elemento de la lista
        String primerElemento = miLista.get(0);
        String elementoCentral = miLista.get(2);
        String ultimoElemento = miLista.get(4);
        System.out.println("El primer elemento es:" + " " + primerElemento + '\n' + "El elementro central es:" + " " + elementoCentral + '\n'+ "El ultimo elemento:" +" " + ultimoElemento);

        // 5. Declara una lista llamada tipos_datos_mezclados
        ArrayList<Object> tiposDatosMezclados = new ArrayList<>();
        tiposDatosMezclados.add("Jhordin");
        tiposDatosMezclados.add("Edad" +" "+ 30);
        tiposDatosMezclados.add("Altura"+" " + 1.75); 
        tiposDatosMezclados.add("Soltero");
        tiposDatosMezclados.add("cartagena");
        System.out.println("la lista es:" + tiposDatosMezclados);

        // 6. variable de lista llamada it_companies
        ArrayList<String> itCompanies = new ArrayList<>();
        itCompanies.add("Facebook");
        itCompanies.add("Google");
        itCompanies.add("Microsoft");
        itCompanies.add("Apple");
        itCompanies.add("IBM");
        itCompanies.add("Oracle");
        itCompanies.add("Amazon");
        System.out.println("la lista es:"+" "+ itCompanies );

        // 7. Añadir una empresa de TI a it_companies
        itCompanies.add(1, "Samsung");
        System.out.println("la lista es:"+" "+ itCompanies );

        // 8. Comprobar si una empresa existe en la lista it_companies
        boolean ExisteEmpresa = itCompanies.contains("Google");
        System.out.println( ExisteEmpresa );

        // 9. método sort()
        Collections.sort(itCompanies);
        System.out.println("la lista es:"+" "+ itCompanies );

        // 10. método reverse()
        Collections.reverse(itCompanies);
        System.out.println("la lista es:"+" "+ itCompanies );

        // 11. Elimine la primera empresa informática
        itCompanies.remove(0);
        System.out.println("la lista es:"+" "+ itCompanies );

        // 12. Eliminar todas las empresas de TI
        itCompanies.clear();
        System.out.println("la lista es:"+" "+ itCompanies );
    }
}


