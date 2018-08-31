package Control;

import Database_access.DaoFine;
import Logic.Fine;

public class ControlFine {
    DaoFine fineDao;
    Fine fine = new Fine();
    public ControlFine(){
        fineDao= new DaoFine();
    }
    
    public void Crearmulta(int code,int valor,int id){
        fine.setUserCode(code);
        fine.setValue(valor);
        fineDao.saveFine(fine, id);
        
    }
    
    public boolean check_fine(int id){
        return fineDao.cheack_fine(id);
    }
}
