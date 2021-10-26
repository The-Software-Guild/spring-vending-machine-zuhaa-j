package zuhaa.service;

import com.mthree.c130.zuhaa.dao.VendingMachineAuditDao;
import com.mthree.c130.zuhaa.dao.VendingMachinePersistenceException;
import org.springframework.stereotype.Component;

@Component
public class VendingMachineAuditDaoStubImpl implements VendingMachineAuditDao {

    public void writeAuditEntry(String entry) throws VendingMachinePersistenceException {
        //do nothing
    }
}
