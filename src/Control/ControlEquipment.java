package Control;

import Database_access.DaoEquipment;
import Logic.Equipment;

public class ControlEquipment {
    
    DaoEquipment daoequipment;
    public ControlEquipment()
    {
        daoequipment = new DaoEquipment();
    }
    
    public int  insertarEquipo(String  nombre, int marca, String descripcion, String estado){
        Equipment equipment = new Equipment();        

        equipment.setEquipmentName(nombre);
        equipment.setMake(marca);
        equipment.setDescription(descripcion);
        equipment.setState(estado);
        int result = daoequipment.insertequipment(equipment);
        
        return result;
    }
    
    public int  modificar_Estado(String estado, int numEquip){
        Equipment equipment = new Equipment();        

        equipment.setNumeroEquipo(numEquip);
        equipment.setState(estado);

        int result = daoequipment.editarEquipo(equipment);

        return result;

    }
    
    public int  editequipment(String name,String descripcion,String state,String liststate,
            int number,int serial,int numero,String nombre){
        Equipment equipment = new Equipment();        
        
        equipment.setEquipmentName(name);
        equipment.setMake(serial);
        equipment.setDescription(descripcion);
        equipment.setState(state);
        equipment.setNumeroEquipo(number);
        equipment.setStateequipment(liststate);

        int result = daoequipment.modificar(equipment,numero,nombre);

        return result;
    } 
}
