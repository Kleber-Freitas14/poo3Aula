package org.model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
   private long id;
   private String name;
   private List<Modelo> modelos;

   public Marca() {
      this.id = 0;
      this.name = "";
      this.modelos = new ArrayList<>();
   }

   public Marca(long id, String name, List<Modelo> modelos) {
      this.id = id;
      this.name = name;
      this.modelos = modelos;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Modelo> getModelos() {
      return modelos;
   }

   public void setModelos(List<Modelo> modelos) {
      this.modelos = modelos;
   }
}
