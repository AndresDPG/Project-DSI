package Control;

import Database_access.DaoProyect;
import Logic.Proyect;

public class ControlProyect {
    
    DaoProyect daoProyect;
    
    
    public ControlProyect(){
        daoProyect = new DaoProyect();
    }
    
     public int  insertarProyecto(String proyectName, String description, int codigo){
        Proyect proyect = new Proyect();        

        proyect.setName(proyectName);
        proyect.setDescription(description);
        proyect.setDirectorCode(codigo);

        int result = daoProyect.guardarProyecto(proyect);
        
        return result;

    }
     
      public int  editproyect(String name,String descripcion,String state,int Code,
            int CodeD,int numero,String nombre){
        Proyect proyect = new Proyect();        
        
        proyect.setName(name);
        proyect.setId(Code);
        proyect.setDirectorCode(CodeD);
        proyect.setDescription(descripcion);
        proyect.setState(state);
        
        int result = daoProyect.editarProyecto(proyect, Code, nombre);
        
        return result;
    }  
}
