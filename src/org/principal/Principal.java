package org.principal;

import org.model.Marca;
import org.model.Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        Modelo mod1 = new Modelo(1, "Ford Ranger", new Date(), 10);
        Modelo mod2 = new Modelo(2, "VW Polo", new Date(), 5);
        List<Modelo> modelos = new ArrayList<>();
        modelos.add(mod1);
        modelos.add(mod2);

        mod1.setId(3);
        mod1.setName("Onix");
        mod1.getAnoModelo(new Date());
        mod1.setQtModelos(45);


        Marca marca = new Marca(1, "Ford", modelos);
        System.out.println(mod1.toString());
        System.out.println(marca.toString());

    }
}
